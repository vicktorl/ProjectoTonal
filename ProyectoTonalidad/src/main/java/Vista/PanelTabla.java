/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Viktor
 */
public class PanelTabla extends JPanel {

    public JTextArea Texto;
    public JTextField pentatonic;

    public PanelTabla() {
        this.inicializarcomponentes();
    }

    public void inicializarcomponentes() {

        this.setBackground(Color.CYAN);
        this.Texto = new JTextArea(25, 65);
        this.Texto.setEnabled(false);
        this.add(this.Texto);
        Font font = new Font("", Font.BOLD, 15);
        Texto.setFont(font);
        
        this.Texto.append(System.getProperty("line.separator"));
        this.Texto.append("                               ESCALA DE :");
        this.Texto.append(System.getProperty("line.separator"));
        this.Texto.append(System.getProperty("line.separator"));
        this.Texto.append(System.getProperty("line.separator"));
        this.Texto.append(System.getProperty("line.separator"));
        this.Texto.append(System.getProperty("line.separator"));
         this.Texto.append(System.getProperty("line.separator"));
        this.Texto.append(System.getProperty("line.separator"));
        this.Texto.append(System.getProperty("line.separator"));
        this.Texto.append(System.getProperty("line.separator"));
        this.Texto.append(System.getProperty("line.separator"));
        this.Texto.append("                               ESCALA PENTATONICA DE :");
    }

    public void paint(Graphics g) {

        int linea1 = 100;
        int linea2 = 300;
        super.paint(g);
        for (int i = 0; i < 5; i++) {
            g.drawLine(700, linea1, 70, linea1);
            linea1 += 20;

        }
        for (int i = 0; i < 5; i++) {
            g.drawLine(700, linea2, 70, linea2);
            linea2 += 20;
        }
    }

    public void paint1(Graphics e) {
        e.drawOval(12, 13, 13, 13);
    }
}
