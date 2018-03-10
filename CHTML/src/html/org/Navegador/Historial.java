/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package html.org.Navegador;

import compi2.Etiqueta.CHTML;

import compi2.Etiqueta.Consolas;
import java.awt.GridBagConstraints;
import java.util.ArrayList;
import javax.swing.JScrollPane;

/**
 *
 * @author luigitercero
 */
public class Historial {

    ArrayList<Pagina> pag;
    int actual;

    public Historial() {
        pag = new ArrayList<>();
        actual = -1;
    }

    public Pagina siguiente() {
        actual++;
        if (pag.size() > actual) {
            return pag.get(actual);
        } else {
            actual = pag.size() - 1;

        }
        return pag.get(actual);
    }
    
    public Pagina atras() {
        actual--;
        if (0 <= actual) {
            return pag.get(actual);
        } else {
            actual = 0;

        }
        return pag.get(actual);
    }
    
   public Pagina getActual(){
   
   return pag.get(actual);
   }

    void agregarHistorial(String text, CHTML panel, GridBagConstraints gbc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    

    void agregarHistorial(String text, JScrollPane scroll, CHTML panel, GridBagConstraints gbc) {
         actual++;
        
        this.pag.add(actual, new Pagina(text, scroll,panel,gbc)); //To change body of generated methods, choose Tools | Templates.
    }

}
