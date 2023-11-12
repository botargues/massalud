package Vistas;

import static Vistas.VistaMenuPrincipal.jEscritorio;
import java.sql.Connection;
import javax.swing.JOptionPane;
import massalud.AccesoADatos.Conexion;
import massalud.AccesoADatos.afiliadoData;
import massalud.Entidades.Afiliados;

public class VistaAgregarAfiliado extends javax.swing.JInternalFrame {
    private Connection con = null;
    private afiliadoData afiData= new afiliadoData();
    private Afiliados agregarAfiliado;
    private Integer var;
    
    public VistaAgregarAfiliado() {
        initComponents();
        con = Conexion.getConexion();
        var=VistaOrden.dni;
        jDni.setText(var+"");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jDni = new javax.swing.JTextField();
        jApellido = new javax.swing.JTextField();
        jNombre = new javax.swing.JTextField();
        jDomicilio = new javax.swing.JTextField();
        jTelefono = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLimpiar = new javax.swing.JButton();
        jGuardar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("AgregarAfiliado");

        jLabel2.setText("Documento");

        jLabel3.setText("Apellido");

        jLabel4.setText("Nombre");

        jLabel5.setText("Domicilio");

        jLabel6.setText("Telefono");

        jDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jDniKeyTyped(evt);
            }
        });

        jApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jApellidoActionPerformed(evt);
            }
        });
        jApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jApellidoKeyTyped(evt);
            }
        });

        jNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jNombreKeyTyped(evt);
            }
        });

        jDomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jDomicilioKeyTyped(evt);
            }
        });

        jTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTelefonoKeyTyped(evt);
            }
        });

        jButton1.setText("Salida");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLimpiar.setText("Limpiar");
        jLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimpiarActionPerformed(evt);
            }
        });

        jGuardar.setText("Guardar");
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jGuardar)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDomicilio)
                                    .addComponent(jNombre)
                                    .addComponent(jApellido)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDni, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 107, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLimpiar)
                        .addGap(32, 32, 32)
                        .addComponent(jButton1)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLimpiar)
                    .addComponent(jGuardar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jLimpiarActionPerformed

    private void jApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jApellidoActionPerformed
    }//GEN-LAST:event_jApellidoActionPerformed

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
        Integer dni=var;
        String apellido = jApellido.getText();
        String nombre = jNombre.getText();
        String telefono = jTelefono.getText();
        String domicilio = jDomicilio.getText();
        Boolean estado = true;
        if(apellido.isEmpty() || nombre.isEmpty() || domicilio.isEmpty() || telefono.isEmpty() || dni==0){
            JOptionPane.showMessageDialog(this, "Complete los campos vacios. Por Favor");
            return;           
        }
        agregarAfiliado=new Afiliados(nombre, apellido, dni, domicilio,telefono,estado);
        afiData.guardarAfiliado(agregarAfiliado);
        dispose();
    }//GEN-LAST:event_jGuardarActionPerformed

    private void jDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDniKeyTyped
        if(jDni.getText().length() >= 8){
            evt.consume();
        }
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros){
            evt.consume();
        }
    }//GEN-LAST:event_jDniKeyTyped

    private void jApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jApellidoKeyTyped
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        if (!(minusculas || mayusculas || espacio)){
            evt.consume();
        }
    }//GEN-LAST:event_jApellidoKeyTyped

    private void jNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNombreKeyTyped
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        if (!(minusculas || mayusculas || espacio)){
            evt.consume();
        }
    }//GEN-LAST:event_jNombreKeyTyped

    private void jDomicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDomicilioKeyTyped
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean numeros = key >= 48 && key <= 57;
        if (!(minusculas || mayusculas || espacio || numeros)){
            evt.consume();
        }
    }//GEN-LAST:event_jDomicilioKeyTyped

    private void jTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTelefonoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros || jTelefono.getText().length() >= 10){
            evt.consume();
        }
    }//GEN-LAST:event_jTelefonoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jApellido;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jDni;
    private javax.swing.JTextField jDomicilio;
    private javax.swing.JButton jGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jLimpiar;
    private javax.swing.JTextField jNombre;
    private javax.swing.JTextField jTelefono;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos(){
            if (jDni==null){
                Integer dni = Integer.parseInt(jDni.getText());
                String apellido = jApellido.getText();
                
                String nombre = jNombre.getText();
                String telefono = jTelefono.getText();
                String domicilio = jDomicilio.getText();
                Boolean estado=true;
                agregarAfiliado=new Afiliados(nombre, apellido, dni, domicilio,telefono,estado);
            }
    }
    
    private void limpiar(){
        jDni.setText("");
        jNombre.setText("");
        jApellido.setText("");
        jTelefono.setText("");
        jDomicilio.setText("");
    }  

}

