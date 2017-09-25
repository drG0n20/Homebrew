package GuiDrawImage;

import javax.swing.*;
import java.awt.*;

public class DrawRectangle extends JPanel {
    public void paintComponent(Graphics g){
        g.setColor(Color.black);
        g.fillRect(50, 50, 100, 100);
    }
    public static void main(String[] args) {
            DrawRectangle drawImage = new DrawRectangle();
            JFrame ramka = new JFrame();
            ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ramka.getContentPane().add(drawImage);
            ramka.setSize(300, 300);
            ramka.setVisible(true);
    }
}
