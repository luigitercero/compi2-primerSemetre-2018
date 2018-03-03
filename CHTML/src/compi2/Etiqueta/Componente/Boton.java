/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compi2.Etiqueta.Componente;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import org.compi2.Interprete.CSS.ID.CSS;
import org.compi2.Interprete.CSS.ID.Grupo;
import org.compi2.Interprete.CSS.ID.ID;
import org.compi2.Interprete.CSS.ID.Propiedad;

/**
 *
 * @author luigitercero
 */
public class Boton extends JButton implements ActionListener {

    private String ruta;
    private String id;
    private String click;
    private String grupo;

    public Boton(String nombre) {
        this.setPreferredSize(new Dimension(100, 100));
    }

    public Boton() {
        super();
        this.setSize(10, 10);
        this.setPreferredSize(new Dimension(10, 10));
        this.ClickAction();
    }

    public void addText(String b) {
        if (this.getText().equals("")) {
            this.setText(b);
        }
    }

    public void ClickAction() {
        this.addActionListener((ActionEvent e) -> {
            System.out.println("esto es un click");
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("sdfasdfaskjdkfasdjfalsdf;");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addAtributo(String atributo, String valor, ArrayList<CSS> css) {
        switch (atributo.toLowerCase()) {
            case "ancho":
                this.setSize(Integer.parseInt(valor), this.getSize().height);
                this.setPreferredSize(new Dimension(Integer.parseInt(valor), this.getSize().height));
                break;
            case "alto":
                this.setSize(this.getSize().width, Integer.parseInt(valor));
                this.setPreferredSize(new Dimension(this.getSize().width, Integer.parseInt(valor)));
                break;
            case "alineado":
            case "grupo":
                this.grupo = valor;
                agregarAtributo(css, valor, "GRUPO");
                break;
            case "id":
                this.id = valor;
                agregarAtributo(css, valor, "ID");
                break;
            case "ruta":
                this.ruta = valor;
                break;
            case "click":
                this.click = valor;
                break;
            case "valor":
                break;
            default:
                System.err.println("no son parametros validosf");
        }
    }

    private void agregarAtributo(ArrayList<CSS> css, String valor, String tipo) {
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

    private void addAtributo(Propiedad propiedade) {
        //To change body of generated methods, choose Tools | Templates.

        switch (propiedade.Propiedad.toUpperCase()) {
            case "ALINEADO":
                break;
            case "OPAQUE":
                this.setOpaque(getLogico(propiedade.valor.toString()));
                break;
            case "VISIBLE":
                this.setVisible(getLogico(propiedade.valor.toString()));
                break;
            case "FONDOELEMENTO":
                this.setContentAreaFilled(false);
                try {
                    this.setBackground(java.awt.Color.decode(propiedade.valor.toString()));
                } catch (Exception e) {
                    this.setBackground(getColor(propiedade.valor.toString()));
                }
                break;
            case "TAMTEXT":
                this.setFont(new Font(this.getFont().getFontName(), this.getFont().getStyle(), Integer.parseInt(propiedade.valor.toString())));
                break;
            case "LETRA":
                this.setFont(new Font(propiedade.valor.toString(), this.getFont().getStyle(), this.getFont().getSize()));
                System.out.println(this.getFont().getName());
                this.repaint();
                break;
            case "FORMATO":
                addFormato(propiedade.valor.toString());
                break;
            case "TEXTO":
                System.err.println(this.getText());
                this.setText(propiedade.valor.toString());
                System.err.println(this.getText());
                this.repaint();
                break;
            case "COLORTEXT":
                try {
                    this.setForeground(java.awt.Color.decode(propiedade.valor.toString()));
                } catch (Exception e) {
                    this.setForeground(getColor(propiedade.valor.toString()));
                }
                break;
            case "BORDE":
                addBorde(propiedade);
                break;
        }
    }

    private void addBorde(Propiedad pro) {
        try {
            this.setBorder(BorderFactory.createLineBorder(java.awt.Color.decode(pro.color), pro.tam, getLogico(pro.curva)));
        } catch (Exception e) {
            this.setBorder(BorderFactory.createLineBorder(getColor(pro.color), pro.tam, getLogico(pro.curva)));
        }

    }

    private void addFormato(String Formato) {
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

    private boolean getLogico(String valor) {
        if (valor.equalsIgnoreCase("true")) {
            return true;
        }

        return false;
    }

    private Color getColor(String color) {
        switch (color.toLowerCase()) {
            case "black":
                return Color.black;
            case "blue":
                return Color.blue;
            case "cyan":
                return Color.cyan;
            case "darkgray":
                return Color.darkGray;
            case "gray":
                return Color.gray;
            case "green":
                return Color.green;
            case "lightgray":
                return Color.lightGray;
            case "magenta":
                return Color.magenta;
            case "orange":
                return Color.orange;
            case "pink":
                return Color.pink;
            case "red":
                return Color.red;
            case "white":
                return Color.white;
            case "yellow":
                return Color.yellow;
        }
        return Color.darkGray;
    }
}
