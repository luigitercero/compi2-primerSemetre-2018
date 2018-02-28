/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compi1p1;

import javax.swing.*;

/**
 *
 * @author oswald
 */
public class Tab {
    
    private JTextArea texto;
    private JScrollPane scroll;
    private JPanel panel;
    private JLabel titulo;
    private JButton cerrar;
    private Tab pareja;
    private String archivo;
    private boolean guardado;
    private String ubica;
    private int noboton;
    private Tab siguiente;

    public Tab(JTextArea texto, JScrollPane scroll, JPanel panel, JLabel titulo, JButton cerrar, Tab pareja, String archivo, boolean guardado, String ubica, int noboton, Tab siguiente) {
        this.texto = texto;
        this.scroll = scroll;
        this.panel = panel;
        this.titulo = titulo;
        this.cerrar = cerrar;
        this.pareja = pareja;
        this.archivo = archivo;
        this.guardado = guardado;
        this.ubica = ubica;
        this.noboton = noboton;
        this.siguiente = siguiente;
    }

    

    

    

    

    /**
     * @return the texto
     */
    public JTextArea getTexto() {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(JTextArea texto) {
        this.texto = texto;
    }

    /**
     * @return the scroll
     */
    public JScrollPane getScroll() {
        return scroll;
    }

    /**
     * @param scroll the scroll to set
     */
    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    /**
     * @return the panel
     */
    public JPanel getPanel() {
        return panel;
    }

    /**
     * @param panel the panel to set
     */
    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    /**
     * @return the titulo
     */
    public JLabel getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(JLabel titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the cerrar
     */
    public JButton getCerrar() {
        return cerrar;
    }

    /**
     * @param cerrar the cerrar to set
     */
    public void setCerrar(JButton cerrar) {
        this.cerrar = cerrar;
    }

    /**
     * @return the pareja
     */
    

    /**
     * @return the archivo
     */
   

    /**
     * @return the pareja
     */
    public Tab getPareja() {
        return pareja;
    }

    /**
     * @param pareja the pareja to set
     */
    public void setPareja(Tab pareja) {
        this.pareja = pareja;
    }

    /**
     * @return the archivo
     */
    public String getArchivo() {
        return archivo;
    }

    /**
     * @param archivo the archivo to set
     */
    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    /**
     * @return the guardado
     */
    public boolean isGuardado() {
        return guardado;
    }

    /**
     * @param guardado the guardado to set
     */
    public void setGuardado(boolean guardado) {
        this.guardado = guardado;
    }

    /**
     * @return the ubica
     */
    public String getUbica() {
        return ubica;
    }

    /**
     * @param ubica the ubica to set
     */
    public void setUbica(String ubica) {
        this.ubica = ubica;
    }

    /**
     * @return the noboton
     */
    public int getNoboton() {
        return noboton;
    }

    /**
     * @param noboton the noboton to set
     */
    public void setNoboton(int noboton) {
        this.noboton = noboton;
    }

    /**
     * @return the siguiente
     */
    public Tab getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Tab siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
    
}
