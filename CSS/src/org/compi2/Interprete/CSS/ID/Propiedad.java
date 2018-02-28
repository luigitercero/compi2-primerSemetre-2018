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
public class Propiedad {

    public String Propiedad;
    public Object valor;
    public ArrayList<Propiedad> valores;

    public int tam;
    public String color;
    public String curva;
    public String area;

    public Propiedad(String propiedad, Object Valor) {
        this.Propiedad = propiedad.toLowerCase();
        this.valor = Valor;

        this.valores = new ArrayList<Propiedad>();
    }

    public Propiedad(String propiedad, Object Valor, boolean valores) {
        this.Propiedad = propiedad.toLowerCase();
        this.valor = Valor;
        if (valores) {
            this.valores = new ArrayList<Propiedad>();
        }
    }

    public Propiedad(String nombre, Object valor, Object area) {
        this.Propiedad = nombre; //To change body of generated methods, choose Tools | Templates.
        this.valor = Integer.parseInt(valor.toString());
        this.area = area.toString();
    }

    public Propiedad(String nombre, Object tam, Object color, Object curva) {
        this.Propiedad = nombre; //To change body of generated methods, choose Tools | Templates.
        this.tam = Integer.parseInt(tam.toString());
        this.color = color.toString();
        this.curva = curva.toString();
    }

    public void addValor(Object Valor) {
        valores.add(new Propiedad(Propiedad, Valor));
    }
}
