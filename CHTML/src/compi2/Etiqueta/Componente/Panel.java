/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compi2.Etiqueta.Componente;

import compi2.Etiqueta.CHTML;
import compi2.Etiqueta.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author luigitercero
 */
public class Panel extends CHTML {

    private String justificado;

    public void addAtributo(String atributo, String valor) {
        switch (atributo.toLowerCase()) {
            case "ancho":
                this.setSize(Integer.parseInt(valor), this.getSize().height);
                this.setPreferredSize(new Dimension(Integer.parseInt(valor), this.getSize().height));
                break;
            case "alto":
                this.setSize(this.getSize().width, Integer.parseInt(valor));
                this.setPreferredSize(new Dimension(this.getSize().width, Integer.parseInt(valor)));
                break;
            case "fondo":
                Color c = new Color();
                this.setBackground(c.getColor(valor));
                break;
            case "alineado":

                break;
            case "grupo":
            case "id":
            case "ruta":
            case "click":
            case "valor":

        }
//To change body of generated methods, choose Tools | Templates.
    }

    private void cabiarAlineado(String alineado) {
        switch (alineado.toLowerCase()) {
            case "centrado":
                this.justificado = "";
                this.setLayout(new MigLayout("center"));
                break;
            case "derecha":
                this.justificado = "";
                this.setLayout(new MigLayout("right"));
                break;
            case "izquierda":
                this.justificado = "";
                this.setLayout(new MigLayout("left"));
                break;
            case "justificado":
                this.justificado = "pushx,growx";
                break;

        }
    }

    public void addComponent(Component c) {
        add(c, justificado);
    }
}
