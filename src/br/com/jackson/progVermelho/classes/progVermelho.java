/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jackson.progVermelho.classes;

import br.com.jackson.proVermelho.telas.loguin;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @jacksonsr45@gmail.com 
 */
public class progVermelho {
    public static void main(String[] ar){
        loguin loguin = new loguin();
        loguin.loguin();
        loguin.setSize(400,250);
        loguin.setResizable(false);
        loguin.setLocationRelativeTo(null);
        URL url = loguin.getClass().getClassLoader().getResource("");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        loguin.setIconImage(iconeTitulo);
        loguin.setTitle("Loguin");
        loguin.setDefaultCloseOperation(EXIT_ON_CLOSE);
        loguin.setVisible(true);      
    }
    
}
