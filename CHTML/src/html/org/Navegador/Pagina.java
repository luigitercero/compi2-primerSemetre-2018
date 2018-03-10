/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package html.org.Navegador;

import compi2.Etiqueta.CHTML;

import compi2.Etiqueta.Consolas;
import java.awt.GridBagConstraints;
import javax.swing.JScrollPane;

/**
 *
 * @author luigitercero
 */
public class Pagina {

    public CHTML getChtml() {
        return chtml;
    }

    public void setChtml(CHTML chtml) {
        this.chtml = chtml;
    }

    private CHTML chtml;



    Pagina(String text, JScrollPane scroll, CHTML panel, GridBagConstraints gbc) {
        this.ruta = text;
        this.scroll = scroll;
        this.gbc = gbc;
        this.chtml = panel; //To change body of generated methods, choose Tools | Templates.
    }

    public Consolas getConsola() {
        return consola;
    }

    private Consolas consola;


    public GridBagConstraints getGbc() {
        return gbc;
    }

    private GridBagConstraints gbc;
    private JScrollPane scroll;



    public String getRuta() {
        return ruta;
    }

    public JScrollPane getChtm() {
        return scroll;
    }

    private final String ruta;


    
}
