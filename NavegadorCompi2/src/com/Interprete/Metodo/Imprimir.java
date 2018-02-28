/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interprete.Metodo;

import com.Iterprete.Control.Instruccion;
import com.Navegador.JS.Interprete;
import com.TreeParser.Node;

/**
 *
 * @author luigitercero
 */
public class Imprimir extends Instruccion {

    public Imprimir(Node get, Interprete aThis) {
       Object value = aThis.exp.evaluar(get.childNode.get(0));
        aThis.consola =aThis.consola + "\n"+ value.toString() ;
        System.out.println("    imprimiendo '"+value.toString()+"' poss: "+(get.childNode.get(1).token.Location.Line+1)+"\n");
    }


    
}
