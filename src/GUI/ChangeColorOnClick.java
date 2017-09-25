package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ChangeColorOnClick implements ActionListener {
    private JFrame _ramka;
    private JButton _przyciskKolor;
    private JButton _przyciskEtykieta;

    public static void main(String[] args) {
        ChangeColorOnClick apGui = new ChangeColorOnClick();
        apGui.click();
    }

    public void click() {
        _ramka = new JFrame();
        _ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        _przyciskKolor = new JButton("Kliknij mnie");
        _przyciskEtykieta = new JButton("Etykieta");
        _przyciskKolor.addActionListener(this);
        _przyciskEtykieta.addActionListener(this);

        PanelRysunkowy panelR = new PanelRysunkowy();


        _ramka.getContentPane().add(BorderLayout.SOUTH, _przyciskKolor);
        _ramka.getContentPane().add(BorderLayout.EAST, _przyciskEtykieta);
        _ramka.getContentPane().add(BorderLayout.CENTER, panelR);
        _ramka.setSize(300, 300);
        _ramka.setVisible(true);
    }


    public void actionPerformed(ActionEvent zdarzenie) {
        if (zdarzenie.getSource()==_przyciskKolor){
        _ramka.repaint();
        } else
        {
            _przyciskEtykieta.setText("Zmieniam Kolor!");
        }
    }
}
