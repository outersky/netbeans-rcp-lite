package org.openide.explorer;

import org.openide.explorer.view.ListView;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.Children;
import org.openide.nodes.Node;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Callable;

public class ExplorerTest {

    public static void main(String[] args) throws Exception{
        new ExplorerTest().testNoScrollOnIconChange();
    }

    private ListView view;
    private ExplorerWindow testWindow;

    public void testNoScrollOnIconChange() throws Exception {

        testWindow = new ExplorerWindow();
        testWindow.getContentPane().add(view = new ListView());

        Children.Array ch = new Children.Array();
        Node root = new AbstractNode(ch);

        AbstractNode last = null;

        for (int i=1; i<20; i++) {
            last = new AbstractNode(Children.LEAF);
            last.setName("Node #" + i);
            ch.add(new Node[] {last});
        }

        testWindow.getExplorerManager().setRootContext(root);

        awtRequest(new Callable<Void>() {
            @Override
            public Void call() {
                testWindow.pack();
                testWindow.setVisible(true);
                return null;
            }
        });

        //Wait for the AWT thread to actually display the dialog:
        Thread.sleep(5000);

        // cause an icon change
        last.setIconBaseWithExtension("org/openide/nodes/beans.gif");
        Thread.sleep(3000);

        // cleanup
        awtRequest(new Callable<Void>() {
            @Override
            public Void call() {
                testWindow.setVisible(false);
                return null;
            }
        });
    }


    private static final class ExplorerWindow extends JFrame
            implements ExplorerManager.Provider {

        private final ExplorerManager explManager = new ExplorerManager();

        ExplorerWindow() {
            super("ListView test");                                     //NOI18N
        }

        @Override
        public ExplorerManager getExplorerManager() {
            return explManager;
        }
    }

    private static <T> T awtRequest(final Callable<T> call) throws Exception {
        final Object[] value = new Object[1];
        final Exception[] exc = new Exception[1];
        EventQueue.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                try {
                    value[0] = call.call();
                } catch (Exception ex) {
                    exc[0] = ex;
                }
            }
        });

        if (exc[0] != null) throw exc[0];
        return (T) value[0];
    }

    private class CallY implements Callable<Integer> {
        @Override
        public Integer call() {
            return view.getViewport().getViewPosition().y;
        }
    };

}
