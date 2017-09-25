package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SimpleGui implements ActionListener {
    JButton przycisk;

    public static void main(String[] args) {
        SimpleGui apGui = new SimpleGui();
        apGui.click();
    }

public void click(){
        JFrame ramka = new JFrame();
        przycisk = new JButton("Kliknij mnie");
        przycisk.addActionListener(this);
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.getContentPane().add(przycisk);
        ramka.setSize(300, 300);
        ramka.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent zdarzenie) {
        przycisk.setText("Zostalem klikniety");
    }
}
