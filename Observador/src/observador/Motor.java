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
public class Motor implements observador.Observador{

    @Override
    public void update() {
        System.out.println(" subir potencia");
    }

    @Override
    public void update(String id) {
         System.out.println(" subir potencia " + id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Observar(String id, String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void UpdateMetodo(String metodo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void UpdateRuta(String ruta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
