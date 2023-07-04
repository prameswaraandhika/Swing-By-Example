package belajar_layouting;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Andhika Prameswara <prameswaara@gmail.com>
 */
public class GridLayoutExample extends JFrame {

    /*
     * GridLayout(int rows, int cols)
     * Setiap sel dalam grid akan diberikan ukuran yang sama,
     * sehingga jika ukuran komponen tidak cocok dengan ukuran sel, komponen
     * tersebut mungkin akan terdistorsi.
     * Jika Anda ingin mengatur ukuran komponen secara individual,
     * Anda dapat mempertimbangkan menggunakan layout manager lain seperti
     * GridBagLayout atau GroupLayout.
     */
    public GridLayoutExample() throws HeadlessException {
        setSize(new Dimension(500, 500));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 2));
        // 1 ROW 2 COL
        add(new JLabel(new ImageIcon(GridLayoutExample.class.getResource("/resources/ronaldo.jpg"))));
        add(new JLabel(new ImageIcon(GridLayoutExample.class.getResource("/resources/messi.jpg"))));

        // 1 ROW 2 COL
        // add(new JButton("BUTTON 2"));
        // add(new JButton("BUTTON 2A"));
        setVisible(true);

        // Behaviour
        // Objek akan diatur dengan kiri ke kanan lebih dulu lalu diikuti dengan atas
        // kebawah
        // Jika kita tambahkan 1 objek lagi maka dia akan menjadi 2 row 3 col
        // add(new JButton("BUTTON 3"));
        // Jika kita tambahkan 2 objek lagi maka dia akan menjadi 3 row 3 col
        // add(new JButton("BUTTON 3"));
        // add(new JButton("BUTTON 3"));
    }

    public static void main(String[] args) {
        new GridLayoutExample();
    }
}
