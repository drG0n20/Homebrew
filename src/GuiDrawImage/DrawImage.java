package GuiDrawImage;

import javax.swing.*;
import java.awt.*;

public class DrawImage extends JPanel {
    public void paintComponent(Graphics g) {
        Image obrazek = new ImageIcon("niebo.jpg").getImage();
        g.drawImage(obrazek, 3, 4, this);
    }
    public static void main(String[] args) {
            DrawImage drawImage = new DrawImage();
            JFrame ramka = new JFrame();
            ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ramka.getContentPane().add(drawImage);
            ramka.setSize(300, 300);
            ramka.setVisible(true);
    }
}
