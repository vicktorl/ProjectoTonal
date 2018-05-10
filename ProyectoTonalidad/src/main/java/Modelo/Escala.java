/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.PanelTabla;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Viktor
 */
public class Escala {
    
    public PanelTabla tabla;

    public Escala() {
    }
    
      public void mostrarEscala() {

        Graphics g = this.tabla.getGraphics();
        g.setColor(Color.WHITE);
        g.drawLine(30, 200, 30, 275);
        g.setColor(Color.BLACK);
        g.drawLine(10, 200, 50, 200);
        g.drawLine(10, 275, 50, 275);
      }
}
