/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.compi2.Interprete.CSS.ID;

import java.util.ArrayList;

/**
 *
 * @author luigitercero
 */
public class Grupo {

    String ID;
    ArrayList<Propiedad> propiedades;

    public Grupo(String ID) {
        this.ID = ID;
        propiedades = new ArrayList<Propiedad>();

    }

    public boolean agregarPropiedad(String nombre, Object Valor) {
        propiedades.add(new Propiedad(nombre, Valor));
        return false;
    }

    public boolean agregarPropiedad(String nombre, Object tam, Object color, Object curva) {
        propiedades.add(new Propiedad(nombre, tam, color, curva));
        return false;
    }

    public boolean agregarPropiedad(String nombre, Object valor, Object area) {
        propiedades.add(new Propiedad(nombre, valor, area));
        return false;
    }

    public boolean agregarPropiedad(Propiedad p) {
        propiedades.add(new Propiedad(p.Propiedad, p.valor, false));

        for (Propiedad valore : p.valores) {
            propiedades.add(new Propiedad(valore.Propiedad, valore.valor, false));
        }
        return false;
    }

    public String getID() {
        return this.ID;
    }

    public String recorrer() {
        String salida = "{\n";
        for (Propiedad propiedade : propiedades) {
            salida = salida + "\n    " + propiedade.Propiedad + ":=" + propiedade.valor;
        }
        return salida + "\n    }";
    }
}
