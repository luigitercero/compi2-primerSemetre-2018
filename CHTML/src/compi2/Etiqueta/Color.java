/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compi2.Etiqueta;

/**
 *
 * @author luigitercero
 */
public class Color {
    public Color(){}
    public java.awt.Color getColor(String color){
        String valor = color.replaceAll("\"", "");
        switch(valor.toLowerCase()){
            case "amarillo":
                return java.awt.Color.YELLOW;
            case "rojo":
                return java.awt.Color.RED;
            case "azul":
                return java.awt.Color.BLUE;
            case "gris":
                return java.awt.Color.gray;
            case "verde":
                return java.awt.Color.GREEN;
             
                  
        }
        return null;    
    }
}
