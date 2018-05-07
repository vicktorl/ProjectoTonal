/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

//import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author sala_17
 */
public class PanelBotones extends JPanel  {

    private JButton btnMostrarEsala;
    private JButton btnMostrarTonalidad;
    private JButton btnLimpiar;

    public PanelBotones() {
        this.inicializarComponentes();
    }

    public void inicializarComponentes(){

        
        this.btnLimpiar = new JButton ("Limpiar");
        this.add(this.btnLimpiar);
        
        this.btnMostrarEsala = new JButton("Mostrar Escala");
        this.add(this.btnMostrarEsala);
        
        this.btnMostrarTonalidad = new JButton(" Mostrar Tonalidad");
        this.add(this.btnMostrarTonalidad);
        
    }
}
