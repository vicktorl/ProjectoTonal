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
    
    public PanelBotones panelBtnes;
    public PanelFormulario panelForm;
    public PanelTabla panelTabla;

    public VentanaPrincipal() {
        this.inicializarComponentes();
    }
    public void inicializarComponentes() {
        
        this.panelBtnes = new PanelBotones();
        this.add(this.panelBtnes,BorderLayout.PAGE_START);
        
        this.panelForm = new PanelFormulario();
        this.add(this.panelForm,BorderLayout.LINE_END);
        
        this.panelTabla = new PanelTabla();
        this.add(this.panelTabla,BorderLayout.CENTER);
        
        panelBtnes.btnMostrarEsala.addActionListener(this);
        panelBtnes.btnLimpiar.addActionListener(this);
        panelBtnes.btnMostrarTonalidad.addActionListener(this);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Tonalidad");
        this.setSize(1000,600);
        this.setVisible(true);        
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelBtnes.btnLimpiar) {
            
        } else if (e.getSource() == panelBtnes.btnMostrarEsala) {
            
            
        } else if (e.getSource() == panelBtnes.btnMostrarTonalidad) {
        }
    }
}