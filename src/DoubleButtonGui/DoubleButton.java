package DoubleButtonGui;

import GUI.PanelRysunkowy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DoubleButton {
    JFrame ramka;
    JLabel etykieta;

    public static void main(String[] args) {
        DoubleButton gui = new DoubleButton();
gui.click();
    }

    public void click(){
        ramka = new JFrame();
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton przyciskEtyk = new JButton("Zmien Etykiete");
        przyciskEtyk.addActionListener(new EtykietaListeneter());

        JButton przyciskKolor = new JButton("Zmien Kolor");
        przyciskKolor.addActionListener(new KolorListeneter());

        etykieta = new JLabel("Etykieta");
        PanelRysunkowy panel = new PanelRysunkowy();

        ramka.getContentPane().add(BorderLayout.SOUTH, przyciskKolor);
        ramka.getContentPane().add(BorderLayout.CENTER, panel);
        ramka.getContentPane().add(BorderLayout.EAST, przyciskEtyk);
        ramka.getContentPane().add(BorderLayout.WEST, etykieta);

        ramka.setSize(400, 300);
        ramka.setVisible(true);
    }

    class EtykietaListeneter implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent zdarzenie) {
            etykieta.setText("Auuu!");
        }
    }

    class KolorListeneter implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent zdarzenie) {
            ramka.repaint();
        }
    }


}
