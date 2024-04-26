package br.unigran;

import javax.swing.*;

public class Tela extends JFrame {
    private JPanel tela = new JPanel();
    private JButton buscar=new JButton("click");
    public Tela() {
        setTitle("Tela");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,300);
        setLocationRelativeTo(null);
        setVisible(true);
        aloca();
    }
    public void aloca(){
        add(tela);
        tela.add(buscar);
    }
}

