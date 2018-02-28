/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mostrarcolores;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author luigitercero
 */
public class MostrarColores2JFrame  extends JFrame{
    private JButton cambiarColorJButton;
    private Color color = Color.LIGHT_GRAY;
    private JPanel coloresJPanel1;
    
    public MostrarColores2JFrame(){
        super("Uso de JColorechosser");
        coloresJPanel1 = new JPanel();
        coloresJPanel1.setBackground(color);
        cambiarColorJButton = new JButton("cambiar color");
        cambiarColorJButton.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             color = JColorChooser.showDialog(MostrarColores2JFrame.this, "seleccione Color", color);
             if (color == null)
                 color = Color.lightGray;
             coloresJPanel1.setBackground(color);
//To change body of generated methods, choose Tools | Templates.
            }
        });
        add(coloresJPanel1,BorderLayout.CENTER);
        add(cambiarColorJButton,BorderLayout.SOUTH);
        setSize(400,130);
        setVisible(true);
    
    }
}
