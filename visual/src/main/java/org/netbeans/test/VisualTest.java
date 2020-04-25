package org.netbeans.test;

import org.netbeans.api.visual.anchor.AnchorFactory;
import org.netbeans.api.visual.border.BorderFactory;
import org.netbeans.api.visual.widget.ConnectionWidget;
import org.netbeans.api.visual.widget.LayerWidget;
import org.netbeans.api.visual.widget.Scene;
import org.netbeans.api.visual.widget.Widget;
import org.netbeans.modules.visual.laf.DefaultLookFeel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class VisualTest {
    private static final boolean DISPLAY_FRAMES = true;

    public static void main(String[] args) {
        new VisualTest().test();
    }

    public void test(){
        Scene scene = new Scene ();

        LayerWidget mainLayer = new LayerWidget (scene);
        scene.addChild(mainLayer);

        Widget w1 = new Widget (scene);
        w1.setBorder (BorderFactory.createLineBorder ());
        w1.setPreferredLocation (new Point(100, 100));
        w1.setPreferredSize (new Dimension (40, 20));
        mainLayer.addChild(w1);

        Widget w2 = new Widget (scene);
        w2.setBorder (BorderFactory.createLineBorder ());
        w2.setPreferredLocation (new Point (200, 100));
        w2.setPreferredSize (new Dimension (40, 20));
        mainLayer.addChild(w2);

        LayerWidget connLayer = new LayerWidget (scene);
        scene.addChild(connLayer);

        ConnectionWidget conn = new ConnectionWidget(scene);
        conn.setSourceAnchor(AnchorFactory.createRectangularAnchor(w1));
        conn.setTargetAnchor(AnchorFactory.createRectangularAnchor(w2));
        connLayer.addChild(conn);

        Color color = (Color) (new DefaultLookFeel()).getBackground();

        showFrame(scene);
    }



    /**
     * Shows a frame for a scene and wait until it shown on a screen. View size is [400,300].
     * @param scene the scene
     * @return the frame; null if the frame is not shown in 10 seconds
     */
    public JFrame showFrame (Scene scene) {
        return showFrame (scene, 600, 500);
    }

    /**
     * Shows a frame of for a scene and wait until it shown on a screen.
     * @param scene the scene
     * @param width the view width
     * @param height the view height
     * @return the frame; null if the frame is not shown in 10 seconds
     */
    public JFrame showFrame (Scene scene, int width, int height) {
        assert scene != null;

        JFrame frame = new JFrame ("Default Scene JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout (new BorderLayout ());
        JComponent view = scene.createView ();
        view.setPreferredSize (new Dimension (width, height));
        frame.getContentPane().add(view, BorderLayout.CENTER);
        frame.pack ();
        if (DISPLAY_FRAMES) {
            frame.setVisible(true);
        }
        int countdown = 10;
        for (;;) {
            if ((!DISPLAY_FRAMES || frame.isShowing()) && scene.isValidated())
                break;
            if (-- countdown < 0) {
                if (DISPLAY_FRAMES) {
                    frame.setVisible(false);
                }
                frame.dispose ();
                return null;
            }
            try {
                Thread.sleep (1000);
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }
        return frame;
    }

    /**
     * Takes a snapshot of a scene. This method assumes that the scene view is already shown on the screen
     * and therefore the scene is initialized correctly.
     * @param scene the scene
     * @return the snapshot
     */
    public BufferedImage takeSnapshot (Scene scene) {
        assert scene != null;
        Dimension viewSize = scene.getView().getSize();
        assert viewSize.width >= 0  &&  viewSize.height >= 0;
        return takeSnapshot (scene, viewSize.width, viewSize.height);
    }

    /**
     * Takes a snapshot of a scene. This method assumes that the scene view is already shown on the screen
     * and therefore the scene is initialized correctly.
     * @param scene the scene
     * @param width the snapshot width
     * @param height the snapshot height
     * @return the snapshot
     */
    public BufferedImage takeSnapshot (Scene scene, int width, int height) {
        assert scene != null;
        BufferedImage snapshot = new BufferedImage (width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D snapshotGraphics = snapshot.createGraphics();
        scene.paint(snapshotGraphics);
        snapshotGraphics.dispose ();
        return snapshot;
    }

    /**
     * Takes a one-time snapshot. Similar to takeSnapshot method but it automatically creates and disposes a frame for it.
     * @param scene the scene
     * @return the snapshot
     */
    public BufferedImage takeOneTimeSnapshot (Scene scene) {
        JFrame frame = showFrame (scene);
        BufferedImage snapshot = takeSnapshot (scene);
        assert scene != null;
        frame.setVisible(false);
        frame.dispose ();
        return snapshot;
    }

    /**
     * Takes a one-time snapshot. Similar to takeSnapshot method but it automatically creates and disposes a frame for it.
     * @param scene the scene
     * @param width the scene width
     * @param height the scene height
     * @return the snapshot
     */
    public BufferedImage takeOneTimeSnapshot (Scene scene, int width, int height) {
        JFrame frame = showFrame (scene, width, height);
        BufferedImage snapshot = takeSnapshot (scene, width, height);
        assert scene != null;
        frame.setVisible(false);
        frame.dispose ();
        return snapshot;
    }

    /**
     * Creates a new image which is a copy of a specified image and contains "clean" regions.
     * @param image the image to be copied
     * @param clearColor the color by which the regions are cleaned.
     * @param clearShapes the clean regions
     * @return the clean image
     */
    public BufferedImage clearRegions (BufferedImage image, Color clearColor, Shape... clearShapes) {
        BufferedImage clean = new BufferedImage (image.getWidth (), image.getHeight (), BufferedImage.TYPE_INT_RGB);
        Graphics2D cleanGraphics = clean.createGraphics();
        cleanGraphics.drawImage(image, 0, 0, null);
        cleanGraphics.setColor(clearColor);
        for (Shape shape : clearShapes)
            cleanGraphics.fill (shape);
        cleanGraphics.dispose();
        return clean;
    }

    /**
     * Checks whether an image contains only specified colors.
     * @param image the image
     * @param colors the colors
     * @return true if the image contains specified colors only; false otherwise
     */
    public boolean testCleaness (BufferedImage image, Color... colors) {
        int[] rgbs = new int[colors.length];
        for (int a = 0; a < colors.length; a ++)
            rgbs[a] = colors[a].getRGB ();
        int height = image.getHeight ();
        int width =  image.getWidth ();
        for (int y = 0; y < height; y ++)
            for (int x = 0; x < width; x ++) {
                boolean isClean = false;
                for (int rgb : rgbs)
                    if (image.getRGB(x, y) == rgb) {
                        isClean = true;
                        break;
                    }
                if (! isClean)
                    return false;
            }
        return true;
    }

    /**
     * Saves an image into the working directory of the test.
     * @param image the image to save
     * @param imageID the image id used as an image file name
     */
    public void saveImage (BufferedImage image, String imageID) {
        if (image == null)
            return;
        try {
            ImageIO.write (image, "png", new File("/tmp", imageID + ".png")); // NOI18N
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
