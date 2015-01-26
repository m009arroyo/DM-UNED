/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.*;
import Modelo.Usuario.tipo_usuarios;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Michael
 */
public class FIS extends javax.swing.JFrame {


    GestorUsuarios gu;
    GestorDocumentos gd = new GestorDocumentos();
    Entrada en = new Entrada(this, true);
    
    // Constructor
    public FIS() throws FileNotFoundException 
    {
        initComponents(); 
        this.setIconImage(new ImageIcon(getClass().getResource("about.png")).getImage());
        Iniciar();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPaneUsuariol = new javax.swing.JPanel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelTipoUsuario = new javax.swing.JLabel();
        jButtonConsultar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonInsertar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jMenuBarPrincipal = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItemCerrarS = new javax.swing.JMenuItem();
        jMenuItemIniciarS = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuFIS = new javax.swing.JMenu();
        jMenuItemConsultar = new javax.swing.JMenuItem();
        jMenuItemInsertar = new javax.swing.JMenuItem();
        jMenuItemModificar = new javax.swing.JMenuItem();
        jMenuItemEliminar = new javax.swing.JMenuItem();
        jMenuAyuda = new javax.swing.JMenu();
        jMenuItemAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca FIS UNED");
        setBackground(new java.awt.Color(153, 153, 255));
        setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        setResizable(false);
        setShape(getShape());

        jPaneUsuariol.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPaneUsuariol.setForeground(new java.awt.Color(0, 51, 51));
        jPaneUsuariol.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabelUsuario.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(0, 102, 153));
        jLabelUsuario.setText("Ningun Usuario ha iniciado Sesion");

