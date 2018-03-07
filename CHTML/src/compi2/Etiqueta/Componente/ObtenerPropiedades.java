/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compi2.Etiqueta.Componente;

import java.awt.Color;

/**
 *
 * @author luigitercero
 */
public class ObtenerPropiedades {
        public boolean getLogico(String valor) {
        if (valor.equalsIgnoreCase("true")) {
            return true;
        }

        return false;
    }

    public Color getColor(String color) {
        switch (color.toLowerCase()) {
            case "black":
                return Color.black;
            case "blue":
                return Color.blue;
            case "cyan":
                return Color.cyan;
            case "darkgray":
                return Color.darkGray;
            case "gray":
                return Color.gray;
            case "green":
                return Color.green;
            case "lightgray":
                return Color.lightGray;
            case "magenta":
                return Color.magenta;
            case "orange":
                return Color.orange;
            case "pink":
                return Color.pink;
            case "red":
                return Color.red;
            case "white":
                return Color.white;
            case "yellow":
                return Color.yellow;
        }
        return Color.darkGray;
    }
}
