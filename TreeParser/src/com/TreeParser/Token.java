/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.TreeParser;

/**
 *
 * @author luigitercero
 */
public class Token {

    public Token(Location location) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public Location getLocation() {
        return Location;
    }

    public String getValueString() {
        return valueString;
    }

    public String getTipo() {
        return Tipo;
    }
    
   
    public Location Location ;
    public String valueString;
    public Object value;
    public String Tipo;
    
    public Token(Location location, Object valor, String tipo){
        this.Location = location;
        this.value = valor;
        this.valueString = (String)valor;
        this.Tipo = tipo;
    }
    public Token(Location location, Object valor){
        this.Location = location;
        this.value = valor;
        this.valueString = (String)valor;
        
    }
   
    
    
}
