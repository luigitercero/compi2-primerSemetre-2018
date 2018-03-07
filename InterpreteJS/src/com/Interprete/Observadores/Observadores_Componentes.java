/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interprete.Observadores;

import Simbol.Metodo.Estructura;
import Simbol.Metodo.Metodo;
import com.Interprete.EXP.Component;
import com.Navegador.JS.Interprete;
import com.TreeParser.Node;

/**
 *
 * @author luigitercero
 */
public class Observadores_Componentes {

    public Observadores_Componentes(Interprete aThis, Node nodo) {
        this.idObtener = "";
        Object valor = aThis.exp.evaluarDato(nodo.childNode.get(0));
        this.tipoObservador = nodo.childNode.get(2).token.getValueString();
        if (valor instanceof Component) {
            Component c =(Component) valor;
            this.idObtener = c.cadena;
            if (nodo.childNode.get(3).term.getName().equals("cuerpo")) {
                metodo = new com.Interprete.Metodo.Metodo(aThis);
                metodo.addCuerpo(nodo.childNode.get(3));
            } else {
                metodo = new com.Interprete.Metodo.Metodo(aThis, nodo.childNode.get(3));
            }
            addObservador(aThis, this); //To change body of generated methods, choose Tools | Templates.
        } else {
            System.err.println("no es un componente valido");
        }
    }

    //private final Interprete i;
    public String getIdObtener() {
        return idObtener;
    }
    private  String idObtener;
    private  String tipoObservador;
    public com.Interprete.Metodo.Metodo metodo;

    public Observadores_Componentes(Interprete aThis, Node nodo, String tipo) {
        //this.i = aThis;
        this.idObtener = "fin";
        this.tipoObservador = nodo.childNode.get(1).token.getValueString();
        if (nodo.childNode.get(2).term.getName().equals("cuerpo")) {
            metodo = new com.Interprete.Metodo.Metodo(aThis);
            metodo.addCuerpo(nodo.childNode.get(2));
        } else {
            metodo = new com.Interprete.Metodo.Metodo(aThis, nodo.childNode.get(2));
        }
        addObservador(aThis, this);
    }

    private void addObservador(Interprete aThis, Observadores_Componentes esto) {
        if (aThis != null && esto != null) {
            switch (this.tipoObservador.toLowerCase()) {
                case "click":
                    aThis.clickO.add(esto);
                    break;
                case "clic":
                    aThis.clickO.add(esto);
                    break;
                case "clik":
                    aThis.clickO.add(esto);
                    break;
                case "listo":
                    aThis.listoO.add(this);
                    break;
                case "modificado":
                    aThis.modificarO.add(esto);
                    break;
                case "cliqueado":
                    aThis.clickO.add(esto);
                    break;
            }
        }
    }

    public String getTipoObservacion() {
        return tipoObservador;
    }

}
