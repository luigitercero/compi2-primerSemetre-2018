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
        
        
              //---------------------> Hijo 0, condicion
        //---------------------> Hijo 1, accion si condicion true
        Object a = inter.exp.evaluar(nodo.childNode.get(0));
        try {
              while ((boolean) a) {
                 inter.tabla.aumentarAmbito();
                if (nodo.childNode.get(1).childNode.size() > 0) {
                    int ex = inter.listacuerpo(nodo.childNode.get(01), true);
                    if (ex == 0 || ex == 1) {

                        break;
                    }
                }
               inter.tabla.disminuirAmbito();
                a = inter.exp.evaluar(nodo.childNode.get(0));
            }
        } catch (Exception e) {
        }
          
    

        return 0;

    }

}