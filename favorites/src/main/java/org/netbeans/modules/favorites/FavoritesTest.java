package org.netbeans.modules.favorites;

import org.netbeans.modules.favorites.api.Favorites;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class FavoritesTest {
    public static void main(String[] args) throws Exception{
        // NOT working

        JFrame jf = new JFrame("FavoritesTest");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.getContentPane().setLayout(new BorderLayout());
        jf.setBounds(20, 20, 700, 300);

        Favorites fav = Favorites.getDefault();
        File home = new File(System.getProperty("user.home"));
        FileObject wd = FileUtil.toFileObject(home);
        fav.add(wd);

        jf.getContentPane().add(Tab.getDefault(), BorderLayout.CENTER);
        jf.pack();
        jf.setVisible(true);

    }
}
