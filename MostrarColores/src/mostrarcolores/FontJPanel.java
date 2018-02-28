/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mostrarcolores;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author luigitercero
 */
public class FontJPanel extends JPanel{
      
       public void paintComponent(Graphics g){
           
           g.setFont(new Font ("Serif",Font.BOLD,12));
           g.drawString("Serif 12 puntos, negrita", 20, 50);
           
           g.setFont(new Font ("Monospaced",Font.ITALIC,24));
           g.drawString("Monospaced 24 puntos, cursiva", 20, 70);
           
           g.setFont(new Font ("SansSerif",Font.PLAIN,14));
           g.drawString("SansSerif 14 puntos, simple", 20, 90);
           
           g.setColor(Color.red);
           g.setFont(new Font("serfi",Font.BOLD+Font.ITALIC,18));
           g.drawString(g.getFont().getName()+ " "+g.getFont().getSize()+ "pubtos, negrita", 20, 110);
           
           
       }
}
