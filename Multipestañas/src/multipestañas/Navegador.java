/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multipestañas;

import archivo.Archivo;
import html.org.compi2.codigo3d.Inicio;
import html.org.compi2.codigo3d.parser.parser;
import html.org.compi2.codigo3d.parser.scanner;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author luigitercero
 */
public class Navegador extends javax.swing.JPanel {

    /**
     * Creates new form Navegador
     */
    public Navegador() {
        initComponents();
        this.Navegador.setLayout(new GridBagLayout());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLURL = new javax.swing.JTextField();
        Navegador = new javax.swing.JPanel();
        JbActualizar = new javax.swing.JButton();
        JbRegresar = new javax.swing.JButton();
        JbAdelante = new javax.swing.JButton();

        jLURL.setText("jTextField1");
        jLURL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLURLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NavegadorLayout = new javax.swing.GroupLayout(Navegador);
        Navegador.setLayout(NavegadorLayout);
        NavegadorLayout.setHorizontalGroup(
            NavegadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        NavegadorLayout.setVerticalGroup(
            NavegadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 289, Short.MAX_VALUE)
        );

        JbActualizar.setText("*");
        JbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbActualizarActionPerformed(evt);
            }
        });

        JbRegresar.setText("<-");
        JbRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbRegresarActionPerformed(evt);
            }
        });

        JbAdelante.setText("->");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Navegador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JbRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JbAdelante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JbActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLURL, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbActualizar)
                    .addComponent(JbRegresar)
                    .addComponent(JbAdelante))
                .addGap(18, 18, 18)
                .addComponent(Navegador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLURLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLURLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLURLActionPerformed

    private void JbRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JbRegresarActionPerformed

    private void JbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbActualizarActionPerformed

        Archivo archivo = new Archivo();
        archivo.abrirArchivo("/home/luigitercero/Escritorio/html.txt");
        String texto = null;

        try {
            texto = archivo.getContenido();
        } catch (Exception e) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, e);
        }

        if (texto.isEmpty()) {
            System.err.println("No es posible evaluar una cadena en blanco.");
            return;
        }

        try {

            System.out.println("Inicia la generación de C3D...");
            scanner scan = new scanner(new BufferedReader(new StringReader(texto)));
            parser parser = new parser(scan);
            parser.parse();
            // jTextArea_Codigo3Dgenerado.setText(
            // parser.parserTree.recorrerArbol());

            //jTextArea_Codigo3Dgenerado.setText(ControlC3D.getC3D());
            GridBagConstraints gbc = new GridBagConstraints();
            JScrollPane scroll = new JScrollPane(parser.chtml);
          
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.gridheight = 0;
            gbc.gridwidth = 0;
            gbc.weightx = 1.0;
            gbc.weighty = 1.0;
            gbc.fill = GridBagConstraints.BOTH;
            this.add(scroll, gbc);
            this.setVisible(true);

           
            System.out.println("Finaliza la generación de C3D...");
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }//GEN-LAST:event_JbActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbActualizar;
    private javax.swing.JButton JbAdelante;
    private javax.swing.JButton JbRegresar;
    private javax.swing.JPanel Navegador;
    private javax.swing.JTextField jLURL;
    // End of variables declaration//GEN-END:variables
}
