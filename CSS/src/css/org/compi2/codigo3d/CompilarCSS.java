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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luigitercero
 */
public class CompilarCSS {

    public CompilarCSS(String ruta, observador.consola.recibirMensaje mensajes,observador.errores.RecibirError errores) {
        try {
            Archivo archivo = new Archivo();
            archivo.abrirArchivo(ruta);
            String texto = null;
            try {
                texto = archivo.getContenido();
            } catch (IOException ex) {
                Logger.getLogger(CompilarCSS.class.getName()).log(Level.SEVERE, null, ex);
               errores.recibirError(ruta + " \n    " + "no se pudo obtener el texto" );
            }
            System.out.println("Iniciando Compilacion de CSS...");
            scanner scan = new scanner(new BufferedReader(new StringReader(texto)));
            
            this.parser = new parser(scan);
              parser.ruta =ruta;
              parser.enviar = errores;
            parser.parse(); //To change body of generated methods, choose Tools | Templates.
        } catch (Exception ex) {
            errores.recibirError(ruta + " \n    " + "no se pudo compilar" );
            Logger.getLogger(CompilarCSS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public parser getParser() {
        return parser;
    }

    parser parser;

    public CompilarCSS(String ruta) throws IOException, Exception {
        Archivo archivo = new Archivo();
        archivo.abrirArchivo(ruta);
        String texto = archivo.getContenido();
        System.out.println("Iniciando Compilacion de CSS...");
        scanner scan = new scanner(new BufferedReader(new StringReader(texto)));
        this.parser = new parser(scan);
        parser.parse();
    }
    
}
