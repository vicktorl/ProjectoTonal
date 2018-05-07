/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author fernando
 */
public class PanelFormulario extends JPanel {
    
    private JLabel lblIngresarAcordes;
    private JTextField tfIngresarAcordes;

    public PanelFormulario() {
        this.inicializarComponentes();
    }
    
    public void inicializarComponentes(){
        
        this.lblIngresarAcordes = new JLabel("Ingresar Acordes");
        this.add(this.lblIngresarAcordes);
        this.tfIngresarAcordes = new JTextField("                        ");
        this.add(this.tfIngresarAcordes); 
    }

    public JTextField getTfIngresarAcordes() {
        return tfIngresarAcordes;
    }

    public void setTfIngresarAcordes(JTextField tfIngresarAcordes) {
        this.tfIngresarAcordes = tfIngresarAcordes;
    }
    
}
