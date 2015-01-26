/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.GestorDocumentos;
import Modelo.Documento;
import Modelo.Libro;
import Modelo.Publicacion;
import Modelo.Revista;
import Modelo.TrabajoGrado;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;


public class Eliminar extends javax.swing.JDialog {

    GestorDocumentos gestor  =new GestorDocumentos();
    List<Documento> eliminables;
    DefaultListModel mi_modelo;
    
    public Eliminar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.jButtonEliminar.setEnabled(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelEncontrados = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListElim = new javax.swing.JList();
        jButtonEliminar = new javax.swing.JButton();
        jPanelDetalles = new javax.swing.JPanel();
        jLabelGenerales = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jTextFieldAeliminar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminar Documentos - FIS UNED");

        jPanelEncontrados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Documentos Encontrados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(255, 153, 51)));

        jListElim.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListElimValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListElim);

        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1375430307_edit-delete.png"))); // NOI18N
        jButtonEliminar.setText("Eliminar Documento");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEncontradosLayout = new javax.swing.GroupLayout(jPanelEncontrados);
        jPanelEncontrados.setLayout(jPanelEncontradosLayout);
        jPanelEncontradosLayout.setHorizontalGroup(
            jPanelEncontradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEncontradosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEliminar)
                .addContainerGap())
        );
        jPanelEncontradosLayout.setVerticalGroup(
            jPanelEncontradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEncontradosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEncontradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelEncontradosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonEliminar))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        jPanelDetalles.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(255, 102, 0)));

        javax.swing.GroupLayout jPanelDetallesLayout = new javax.swing.GroupLayout(jPanelDetalles);
        jPanelDetalles.setLayout(jPanelDetallesLayout);
        jPanelDetallesLayout.setHorizontalGroup(
            jPanelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetallesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelGenerales)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDetallesLayout.setVerticalGroup(
            jPanelDetallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetallesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelGenerales)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jLabelTitulo.setText("<html><h3>Consulte el título del documento que desea eliminar</h3></htlm>");

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDetalles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelEncontrados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextFieldAeliminar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonBuscar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelEncontrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDetalles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        ActualizarLista();
        this.jButtonEliminar.setEnabled(false);
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jListElimValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListElimValueChanged
        // TODO add your handling code here:
        this.jButtonEliminar.setEnabled(true);
        try
        {
            if (mi_modelo.elementAt(this.jListElim.getSelectedIndex()) instanceof Libro) 
            {
                Libro l = (Libro) mi_modelo.elementAt(this.jListElim.getSelectedIndex()); 
                this.jLabelGenerales.setText(String.format("<html><h2>Libro</h2><hr>Título: %s<br>Autor: %s<br>Ubicacion: %s<br>Cantidad: %s</html>",l.GetTitulo(),l.GetAutor(),l.GetUbicacion(),Integer.toString(l.GetCantidad())));
            }
            else if (mi_modelo.elementAt(this.jListElim.getSelectedIndex()) instanceof Revista) 
            {
                Revista r = (Revista) mi_modelo.elementAt(this.jListElim.getSelectedIndex()); 
                this.jLabelGenerales.setText(String.format("<html><h2>Revista</h2><hr>Título: %s<br>Autor: %s<br>Ubicacion: %s<br>Cantidad: %s</html>",r.GetTitulo(),r.GetAutor(),r.GetUbicacion(),Integer.toString(r.GetCantidad())));
            }
            else if (mi_modelo.elementAt(this.jListElim.getSelectedIndex()) instanceof Publicacion) 
            {
                Publicacion p = (Publicacion) mi_modelo.elementAt(this.jListElim.getSelectedIndex()); 
                this.jLabelGenerales.setText(String.format("<html><h2>Publicación</h2><hr>Título: %s<br>Autor: %s<br>Ubicacion: %s<br>Cantidad: %s</html>",p.GetTitulo(),p.GetAutor(),p.GetUbicacion(),Integer.toString(p.GetCantidad())));
            }
            else if (mi_modelo.elementAt(this.jListElim.getSelectedIndex()) instanceof TrabajoGrado) 
            {
                TrabajoGrado tg = (TrabajoGrado) mi_modelo.elementAt(this.jListElim.getSelectedIndex()); 
                this.jLabelGenerales.setText(String.format("<html><h2>Trabajo de Grado</h2><hr>Título: %s<br>Autor: %s<br>Ubicacion: %s<br>Cantidad: %s</html>",tg.GetTitulo(),tg.GetAutor(),tg.GetUbicacion(),Integer.toString(tg.GetCantidad())));
            }
        }
        catch(Exception e){}
    }//GEN-LAST:event_jListElimValueChanged

    private void ActualizarLista()
    {
        eliminables = new ArrayList();
        String busqueda  = this.jTextFieldAeliminar.getText();
        try 
        {
            eliminables = gestor.Consultar(busqueda);
        } catch (IOException ex) 
        {
            System.err.println(ex.toString());
        }
        SetModelo();
        this.jLabelGenerales.setVisible(true);
        this.jLabelGenerales.setText("Seleccione un documento de la lista");
    }
    
    
    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
        try
        {
            // ENVIA EL DOCUMENTO QUE SE VA A ELIMINAR
            // EL CUAL ES EL QUE SE ENCUENTRA SELECCIONADO
            Documento eliminable = (Documento) mi_modelo.elementAt(this.jListElim.getSelectedIndex());
            gestor.Eliminar(eliminable);
            ActualizarLista();
            this.jButtonEliminar.setEnabled(false);
        }
        catch(NullPointerException ex)
        {
            System.err.println(ex.toString());
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void SetModelo()
    {
        mi_modelo = new DefaultListModel();
        
        for(Documento doc: eliminables)
        {
            mi_modelo.addElement(doc);
        }
        
        this.jListElim.setModel(mi_modelo);
    }
    
    /*____________________________________________________________________________
    ______________________________________________________________________________
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
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Eliminar dialog = new Eliminar(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JLabel jLabelGenerales;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JList jListElim;
    private javax.swing.JPanel jPanelDetalles;
    private javax.swing.JPanel jPanelEncontrados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldAeliminar;
    // End of variables declaration//GEN-END:variables
}
