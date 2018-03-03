/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package css.org.compi2.codigo3d;

import archivo.Archivo;
import css.org.compi2.codigo3d.parser.parser;
import css.org.compi2.codigo3d.parser.scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

/**
 *
 * @author luigitercero
 */
public class CompilarCSS {

    public parser getParser() {
        return parser;
    }

    parser parser;

    public CompilarCSS(String ruta) throws IOException, Exception {
        Archivo archivo = new Archivo();
        archivo.abrirArchivo("/home/luigitercero/Escritorio/css.txt");
        String texto = archivo.getContenido();
        System.out.println("Iniciando Compilacion de CSS...");
        scanner scan = new scanner(new BufferedReader(new StringReader(texto)));
        this.parser = new parser(scan);
        parser.parse();
    }
    
}
