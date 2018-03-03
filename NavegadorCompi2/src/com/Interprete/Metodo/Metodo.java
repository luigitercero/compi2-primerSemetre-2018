/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interprete.Metodo;

import Simbol.Metodo.Estructura;
import com.Interprete.EXP.TipoObjeto;
import com.Iterprete.Control.Instruccion;
import com.Navegador.JS.Interprete;
import com.TreeParser.Node;
import simbol.tablasimbolos.TablaSimbolo;

/**
 *
 * @author luigitercero
 */
public class Metodo extends Instruccion {

    public Object retorno;

    public Metodo(Interprete aThis) {
        inter = aThis;
        retorno = null;
    }

    public Object getMetodo(Node nodo) {
        TablaSimbolo temp = inter.tabla;
        String nombre = nodo.childNode.get(0).token.valueString;
        Node parametro = null;
        int tamanio = 0;
        if (nodo.childNode.size() == 2) {
            tamanio = nodo.childNode.get(1).childNode.size();
            parametro = nodo.childNode.get(1);
            
            if (parametro.getNezt() == 0){
            System.out.println("siguiente nodo "+parametro.getNezt());
            }
        }
        nombre = nombre + "_" + tamanio;
        Estructura estructura = inter.metodo.geMetodo(nombre);
        try {
            TablaSimbolo tablaMetodo = new TablaSimbolo(inter.tabla.ambitoGlobal);
            tablaMetodo.aumentarAmbito();
            tablaMetodo.addVariable("retorno", null, -1);
            if (estructura.parametro != null) {
                for (Node node : estructura.parametro.childNode) {
                    
                    Node par = parametro.nextChlid();
                    Object value = inter.exp.evaluar(par);
                    //System.out.println("iteracion" + value);
                    TipoObjeto tipo = new TipoObjeto();
                    tablaMetodo.addVariable(node.token.valueString, value, tipo.tipoObjecto(value));
                }
                parametro.nextChlidReset();
            }

            inter.tabla = tablaMetodo;
            inter.listacuerpo(estructura.cuerpo, false);

            retorno = inter.tabla.getValVariable("retorno");
            tablaMetodo.disminuirAmbito();
            inter.tabla = temp;
            return retorno;

        } catch (Exception e) {
            
            System.err.println("error al ejecutar metodo " + e);
        }

        inter.tabla = temp;
        return null;
    }

}
