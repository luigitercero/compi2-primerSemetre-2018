/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simbol.tablasimbolos;

import com.TreeParser.Token;

/**
 *
 * @author luigitercero
 */
public class Variable {
    public int tipo;
    public String nombre;
    public Object valor;
    public Token token;
    public int cabio = 0;
    public int visibilidad;

    public Variable(String nom) {
        nombre = nom;
    }

    public Variable() {
    }

    public Variable(String nom, int tipo) {
        nombre = nom;
        this.tipo = tipo;
    }

    public Variable(String tipo, Token token, Object val) {
        this.token = token;
        // this.tipo = getTipo(tipo);
        nombre = token.valueString;
        valor = val;
    }

    public Variable(String nombre, Object val, int tipo) {
        this.tipo = tipo;
        // this.tipo = getTipo(tipo);
        this.nombre = nombre;
        valor = val;
    }
    
      public Variable(Token token,String nombre, Object val, int tipo, int visibilidad) {
        this.tipo = tipo;
      
        this.nombre = nombre;
        valor = val;
        this.visibilidad = visibilidad;
         this.token = token;
    }

    public Variable(String nom, String nulo1) {
        this.valor = nulo1;
        this.nombre = nom;
    }
}
