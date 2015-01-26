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
import Modelo.TrabajoGrado.tipo_grado;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Michael
 */
public class Modificar extends javax.swing.JDialog {

    
    GestorDocumentos gestor = new GestorDocumentos();
    List<Documento> encontrado;
    DefaultListModel modelo;
    Documento nuevo;
    Documento existente;
    
    public Modificar(java.awt.Frame parent, boolean modal, GestorDocumentos gd) {
        super(parent, modal);
        gestor = gd;
        initComponents();
        this.jLabelTip1.setVisible(false);
        this.jLabelTip2.setVisible(false);
        this.jLabelTip3.setVisible(false);
        this.jLabelTip4.setVisible(false);
        this.jLabelTip6.setVisible(false);
        this.jLabelTip1.setText("Ej. Lenguajes de Programación");
        this.jLabelTip2.setText("Ej. 100");
        this.jButtonModificar.setEnabled(false);
    }

    private Modificar(JFrame jFrame, boolean b) 
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldAModificar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListEncontrados = new javax.swing.JList();
        jPanelDatos = new javax.swing.JPanel();
        jLabelTipo = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelAutor = new javax.swing.JLabel();
        jLabelUbicacion = new javax.swing.JLabel();
        jLabelCantidad = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldAutor = new javax.swing.JTextField();
        jTextFieldTitulo = new javax.swing.JTextField();
        jTextFieldUbicacion = new javax.swing.JTextField();
        jTextFieldCantidad = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabelTip2 = new javax.swing.JLabel();
        jLabelTip1 = new javax.swing.JLabel();
        jLabelTip3 = new javax.swing.JLabel();
        jLabelTip4 = new javax.swing.JLabel();
        jLabelTip6 = new javax.swing.JLabel();
        jButtonModificar = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Documentos - FIS UNED");

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("<html><h4>Ingrese el título del documento que desea Modificar</h4><hr></html>");
        jLabel1.setAutoscrolls(true);

        jTextFieldAModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jButtonBuscar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jListEncontrados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Resultados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(255, 102, 0)));
        jListEncontrados.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jListEncontrados.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListEncontradosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListEncontrados);

        jPanelDatos.setBackground(new java.awt.Color(185, 209, 234));
        jPanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles del Documento Seleccionado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(255, 102, 0)));

        jLabelTipo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabelTipo.setText("<html><h3>Tipo de documento</h2></html>");

        jLabelTitulo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabelTitulo.setText("Titulo:");

        jLabelAutor.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabelAutor.setText("Autor:");

        jLabelUbicacion.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabelUbicacion.setText("Ubicacion: ");

        jLabelCantidad.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabelCantidad.setText("Cantidad:");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel7.setText("Propiedad");

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel8.setText("Propiedad");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel9.setText("Propiedad");

        jTextFieldAutor.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jTextFieldTitulo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jTextFieldUbicacion.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jTextFieldCantidad.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jTextField7.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jTextField8.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jTextField9.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jLabelTip2.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        jLabelTip2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tip.png"))); // NOI18N
        jLabelTip2.setText("jLabel2");

        jLabelTip1.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        jLabelTip1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tip.png"))); // NOI18N
        jLabelTip1.setText("jLabel3");

        jLabelTip3.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        jLabelTip3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tip.png"))); // NOI18N
        jLabelTip3.setText("jLabel4");

        jLabelTip4.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        jLabelTip4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tip.png"))); // NOI18N
        jLabelTip4.setText("jLabel5");

        jLabelTip6.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        jLabelTip6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tip.png"))); // NOI18N
        jLabelTip6.setText("jLabel6");

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTitulo)
                            .addComponent(jLabelAutor)
                            .addComponent(jLabelUbicacion)
                            .addComponent(jLabelCantidad)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(27, 27, 27)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTitulo)
                            .addComponent(jTextFieldAutor)
                            .addComponent(jTextFieldUbicacion)
                            .addComponent(jTextFieldCantidad)
                            .addComponent(jTextField7)
                            .addComponent(jTextField8)
                            .addComponent(jTextField9)))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addComponent(jLabelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelTip2)
                        .addComponent(jLabelTip1)
                        .addComponent(jLabelTip3)
                        .addComponent(jLabelTip4, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabelTip6))
                .addContainerGap())
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo)
                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAutor)
                    .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUbicacion)
                    .addComponent(jTextFieldUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTip1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCantidad)
                    .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTip2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTip3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTip4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTip6))
                .addGap(20, 20, 20))
        );

        jButtonModificar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButtonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        jButtonModificar.setText("Actualizar Documento");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonVolver.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButtonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        jButtonVolver.setText("Volver al Menú Principal");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldAModificar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonVolver)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldAModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonModificar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
       
       ActualizarLista(); 
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jListEncontradosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListEncontradosValueChanged
       
        // EVENTO EN EL CUAL CAMBIA EL ITEM SELECCIONADO DE LA LISTA
        
        // SE ACTIVA EL PANEL PARA PODER EDITAR LOS DATOS DE LOS DOCUMENTOS
        this.jButtonModificar.setEnabled(true);
        try
       {
           // SE DETERMINA EL TIPO DE DOCUMENTO QUE ESTA SELECCIONADO
        if(modelo.elementAt(this.jListEncontrados.getSelectedIndex()) instanceof Libro)
        { // LIBRO
            Libro l = (Libro) modelo.elementAt(this.jListEncontrados.getSelectedIndex()); 
            existente = l;
            this.jLabelTipo.setText("<html><h2>Libro</h2></html>");
            this.jTextFieldTitulo.setText(l.GetTitulo());
            this.jTextFieldAutor.setText(l.GetAutor());
            this.jTextFieldUbicacion.setText(l.GetUbicacion());
            this.jTextFieldCantidad.setText(Integer.toString(l.GetCantidad()));
            this.jLabel7.setText("Editorial:");
            this.jTextField7.setText(l.GetEditorial());
            this.jTextField8.setVisible(true);
            this.jLabel8.setVisible(true);
            this.jLabel8.setText("Año de Publicación:");
            this.jTextField8.setText(Integer.toString(l.GetAñoPublic()));
            this.jTextField9.setVisible(false);
            this.jLabel9.setVisible(false);
            
            // ---------- Tips para llenado completo de la información------
            
            this.jLabelTip2.setVisible(true);
            this.jLabelTip1.setVisible(true);
            this.jLabelTip4.setText("Ej: 1990");
            this.jLabelTip3.setVisible(false);
            this.jLabelTip4.setVisible(true);
            this.jLabelTip6.setVisible(false);
            
        }
        else if(modelo.elementAt(this.jListEncontrados.getSelectedIndex()) instanceof Revista)
        { // REVISTA
            Revista r = (Revista) modelo.elementAt(this.jListEncontrados.getSelectedIndex()); 
            existente = r;
            this.jLabelTipo.setText("<html><h2>Revista</h2></html>");
            this.jTextFieldTitulo.setText(r.GetTitulo());
            this.jTextFieldAutor.setText(r.GetAutor());
            this.jTextFieldUbicacion.setText(r.GetUbicacion());
            this.jTextFieldCantidad.setText(Integer.toString(r.GetCantidad()));
            this.jLabel7.setText("Casa de Edición:");
            this.jLabel8.setText("Año:");
            this.jLabel9.setText("Mes:");
            this.jLabel7.setVisible(true);
            this.jLabel8.setVisible(true);
            this.jLabel9.setVisible(true);
            this.jTextField7.setVisible(true);
            this.jTextField8.setVisible(true);
            this.jTextField9.setVisible(true);
            this.jTextField7.setText(r.GetCasaEdicion());
            this.jTextField8.setText(Integer.toString(r.GetAño()));
            this.jTextField9.setText(r.GetMes());
            
            // ---------- Tips para llenado completo de la información------
            
            this.jLabelTip2.setVisible(true);
            this.jLabelTip1.setVisible(true);
            this.jLabelTip3.setVisible(false);
            this.jLabelTip4.setText("Ej: Enero");
            this.jLabelTip4.setVisible(true);
            this.jLabelTip6.setVisible(true);
            this.jLabelTip6.setText("Ej. 2007");
            
        }
        else if(modelo.elementAt(this.jListEncontrados.getSelectedIndex()) instanceof Publicacion)
        { // PUBLICACIÓN
            Publicacion p = (Publicacion) modelo.elementAt(this.jListEncontrados.getSelectedIndex()); 
            existente = p;
            this.jLabelTipo.setText("<html><h2>Publicación</h2></html>");
            this.jTextFieldTitulo.setText(p.GetTitulo());
            this.jTextFieldAutor.setText(p.GetAutor());
            this.jTextFieldUbicacion.setText(p.GetUbicacion());
            this.jTextFieldCantidad.setText(Integer.toString(p.GetCantidad()));
            this.jLabel7.setText("Referencia:");
            this.jLabel7.setVisible(true);
            this.jLabel8.setVisible(false);
            this.jLabel9.setVisible(false);
            this.jTextField7.setVisible(true);
            this.jTextField8.setVisible(false);
            this.jTextField9.setVisible(false);
            this.jTextField7.setText(p.GetReferencia());
            
            // ---------- Tips para llenado completo de la información------
            
            this.jLabelTip2.setVisible(true);
            this.jLabelTip1.setVisible(true);
            this.jLabelTip3.setText("Ej: Diario La Nación");
            this.jLabelTip3.setVisible(true);
            this.jLabelTip4.setVisible(false);
        }
        else if(modelo.elementAt(this.jListEncontrados.getSelectedIndex()) instanceof TrabajoGrado)
        { //  TRABAJO DE GRADO
            TrabajoGrado tg = (TrabajoGrado) modelo.elementAt(this.jListEncontrados.getSelectedIndex()); 
            existente = tg;
            this.jLabelTipo.setText("<html><h2>Trabajo de Grado</h2></html>");
            this.jTextFieldTitulo.setText(tg.GetTitulo());
            this.jTextFieldAutor.setText(tg.GetAutor());
            this.jTextFieldUbicacion.setText(tg.GetUbicacion());
            this.jTextFieldCantidad.setText(Integer.toString(tg.GetCantidad()));
            this.jLabel7.setText("Tipo de Grado:");
            this.jLabel8.setText("Universidad:");
            this.jLabel7.setVisible(true);
            this.jLabel8.setVisible(true);
            this.jLabel9.setVisible(false);
            this.jTextField7.setVisible(true);
            this.jTextField8.setVisible(true);
            this.jTextField9.setVisible(false);
            this.jTextField7.setText(tg.GetTipo().toString());
            this.jTextField8.setText(tg.GetUniversidad());
            
            // ---------- Tips para llenado completo de la información------
            
            this.jLabelTip2.setVisible(true);
            this.jLabelTip1.setVisible(true);
            this.jLabelTip3.setText("D(Diplomado), B(Bachillerato), L(Licenciatura)");
            this.jLabelTip3.setVisible(true);
            this.jLabelTip4.setVisible(false);
        }
       }
       catch(Exception e)
       {
           
       }
    }//GEN-LAST:event_jListEncontradosValueChanged

    private void ActualizarLista()
    {
        // SE DEFINE EL MODELO DE LA LISTA
        modelo = new DefaultListModel();
        // SE INICIALIZA LA LISTA
        encontrado = new ArrayList();
        
        try 
        {
            // SE OBTIENEN LOS DOCUMENTOS DEL METODO CONSULTAR
            encontrado = gestor.Consultar(this.jTextFieldAModificar.getText());
            for (Documento doc:encontrado) 
            {
                // SE RECORREN LOS DOCUMENTOS IDENTIFICADOS
                // SE IDENTIFICA EL TIPO DE DOCUMENTO
                if (doc instanceof Libro) 
                {
                    Libro l = (Libro) doc;
                    l.SetTipo("Libro");
                    modelo.addElement(l);
                }
                else if (doc instanceof Revista) 
                {
                    Revista r = (Revista) doc;
                    r.SetTipo("Revista");
                    modelo.addElement(r);
                }
                else if (doc instanceof Publicacion) 
                {
                    Publicacion p = (Publicacion) doc;
                    p.SetTipo("Publicacion");
                    modelo.addElement(p);
                }
                else if (doc instanceof TrabajoGrado) 
                {
                    TrabajoGrado tg = (TrabajoGrado) doc;
                    tg.SetTipo("Trabajo Grado");
                    modelo.addElement(tg);
                }
                else{}
            }
        } catch (IOException ex) 
        {
            System.err.println(ex.toString());
        }
        if (encontrado.isEmpty()) 
        {
            JOptionPane.showMessageDialog(rootPane, "No existen documentos relacionados\n con ese criterio de búsqueda", "No encontrado", JOptionPane.WARNING_MESSAGE);
        }
        // SE LE APLICA EL MÓDELO A LA LISTA
        this.jListEncontrados.setModel(modelo);
    }
    
    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
       
        // SE OBTIENEN LOS VALORES MODIFICADOS EN LOS TEXTFIELDS
        try
        {
        switch (this.jLabelTipo.getText()) 
        {  // IDENTIFICA EL TIPO DE DOCUMENTO QUE SE DESEA MODIFICAR
                case "<html><h2>Libro</h2></html>":
                    Libro mi_libro = new Libro();
                    mi_libro.SetTitulo(this.jTextFieldTitulo.getText());
                    mi_libro.SetAutor(this.jTextFieldAutor.getText());
                    mi_libro.SetUbicacion(this.jTextFieldUbicacion.getText());
                    mi_libro.SetCantidad(Integer.parseInt(this.jTextFieldCantidad.getText()));
                    mi_libro.setEditorial(this.jTextField7.getText());
                    mi_libro.setAñoPublicacion(Integer.parseInt(this.jTextField8.getText()));
                    mi_libro.SetTipo("Libro");
                    nuevo = mi_libro;
                    break;
                case "<html><h2>Revista</h2></html>":
                    Revista mi_revista = new Revista();
                    mi_revista.SetTitulo(this.jTextFieldTitulo.getText());
                    mi_revista.SetAutor(this.jTextFieldAutor.getText());
                    mi_revista.SetUbicacion(this.jTextFieldUbicacion.getText());
                    mi_revista.SetCantidad(Integer.parseInt(this.jTextFieldCantidad.getText()));
                    mi_revista.setCasaEdicion(this.jTextField7.getText());
                    mi_revista.setAño(Integer.parseInt(this.jTextField8.getText()));
                    mi_revista.setMes(this.jTextField9.getText());
                    mi_revista.SetTipo("Revista");
                    nuevo = mi_revista;
                    break;
                case "<html><h2>Publicación</h2></html>":
                    Publicacion mi_publi = new Publicacion();
                    mi_publi.SetTitulo(this.jTextFieldTitulo.getText());
                    mi_publi.SetAutor(this.jTextFieldAutor.getText());
                    mi_publi.SetUbicacion(this.jTextFieldUbicacion.getText());
                    mi_publi.SetCantidad(Integer.parseInt(this.jTextFieldCantidad.getText()));
                    mi_publi.setReferencia(this.jTextField7.getText());
                    mi_publi.SetTipo("Publicacion");
                    nuevo = mi_publi;
                    break;
                case "<html><h2>Trabajo de Grado</h2></html>":
                    TrabajoGrado mi_trabajo = new TrabajoGrado();
                    mi_trabajo.SetTitulo(this.jTextFieldTitulo.getText());
                    mi_trabajo.SetAutor(this.jTextFieldAutor.getText());
                    mi_trabajo.SetUbicacion(this.jTextFieldUbicacion.getText());
                    mi_trabajo.SetCantidad(Integer.parseInt(this.jTextFieldCantidad.getText()));
                    mi_trabajo.setTipoGrado(tipo_grado.valueOf(this.jTextField7.getText()));
                    mi_trabajo.setUniversidad(this.jTextField8.getText());
                    mi_trabajo.SetTipo("Trabajo Grado");
                    nuevo = mi_trabajo;
                    break;
                default:
                    JOptionPane.showMessageDialog(rootPane, "ERROR");
                    break;
        }
        }
        catch(NumberFormatException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(rootPane, "Verifique los datos ingresados, algunos\nno cumplen con el formato solicitado.", "Datos no Válidos", JOptionPane.ERROR_MESSAGE);
        }
        try 
        { // SE ENVIA EL OBJETO ANTERIOR Y EL CREADO
            gestor.Modificar(existente, nuevo);
            ActualizarLista();
            // SE ACTUALIZA LA LISTA DE DOCUMENTOS
        } 
        catch (IOException ex) 
        {
            System.err.println(ex.toString());
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        // CIERRA LA VENTANA DE DIALOGO MODIFICAR
        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed


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
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Modificar dialog = new Modificar(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelTip1;
    private javax.swing.JLabel jLabelTip2;
    private javax.swing.JLabel jLabelTip3;
    private javax.swing.JLabel jLabelTip4;
    private javax.swing.JLabel jLabelTip6;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUbicacion;
    private javax.swing.JList jListEncontrados;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextFieldAModificar;
    private javax.swing.JTextField jTextFieldAutor;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldTitulo;
    private javax.swing.JTextField jTextFieldUbicacion;
    // End of variables declaration//GEN-END:variables
}
