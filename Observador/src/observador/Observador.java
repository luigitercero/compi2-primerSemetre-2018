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
public interface Observador {
    public void update(); //SE ACTUALIZA CUNADO EL SUJETO L

    public void update(String id);

}
