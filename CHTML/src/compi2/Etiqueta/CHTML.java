/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compi2.Etiqueta;

import observador.CSSI;
import compi2.Etiqueta.Componente.Panel;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import observador.Observador;

/**
 *
 * @author luigitercero
 */
public class CHTML extends JPanel implements observador.Observador,observador.Observable,observador.consola.recibirMensaje,observador.errores.RecibirError{
 
    GridBagConstraints gbc;
    private int fila;
    public ArrayList<org.compi2.Interprete.CSS.ID.CSS> css;
    public ArrayList<ControlComponente> componentes;
    public ArrayList<CSSI> componetesCSSI;
    public ArrayList<Observador> observadores;
    public ArrayList<Observador> Observadorrutas;
    public Consolas consola;
   
    public CHTML() {
        super();
        initi();
    }

    public void initi() {
        css = new ArrayList<org.compi2.Interprete.CSS.ID.CSS>();
        fila = 0;
        gbc = new GridBagConstraints();
        this.setLayout(new MigLayout());
        componentes = new ArrayList<>();
        observadores =new ArrayList<>();
        componetesCSSI = new ArrayList<>();
        Observadorrutas = new ArrayList<>();
        consola = new Consolas();
        
    }

    public void addPanel(Panel jpanel) {

        add(jpanel, "pushx 200,growx");
        //add(jpanel, "span, split2,grow, w 180, h 100");

    }

    public void addSalto() {

        JLabel a = new JLabel();
        
        add(a, "al right,wrap");
    }

    public void update() {
        System.out.println("hola estoy Observando");//To change body of generated methods, choose Tools | Templates.
    }

    public void update(String id) {
        System.out.println("hola estoy Observando " + id );
        //this.componentes.forEach(x->System.out.println(" componente"+x.id));
     

    }

    @Override
    public void Observar(String id, String tipo) {
         //To change body of generated methods, choose Tools | Templates.
    
    }

    
    
    @Override
    public void notificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void enlazarObservador(Observador o) {
       observadores.add(o);//To change body of generated methods, choose Tools | Templates.
    }

    //@Override
    public void notificar(String id, String tipo) {
        for (Observador observadore : observadores) {
            observadore.Observar(id, tipo);
        }
    }

    @Override
    public void UpdateMetodo(String metodo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void UpdateRuta(String ruta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void recibirMensaje(String mensaje) {
        
        consola.jTextAreaSalida.setText(consola.jTextAreaSalida.getText() +"\n" +mensaje);
        //System.out.println("ser recibio un mensaje"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void recibirError(String error) {
        consola.jTextAreaErrores.setText(consola.jTextAreaErrores.getText()+"\n" + error);
       
    }

}
