/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interprete.Metodo;

import com.Navegador.JS.Interprete;
import com.TreeParser.Node;
import javax.swing.JOptionPane;

/**
 *
 * @author luigitercero
 */
public class Mensaje {

    public Mensaje(Node get, Interprete aThis) {
        Object value = aThis.exp.evaluar(get.childNode.get(0));

        
        JOptionPane.showMessageDialog(null, value.toString() );
        aThis.enviarMensaje("    enviando mensaje '" + value.toString() + "' poss: " + (get.childNode.get(1).token.Location.Line + 1) + "\n");
    }
    
    public void Mostrar(){
    
    
    }
}
