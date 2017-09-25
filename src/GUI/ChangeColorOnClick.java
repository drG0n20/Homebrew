package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ChangeColorOnClick implements ActionListener {
    private JFrame _ramka;
    private JButton _przycisk;

    public static void main(String[] args) {
        ChangeColorOnClick apGui = new ChangeColorOnClick();
        apGui.click();
    }

    public void click() {
        _ramka = new JFrame();
        _ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        _przycisk = new JButton("Zmiana koloru");
        _przycisk.addActionListener(this);

        PanelRysunkowy panelR = new PanelRysunkowy();


        _ramka.getContentPane().add(BorderLayout.SOUTH, _przycisk);
        _ramka.getContentPane().add(BorderLayout.CENTER, panelR);
        _ramka.setSize(300, 300);
        _ramka.setVisible(true);
    }


    public void actionPerformed(ActionEvent zdarzenie) {
        _ramka.repaint();
    }
}