        jLabelTipoUsuario.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabelTipoUsuario.setForeground(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout jPaneUsuariolLayout = new javax.swing.GroupLayout(jPaneUsuariol);
        jPaneUsuariol.setLayout(jPaneUsuariolLayout);
        jPaneUsuariolLayout.setHorizontalGroup(
            jPaneUsuariolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneUsuariolLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTipoUsuario)
                .addContainerGap())
        );
        jPaneUsuariolLayout.setVerticalGroup(
            jPaneUsuariolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneUsuariolLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneUsuariolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario)
                    .addComponent(jLabelTipoUsuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonConsultar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButtonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search-b-icon.png"))); // NOI18N
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jButtonModificar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButtonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/App-edit-icon.png"))); // NOI18N
        jButtonModificar.setText("Modificar Documento");
        jButtonModificar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonInsertar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButtonInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Files-New-File-icon.png"))); // NOI18N
        jButtonInsertar.setText("Insertar Documento");
        jButtonInsertar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButtonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertarActionPerformed(evt);
            }
        });

        jButtonEliminar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blue-recycle-bin-icon.png"))); // NOI18N
        jButtonEliminar.setText("Eliminar Documento");
        jButtonEliminar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jMenuArchivo.setText("Archivo");

        jMenuItemCerrarS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCerrarS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login-out-icon.png"))); // NOI18N
        jMenuItemCerrarS.setText("Cerrar Sesion");
        jMenuItemCerrarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCerrarSActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemCerrarS);

        jMenuItemIniciarS.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemIniciarS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login-in-icon.png"))); // NOI18N
        jMenuItemIniciarS.setText("Iniciar Sesion");
        jMenuItemIniciarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIniciarSActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemIniciarS);

        jMenuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close-icon.png"))); // NOI18N
        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemSalir);

        jMenuBarPrincipal.add(jMenuArchivo);

        jMenuFIS.setText("FIS UNED");

        jMenuItemConsultar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Search-icon.png"))); // NOI18N
        jMenuItemConsultar.setText("Consultar");
        jMenuItemConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultarActionPerformed(evt);
            }
        });
        jMenuFIS.add(jMenuItemConsultar);

        jMenuItemInsertar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add-icon.png"))); // NOI18N
        jMenuItemInsertar.setText("Insertar Documento");
        jMenuItemInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInsertarActionPerformed(evt);
            }
        });
        jMenuFIS.add(jMenuItemInsertar);

        jMenuItemModificar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit-icon.png"))); // NOI18N
        jMenuItemModificar.setText("Modificar Documento");
        jMenuItemModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModificarActionPerformed(evt);
            }
        });
        jMenuFIS.add(jMenuItemModificar);

        jMenuItemEliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete-icon.png"))); // NOI18N
        jMenuItemEliminar.setText("Eliminar Documento");
        jMenuItemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEliminarActionPerformed(evt);
            }
        });
        jMenuFIS.add(jMenuItemEliminar);

        jMenuBarPrincipal.add(jMenuFIS);

        jMenuAyuda.setText("Ayuda");

        jMenuItemAcerca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItemAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Info-icon.png"))); // NOI18N
        jMenuItemAcerca.setText("Acerca De");
        jMenuItemAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAcercaActionPerformed(evt);
            }
        });
        jMenuAyuda.add(jMenuItemAcerca);

        jMenuBarPrincipal.add(jMenuAyuda);

        setJMenuBar(jMenuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPaneUsuariol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPaneUsuariol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonConsultar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsertar)
                    .addComponent(jButtonModificar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultarActionPerformed
        // TODO add your handling code here:
        Consultar consulta = new Consultar(this, true, gd);
            consulta.setVisible(true);
    }//GEN-LAST:event_jMenuItemConsultarActionPerformed

    private void jMenuItemInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInsertarActionPerformed
        // TODO add your handling code here:
        Insertar insert = new Insertar(this, true, gd);
            insert.setVisible(true);
    }//GEN-LAST:event_jMenuItemInsertarActionPerformed

    private void jMenuItemCerrarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCerrarSActionPerformed
        // TODO add your handling code here:
        // Se llama al método CerrarSesion
        
        this.CerrarSesion();
    }//GEN-LAST:event_jMenuItemCerrarSActionPerformed

    private void jMenuItemIniciarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIniciarSActionPerformed
        this.Iniciar();
    }//GEN-LAST:event_jMenuItemIniciarSActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        // TODO add your handling code here:
        Consultar consulta = new Consultar(this, true, gd);
            consulta.setVisible(true);
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
        Eliminar eliminado = new Eliminar(this, true);
        eliminado.setVisible(true);
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jMenuItemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEliminarActionPerformed
        // TODO add your handling code here:
        Eliminar eliminado = new Eliminar(this, true);
        eliminado.setVisible(true);
    }//GEN-LAST:event_jMenuItemEliminarActionPerformed

    private void jButtonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarActionPerformed
        // TODO add your handling code here:
        Insertar insert = new Insertar(this, true, gd);
        insert.setVisible(true);
    }//GEN-LAST:event_jButtonInsertarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        // TODO add your handling code here:
        Modificar mod = new Modificar(this, true, gd);
        mod.setVisible(true);
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jMenuItemModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModificarActionPerformed
        // TODO add your handling code here:
        Modificar mod = new Modificar(this, true, gd);
        mod.setVisible(true);
    }//GEN-LAST:event_jMenuItemModificarActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        // TODO add your handling code here:
        // Salir del Sistema
        Salir();
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAcercaActionPerformed
        
        AcercaDe acerca = new AcercaDe(this, true);
        acerca.show();
    }//GEN-LAST:event_jMenuItemAcercaActionPerformed

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
            java.util.logging.Logger.getLogger(FIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                try {
                    new FIS().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FIS.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    private void CerrarSesion()
    {
        // Cerrar la sesion actual
        int cerrar = JOptionPane.showConfirmDialog(rootPane, "¿Segur@ que desea Cerrar Sesion?", "Cerrar Sesion", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (cerrar==JOptionPane.YES_OPTION) 
        {
            this.gu.login.SetTipo(tipo_usuarios.no_identificado);
            this.IdentificarUsuario();

            this.jLabelUsuario.setText("Ningun Usuario ha sido autentificado");
            this.jLabelTipoUsuario.setText("");
            this.jMenuItemCerrarS.setEnabled(false);
            this.jMenuItemIniciarS.setEnabled(true);
        }
    }
   
    private void setEtiquetas() 
    {
        String nombre = gu.login.GetNombre();
        String tipo = gu.login.GetTipo().toString();
        this.jLabelUsuario.setText("Usuario Registrado: "+nombre);
        this.jLabelTipoUsuario.setText("Tipo de Usuario: "+tipo);
    }
    
    private void IdentificarUsuario()
    {
        // Se identifica si el usuario es de consulta o encargado
        if (this.gu.login.GetTipo() == tipo_usuarios.consulta) 
        {
            this.jButtonEliminar.setEnabled(false);
            this.jButtonConsultar.setEnabled(true);
            this.jButtonInsertar.setEnabled(false);
            this.jButtonModificar.setEnabled(false);
            
            this.jMenuItemInsertar.setEnabled(false);
            this.jMenuItemEliminar.setEnabled(false);
            this.jMenuItemModificar.setEnabled(false);
            this.jMenuItemConsultar.setEnabled(true);
        }
        else if(this.gu.login.GetTipo() == tipo_usuarios.encargado)
        {
            this.jButtonEliminar.setEnabled(true);
            this.jButtonConsultar.setEnabled(true);
            this.jButtonInsertar.setEnabled(true);
            this.jButtonModificar.setEnabled(true);
            
            this.jMenuItemInsertar.setEnabled(true);
            this.jMenuItemEliminar.setEnabled(true);
            this.jMenuItemModificar.setEnabled(true);
            this.jMenuItemConsultar.setEnabled(true);
        }
        else
        {
            this.jButtonEliminar.setEnabled(false);
            this.jButtonConsultar.setEnabled(false);
            this.jButtonInsertar.setEnabled(false);
            this.jButtonModificar.setEnabled(false);
            
            this.jMenuItemInsertar.setEnabled(false);
            this.jMenuItemEliminar.setEnabled(false);
            this.jMenuItemModificar.setEnabled(false);
            this.jMenuItemConsultar.setEnabled(false);
        }
    }
    
    private void Iniciar() 
    {
        // Iniciar Sesion
        en.show();
        try
        {
        gu = en.ObtenerInstancia();
        setEtiquetas(); 
        }
        catch(Exception e)
        {
            System.err.println(e.toString());
        }
        this.IdentificarUsuario();
        this.jMenuItemCerrarS.setEnabled(true);
        this.jMenuItemIniciarS.setEnabled(false);
    }
    
    private void Salir()
    {
        // Salir del Sistema
        int salir = JOptionPane.showConfirmDialog(rootPane, "¿Segur@ que desea Salir?", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (salir==JOptionPane.YES_OPTION) 
        {
            System.exit(salir);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonInsertar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabelTipoUsuario;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JMenu jMenuFIS;
    private javax.swing.JMenuItem jMenuItemAcerca;
    private javax.swing.JMenuItem jMenuItemCerrarS;
    private javax.swing.JMenuItem jMenuItemConsultar;
    private javax.swing.JMenuItem jMenuItemEliminar;
    private javax.swing.JMenuItem jMenuItemIniciarS;
    private javax.swing.JMenuItem jMenuItemInsertar;
    private javax.swing.JMenuItem jMenuItemModificar;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JPanel jPaneUsuariol;
    // End of variables declaration//GEN-END:variables

    
}