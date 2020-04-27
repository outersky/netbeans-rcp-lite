package org.netbeans.api.print.test;

import org.netbeans.api.print.PrintManager;

import javax.swing.*;
import java.awt.*;

public class PrintTest {
    public static void main(String[] args) {
        // NOT work
        JFrame jf = new JFrame("OutputTabTest");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.getContentPane().setLayout(new BorderLayout());
        jf.setBounds(20, 20, 700, 300);
        jf.setVisible(true);

        Action action = PrintManager.printAction(jf.getRootPane());
        jf.getContentPane().add(new JButton(action), BorderLayout.CENTER);
    }
}
