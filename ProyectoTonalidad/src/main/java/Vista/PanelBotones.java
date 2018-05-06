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
public class PanelBotones extends JPanel implements ActionListener {

    private JButton btnMostrarEsala;
    private JButton btnMostrarTonalidad;
    private JButton btnLimpiar;

    public PanelBotones() {
        this.inicializarComponentes();
    }

    public void inicializarComponentes(){
        
        //FlowLayout distribution = new FlowLayout();
        //this.SetLayout(distribution);
        
        this.btnLimpiar = new JButton ("Limpiar");
        this.btnLimpiar.addActionListener(this);
        this.add(this.btnLimpiar);
        
        this.btnMostrarEsala = new JButton("Mostrar Escala");
        this.btnMostrarEsala.addActionListener(this);
        this.add(this.btnMostrarEsala);
        
        this.btnMostrarTonalidad = new JButton(" Mostrar Tonalidad");
        this.btnMostrarTonalidad.addActionListener(this);
        this.add(this.btnMostrarTonalidad);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
