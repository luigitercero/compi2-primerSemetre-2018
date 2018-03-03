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
public class IF2 extends Instruccion {

    public IF2(Node nodo, Interprete aThis) {
        inter = aThis;
    }

    public int ejecutar(Node nodo, boolean estoyEnCiclo) {

        //---------------------> Hijo 0, condicion
        //---------------------> Hijo 1, accion si condicion true
        //---------------------> Hijo 2, accion si condicion false 
        int salida = 0;
        Object a = inter.exp.evaluar(nodo.childNode.get(0));
        try {
            if ((Boolean) a) {
                inter.tabla.aumentarAmbito();

                salida = inter.listacuerpo(nodo.childNode.get(1), estoyEnCiclo);

                inter.tabla.disminuirAmbito();
            } else {

                inter.tabla.aumentarAmbito();
                salida = inter.listacuerpo(nodo.childNode.get(2), estoyEnCiclo);

                inter.tabla.disminuirAmbito();
            }
        } catch (Exception e) {
            System.err.println("error en el if2 " + nodo.posl + " " + nodo.posr);
            salida = 2;
            // errorhtml.agregarError(Semantic, "error con operador booleano ", nameArchivo, nodo);
        }

        return salida;

    }

}
