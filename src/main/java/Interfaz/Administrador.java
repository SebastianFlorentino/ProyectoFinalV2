package Interfaz;


import ConeccionDataBase.Coneccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ConeccionDataBase.Coneccion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author PC
 */
public class Administrador extends javax.swing.JFrame {
  
  Coneccion con= new Coneccion(); 
  Connection cn= con.EstablacerConnection();
  
  public Administrador() {
    initComponents();
    mostrarDatos();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
    jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
    jPanel3 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    txtid = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    txtcedula = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    txtcontrasenia = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    txtConfirmarContrasenia = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    txtnombre = new javax.swing.JTextField();
    txtapellido = new javax.swing.JTextField();
    txtCargo = new javax.swing.JTextField();
    txtFechaNac = new javax.swing.JTextField();
    txtFechaIngreso = new javax.swing.JTextField();
    txtSueldo = new javax.swing.JTextField();
    jPanel4 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tabla = new javax.swing.JTable();
    jPanel1 = new javax.swing.JPanel();
    btnEditar = new javax.swing.JButton();
    btnGuardar = new javax.swing.JButton();
    btnEliminar = new javax.swing.JButton();
    jButton1 = new javax.swing.JButton();
    jMenuBar1 = new javax.swing.JMenuBar();
    jMenu7 = new javax.swing.JMenu();
    jMenu1 = new javax.swing.JMenu();
    jMenu3 = new javax.swing.JMenu();
    jMenu6 = new javax.swing.JMenu();
    jMenu2 = new javax.swing.JMenu();
    jMenu4 = new javax.swing.JMenu();

    jCheckBoxMenuItem1.setSelected(true);
    jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

    jCheckBoxMenuItem2.setSelected(true);
    jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel3.setBackground(new java.awt.Color(204, 255, 255));
    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

    jLabel1.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
    jLabel1.setText("Id");

    txtid.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtid.setText("...");
    txtid.setEnabled(false);
    txtid.setRequestFocusEnabled(false);
    txtid.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtidActionPerformed(evt);
      }
    });

    jLabel2.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
    jLabel2.setText("cedula");

    txtcedula.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtcedula.setText("...");

    jLabel3.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
    jLabel3.setText("contrasenia");

    txtcontrasenia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtcontrasenia.setText("...");

    jLabel4.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
    jLabel4.setText("confirmar_contrasenia");

    txtConfirmarContrasenia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    txtConfirmarContrasenia.setText("...");

    jLabel5.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
    jLabel5.setText("nombre");

    jLabel6.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
    jLabel6.setText("fechaNacimiento");

    jLabel7.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
    jLabel7.setText("cargo");

    jLabel8.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
    jLabel8.setText("apellido");

    jLabel9.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
    jLabel9.setText("sueldo");

    jLabel10.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
    jLabel10.setText("fechaIngreso");

    txtnombre.setText("...");

    txtapellido.setText("...");

    txtCargo.setText("...");

    txtFechaNac.setText("...");

    txtFechaIngreso.setText("...");

    txtSueldo.setText("...");

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(txtid)
          .addComponent(txtcontrasenia)
          .addComponent(txtcedula)
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel2)
              .addComponent(jLabel3)
              .addComponent(jLabel1)))
          .addComponent(jLabel4)
          .addComponent(txtConfirmarContrasenia))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel7)
          .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel6)
          .addComponent(jLabel8)
          .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel5)
          .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(42, 42, 42)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(6, 6, 6)
            .addComponent(jLabel10))
          .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel9)
          .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(43, 43, 43))
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtcontrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtConfirmarContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel7)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel6)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(62, Short.MAX_VALUE))
    );

    jPanel4.setBackground(new java.awt.Color(153, 153, 255));
    jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Información"));

    tabla.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null}
      },
      new String [] {
        "Id", "cedula", "contrasenia", "confirmar_contrasenia", "nombre", "apellido", "cargo", "fechaNacimiento", "fechaIngreso", "sueldo"
      }
    ));
    tabla.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tablaMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tabla);

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel4Layout.setVerticalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    jPanel1.setBackground(new java.awt.Color(0, 153, 204));
    jPanel1.setForeground(new java.awt.Color(0, 204, 204));

    btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    btnEditar.setText("Editar");
    btnEditar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnEditarActionPerformed(evt);
      }
    });

    btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    btnGuardar.setText("Gaurdar");
    btnGuardar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnGuardarActionPerformed(evt);
      }
    });

    btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    btnEliminar.setText("Eliminar");
    btnEliminar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnEliminarActionPerformed(evt);
      }
    });

    jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jButton1.setText("Limpiar");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(btnGuardar)
        .addGap(32, 32, 32)
        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(btnEliminar)
        .addGap(41, 41, 41)
        .addComponent(jButton1)
        .addGap(46, 46, 46))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(15, 15, 15)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnEditar)
          .addComponent(btnEliminar)
          .addComponent(btnGuardar)
          .addComponent(jButton1))
        .addContainerGap(67, Short.MAX_VALUE))
    );

    jMenu7.setText("Interfaces");

    jMenu1.setText("Interfaz para clientes");
    jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jMenu1MouseClicked(evt);
      }
    });
    jMenu7.add(jMenu1);

    jMenu3.setText("Realizar Pagos");
    jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jMenu3MouseClicked(evt);
      }
    });
    jMenu7.add(jMenu3);

    jMenuBar1.add(jMenu7);

    jMenu6.setText("Cerrar sesión");

    jMenu2.setText("Salir");
    jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jMenu2MouseClicked(evt);
      }
    });
    jMenu6.add(jMenu2);

    jMenuBar1.add(jMenu6);

    jMenu4.setText("Interfaz del administrador para agregar empleados");
    jMenuBar1.add(jMenu4);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    String sql = "INSERT INTO empleado (cedula, contrasenia, confirmar_contrasenia, nombre, apellido, cargo, fechaNacimiento, fechaIngreso, sueldo) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?,?)";
    
    try {
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setString(1, txtcedula.getText());
        pst.setString(2, txtcontrasenia.getText());
        pst.setString(3, txtConfirmarContrasenia.getText());
        pst.setString(4, txtnombre.getText());
        pst.setString(5, txtapellido.getText());
        pst.setString(6, txtCargo.getText());
        pst.setString(7, txtFechaNac.getText());
        pst.setString(8, txtFechaIngreso.getText());
        pst.setString(9, txtSueldo.getText());
        
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "empleado ingresado al dedillo");
        
        limpiarCampos();
  }//GEN-LAST:event_btnGuardarActionPerformed
    catch (Exception ex) {
      JOptionPane.showMessageDialog(null, "Error: "+ex);
    }
  }
  private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
    int selectedRow = tabla.getSelectedRow();
        try {
            String updateQuery = "UPDATE empleado SET cedula='" + txtcedula.getText() + "', "
                    + "contrasenia='" + txtcontrasenia.getText() + "', confirmar_contrasenia='" + txtConfirmarContrasenia.getText() + "', "
                    + "nombre='" + txtnombre.getText() + "', apellido='" + txtapellido.getText() + "', "
                    + "cargo='" + txtCargo.getText() + "', fechaNacimiento='" + txtFechaNac.getText() + "', "
                    + "fechaIngreso='" + txtFechaIngreso.getText() + "', sueldo='" + txtSueldo.getText() + "' WHERE id='" + txtid.getText() + "'";

            PreparedStatement pst = cn.prepareStatement(updateQuery);

            int result = pst.executeUpdate();

            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Registro actualizado correctamente");
                  mostrarDatos(); // Refresh the table
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el registro");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el registro: " + ex.getMessage());
        }
    
  }//GEN-LAST:event_btnEditarActionPerformed

  private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
    btnGuardar.setEnabled(false);
    btnEditar.setEnabled(true);
    btnEliminar.setEnabled(true);
    int fila = tabla.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(null, "Seleccione una fila");
    } else {
        // Set the selected row data to the text fields
        txtid.setText(tabla.getValueAt(fila, 0).toString());
        txtcedula.setText(tabla.getValueAt(fila, 1).toString());
        txtcontrasenia.setText(tabla.getValueAt(fila, 2).toString());
        txtConfirmarContrasenia.setText(tabla.getValueAt(fila, 3).toString());
        txtnombre.setText(tabla.getValueAt(fila, 4).toString());
        txtapellido.setText(tabla.getValueAt(fila, 5).toString());
        txtCargo.setText(tabla.getValueAt(fila, 6).toString());
        txtFechaNac.setText(tabla.getValueAt(fila, 7).toString());
        txtFechaIngreso.setText(tabla.getValueAt(fila, 8).toString());
        txtSueldo.setText(tabla.getValueAt(fila, 9).toString());
    }
  
  }//GEN-LAST:event_tablaMouseClicked

  private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
      int selectedRow = tabla.getSelectedRow();

    if (selectedRow != -1) {
        try {
            String deleteQuery = "DELETE FROM empleado WHERE id='" + txtid.getText() + "'";

            Statement st = cn.createStatement();
            int result = st.executeUpdate(deleteQuery);

            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
                mostrarDatos(); // Refresh the table
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el registro: " + ex.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(null, "Selecciona una fila para eliminar");
    }
  }//GEN-LAST:event_btnEliminarActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
