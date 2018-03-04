/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compi2.Etiqueta;

/**
 *
 * @author luigitercero
 */
public class ControlComponente {

    String id;
    Object objeto;
    String tipo;

    public ControlComponente(String id, Object componente, String tipo) {
        this.id = id;
        this.objeto = componente;
        this.tipo = tipo;
    }
}
