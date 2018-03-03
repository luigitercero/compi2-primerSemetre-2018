/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compi2.Etiqueta.Componente;

import java.awt.Component;
import java.awt.Dimension;

/**
 *
 * @author luigitercero
 */
public class Enlace extends Component {

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
            case "alineado":
            case "grupo":
            case "id":
            case "ruta":
            case "click":
            case "valor":

        }
//To change body of generated methods, choose Tools | Templates.
    }

    public void addText(String b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
