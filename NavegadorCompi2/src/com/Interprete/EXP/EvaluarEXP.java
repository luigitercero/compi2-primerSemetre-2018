/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interprete.EXP;

import com.Interprete.EXP.Funcion.Sumar;
import static com.Interprete.EXP._Token.*;
import com.Iterprete.Control.Instruccion;
import com.Navegador.JS.Interprete;
import com.TreeParser.Node;
import simbol.tablasimbolos.TablaSimbolo;

/**
 *
 * @author luigitercero
 */
public class EvaluarEXP extends Instruccion {

    public Object valor;
    private String tipo;
   

    public EvaluarEXP() {
        this.valor = null;
        this.tipo = "";
    }

    public EvaluarEXP(Interprete interprete) {
        this.valor = null;
        this.tipo = "";
        this.inter = interprete;
    }

    public Object evaluar(Node nodo) {
        int size = nodo.childNode.size();

        switch (size) {
            case 3:
                this.valor = evaluarOperacion(nodo);
                return valor;
            case 2:

                break;
            case 1:
                this.valor = evaluarDato(nodo.childNode.get(0));
                return valor;

            default:
        }
        return null;
    }

    private Object evaluarOperacion(Node nodo) {
        String operador = nodo.childNode.get(1).term.name;
        switch (operador) {
            case mas:
                return evaluarMas(nodo.childNode.get(0), nodo.childNode.get(2));
        }
        return null;
    }

    private Object evaluarMas(Node izq, Node der) {
        Sumar suma = new Sumar(izq, der,this);
        return suma.evaluar();
    }

    private Object evaluarDato(Node nodo) {
        String termino = nodo.term.getName();
        switch (termino) {
            case numero:
                return evaluarNumero(nodo);
            case decimal:
                return evaluarNumero(nodo);
            case cadena:
                String a = nodo.token.valueString.replaceAll("\"", "");
                return a;
            case falso:
                return false;
            case verdadero:
                return true;
            case date:
                return new Date(nodo.token.valueString.replaceAll("\'", ""));
            case dateTieme:
                return new DateTime(nodo.token.valueString.replaceAll("\'", ""));
            case "ID":
                return inter.tabla.getValVariable(nodo.token.getValueString());
            case "vector":
                Object cv = evaluar(nodo.childNode.get(1));
                if (cv instanceof Long) {
                    Long l = (long) cv;
                    return inter.tabla.getValVariable(nodo.childNode.get(0).token.getValueString(), l.intValue());
                }

            case "getMetodo":
                com.Interprete.Metodo.Metodo m = new com.Interprete.Metodo.Metodo(inter);
                return m.getMetodo(nodo);

        }
        return null;
    }

    private Object evaluarNumero(Node nodo) {
        if (nodo.token.Tipo == numero) {
            return Long.parseLong(nodo.token.valueString);
        } else {
            return Double.parseDouble(nodo.token.valueString);
        }
    }

}
