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
    /**
     metodo acualizar del observador
    ***/
    public void update(); //SE ACTUALIZA CUNADO EL SUJETO L
    /**
     metodo acualizar del observador
     * @param id este es el id de quien se observo
    ***/
    public void update(String id);
    /**
     metodo acualizar del observador
     * @param id este parametro es el id del que se activo
     * @param tipo este es el tipo de accion
     * 
    ***/
    public void Observar(String id , String tipo);
    
    public void UpdateMetodo(String metodo);
    public void UpdateRuta(String ruta);

}
