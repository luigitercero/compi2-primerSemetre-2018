/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interprete.EXP;

import com.Navegador.JS.Interprete;
import com.TreeParser.Node;

/**
 *
 * @author luigitercero
 */
public class Component {

    public String id;
    public String cadena;

    public Component(String id, String cadena) {
        this.id = id;
        this.cadena = cadena;
    }

    public Component(String id, Node cadena) {
        this.id = id;

    }

    Component(String valueString, Node get, Interprete inter) {
        this.id = id;
        Object valor
                = inter.exp.evaluar(get);
        
        cadena = valor.toString();
        
//To change body of generated methods, choose Tools | Templates.
    }
}
