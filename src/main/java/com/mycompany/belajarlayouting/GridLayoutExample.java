package com.mycompany.belajarlayouting;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Andhika Prameswara <prameswaara@gmail.com>
 */
public class GridLayoutExample extends JFrame {

    /*
        GridLayout(int rows, int cols)
        Setiap sel dalam grid akan diberikan ukuran yang sama,
        sehingga jika ukuran komponen tidak cocok dengan ukuran sel, komponen tersebut mungkin akan terdistorsi.
        Jika Anda ingin mengatur ukuran komponen secara individual, 
        Anda dapat mempertimbangkan menggunakan layout manager lain seperti GridBagLayout atau GroupLayout.
     */
    public GridLayoutExample() throws HeadlessException {
        setSize(new Dimension(500, 400));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 2));
//        1 ROW 2 COL
        add(new JButton("BUTTON 1"));
        add(new JButton("BUTTON 1A"));

//        1 ROW 2 COL
        add(new JButton("BUTTON 2"));
        add(new JButton("BUTTON 2A"));
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutExample();
    }
}
