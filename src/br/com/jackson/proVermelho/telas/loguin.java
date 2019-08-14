/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jackson.proVermelho.telas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @jacksonsr45@gmail.com
 */
public class loguin extends JFrame{
    
    JButton loguin = new JButton();
    JTextField nome = new JTextField();
    JPasswordField senha = new JPasswordField();
    JLabel cNome = new JLabel();
    JLabel cSenha = new JLabel();
    
    public void loguin(){
        setLayout(null);
        cNome.setText("Nome: ");
        cNome.setBounds(10,30,40,25);
        add(cNome);
        
        nome.setText("");
        nome.setBounds(50,30,300,25);
        add(nome);
        
        cSenha.setText("Senha:");
        cSenha.setBounds(10,60,40,25);
        add(cSenha);
        
        senha.setText("");
        senha.setBounds(50,60,300,25);
        add(senha);
        
        loguin.setText("ENTRAR");
        loguin.setBounds(150,120,100,30);
        add(loguin);
        
        
        
        
        loguin.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent w){
                Toolkit kit = Toolkit.getDefaultToolkit();  
                Dimension tamTela = kit.getScreenSize();  

                //Pega largura e altura da tela 
                int larg = tamTela.width;  
                int alt = tamTela.height;  
                telaPrincipal tela = new telaPrincipal();
                tela.telaPrincipal();
                tela.setSize(larg,alt);
                tela.setResizable(false);
                tela.setLocationRelativeTo(null);
                URL url = tela.getClass().getClassLoader().getResource("");
                Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
                tela.setIconImage(iconeTitulo);
                tela.setTitle("TELA PRINCIPAL");
                tela.setDefaultCloseOperation(EXIT_ON_CLOSE);
                tela.setVisible(true);  
                dispose();
            }});
        
    }
    
}
