/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compi2.Etiqueta;

import java.awt.Dimension;
import javax.swing.JButton;

/**
 *
 * @author luigitercero
 */
public class Boton extends JButton{
    
    public Boton(){
        super("hola");
       // this.reshape(30, 30,30, 30);
        //this.setBounds(10, 25, 900, 900);
        this.setSize(100, 100);
        this.setPreferredSize(new Dimension(100, 100));
    }
}
