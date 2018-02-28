/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creador;

/**
 *
 * @author oswald
 */
public class creadordecompilador {
    public static void main(String[] args) {
        generarCompilador();
    }
    
    private static void generarCompilador(){
        try {
            String ruta = "src/analizadores/";
            String opcFlex[] = { ruta + "lexico.flex", "-d", ruta };
            jflex.Main.generate(opcFlex);
            String opcCUP[] = { "-destdir", ruta, "-parser", "parser", ruta + "sintactico.cup" };
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
}
