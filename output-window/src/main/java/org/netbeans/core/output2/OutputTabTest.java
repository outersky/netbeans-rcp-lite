package org.netbeans.core.output2;

import org.openide.util.Exceptions;
import org.openide.windows.IOContainer;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OutputTabTest {
    public static void main(String[] args) throws Exception {
        new OutputTabTest().setUp();
    }
    private IOContainer container;
    private NbIO io;
    JFrame jf = null;
    OutputTab tab = null;
    OutputPane pane = null;

    protected void setUp() throws java.lang.Exception {
        SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                container = IOContainer.getDefault();
                jf = new JFrame("OutputTabTest");
                jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jf.getContentPane().setLayout(new BorderLayout());
                jf.getContentPane().add(getIOWindow(), BorderLayout.CENTER);
                jf.setBounds(20, 20, 700, 300);
                jf.setVisible(true);
                io = (NbIO) new NbIOProvider().getIO("Test", false);
                io.select();
                io.out().println("您好, China!\nHello world!");
                tab = (OutputTab) container.getSelected();
                pane = (OutputPane) tab.getOutputPane();
            }
        });

        if (tab == null) {
//            fail("Failed in setup - selected tab was null");
        }
    }

    static JComponent getIOWindow() {
        IOContainer container = IOContainer.getDefault();
        JComponent comp = null;
        try {
            Field f = container.getClass().getDeclaredField("provider");
            f.setAccessible(true);
            IOContainer.Provider prov = (IOContainer.Provider) f.get(container);
            return (JComponent) prov;
            //Method m = prov.getClass().getDeclaredMethod("impl", new Class<?>[0]);
            //m.setAccessible(true);
            //comp = (JComponent) m.invoke(prov);
        } catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException ex) {
            Exceptions.printStackTrace(ex);
        }
        return comp;
    }

}
