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

        Object valor = inter.exp.evaluar(nodo.childNode.get(0));
        Node cuerpoSwithc = nodo.childNode.get(1);

        int salida = 0;
        Object valor1 = null;
        for (Node node : cuerpoSwithc.childNode) {

            if (node.childNode.get(0).term.getName().equalsIgnoreCase("exp")) {
                valor1 = inter.exp.evaluar(node.childNode.get(0));
            }

            if (valor.equals(valor1)) {
                inter.tabla.aumentarAmbito();
                try {
                    salida = inter.listacuerpo(node.childNode.get(1), true);
                    inter.tabla.disminuirAmbito();

                    if (salida == 2) {
                        salida = 0;
                        inter.tabla.disminuirAmbito();
                        break;
                    } else if (salida == 1) {
                        salida = 1;
                        inter.tabla.disminuirAmbito();
                        break;
                    }
                } catch (Exception e) {
                    inter.  enviarError("error de semantica: no es posible ejecutar el swithc resultado de declaracion  : " +" "+ (nodo.posl+1)+ " " +(nodo.posr+1));
                }

            }

            if (node.term.getName().equalsIgnoreCase("defecto")) {
                 inter.tabla.aumentarAmbito();
                try {
                     salida = inter.listacuerpo(node.childNode.get(0), true);
                inter.tabla.disminuirAmbito();

                if (salida == 2) {
                    salida = 0;
                    inter.tabla.disminuirAmbito();
                    break;
                } else if (salida == 1) {
                    salida = 1;
                    inter.tabla.disminuirAmbito();
                    break;
                }
                } catch (Exception e) {
                  inter.  enviarError("error de semantica: no es posible ejecutar el swithc resultado de declaracion  : " +" "+ (nodo.posl+1)+ " " +(nodo.posr+1));
                }
               
               
            }

        }

        return salida;

    }

}
