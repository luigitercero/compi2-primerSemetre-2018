/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simbol.Metodo;

import com.TreeParser.Node;

/**
 *
 * @author luigitercero
 */
public class Estructura {
    public String nombre;
    public Node parametro;
    public Node cuerpo;
    
    public Estructura(String nombre,Node parametro,Node cuerpo){
        this.nombre = nombre;
        this.parametro = parametro;
        this.cuerpo = cuerpo;
    }
}
