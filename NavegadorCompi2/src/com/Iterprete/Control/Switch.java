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
public class Switch extends Instruccion {



    public Switch(Node nodo, Interprete aThis) {
       inter = aThis;
    }


    public int ejecutar(Node nodo, boolean estoyEnCiclo) {
        
                Node valor = nodo.childNode.get(0);
        Node cas = nodo.childNode.get(1);
        Node defe = nodo.childNode.get(2);
        int salida = 0;
        /*
        for (Node nodeTree : cas.childNode) {

            if ((boolean) evaluarIGUAL(valor, nodeTree)) {
                inter.tabla.aumentarAmbito();
                salida = inter.listacuerpo(nodeTree.childNode.get(0), estoyEnCiclo);
                inter.tabla.disminuirAmbito();
                return salida;
            }

        }
        if (defe.childNode.size() != 0) {
            inter.tabla.aumentarAmbito();
            salida = inter.listacuerpo(defe.childNode.get(0), estoyEnCiclo);
            inter.tabla.disminuirAmbito();
            return salida;
        }*/
        return salida;
        
     

    }

}