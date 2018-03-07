/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador;

import java.util.ArrayList;

/**
 *
 * @author luigitercero
 */
public class Acelerador implements observador.Observable {

    private ArrayList<Observador> observadores;
    public  Acelerador(){
        observadores = new ArrayList<>();
    }
    public void enlazarObservador(Observador o) {
        observadores.add(o);
    }

    @Override
    public void notificar() {
        for (Observador observador : observadores) {
            observador.update();
        }
    }

    public void  accion(){
            notificar();
    }

    @Override
    public void notificar(String id, String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
