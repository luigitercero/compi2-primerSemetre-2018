/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mostrarcolores;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

/**
 *
 * @author luigitercero
 */
public class Button extends JButton {

    public Button(String text) {

        super(text);
       

    }

    @Override
    protected void paintComponent(Graphics g) {
       g.setFont(new Font ("Monospaced",Font.ITALIC,25));

        super.paintComponent(g);
    }

}
