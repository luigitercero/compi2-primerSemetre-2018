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
    Node parametro;

    TablaSimbolo tablaMetodo;
    public Estructura estructura;

    public Metodo(Interprete aThis, Node nodo) {
        inter = aThis;
        retorno = null;
        parametro = null;
        tablaMetodo = null;
        GetEstructura(nodo);
    }

        public Metodo(Interprete aThis) {
        inter = aThis;
        retorno = null;
        parametro = null;
        tablaMetodo = null;
        //GetEstructura(nodo);
    }

    
    private Estructura GetEstructura(Node nodo) {
        String nombre = nodo.childNode.get(0).token.valueString;

        int tamanio = 0;
        if (nodo.childNode.size() == 2) {
            tamanio = nodo.childNode.get(1).childNode.size();
            parametro = nodo.childNode.get(1);

        }
        nombre = nombre + "_" + tamanio;
        this.estructura = inter.metodo.geMetodo(nombre);
        return this.estructura;
    }

    private void CargarParametros(Node parametro1) {
        if (parametro1 != null) {
            parametro.nextChlidReset();
            for (Node node : parametro1.childNode) {

                Node par = parametro.nextChlid();
                Object value = inter.exp.evaluar(par);
                //System.out.println("iteracion" + value);
                TipoObjeto tipo = new TipoObjeto();
                tablaMetodo.addVariable(node.token.valueString, value, tipo.tipoObjecto(value));
            }
            parametro.nextChlidReset();
        }
    }

    private void aumetarAmbito() {
        tablaMetodo = new TablaSimbolo(inter.tabla.ambitoGlobal);
        tablaMetodo.aumentarAmbito();
        tablaMetodo.addVariable("retorno", null, -1);
    }

    private void disminuirAmbito(TablaSimbolo temp) {
        retorno = inter.tabla.getValVariable("retorno");
        tablaMetodo.disminuirAmbito();
        inter.tabla = temp;
    }

    public Object Ejecutar() {
        TablaSimbolo temp = inter.tabla;

        try {
            aumetarAmbito();

            CargarParametros(estructura.parametro);

            inter.tabla = tablaMetodo;

            inter.listacuerpo(estructura.cuerpo, false);

            disminuirAmbito(temp);
            return retorno;

        } catch (Exception e) {

            System.err.println("error al ejecutar metodo " + e);
        }

        inter.tabla = temp;
        return null;
    }

    public void addCuerpo(Node get) {
        this.estructura = new Estructura("anonimo", null, get);
    }

}
