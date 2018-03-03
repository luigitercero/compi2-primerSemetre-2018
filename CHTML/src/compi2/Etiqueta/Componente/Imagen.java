/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compi2.Etiqueta.Componente;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;
import java.net.URL;
import java.text.AttributedCharacterIterator;
import javax.swing.ImageIcon;

/**
 *
 * @author luigitercero
 */
public class Imagen extends javax.swing.JPanel {

    private Graphics Graphics;

    public Imagen() {
        this.setSize(300, 400);
        this.setPreferredSize(new Dimension(300, 400));//se selecciona el tamaño del panel
    }
    /*
//Se crea un método cuyo parámetro debe ser un objeto Graphics
    public void paint(Graphics grafico) {
        try {
            Dimension height = getSize();

//Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
            URL a = getClass().getResource("/home/luigitercero/Imágenes/1.png");
            ImageIcon Img = new ImageIcon("/home/luigitercero/Imágenes/1.png");
            System.err.println(Img);
//se dibuja la imagen que tenemos en el paquete Images //dentro de un panel

            grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);

            setOpaque(false);
            super.paintComponent(grafico);
        } catch (Exception e) {
            System.out.println(e);
        }

    }*/

    private ImageIcon fondo = null;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.fondo != null) {
            g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), null);
        }
    }

    public void setImage(String image) {
        if (image != null) {

            fondo = new ImageIcon(image);
            //fondo = new ImageIcon(getClass().getResource(image)).getImage();
        }
    }

    public void addAtributo(String atributo, String valor) {
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

                break;
            case "grupo":
                break;
            case "id":
                break;
            case "ruta":
                setImage(valor);
                break;
            case "click":
                break;
            case "valor":
                break;

        }
//To change body of generated methods, choose Tools | Templates.
    }

    public void mouseEntered(MouseEvent arg0) {
        System.out.println("holi");

    }

    public void addImagen(String b) {

        setImage(b);
    }
}
