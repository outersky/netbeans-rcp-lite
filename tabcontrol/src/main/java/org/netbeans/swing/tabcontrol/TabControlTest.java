package org.netbeans.swing.tabcontrol;

import org.netbeans.swing.popupswitcher.SwitcherTableItem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class TabControlTest {

    public static void main(String[] args) {
        TabControlTest tabControlTest = new TabControlTest();
        tabControlTest.setUp();
    }
    private JFrame frame;
    private TabDisplayer displayer;

    private TabData[] items = new TabData[100];

    public TabControlTest() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            System.err.println("Cannot set L&F: " + ex);
        }
    }

    protected void setUp() {
        frame = createFrame();
        frame.setVisible(true);
        items[0] = new TabData(new JPanel(), new DummyIcon(Color.BLUE), "Something.txt", "Something.txt" );
        items[1] = new TabData(new JPanel(), new DummyIcon(), "Sometime.txt", "Sometime.txt");
        items[2] = new TabData( new JPanel(), new DummyIcon(Color.YELLOW), "Somewhere.txt",  "Somewhere.txt");
        items[3] = new TabData(new JPanel(), new DummyIcon(Color.BLUE), "AbCd.txt", "AbCd.txt" );
        items[4] = new TabData(new JPanel(), new DummyIcon(), "Sometime.txt",
                "Very Very Very Long" +
                        " name with a lot of words in its name bla bla bla bla bla bla" +
                        " which sould be shortened and should ends with three dots [...]." +
                        " Hmmmmm");
        items[5] = new TabData(new JPanel(), new DummyIcon(Color.YELLOW), "Somewhere.txt", "Somewhere.txt");
        Arrays.fill(items, 6, 70, new TabData(new JPanel(), new DummyIcon(), "s2.txt", "s2.txt"));
        items[70] = new TabData(new JPanel(), null, "Somewhere.txt", "null icon");
        Arrays.fill(items, 71, 90, new TabData(new JPanel(), new DummyIcon(), "s5.txt", "s5.txt"));
        items[90] = new TabData(new JPanel(), new DummyIcon(Color.BLACK), "Somewhere.txt", null );
        Arrays.fill(items, 91, 100, new TabData(new JPanel(), new DummyIcon(Color.GREEN), "q1.txt", "q1.txt"));

        displayer = new TabDisplayer(new DefaultTabDataModel( items ), TabDisplayer.TYPE_EDITOR );
        JFrame frame2 = new JFrame("Display");
        frame2.getContentPane().add(displayer);
        frame2.setSize(500,500);
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame2.setVisible(true);
        // wait until a developer close the frame
        sleepForever();
    }

    public void testFake() {
        // needed to "run" this class
    }

    private JFrame createFrame() {
        JFrame frame = new JFrame(getClass().getName());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new FlowLayout());
        JButton pBut = new JButton("Popup");
        pBut.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                pButAction(e);
            }
        });
        frame.getContentPane().add(pBut);
        frame.pack();
        frame.setLocationRelativeTo(null);
        return frame;
    }

    private void pButAction(MouseEvent e) {
        // create popup with our SwitcherTable
        JComponent c = (JComponent) e.getSource();
        Point p = new Point(c.getWidth(), c.getHeight());
        SwingUtilities.convertPointToScreen(p, c);
        if (!ButtonPopupSwitcher.isShown()) {
            ButtonPopupSwitcher.showPopup( c, displayer, p.x, p.y);
        }
    }

    private static class DummyIcon implements Icon {
        Color color;
        private DummyIcon(Color color) {
            this.color = color;
        }
        private DummyIcon() {
            this.color = Color.RED;
        }
        public void paintIcon(Component c, Graphics g, int x, int y) {
            int left = ((JComponent) c).getInsets().left;
            int top = ((JComponent) c).getInsets().top;
            g.setColor(color);
            g.fillRect(left + 2, top + 2, 12, 12);
            g.setColor(Color.BLACK);
            g.fillRect(left + 4, top + 4, 8, 8);
        }

        public int getIconWidth() {
            return 16;
        }

        public int getIconHeight() {
            return 16;
        }
    }

    /**
     * Activatable tester class.
     */
    private static class DummyActivatable implements SwitcherTableItem.Activatable {
        String dummyName;
        private DummyActivatable(String name) {
            this.dummyName = name;
        }
        public void activate() {
            System.out.println("MK> Activating \"" + dummyName + "\"....");
        }
    }


    private void sleep() {
        sleep(12000);
    }

    private void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void sleepForever() {
        boolean dumb = true;
        while(dumb) {
            sleep(60000);
        }
    }
}
