/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simbol.Metodo;

import com.TreeParser.Node;


import java.util.HashMap;

/**
 *
 * @author luigitercero
 */
public class Metodo {

    public HashMap<String, Estructura> metodo;

    public Metodo() {
        metodo = new HashMap<String, Estructura>();
    }

    public boolean insertar(String nombre, Node parametro,Node Cuerpo) {
        Estructura a = this.metodo.get(nombre);
       
        if (a== null){
            
            
            this.metodo.put(nombre, new Estructura(nombre, parametro, Cuerpo));
            return true;
        }else{
            System.out.println("existe metodo \""+nombre+"\" igual");
        }

        return false;
    }
    
   public Estructura geMetodo(String nombre){
       Estructura metodo = this.metodo.get(nombre);
       if (metodo != null){
           return metodo;
       }else{
           System.err.println("no existe el metodo con nombre " + nombre );
           return null;
       }
   
   } 
    
    
    public void prueba(){}
}
