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


public interface Observable {

    public void notificar();

    public void notificar(String id, String tipo);

    public void enlazarObservador(Observador o);

}
