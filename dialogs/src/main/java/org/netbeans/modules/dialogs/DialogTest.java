package org.netbeans.modules.dialogs;

import org.openide.DialogDisplayer;
import org.openide.WizardDescriptor;
import org.openide.util.HelpCtx;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.io.IOException;
import java.util.Set;

public class DialogTest {

    public static void main(String[] args) {
        MyWizard wizard = new MyWizard(new MyIter());
        Dialog dialog = DialogDisplayer.getDefault().createDialog(wizard);
        dialog.setSize(500,400);
        dialog.setVisible(true);
    }

    private static class MyWizard extends WizardDescriptor {

        public MyWizard(WizardDescriptor.Iterator<MyWizard> it) {
            super();
            MyPanel.set = null;
            setPanelsAndSettings(it, this);
        }
    }

    private static class MyIter implements WizardDescriptor.Iterator<MyWizard> {
        private MyPanel myPanel = new MyPanel();

        public WizardDescriptor.Panel<MyWizard> current() {
            return myPanel;
        }

        public String name() {
            return "OneName";
        }

        public boolean hasNext() {
            return false;
        }

        public boolean hasPrevious() {
            return false;
        }

        public void nextPanel() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public void previousPanel() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public void addChangeListener(ChangeListener l) {
        }

        public void removeChangeListener(ChangeListener l) {
        }
    }

    private static class MyInstantiatingIter extends MyIter implements WizardDescriptor.InstantiatingIterator<MyWizard> {
        public boolean initialized = false;
        public WizardDescriptor initializedOnWD = null;

        public Set instantiate() throws IOException {
            return null;
        }

        public void initialize(WizardDescriptor wizard) {
            initialized = true;
            initializedOnWD = wizard;
        }

        public void uninitialize(WizardDescriptor wizard) {
            initialized = false;
            initializedOnWD = null;
        }
    }

    private static class MyPanel implements WizardDescriptor.Panel<MyWizard> {
        private static MyWizard set;

        private JPanel cmp = new JPanel();

        public Component getComponent() {
            return cmp;
        }

        public HelpCtx getHelp() {
            return HelpCtx.DEFAULT_HELP;
        }

        public void readSettings(MyWizard settings) {
            set = settings;
        }

        public void storeSettings(MyWizard settings) {
        }

        public boolean isValid() {
            return true;
        }

        public void addChangeListener(ChangeListener l) {
        }

        public void removeChangeListener(ChangeListener l) {
        }
    }
}
