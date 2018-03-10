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
        int ex = 0;
        inter.asignarValor(AgregarV);
        Object a = inter.exp.evaluar(condicion);

        try {
            while ((boolean) a) {
                inter.tabla.aumentarAmbito();
                if (nodo.childNode.get(1).childNode.size() > 0) {
                    ex = inter.listacuerpo(cuerpo, true);
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

                inter.asignarValor(sentencia);

                a = inter.exp.evaluar(condicion);

            }

            inter.tabla.disminuirAmbito();
        } catch (Exception e) {
                inter.  enviarError("error de semantica: no es posible ejecutar el para resultado de declaracion  : " + a +" "+ (nodo.posl+1)+ " " +(nodo.posr+1));
           
        }
        return ex;

    }

}
