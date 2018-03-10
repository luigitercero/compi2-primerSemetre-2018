/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compi2.Etiqueta.Componente;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
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
public class Texto_A extends JTextArea implements CSSI, observador.Observable {

    private ArrayList<Observador> observadores;
    private ArrayList<Observador> Observadorrutas;
    private String ruta;
    public String id;
    private String click;
    private String grupo;
    private ArrayList<CSS> css;
    private ObtenerPropiedades propiedades;

    public Texto_A(String texto) {
        super();
        String a = texto.replaceFirst(">", "");
        String b = a.replaceAll("[<][Ff][Ii][Nn][-][Tt][Ee][Xx][Tt][Oo][_][Aa]", "");
        this.setText(b);
        this.setPreferredSize(new Dimension(90, 90));

    }

    public Texto_A(ArrayList<CSS> css, ArrayList<Observador> observadores, ArrayList<Observador> rutas) {
        super();
        this.setSize(10, 10);
        this.setPreferredSize(new Dimension(10, 10));
        this.ClickAction();
        this.observadores = observadores;
        this.ruta = "";
        this.id = "";
        this.click = "";
        this.grupo = "";
        this.css = css;
        propiedades = new ObtenerPropiedades();
        this.Observadorrutas = rutas;

    }

    public void addText(String b) {

        this.setText(b);

    }

    public void addTexta(String texto) {

        String a = texto.replaceFirst(">", "");
        String b = a.replaceAll("[<][Ff][Ii][Nn][-][Tt][Ee][Xx][Tt][Oo][_][Aa]", "");
        this.setText(b);

    }

    public void ClickAction() {
//        this.addActionListener((ActionEvent e) -> {
//            notificar();
//        });
    }

    public void addAtributo(String atributo, String valor) {

        switch (atributo.toLowerCase()) {
            case "ancho":
                ActualizarAncho(Integer.parseInt(valor));
                break;
            case "alto":
                ActualizarAlto(Integer.parseInt(valor));
                break;
            case "alineado":
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
                break;
            case "OPAQUE":
                this.setOpaque(propiedades.getLogico(propiedade.valor.toString()));
                break;
            case "VISIBLE":
                this.setVisible(propiedades.getLogico(propiedade.valor.toString()));
                break;
            case "FONDOELEMENTO":
//                this.setContentAreaFilled(false);
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
                addFormato(propiedade.valor.toString());
                break;
            case "TEXTO":

                this.setText(propiedade.valor.toString());

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

    public void addFormato(String Formato) {
        switch (Formato.toLowerCase()) {
            case "negrilla":
                this.setFont(new Font(this.getFont().getFontName(), Font.BOLD, this.getFont().getSize()));
            case "cursiva":
                this.setFont(new Font(this.getFont().getFontName(), Font.ITALIC, this.getFont().getSize()));
                break;
            case "mayuscula":
                this.setText(this.getText().toUpperCase());
                break;
            case "minuscula":
                this.setText(this.getText().toLowerCase());
                break;
        }

    }

    @Override
    public void notificar() {

        if (!this.click.equals("") || !this.id.equals("")) {
            for (Observador observador : observadores) {
                observador.UpdateMetodo(click);
                observador.Observar(id, "click");

            } //To change body of generated methods, choose Tools | Templates.
        }
        if (!this.ruta.equals("")) {
            for (Observador Observadorruta : Observadorrutas) {
                Observadorruta.UpdateRuta(ruta);
            }
        }
    }

    //@Override
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
