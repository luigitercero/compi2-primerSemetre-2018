/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interprete.EXP;

import com.Interprete.EXP.Funcion.IgualIgual;
import com.Interprete.EXP.Funcion.MenorIgual;
import com.Interprete.EXP.Funcion.Restar;
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
            case menos:
                return evaluarMenos(nodo.childNode.get(0), nodo.childNode.get(2));
            case igual:
                return evaluarIgual(nodo.childNode.get(0), nodo.childNode.get(2));
            case menorIgual:
                return evaluarMenorIgual(nodo.childNode.get(0), nodo.childNode.get(2));
        }
        System.err.println("no se encontro operador para evaluar");
        return null;
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

    private Object evaluarIgual(Node get, Node get0) {
        IgualIgual igualar = new IgualIgual(get, get0, this);
        return igualar.evaluar(); //To change body of generated methods, choose Tools | Templates.
    }

    private Object evaluarMas(Node izq, Node der) {
        Sumar suma = new Sumar(izq, der, this);
        return suma.evaluar();
    }

    private Object evaluarMenorIgual(Node get, Node get0) {
        MenorIgual v = new MenorIgual(get, get0, this);
//To change body of generated methods, choose Tools | Templates.
        return v.evaluar();
    }

    private Object evaluarMenos(Node get, Node get0) {
     Restar re = new Restar(get, get0, this);
        return re.evaluar();
    }//To change body of generated methods, choose Tools | Templates.
    

}
