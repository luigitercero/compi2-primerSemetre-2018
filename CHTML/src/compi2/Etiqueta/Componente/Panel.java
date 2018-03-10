/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compi2.Etiqueta.Componente;

import compi2.Etiqueta.CHTML;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import java.util.ArrayList;
import java.util.Map;
import javax.swing.BorderFactory;

import net.miginfocom.swing.MigLayout;
import observador.CSSI;

import observador.Observador;
import org.compi2.Interprete.CSS.ID.CSS;
import org.compi2.Interprete.CSS.ID.Grupo;
import org.compi2.Interprete.CSS.ID.ID;
import org.compi2.Interprete.CSS.ID.Propiedad;

/**
 *
 * @author luigitercero
 */
public class Panel extends CHTML implements CSSI, observador.Observable {

    private ArrayList<Observador> observadores;
    private ArrayList<Observador> Observadorrutas;
    private String ruta;
    public String id;
    private String click;
    private String grupo;
    private ArrayList<CSS> css;
    private ObtenerPropiedades propiedades;

    public Panel(ArrayList<CSS> css, ArrayList<Observador> observadores, ArrayList<Observador> rutas) {
        super();

        this.observadores = observadores;
        this.ruta = "";
        this.id = "";
        this.click = "";
        this.grupo = "";
        this.css = css;
        propiedades = new ObtenerPropiedades();
        this.Observadorrutas = rutas;

    }
    private String justificado;

    public void addAtributo(String atributo, String valor) {

        switch (atributo.toLowerCase()) {
            case "ancho":
                ActualizarAncho(Integer.parseInt(valor));
                break;
            case "alto":
                ActualizarAlto(Integer.parseInt(valor));
                break;
            case "alineado":
                cabiarAlineado(valor.toString());
                break;
            case "grupo":
                ActualizarGrupo(valor);
                break;
            case "id":
                ActualiarID(valor);

                break;
            case "ruta":
                ActualizaRuta(valor);

                break;
            case "click":
                this.click = valor;
                break;
            case "clic":
                this.click = valor;
                break;
            case "valor":
                break;
            default:
                System.err.println("no son parametros validos");
        }
    }

    private void cabiarAlineado(String alineado) {
        switch (alineado.toLowerCase()) {
            case "centrado":
                this.justificado = "";
                this.setLayout(new MigLayout("center"));
                break;
            case "derecha":
                this.justificado = "";
                this.setLayout(new MigLayout("right"));
                break;
            case "izquierda":
                this.justificado = "";
                this.setLayout(new MigLayout("left"));
                break;
            case "justificado":
                this.justificado = "pushx,growx";
                break;

        }
    }

    public void addComponent(Component c) {
        add(c, justificado);
    }

    public void agregarAtributo(String valor, String tipo) {

        for (CSS cs : css) {
            for (Map.Entry<String, ID> entry : cs.css.entrySet()) {
                String key = entry.getKey();
                ID value = entry.getValue();
                Grupo group = value.grupo.get(valor + "_" + tipo.toUpperCase());
                if (group != null) {
                    for (Propiedad propiedade : group.propiedades) {
                        addAtributo(propiedade);
                    }
                }
            }
        }
        //To change body of generated methods, choose Tools | Templates.
    }

    public void addAtributo(Propiedad propiedade) {
        //To change body of generated methods, choose Tools | Templates.

        switch (propiedade.Propiedad.toUpperCase()) {
            case "ALINEADO":
                cabiarAlineado(propiedade.valor.toString());
                break;
            case "OPAQUE":
                this.setOpaque(propiedades.getLogico(propiedade.valor.toString()));
                break;
            case "VISIBLE":
                this.setVisible(propiedades.getLogico(propiedade.valor.toString()));
                break;
            case "FONDOELEMENTO":
                // this.setContentAreaFilled(false);
                try {
                    this.setBackground(java.awt.Color.decode(propiedade.valor.toString()));
                } catch (Exception e) {
                    try {
                        this.setBackground(propiedades.getColor(propiedade.valor.toString()));
                    } catch (Exception a) {
                        System.out.println("no salen colores");
                    }

                }

                break;
            case "TAMTEXT":
                this.setFont(new Font(this.getFont().getFontName(), this.getFont().getStyle(), Integer.parseInt(propiedade.valor.toString())));
                break;
            case "LETRA":
                this.setFont(new Font(propiedade.valor.toString(), this.getFont().getStyle(), this.getFont().getSize()));

                break;
            case "FORMATO":
              
                break;
            case "TEXTO":

                break;
            case "COLORTEXT":
                try {
                    this.setForeground(java.awt.Color.decode(propiedade.valor.toString()));
                } catch (Exception e) {
                    this.setForeground(propiedades.getColor(propiedade.valor.toString()));
                }
                break;
            case "BORDE":
                addBorde(propiedade);
                break;
        }
    }

    public void addBorde(Propiedad pro) {
        try {
            this.setBorder(BorderFactory.createLineBorder(java.awt.Color.decode(pro.color), pro.tam, propiedades.getLogico(pro.curva)));
        } catch (Exception e) {
            this.setBorder(BorderFactory.createLineBorder(propiedades.getColor(pro.color), pro.tam, propiedades.getLogico(pro.curva)));
        }

    }

    @Override
    public void ActualizarAncho(int ancho) {
        this.setSize(ancho, this.getSize().height);
        this.setPreferredSize(new Dimension(ancho, this.getSize().height));
    }

    @Override
    public void ActualizarAlto(int alto) {
        this.setSize(this.getSize().width, alto);
        this.setPreferredSize(new Dimension(this.getSize().width, alto));
    }

    @Override
    public void ActualizarGrupo(String grupo) {
        this.grupo = grupo;
        agregarAtributo(grupo, "GRUPO"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ActualiarID(String id) {
        this.id = id;
        agregarAtributo(id, "ID"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ActualizaRuta(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public void ActualizarClick(String ruta) {
        this.click = ruta; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ActualizarValori(String valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void enlazarObservador(Observador o) {
        observadores.add(o);
    }

    // @Override
    public void notificar(String id, String tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getID() {
        return this.id; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void repitar() {
        this.updateUI(); //To change body of generated methods, choose Tools | Templates.
    }

}
