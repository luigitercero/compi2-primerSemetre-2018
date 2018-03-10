/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observador.consola;

/**
 *
 * @author luigitercero
 */
public interface EnviarMensaje {
    public void enviarMensaje(String mensaje);
    public void enviarErrores(String mensaje);
}
