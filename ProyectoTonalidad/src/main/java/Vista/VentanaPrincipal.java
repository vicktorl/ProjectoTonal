/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author sala_17
 */
public class VentanaPrincipal extends JFrame implements ActionListener {
    
    private PanelBotones panelBtnes;

    public VentanaPrincipal() {
        this.inicializarComponentes();
    }
    public void inicializarComponentes() {
        
        this.panelBtnes = new PanelBotones();
        this.add(this.panelBtnes,BorderLayout.EAST);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Tonalidad");
        this.setSize(400,400);
        this.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
