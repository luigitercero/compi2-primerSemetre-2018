/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compi;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
/**
 *
 * @author jlemu
 */
public class ControladorMultipestaña {
    
    private JTabbedPane ContenedorPestañas;
    
    /**
     * Constructor que enlaza la JTabbedPane del la Gui
     * @param TablaPaneles Componente Grafico
     */
    public ControladorMultipestaña(JTabbedPane TablaPaneles){
        this.ContenedorPestañas = TablaPaneles;
    }
    
    /**
     * 
     * @param Nombre
     * @param tooltip
     * @param pestaña 
     */
    public void addPestaña(String Nombre, String tooltip, JPanel pestaña){
        String NewName = String.format("%s -- %s", 
                Nombre, 
                ContenedorPestañas.getComponentCount());
        ContenedorPestañas.addTab(NewName,null, pestaña, tooltip);
    }
    
    /**
     * Elimina la pestaña actual de la Gui
     */
    public void deletePestaña(){
        ContenedorPestañas.remove(ContenedorPestañas.getSelectedComponent());
    }
    
}
