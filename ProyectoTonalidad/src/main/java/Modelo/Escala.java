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
        inicializarcomponentes();
    }
    
      public void inicializarcomponentes() {

        Graphics g = this.tabla.getGraphics();
        g.setColor(Color.BLACK);
        g.drawOval(20,20,20,20);
        g.clearRect(780, 110, 110, 110);
      }
      
       public void agregarNota(Graphics g){
       
        g.drawOval(30, 50, 690, 450);
        
    }
      
}
