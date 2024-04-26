package br.unigran;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Tela extends JFrame {
<<<<<<< HEAD

    JLabel texto = new JLabel();
    JTextArea painel = new JTextArea();

=======
    private JPanel tela = new JPanel();
    private JButton buscar=new JButton("click");
>>>>>>> 7399b57606d6ee624b473f6ec6e9bdf7d1f62185
    public Tela() {
        setTitle("Tela");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,300);
        setLocationRelativeTo(null);
        setVisible(true);
<<<<<<< HEAD
        add(painel,BorderLayout.PAGE_END);
        painel.add(texto);
=======
        aloca();
    }
    public void aloca(){
        add(tela);
        tela.add(buscar);
>>>>>>> 7399b57606d6ee624b473f6ec6e9bdf7d1f62185
    }

}

