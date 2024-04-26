package br.unigran;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Tela extends JFrame {

    JLabel texto = new JLabel();
    JTextArea painel = new JTextArea();

    public Tela() {
        setTitle("Tela");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,300);
        setLocationRelativeTo(null);
        setVisible(true);
        add(painel,BorderLayout.PAGE_END);
        painel.add(texto);
    }

}
