/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compi2.Etiqueta;

import compi2.Etiqueta.Componente.Panel;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author luigitercero
 */
public class CHTML extends JPanel {

    GridBagConstraints gbc;
    private int fila;

    public CHTML() {
        super();
        fila = 0;
        gbc = new GridBagConstraints();
        this.setLayout(new MigLayout());

    }

    public void addPanel(Panel jpanel) {
        
        add(jpanel, "pushx 200,growx");
       //add(jpanel, "span, split2,grow, w 180, h 100");

    }

    public void addSalto() {
        
         JLabel a= new JLabel("esto es una pruo\n jisjisijs");
         a.setBackground(java.awt.Color.blue);
         a.setOpaque(true);
         a.setForeground(java.awt.Color.red);
        add(a, "al right,wrap");
    }

}
