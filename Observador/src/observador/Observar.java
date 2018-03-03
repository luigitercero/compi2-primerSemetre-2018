/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador;

/**
 *
 * @author luigitercero
 */
public class Observar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Motor m = new Motor();
        Acelerador a = new Acelerador();
        a.enlazarObservador(m);
        a.accion();
    }
    
}
