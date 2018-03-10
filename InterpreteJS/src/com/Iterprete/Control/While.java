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
public class While extends Instruccion {

    public While(Node nodo, Interprete aThis) {
        inter = aThis;
    }

    public int ejecutar(Node nodo, boolean estoyEnCiclo) {
        int ex = 0;
        int interator = 0;
        //---------------------> Hijo 0, condicion
        //---------------------> Hijo 1, accion si condicion true
        Object a = inter.exp.evaluar(nodo.childNode.get(0));
        try {
            while ((boolean) a) {
                inter.tabla.aumentarAmbito();
                if (nodo.childNode.get(1).childNode.size() > 0) {
                    ex = inter.listacuerpo(nodo.childNode.get(01), true);
                    if (ex == 2) {
                        ex = 0;
                        inter.tabla.disminuirAmbito();
                        break;
                    } else if (ex == 1) {
                        ex = 1;
                        inter.tabla.disminuirAmbito();
                        break;
                    }
                }
                inter.tabla.disminuirAmbito();
                a = inter.exp.evaluar(nodo.childNode.get(0));
                interator++;
            }
        } catch (Exception e) {
          inter.  enviarError("error de semantica: no es posible ejecutar el while resultado de declaracion  : " + a +" "+ (nodo.posl+1)+ " " +(nodo.posr+1));
           
             ex = 2;
        }

        return ex;

    }

}
