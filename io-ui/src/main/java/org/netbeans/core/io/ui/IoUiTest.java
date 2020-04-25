package org.netbeans.core.io.ui;

import org.openide.util.Utilities;

import javax.swing.*;

public class IoUiTest {
    public static void main(String[] args) {
        IOWindow.IOWindowImpl ioWin = IOWindow.IOWindowImpl.findDefault();
        ioWin.addTab(new JPanel(), null);
        ioWin.addTab(new JPanel(), null);
        int minHeight = ioWin.getMinimumSize().height;
        ioWin.addTab(new JPanel(), null);
        JFrame frame = new JFrame("IoUiTest");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(ioWin);
        frame.pack();
        frame.setSize(500,400);
        frame.setVisible(true);
    }
}
