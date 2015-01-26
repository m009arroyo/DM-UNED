/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.GestorDocumentos;
import Modelo.*;
import java.io.IOException;
import java.net.URL;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Michael
 * @since Julio 31, 2013
 * @version 1.0.0
 */
public class Consultar extends javax.swing.JDialog {

    
    GestorDocumentos gestor;
    
     // CONSTRUCTORES
    public Consultar(java.awt.Frame parent, boolean modal, GestorDocumentos gu) {
        super(parent, modal);
        gestor = gu;
        initComponents();
    }

    private Consultar(JFrame jFrame, boolean b) 
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonBuscar = new javax.swing.JButton();
        jtxtConsultar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        nuevo_doc = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonAtras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultas - FIS UNED");

        jButtonBuscar.setText("Consultar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        nuevo_doc.setBackground(new java.awt.Color(153, 180, 209));
        nuevo_doc.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(nuevo_doc);

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel1.setText("<html><h2>Resultados de su Busqueda</h2><hr></html>");

        jButtonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        jButtonAtras.setText("Volver al Menú Principal");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("<html><h3>Ingrese el título del documento que desea consultar</h3><hr></html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonAtras))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonBuscar)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxtConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAtras)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
       
// LISTA DE DOCUMENTOS ENCONTRADOS
       List<Documento> encontrado = new ArrayList();
       String ruta = "Error.png";
       URL url = this.getClass().getResource(ruta); 
       ImageIcon icono = new ImageIcon(url);
       
       // LABEL CON TEXTO UTILIZANDO HTML PARA PODER CREAR MULTIPLES LINEAS
       String texto = "<html>";
        try 
        {
            // OBTIENE LA LISTA DE DOCUMENTOS DEL METODO CONSULTAR DE LA CLASE GESTORDOCUMENTOS
            encontrado = gestor.Consultar(this.jtxtConsultar.getText());
            for (Documento doc:encontrado) 
            {
                // RECORRE LA LISTA
                // SE IDENTIFICA SI ES LIBRO, REVISTA, PUBLICACION O TRABAJO
                if (doc instanceof Libro) 
                {
                    Libro l = (Libro) doc;
                    String l_texto = String.format("<h3>Libro</h3>Titulo: %s<br>Autor: %s<br>Ubicación: %s<br>Cantidad: %d<br>Editorial: %s<br>Año Publicación: %d", l.GetTitulo(), l.GetAutor(), l.GetUbicacion(), l.GetCantidad(), l.GetEditorial(), l.GetAñoPublic());
                    texto = texto+ "<br><hr>" + l_texto;
                }
                else if (doc instanceof Revista) 
                {
                    Revista r = (Revista) doc;
                    String r_texto = String.format("<h3>Revista</h3>Titulo: %s<br>Autor: %s<br>Ubicación: %s<br>Cantidad: %d<br>Casa de Edición: %s<br>Mes: %s<br>Año Publicación: %d", r.GetTitulo(), r.GetAutor(), r.GetUbicacion(), r.GetCantidad(), r.GetCasaEdicion(), r.GetMes(), r.GetAño());
                    texto = texto + "<br><hr>" +r_texto;
                }
                else if (doc instanceof Publicacion) 
                {
                    Publicacion p = (Publicacion) doc;
                    String p_texto = String.format("<h3>Publicacion</h3>Titulo: %s<br>Autor: %s<br>Ubicación: %s<br>Cantidad: %d<br>Referencia: %s", p.GetTitulo(), p.GetAutor(), p.GetUbicacion(), p.GetCantidad(), p.GetReferencia());
                    texto = texto + "<br><hr>" + p_texto;
                }
                else if (doc instanceof TrabajoGrado) 
                {
                    TrabajoGrado tg = (TrabajoGrado) doc;
                    String tg_texto = String.format("<h3>Trabajo de Grado</h3>Titulo: %s<br>Autor: %s<br>Ubicación: %s<br>Cantidad: %d<br>Tipo de Grado: %s<br>Universidad: %s", tg.GetTitulo(), tg.GetAutor(), tg.GetUbicacion(), tg.GetCantidad(), tg.GetTipo(),tg.GetUniversidad());
                    texto = texto + "<br><hr>" +tg_texto;
                }
                else{}
            }
            texto+="</html>"; // SE CIERRA LA ETIQUETA HTML
            this.nuevo_doc.setText(texto);
        } catch (IOException ex) // CAPTURA ERRORES
        {
            System.err.println(ex.toString());
        }
        if (encontrado.isEmpty()) 
        {
            this.nuevo_doc.setIcon(icono);
            this.nuevo_doc.setText("Lo Sentimos, el documento no se ha encontrado");
        }
        else
        {
            this.nuevo_doc.setIcon(null);
        }
        
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed

        this.dispose();
        // CIERRA EL DIALOGO DE CONSULTA
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Consultar dialog = new Consultar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtxtConsultar;
    private javax.swing.JLabel nuevo_doc;
    // End of variables declaration//GEN-END:variables
}
