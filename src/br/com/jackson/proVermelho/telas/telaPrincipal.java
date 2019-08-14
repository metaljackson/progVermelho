/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jackson.proVermelho.telas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @jacksonsr45@gmail.com
 */
public class telaPrincipal extends JFrame{
    
    JButton         cadastro = new JButton();
    JButton          bairros = new JButton();
    JButton             tela = new JButton();
    JButton            tela2 = new JButton();
    JButton            tela3 = new JButton();
    JButton             sair = new JButton();
    JButton        pesquisar = new JButton();
    
    JDesktopPane   telaFundo = new JDesktopPane();
    JDesktopPane     interno = new JDesktopPane();
    JDesktopPane  campoTexto = new JDesktopPane();
    
    JTextField      pesquisa = new JTextField();
    JLabel         cPesquisa = new JLabel();
    
    public void telaPrincipal(){
        Toolkit       kit = Toolkit.getDefaultToolkit();  
        Dimension tamTela = kit.getScreenSize();  

        //Pega largura e altura da tela 
        int  larg = tamTela.width;  
        int   alt = tamTela.height;
        //===================================================
        //criando o layout
        setLayout(null);
        telaFundo.setBounds(0,0,larg,alt);
        telaFundo.setBackground(Color.black);
        add(telaFundo);
        
        //botao cadastro para chamar clase cadastro
        cadastro.setText("CADASTRO");
        cadastro.setBounds(10,10,175,175);
        telaFundo.add(cadastro);
        
        //botao bairros para chamar clase bairros
        bairros.setText("BAIRROS");
        bairros.setBounds(10,185,175,175);
        telaFundo.add(bairros);
        //botao sair 
        sair.setText("SAIR");
        sair.setBounds(10,535,175,175);
        telaFundo.add(sair);
        
        //JDesktopInternal internal frame 
        interno.setBounds(195,10,larg-250,alt-75);
        interno.setBackground(Color.DARK_GRAY);
        interno.setLayout(null);
        interno.setVisible(true);
        telaFundo.add(interno);
        //===========================================================
        //JDesktopPane interno para textos
        campoTexto.setBounds(5,75,1105,613);
        campoTexto.setBackground(Color.LIGHT_GRAY);
        campoTexto.setLayout(null);
        campoTexto.setVisible(true);
        interno.add(campoTexto);
        //=======================================================
        //dentro do JDesktop
        pesquisa.setText("");
        pesquisa.setBounds(750,25,300,30);
        interno.add(pesquisa);
        
        cPesquisa.setText("Pesquisa rapida: ");
        cPesquisa.setForeground(Color.black);
        cPesquisa.setBounds(750,5,200,20);
        interno.add(cPesquisa);
        
        pesquisar.setText("");
        pesquisar.setBounds(1060,25,30,30);
        interno.add(pesquisar);
        //=======================================================
        //estanciando as clases 
        
        cadastro telaCadastro = new cadastro();
        bairros telaBairros = new bairros();
        
        //============================================
        ///botao para cadastro
        cadastro.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent w) {
                try {
                    interno.add(telaCadastro);
                    telaCadastro.setSelected(true);
                    telaCadastro.telaCadastro();
                    telaCadastro.setVisible(true);
                    
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                } catch (PropertyVetoException ex) {
                    Logger.getLogger(telaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
        //botao para cadastros de bairros 
        bairros.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent w) {
                try {
                    interno.add(telaBairros);
                    telaBairros.telaBairros();
                    telaBairros.setSelected(true);
                    telaBairros.setVisible(true);
                    
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                } catch (PropertyVetoException ex) {
                    Logger.getLogger(telaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
        // botão para sair e fechar
        sair.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent w) {
                
                dispose();
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        
    }
    
}
