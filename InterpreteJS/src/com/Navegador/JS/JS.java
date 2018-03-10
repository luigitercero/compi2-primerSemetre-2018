/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Navegador.JS;

import archivo.Archivo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luigitercero
 */
public class JS {

    public Interprete js;

    public JS(String ruta,observador.consola.recibirMensaje mensajes,observador.errores.RecibirError errores) {
        Archivo archivo = new Archivo();
        archivo.abrirArchivo(ruta);

        
            String texto = null;
        try {
            texto = archivo.getContenido();
        } catch (IOException ex) {
            errores.recibirError("no se pudo obtener texto " + ruta);
            Logger.getLogger(JS.class.getName()).log(Level.SEVERE, null, ex);
        }
            js.org.compi2.codigo3d.parser.scanner scan = new js.org.compi2.codigo3d.parser.scanner(new BufferedReader(new StringReader(texto)));
            js.org.compi2.codigo3d.parser.parser parser = new js.org.compi2.codigo3d.parser.parser(scan);
            parser.ruta = ruta;
            parser.enviar = errores;
        try {
            parser.parse();
        } catch (Exception ex) {
            Logger.getLogger(JS.class.getName()).log(Level.SEVERE, null, ex);
            errores.recibirError("error al ejecutar archivo " + ruta);
        }
//            System.out.println(
//                    parser.parserTree.recorrerArbol());
        
            js = new Interprete(mensajes,errores,ruta);
            js.iniciar(parser.declaracion, parser.metodo, parser.parserTree);

//            parser.metodo.metodo.forEach((k, v) -> System.out.println(k));

        
            
           // System.err.println("error al ejecutar js");
        

    }
    
      public JS(String ruta,observador.consola.recibirMensaje mensajes) {
        Archivo archivo = new Archivo();
        archivo.abrirArchivo(ruta);

        try {
            String texto = archivo.getContenido();
            js.org.compi2.codigo3d.parser.scanner scan = new js.org.compi2.codigo3d.parser.scanner(new BufferedReader(new StringReader(texto)));
            js.org.compi2.codigo3d.parser.parser parser = new js.org.compi2.codigo3d.parser.parser(scan);
       
            parser.parse();
            System.out.println(
                    parser.parserTree.recorrerArbol());
            js = new Interprete();
            js.iniciar(parser.declaracion, parser.metodo, parser.parserTree);

            parser.metodo.metodo.forEach((k, v) -> System.out.println(k));

        } catch (Exception e) {
            System.err.println("error al ejecutar js");
        }

    }

}
