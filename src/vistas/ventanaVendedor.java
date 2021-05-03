package vistas;

import com.mysql.cj.xdevapi.Statement;
import conexion.conexion;
import static conexion.conexion.con;
import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;


public class ventanaVendedor extends javax.swing.JFrame {

    conexion cn = new conexion();
    DefaultTableModel modelo  = new DefaultTableModel(); 
    int item =0;
    double total=0;
    double precio=0;
    int  cantidad=0;
    String idCliente;
    String idVendedor;
    String fecha;
    String ftotal;
    
    
    public ventanaVendedor() {
        
        
        initComponents();
        setLocationRelativeTo(null);
        cn.conectar();
        cargartabla();
        llenarcomboproducto();
        llenarcombocliente();
        tabladetalle();
        DefaultTableModel detalle = new DefaultTableModel();
        Calendar calendario = new GregorianCalendar();
        txtfecha.setText(""+calendario.get(Calendar.YEAR)+"-"+(calendario.get(Calendar.MONTH)+1)+"-"+calendario.get(Calendar.DAY_OF_MONTH));
        fecha= txtfecha.getText();
        System.out.println("fecha "+fecha);
    
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtclave = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtnit = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        cbxtipo = new javax.swing.JComboBox<>();
        btagregar = new javax.swing.JButton();
        bteliminar = new javax.swing.JButton();
        btlimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaclientes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabladetalle = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        sproducto = new javax.swing.JSpinner();
        btfagregar = new javax.swing.JButton();
        cbproducto = new javax.swing.JComboBox<>();
        cbcliente = new javax.swing.JComboBox<>();
        txtprecio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtfnit = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtftipo = new javax.swing.JTextField();
        lbcantidad = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btcalcular = new javax.swing.JButton();
        gtotal = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblidcliente = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JLabel();
        txtidproducto = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Bienvenido");

        jLabel2.setText("Nombre");

        jLabel3.setText("Nit");

        jLabel4.setText("Teléfono");

        jLabel5.setText("Dirección");

        jLabel6.setText("Tipo Cliente");

        jLabel7.setText("Clave");

        txtclave.setEditable(false);

        cbxtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione\t", "Mayorista\t", "Final", " " }));

        btagregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btagregar.setText("Agregar");
        btagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btagregarActionPerformed(evt);
            }
        });

        bteliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bteliminar.setText("Eliminar");
        bteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarActionPerformed(evt);
            }
        });

        btlimpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btlimpiar.setText("Limpiar");
        btlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimpiarActionPerformed(evt);
            }
        });

        tablaclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Clave", "Nombre", "Nit", "Teléfono", "Dirección", "Tipo Cliente  "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaclientes.setCellSelectionEnabled(true);
        tablaclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaclientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaclientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnombre)
                            .addComponent(txtnit))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btagregar, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(bteliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btlimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btagregar))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btlimpiar))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bteliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(cbxtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(303, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Clientes", jPanel1);

        jLabel8.setText("Facturar");

        jLabel10.setText("Cliente");

        jLabel12.setText("Producto");

        tabladetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabladetalle);

        jLabel13.setText("Precio");

        sproducto.setModel(new javax.swing.SpinnerNumberModel(1, 0, 10, 1));

        btfagregar.setText("Agregar");
        btfagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfagregarActionPerformed(evt);
            }
        });

        cbproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbproductoActionPerformed(evt);
            }
        });

        cbcliente.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbclienteAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cbcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbclienteActionPerformed(evt);
            }
        });

        jLabel9.setText("NIT");

        jLabel11.setText("Tipo Cliente");

        jLabel14.setText("Cantidad");

        btcalcular.setText("Validar Factura");
        btcalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcalcularActionPerformed(evt);
            }
        });

        gtotal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel15.setText("idCliente");

        jLabel16.setText("Fecha");

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel17.setText("Total:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel12)
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel13))
                                    .addComponent(txtidproducto))
                                .addGap(36, 36, 36)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblidcliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(4, 4, 4))
                            .addComponent(cbcliente, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbproducto, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addGap(32, 32, 32)
                                .addComponent(sproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtfnit, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtftipo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbcantidad)
                                    .addComponent(btfagregar)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtfecha))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btcalcular)
                            .addGap(81, 81, 81)
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(gtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(340, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(lblidcliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtfnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtftipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtidproducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cbproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtfecha))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbcantidad)
                    .addComponent(jLabel14)
                    .addComponent(sproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btfagregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gtotal)
                    .addComponent(jLabel17)
                    .addComponent(btcalcular))
                .addGap(194, 194, 194))
        );

        jTabbedPane1.addTab("Facturación", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jTabbedPane1))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tablaclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaclientesMouseClicked
        //evento que al hacer click carga los datos a la tabla
        DefaultTableModel modelo = (DefaultTableModel) tablaclientes.getModel();
        txtclave.setText(modelo.getValueAt(tablaclientes.getSelectedRow(), 0) +"");
        txtnombre.setText(modelo.getValueAt(tablaclientes.getSelectedRow(), 1)+"");
        txtnit.setText(modelo.getValueAt(tablaclientes.getSelectedRow(), 2)+"");
        txtdireccion.setText(modelo.getValueAt(tablaclientes.getSelectedRow(),3)+"");
        txttelefono.setText(modelo.getValueAt(tablaclientes.getSelectedRow(),3)+"");
    }//GEN-LAST:event_tablaclientesMouseClicked

    private void btlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimpiarActionPerformed
        //boton limpiar
        limpiar();
    }//GEN-LAST:event_btlimpiarActionPerformed

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed
        String clave = txtclave.getText();
        if ("".equals(clave)){
            JOptionPane.showMessageDialog(null, "Debe de Seleccionar un Cliente");
        }
        else{
            try {
            cn.eliminarcliente(clave);
            JOptionPane.showMessageDialog(null, "El cliente se ha Eliminado" );
            cargartabla();
            } catch (SQLException ex) {  Logger.getLogger(ventanaVendedor.class.getName()).log(Level.SEVERE, null, ex);     }
        }
        
    }//GEN-LAST:event_bteliminarActionPerformed

    private void btagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btagregarActionPerformed
        // TODO add your handling code here:
        

        String Nombre = txtnombre.getText();
        String Nit = txtnit.getText();
        String Telefono = txttelefono.getText();
        String Direccion = txtdireccion.getText();
        String Tipo =  cbxtipo.getSelectedItem().toString();
        if (("".equals(Nombre)) || ("".equals(Nit)) || ("".equals(Telefono)) || ("".equals(Direccion))   )  {
            JOptionPane.showMessageDialog(null, "Debe Llenar todos los Campos", "Faltan Datos", HEIGHT);
        }
        else{
            try {
                cn.agregarcliente(Nombre, Nit, Telefono, Direccion, Tipo);
                JOptionPane.showMessageDialog(null, "Cliente Agregado");
                cargartabla();
            } catch (Exception e) {
            }
            
        }
        
    
    }//GEN-LAST:event_btagregarActionPerformed

    private void btfagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfagregarActionPerformed
        
        try {
            Double precio = Double.parseDouble(txtprecio.getText());
            String descripcion = (String) cbproducto.getSelectedItem();
            int cantidad = (int) sproducto.getValue();
            Double total = precio * cantidad;
            modelo=(DefaultTableModel)tabladetalle.getModel();
            item  = item+1;
            //System.out.println("D "+descripcion +" C "+cantidad+" Total "+total);
            ArrayList lista = new ArrayList();
            lista.add(txtidproducto.getText());
            lista.add(descripcion);
            lista.add(cantidad);
            lista.add(total);
            Object[] ob = new Object[4];
            ob[0]=lista.get(0);
            ob[1]=lista.get(1);
            ob[2]=lista.get(2);
            ob[3]=lista.get(3);
            modelo.addRow(ob);
            tabladetalle.setModel(modelo);
            String nfactura = cn.numerofactura();
            
            
            //total(); 
        } catch (SQLException ex) {
            Logger.getLogger(ventanaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btfagregarActionPerformed

    private double total(){
        for(int i=0; i<tabladetalle.getRowCount();i++)
        {
            cantidad = Integer.parseInt(tabladetalle.getValueAt(i, 2).toString());
            Double t= Double.parseDouble(tabladetalle.getValueAt(i, 3).toString());
            total = total + t;
            
        }
                  
        return total;
    }
    private void cbproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbproductoActionPerformed
        // TODO add your handling code here:
        String examinar =cbproducto.getSelectedItem().toString();
        SpinnerNumberModel nm = new SpinnerNumberModel();
        try {
            PreparedStatement ps = con.prepareStatement("select * from producto where descripcion =?");
            ps.setString(1, examinar);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Object [] fila = new Object[6]; // Hay 6 columnas en la tabla
                for (int i=0;i<6;i++)
                {    
                fila[i] = rs.getObject(i+1); // El primer indice en rs es el 1, no el cero, por eso se suma 1.
                
                }
                //cbproducto.addItem(rs.getObject(3).toString());
                txtprecio.setText(rs.getObject(6).toString());
                txtidproducto.setText(rs.getString(1));
                int spin =(int) rs.getObject(5);
                nm.setMaximum(spin);
                nm.setValue(1);
                sproducto.setModel(nm);
                
             
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ventanaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_cbproductoActionPerformed

    private void cbclienteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbclienteAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_cbclienteAncestorAdded

    private void cbclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbclienteActionPerformed
        // TODO add your handling code here:
        String examinar =cbcliente.getSelectedItem().toString();
        try {
            PreparedStatement ps = con.prepareStatement("select * from cliente where nombre =?");
            ps.setString(1, examinar);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Object [] fila = new Object[6]; // Hay 6 columnas en la tabla
                for (int i=0;i<6;i++)
                {    
                fila[i] = rs.getObject(i+1); // El primer indice en rs es el 1, no el cero, por eso se suma 1.
                
                }
                //cbproducto.addItem(rs.getObject(3).toString());
                txtfnit.setText(rs.getObject(3).toString());
                txtftipo.setText(rs.getObject(6).toString());
                lblidcliente.setText(rs.getObject(1).toString());
                idCliente = rs.getObject(1).toString();
                idVendedor = "1";
                cn.numerofactura();
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ventanaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_cbclienteActionPerformed

    private void btcalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcalcularActionPerformed
        //total();
        String t = String.valueOf(total());
        gtotal.setText(t);
        
        
        try {
            cn.agregarfactura(idCliente, idVendedor, fecha, t);
           //guardardetalle();
                       
        } catch (SQLException ex) {
            Logger.getLogger(ventanaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_btcalcularActionPerformed

    public void guardardetalle() throws SQLException{
        
        for(int i=0; i<tabladetalle.getRowCount(); i++)
        {
            String Cantidad = tabladetalle.getValueAt(i, 3).toString();
            System.out.println("cnatidad" + cantidad);
            String Precio = tabladetalle.getValueAt(i, 4).toString();
            System.out.println("precio" + precio);
            String idproducto = txtidproducto.getText();
            System.out.println("id producto" + idproducto);
            String factura = cn.numerofactura();
            
            
            
            
        }
        
    }
    
    public void llenarcomboproducto(){
        cn.conectar();
        try {
            PreparedStatement ps = con.prepareStatement("select * from producto");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Object [] fila = new Object[6]; // Hay 6 columnas en la tabla
                for (int i=0;i<6;i++)
                {    
                fila[i] = rs.getObject(i+1); // El primer indice en rs es el 1, no el cero, por eso se suma 1.
                
                }
                cbproducto.addItem(rs.getObject(3).toString());
                //txtprecio.setText(rs.getObject(6).toString());
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ventanaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void llenarcombocliente(){
        cn.conectar();
        try {
            PreparedStatement ps = con.prepareStatement("select * from cliente");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Object [] fila = new Object[6]; // Hay 6 columnas en la tabla
                for (int i=0;i<6;i++)
                {    
                fila[i] = rs.getObject(i+1); // El primer indice en rs es el 1, no el cero, por eso se suma 1.
                
                }
                cbcliente.addItem(rs.getObject(2).toString());
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ventanaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void buscarProducto(String id) throws SQLException{
        cn.conectar();
        PreparedStatement ps = con.prepareStatement("select * from producto where idProducto=?");
        ps.setString(1, id);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
            {
                Object [] fila = new Object[6]; 
                fila[1] = rs.getObject(3); // El primer indice en rs es el 1, no el cero, por eso se suma 1.
                //System.out.println("cliente "+fila[1]);
            }
    
    }
    

    public void buscarcliente(String id) throws SQLException{
        cn.conectar();
        PreparedStatement ps = con.prepareStatement("select * from cliente where idCliente=?");
        ps.setString(1, id);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
            {
                Object [] fila = new Object[6]; 
                fila[1] = rs.getObject(2); // El primer indice en rs es el 1, no el cero, por eso se suma 1.
            }
    }
    
    public void tabladetalle(){
       DefaultTableModel modelo = new DefaultTableModel();
       modelo.addColumn("Item");
       modelo.addColumn("Descripcion");
       modelo.addColumn("Cantidad");
       modelo.addColumn("Total");
       tabladetalle.setModel(modelo);
    }
    
    public void cargartabla(){
       DefaultTableModel modelo = new DefaultTableModel();
       modelo.addColumn("Código");
       modelo.addColumn("Nombre");
       modelo.addColumn("Nit");
       modelo.addColumn("Teléfono");
       modelo.addColumn("Dirección");
       modelo.addColumn("Tipo");
       cn.conectar();
        try {
            PreparedStatement ps = con.prepareStatement("select * from cliente");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Object [] fila = new Object[6]; // Hay 6 columnas en la tabla
                for (int i=0;i<6;i++)
                fila[i] = rs.getObject(i+1); // El primer indice en rs es el 1, no el cero, por eso se suma 1.
                modelo.addRow(fila);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ventanaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        tablaclientes.setModel(modelo);
        
    }
    
    void limpiar(){
        txtclave.setText(null);
        txtnombre.setText(null);
        txtnit.setText(null);
        txtdireccion.setText(null);
        txttelefono.setText(null);
    }    
     public static void main(String args[]) {
         
        
        try {
            
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventanaVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new ventanaVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btagregar;
    private javax.swing.JButton btcalcular;
    private javax.swing.JButton bteliminar;
    private javax.swing.JButton btfagregar;
    private javax.swing.JButton btlimpiar;
    private javax.swing.JComboBox<String> cbcliente;
    private javax.swing.JComboBox<String> cbproducto;
    private javax.swing.JComboBox<String> cbxtipo;
    private javax.swing.JLabel gtotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbcantidad;
    private javax.swing.JLabel lblidcliente;
    private javax.swing.JSpinner sproducto;
    private javax.swing.JTable tablaclientes;
    private javax.swing.JTable tabladetalle;
    private javax.swing.JTextField txtclave;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JLabel txtfecha;
    private javax.swing.JTextField txtfnit;
    private javax.swing.JTextField txtftipo;
    private javax.swing.JLabel txtidproducto;
    private javax.swing.JTextField txtnit;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
