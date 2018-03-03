/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simbol.tablasimbolos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author luigitercero
 */
public class TablaSimbolo {

    public LinkedList<HashMap<String, Variable>> listaAmbito;
    public HashMap<String, Variable> ambitoActual;
    public HashMap<String, Variable> ambitoGlobal;

    public TablaSimbolo() {
        listaAmbito = new LinkedList<HashMap<String, Variable>>();
        ambitoActual = new HashMap<String, Variable>();
        ambitoGlobal = ambitoActual;

        listaAmbito.addFirst(ambitoActual);
    }

    public TablaSimbolo(HashMap<String, Variable> ambitoGlobal) {
        listaAmbito = new LinkedList<HashMap<String, Variable>>();
        ambitoActual = ambitoGlobal;
        this.ambitoGlobal = ambitoActual;

        listaAmbito.addFirst(ambitoActual);
    }


    public void aumentarAmbito() {
        HashMap<String, Variable> nuevo = new HashMap<String, Variable>();
        listaAmbito.addFirst(nuevo);
        ambitoActual = nuevo;
    }

    public void disminuirAmbito() {
        listaAmbito.removeFirst();
        ambitoActual = listaAmbito.getFirst();
    }

    public boolean addVariable(String nombre, Object valor, int tipo) {
        Variable v = ambitoActual.get(nombre);
        if (v == null) {
            Variable var = new Variable(nombre, valor, tipo);
            this.ambitoActual.put(nombre, var);
            return true;
        } else {
            return false;
        }
    }

    public Variable getVariable(String nombre) {

        for (HashMap<String, Variable> hashMap : listaAmbito) {
            Variable v = hashMap.get(nombre);
            if (v != null) {
                return v;
            } else {
               
            }
        }
        return null;
    }

    public Variable getVariable(String nombre, int pos) {

        for (HashMap<String, Variable> hashMap : listaAmbito) {
            Variable v = hashMap.get(nombre);
            if (v != null) {
                ArrayList value = (ArrayList) v.valor;
                if (value.size() > pos) {
                    return (Variable) value.get(pos);
                } else {
                    System.err.println( "var "+ nombre+" arreglo es mucho mas peque;o tam " + pos+ "total " + value.size());
                    return null;
                }

            } else {
               
            }
        }
        return null;
    }
    
    
        public Object getValVariable(String nombre, int pos) {

        for (HashMap<String, Variable> hashMap : listaAmbito) {
            Variable v = hashMap.get(nombre);
            if (v != null) {
                ArrayList value = (ArrayList) v.valor;
                if (value.size() > pos) {
                    Variable var = (Variable) value.get(pos);
                    return var.valor;
                } else {
                    System.err.println( "var "+ nombre+" arreglo es mucho mas peque;o tam " + pos+ "total " + value.size());
                    return null;
                }

            } else {
                
            }
        }
        return null;
    }

    public Object getValVariable(String nombre) {

        for (HashMap<String, Variable> hashMap : listaAmbito) {
            Variable v = hashMap.get(nombre);
            if (v != null) {
                return v.valor;
            } else {
            
            }
        }
          System.err.println("no se eencotro variable " + nombre);
        return null;
    }

}
