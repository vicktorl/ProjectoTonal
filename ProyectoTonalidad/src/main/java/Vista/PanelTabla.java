/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Viktor
 */
public class PanelTabla extends JPanel{
    public JTextArea Texto;

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
        
    }
}