/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navegadorcompi2;


import com.Interprete.EXP.EvaluarEXP;
import com.Navegador.JS.Interprete;
import com.TreeParser.Node;
import com.sun.java_cup.internal.runtime.Scanner;
import java.io.BufferedReader;
import java.io.StringReader;

/**
 *
 * @author luigitercero
 */
public class NavegadorCompi2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
            String texto = ""
                    + ""
                    + "Si (TRUE){\n"
                    + "imprimir(numeroMayor(1,6)+1+10); \n"
                    + "\n"
                    + "si(false){\n"
                    + "imprimir(1+2); \n"
                    + "}\n"
                    + "\n"
                    + "}\n"
                    + "funcion numeroMayor(x,y){\n"
                    + "si(true){\n"
                    + "imprimir(4000); \n"
                    + "retornar y;\n"
                    +"imprimir(5000);"
                    + "imprimir(4030);"
                    + "}sino{\n"
                    + "retornar y;\n"
                    
                    + "}"
                    + "imprimir(5000);"
                    + ""
                    + "}\n";
        try {
            js.org.compi2.codigo3d.parser.scanner scan = new js.org.compi2.codigo3d.parser.scanner(new BufferedReader( new StringReader(texto)));
            js.org.compi2.codigo3d.parser.parser parser = new js.org.compi2.codigo3d.parser.parser( scan);
            parser.parse();
            System.out.println(
            parser.parserTree.recorrerArbol());
          Interprete js = new Interprete();
          js.iniciar(parser.declaracion,parser.metodo,parser.parserTree);
         
          parser.metodo.metodo.forEach((k,v)->System.out.println(k));
           
            
        } catch (Exception e) {
            System.err.println("error");
        }

        // TODO code application logic here
    }
    
}