limpiarCampos();
btnGuardar.setEnabled(true);
  }//GEN-LAST:event_jButton1ActionPerformed

  private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtidActionPerformed

  private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
    AdministradorCliente Adcli= new AdministradorCliente();
    
              setVisible(false);
              Adcli.setVisible(true);
  }//GEN-LAST:event_jMenu1MouseClicked

  private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
    
    InicioSesion inicio= new InicioSesion();
    setVisible(false);
              inicio.setVisible(true);
  }//GEN-LAST:event_jMenu2MouseClicked

  private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
    Ipago ipg = new Ipago();
    setVisible(false);
              ipg.setVisible(true);
  }//GEN-LAST:event_jMenu3MouseClicked

  
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
      java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Administrador().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnEditar;
  private javax.swing.JButton btnEliminar;
  private javax.swing.JButton btnGuardar;
  private javax.swing.JButton jButton1;
  private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
  private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JMenu jMenu1;
  private javax.swing.JMenu jMenu2;
  private javax.swing.JMenu jMenu3;
  private javax.swing.JMenu jMenu4;
  private javax.swing.JMenu jMenu6;
  private javax.swing.JMenu jMenu7;
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JScrollPane jScrollPane1;
  public javax.swing.JTable tabla;
  public javax.swing.JTextField txtCargo;
  public javax.swing.JTextField txtConfirmarContrasenia;
  public javax.swing.JTextField txtFechaIngreso;
  public javax.swing.JTextField txtFechaNac;
  public javax.swing.JTextField txtSueldo;
  public javax.swing.JTextField txtapellido;
  public javax.swing.JTextField txtcedula;
  public javax.swing.JTextField txtcontrasenia;
  public javax.swing.JTextField txtid;
  public javax.swing.JTextField txtnombre;
  // End of variables declaration//GEN-END:variables

  private void mostrarDatos() {
    DefaultTableModel modelo= new DefaultTableModel();
     modelo.addColumn("id");
    modelo.addColumn("nomEmp");
    modelo.addColumn("sexEmp");
    modelo.addColumn("fecNac");
    modelo.addColumn("fecIncorporacion");
    modelo.addColumn("salEmp");
    modelo.addColumn("comisionE");
    modelo.addColumn("cargoE");
    modelo.addColumn("jefeID");
        modelo.addColumn("codDepto");

    
    
    tabla.setModel(modelo);
    String consul = "select * from empleado";
    String[] datos = new String[10];
    Statement st;
    try {
        st = cn.createStatement();
        ResultSet rs = st.executeQuery(consul);
        while (rs.next()) {
            datos[0] = rs.getString(1);
            datos[1] = rs.getString(2);
            datos[2] = rs.getString(3);
            datos[3] = rs.getString(4);
            datos[4] = rs.getString(5);
            datos[5] = rs.getString(6);
            datos[6] = rs.getString(7);
            datos[7] = rs.getString(8);
            datos[8] = rs.getString(9);
            datos[9] = rs.getString(10);
         
            modelo.addRow(datos);
        }
    
  }
    catch (Exception ex) {
      System.out.println(ex);
    }
}

  private void limpiarCampos() {

    txtid.setText("");
    txtcedula.setText("");
    txtcontrasenia.setText("");
    txtConfirmarContrasenia.setText("");
    txtnombre.setText("");
    txtapellido.setText("");
    txtCargo.setText("");
    txtFechaNac.setText("");
    txtFechaIngreso.setText("");
    txtSueldo.setText("");
}

  private void buscarDatos(String buscar) {
DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("id");
    modelo.addColumn("nomEmp");
    modelo.addColumn("sexEmp");
    modelo.addColumn("fecNac");
    modelo.addColumn("fecIncorporacion");
    modelo.addColumn("salEmp");
    modelo.addColumn("comisionE");
    modelo.addColumn("cargoE");
    modelo.addColumn("jefeID");
    modelo.addColumn("codDepto");

    tabla.setModel(modelo);

    String consulta = "SELECT * FROM empleado WHERE id LIKE '%" + buscar + "%' OR nombre LIKE '%" +  buscar + "%'";

    String[] datos = new String[10];
    Statement st;

    try {
        st = cn.createStatement();
        ResultSet rs = st.executeQuery(consulta);

        boolean encontrado = false;

        while (rs.next()) {
            encontrado = true;
            datos[0] = rs.getString(1);
            datos[1] = rs.getString(2);
            datos[2] = rs.getString(3);
            datos[3] = rs.getString(4);
            datos[4] = rs.getString(5);
            datos[5] = rs.getString(6);
            datos[6] = rs.getString(7);
            datos[7] = rs.getString(8);
            datos[8] = rs.getString(9);
            datos[9] = rs.getString(10);

            modelo.addRow(datos);
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No se encontraron resultados para la búsqueda");
        }

    } catch (Exception ex) {
        System.out.println(ex);
    }}
  
}
