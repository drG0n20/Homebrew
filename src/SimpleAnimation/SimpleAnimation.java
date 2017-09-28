package SimpleAnimation;

import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {

    int x = 70;
    int y = 70;

    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
        gui.click();
    }

    public void click(){
        JFrame ramka = new JFrame();
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PanelRysunkowy panel = new PanelRysunkowy();

        ramka.getContentPane().add(panel);
        ramka.setSize(300, 300);
        ramka.setVisible(true);

        for (int i = 0; i < 130 ; i++) {
            x++;
            y++;

            ramka.repaint();
            try {
                Thread.sleep(50);
            } catch (Exception ex) { }
        }

    }

    class PanelRysunkowy extends JPanel{
        public void paintComponent(Graphics g){
            g.setColor(Color.white);
            g.fillRect(0,0, this.getWidth(), this.getHeight());

            g.setColor(Color.green);
            g.fillOval(x,y, 40, 40);
        }
    }
}
