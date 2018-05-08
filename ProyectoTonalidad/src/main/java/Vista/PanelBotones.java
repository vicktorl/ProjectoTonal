/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

//import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author sala_17
 */
public class PanelBotones extends JPanel  {

    public JButton btnMostrarEsala;
    public JButton btnMostrarTonalidad;
    public JButton btnLimpiar;

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
