/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mostrarcolores;

import compi2.Etiqueta.Boton;
import compi2.Etiqueta.CHTML;
import compi2.Etiqueta.Panel;
import compi2.HTML.Navegador;
//import html.HTML.Etiqueta.Navegador;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author luigitercero
 */
public class MostrarColores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        CHTML chtml = new CHTML();
        chtml.setBackground(Color.BLUE);
        for (int i = 0; i < 10; i++) {

        }
        Panel panel = new Panel();
        Panel panel1 = new Panel();
        Boton boton = new Boton();
        Boton boton1 = new Boton();
        Boton boton3 = new Boton();
        
        
        panel.add(boton, BorderLayout.NORTH);
        panel.add(boton1, BorderLayout.NORTH);
        panel1.add(boton3, BorderLayout.NORTH);
        Dimension dim = boton.getPreferredSize();
        int x = boton.getPreferredSize().height;
        int y = boton.getPreferredSize().width;
        
        System.out.println(y);
        panel.setLayout(new MigLayout("right"));
        panel.setLayout(new MigLayout("grow"));
       boton.setPreferredSize(new Dimension(150, 10)); 
        
        chtml.addPanel(panel);
        chtml.addSalto();
        chtml.addPanel(panel1);
        
        Navegador marco = new Navegador(chtml);

        
        marco.setVisible(true);
        /*
        MostrarColores2JFrame aplicacion = new MostrarColores2JFrame();
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JFrame marco = new JFrame("uso de tipos de letra");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FontJPanel fontJPanel = new FontJPanel();
        fontJPanel.add(new  Button("hola"));
        
        marco.add(fontJPanel);
        marco.setSize(475,170);
        marco.setVisible(true);
         */
    }

}
