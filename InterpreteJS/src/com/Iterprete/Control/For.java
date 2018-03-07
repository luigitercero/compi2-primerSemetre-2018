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
public class For extends Instruccion {

    public For(Node nodo, Interprete aThis) {
        inter = aThis;
    }

    /*
    public IF1(Node IF, Instruccion instr) {
        this.instr = instr;
        
    }*/
    public int ejecutar(Node nodo, boolean estoyEnCiclo) {

        Node AgregarV = nodo.childNode.get(0);//varuable
        Node condicion = nodo.childNode.get(1);//condicione
        Node sentencia = nodo.childNode.get(2);//sentencia
        Node cuerpo = nodo.childNode.get(3);//cuerpo
        inter.tabla.aumentarAmbito();
        // ejecuarAgregarV(AgregarV);
        Object a = inter.listacuerpo(condicion,false);

        try {
            while ((boolean) a) {
                inter.tabla.aumentarAmbito();
                if (nodo.childNode.get(1).childNode.size() > 0) {
                    int ex = inter.listacuerpo(cuerpo, true);
                    if (ex == 0 || ex == 1) {

                        break;
                    }
                }
                inter.tabla.disminuirAmbito();

                inter.tabla.aumentarAmbito();
                inter.listacuerpo(sentencia, false);
                inter.tabla.disminuirAmbito();

                a = inter.listacuerpo(condicion,false);

            }

            inter.tabla.disminuirAmbito();
        } catch (Exception e) {
        }
        return 0;

    }

}
