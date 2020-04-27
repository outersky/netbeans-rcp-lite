package org.netbeans.api.options.test;

import org.netbeans.api.options.OptionsDisplayer;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.lang.reflect.InvocationTargetException;

public class OptionsDialogTest {
    public static void main(String[] args) {
        // NOT work

        String[] layers = new String[] {"org/netbeans/api/options/test/mf-layer.xml"};//NOI18N
        TestDisplayer displayer = new TestDisplayer();
        Object[] instances = new Object[] {displayer};
        IDEInitializer.setup(layers,instances);
        OptionsDisplayer.getDefault().open(true);
    }

    public static class TestDisplayer extends DialogDisplayer implements Runnable {
        DialogDescriptor descriptor;
        private JDialog dialog;
        boolean okButtonForClose = true;
        public Object notify(NotifyDescriptor descriptor) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public Dialog createDialog(DialogDescriptor descriptor) {
            this.descriptor = descriptor;
            return dialog = new TestDialog(descriptor);
        }

        public void close() {
            try {
                if (okButtonForClose || SwingUtilities.isEventDispatchThread()) {
                    run();
                } else {
                    SwingUtilities.invokeAndWait(this);
                }
            } catch (InterruptedException ex) {
            } catch (InvocationTargetException ex) {
            }
        }

        public void run() {
            if (descriptor != null) {
                Object[] oo = descriptor.getClosingOptions();
                for (int i = 0; i < oo.length; i++) {
                    if (okButtonForClose && oo[i] instanceof JButton && ((JButton)oo[i]).getActionCommand().equals("OK")) {
                        descriptor.getButtonListener().actionPerformed(new ActionEvent(oo[i], 0, ((JButton)oo[i]).getActionCommand()));
                        return;
                    } else if (!okButtonForClose && !(oo[i] instanceof JButton)) {
                        descriptor.getButtonListener().actionPerformed(new ActionEvent(DialogDescriptor.CANCEL_OPTION, 0, ""));
                        return;
                    }
                }
            }
        }
    }

    private static class TestDialog extends JDialog {
        TestDialog(DialogDescriptor descriptor) {
            super((Frame)null, descriptor.getTitle(), descriptor.isModal());
        }

        @Override
        public void setVisible(boolean b) {
            if (isModal()) {
                super.setVisible(b);
            }
        }
    }
}
