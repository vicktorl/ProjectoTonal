/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author sala_17
 */
public class VentanaPrincipal extends JFrame implements ActionListener {
    
    public PanelBotones panelBtnes;

    public VentanaPrincipal() {
        this.inicializarComponentes();
    }
    public void inicializarComponentes() {
        this.panelBtnes = new PanelBotones();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
