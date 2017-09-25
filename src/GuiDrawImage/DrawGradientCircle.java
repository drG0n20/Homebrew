package GuiDrawImage;

import javax.swing.*;
import java.awt.*;

public class DrawGradientCircle extends JPanel {
    public void paintComponent(Graphics g){

        Graphics2D g2d = (Graphics2D) g;

        int czerwony = (int) (Math.random()*256);
        int zielony = (int) (Math.random()*256);
        int niebieski = (int) (Math.random()*256);
        Color kolorPoczatku = new Color(czerwony, zielony, niebieski);

        czerwony = (int) (Math.random()*256);
        zielony = (int) (Math.random()*256);
        niebieski = (int) (Math.random()*256);
        Color kolorKonca = new Color(czerwony, zielony, niebieski);

        GradientPaint gradient = new GradientPaint(70, 70, kolorPoczatku, 150, 150, kolorKonca);
        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);
    }
    public static void main(String[] args) {
            DrawGradientCircle drawImage = new DrawGradientCircle();
            JFrame ramka = new JFrame();
            ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ramka.getContentPane().add(drawImage);
            ramka.setSize(300, 300);
            ramka.setVisible(true);
    }
}
