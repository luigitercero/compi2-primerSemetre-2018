/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Iterprete.Control;

import com.Navegador.JS.Interprete;
import com.TreeParser.Node;



/**
 *
 * @author luigitercero
 */
public class IF1 extends Instruccion {



    public IF1(Node nodo, Interprete aThis) {
       inter = aThis;
    }

   /*
    public IF1(Node IF, Instruccion instr) {
        this.instr = instr;
        
    }*/

    public int ejecutar(Node nodo, boolean estoyEnCiclo) {
        //---------------------> Hijo 0, la condicion
        //---------------------> Hijo 1, la accion 
        int salida = 0;
        Object a;
        a = inter.exp.evaluar(nodo.childNode.get(0));
        try {
            if ((Boolean) a) {
                inter.tabla.aumentarAmbito();
                salida = inter.listacuerpo(nodo.childNode.get(1),estoyEnCiclo);
                inter.tabla.disminuirAmbito();
            }
        } catch (Exception e) {
            System.err.println("error en el if1 "+ nodo.posl+ " " +nodo.posr);
             salida = 2;
            //errorhtml.agregarError(Semantic, "error con operador booleano ", nameArchivo, nodo);
        }

        return salida;
    }

}
