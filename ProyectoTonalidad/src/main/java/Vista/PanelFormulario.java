/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.GridLayout;
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
    private JLabel lblTono;
    private JTextField tfTono;

    public PanelFormulario() {
        this.inicializarComponentes();
    }

    public void inicializarComponentes() {

        GridLayout grid = new GridLayout(12, 1);
        this.setLayout(grid);

        this.lblIngresarAcordes = new JLabel("Ingresar Acordes");
        this.add(this.lblIngresarAcordes);

        this.tfIngresarAcordes = new JTextField();
        this.add(this.tfIngresarAcordes);

        this.lblTono = new JLabel("Tonalidad : ");
        this.add(this.lblTono);

        this.tfTono = new JTextField();
        this.add(this.tfTono);

    }

    public JTextField getTfIngresarAcordes() {
        return tfIngresarAcordes;
    }

    public void setTfIngresarAcordes(JTextField tfIngresarAcordes) {
        this.tfIngresarAcordes = tfIngresarAcordes;
    }

    public JLabel getLblTono() {
        return lblTono;
    }

    public void setTfTono(String tfTono) {
        this.tfTono.setText(tfTono);

    }
}
