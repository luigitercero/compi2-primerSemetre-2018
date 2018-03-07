/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navegadorcompi2;

import archivo.Archivo;

import com.Navegador.JS.Interprete;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;




/**
 *
 * @author luigitercero
 */
public class NavegadorCompi2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        Archivo archivo = new Archivo();
        archivo.abrirArchivo("/home/luigitercero/Escritorio/js.txt");

        try {
            String texto = archivo.getContenido();
            js.org.compi2.codigo3d.parser.scanner scan = new js.org.compi2.codigo3d.parser.scanner(new BufferedReader(new StringReader(texto)));
            js.org.compi2.codigo3d.parser.parser parser = new js.org.compi2.codigo3d.parser.parser(scan);
            parser.parse();
            System.out.println(
                    parser.parserTree.recorrerArbol());
            Interprete js = new Interprete();
            js.iniciar(parser.declaracion, parser.metodo, parser.parserTree);

            parser.metodo.metodo.forEach((k, v) -> System.out.println("esto es un metodo guardado: "+k));

        } catch (Exception e) {
            System.err.println("error"+e);
        }

        // TODO code application logic here
    }

}
