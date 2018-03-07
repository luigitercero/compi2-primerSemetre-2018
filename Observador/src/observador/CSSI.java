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
public interface CSSI {

   public String getID(); 
   public void ActualizarAncho(int ancho);
   public void ActualizarAlto(int alto);
   public void ActualizarGrupo(String grupo);
   public void ActualiarID(String id);
   public void ActualizaRuta(String ruta);
   public void ActualizarClick(String ruta);
   public void ActualizarValori(String valor);
   public void repitar();
}
