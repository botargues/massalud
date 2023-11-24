package Vistas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import massalud.AccesoADatos.especialidadData;
import massalud.AccesoADatos.prestadorData;
import massalud.Entidades.*;

public class VistaMenuPrestadores extends javax.swing.JInternalFrame {
    private prestadorData prest = new prestadorData();
    private especialidadData esp = new especialidadData();
    private Prestador prestadorActual=null;
    private ArrayList<Especialidad> listaEsp;

    public VistaMenuPrestadores() {
        initComponents();
        listaEsp = (ArrayList<Especialidad>)esp.listarEspecialidades();
        jAgregar.setEnabled(false);
        jModificar.setEnabled(false);
        jEliminar.setEnabled(false);
        jApellido.setEnabled(false);
        jNombre.setEnabled(false);
        jDomicilio.setEnabled(false);
        jTelefono.setEnabled(false);
        jCombo.setEnabled(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSalida = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jDocumento = new javax.swing.JTextField();
        jBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        jApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jDomicilio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jAgregar = new javax.swing.JButton();
        jEliminar = new javax.swing.JButton();
        jModificar = new javax.swing.JButton();
        jCombo = new javax.swing.JComboBox<>();
        jLimpiar = new javax.swing.JButton();
        jestado = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("PRESTADORES");

        jSalida.setText("Salir");
        jSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalidaActionPerformed(evt);
            }
        });

        jLabel2.setText("Documento:");

        jDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDocumentoActionPerformed(evt);
            }
        });
        jDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jDocumentoKeyTyped(evt);
            }
        });

        jBuscar.setForeground(new java.awt.Color(51, 51, 51));
        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellido:");

        jNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNombreActionPerformed(evt);
            }
        });
        jNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jNombreKeyTyped(evt);
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

        jLabel5.setText("Domicilio:");

        jDomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jDomicilioKeyTyped(evt);
            }
        });

        jLabel6.setText("Telefono:");

        jTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTelefonoActionPerformed(evt);
            }
        });
        jTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTelefonoKeyTyped(evt);
            }
        });

        jLabel7.setText("Estado:");

        jLabel8.setText("Especialidad:");

        jAgregar.setForeground(new java.awt.Color(51, 51, 51));
        jAgregar.setText("Agregar");
        jAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarActionPerformed(evt);
            }
        });

        jEliminar.setForeground(new java.awt.Color(51, 51, 51));
        jEliminar.setText("Eliminar");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });

        jModificar.setForeground(new java.awt.Color(51, 51, 51));
        jModificar.setText("Modificar");
        jModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificarActionPerformed(evt);
            }
        });

        jCombo.setEditable(true);

        jLimpiar.setText("Limpiar");
        jLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jAgregar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(5, 5, 5)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(jModificar)
                                .addGap(38, 38, 38)
                                .addComponent(jLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSalida)))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(88, 88, 88)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jDomicilio)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jestado, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jestado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAgregar)
                    .addComponent(jEliminar)
                    .addComponent(jModificar)
                    .addComponent(jSalida)
                    .addComponent(jLimpiar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalidaActionPerformed
        dispose();
    }//GEN-LAST:event_jSalidaActionPerformed

    private void jApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jApellidoActionPerformed

    private void jTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTelefonoActionPerformed

    private void jAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarActionPerformed
        Integer dni = Integer.parseInt(jDocumento.getText());
        String apellido = jApellido.getText();
        String nombre = jNombre.getText();
        String telefono = jTelefono.getText();
        String domicilio = jDomicilio.getText();
        Especialidad especialidad = (Especialidad)jCombo.getSelectedItem();
        if(apellido.isEmpty() || nombre.isEmpty() || domicilio.isEmpty() || telefono.isEmpty() || especialidad.getIdEspecialidad()==0){
            JOptionPane.showMessageDialog(this, "Complete los campos vacios. Por Favor");
            return;           
        }
        Boolean estado = true;
        prestadorActual=new Prestador(nombre, apellido, dni, domicilio,telefono,estado,especialidad);
        eliminardtos();
    }//GEN-LAST:event_jAgregarActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        if(jDocumento.getText().length()<=7){
            JOptionPane.showMessageDialog(this, "Numero invalido");
            return;
        }
        try{
            int dni = Integer.parseInt(jDocumento.getText());
            prestadorActual = prest.buscarPrestadorDni(dni);
            if(prestadorActual != null){
               jNombre.setEnabled(true);
               jNombre.setText(prestadorActual.getNombre());
               jApellido.setEnabled(true);
               jApellido.setText(prestadorActual.getApellido());
               jTelefono.setEnabled(true);
               jTelefono.setText(String.valueOf(prestadorActual.getTelefono()));
               jDomicilio.setEnabled(true);
               jDomicilio.setText(prestadorActual.getDomicilio());
               jCombo.setEnabled(true);
               jCombo.setSelectedItem(prestadorActual.getEspecialidad());
               jDocumento.setEnabled(false);
               if (prestadorActual.isEstado()==true){
                    jestado.setText("ACTIVO");
                    jModificar.setEnabled(true);
                    jAgregar.setEnabled(false);
                    jEliminar.setEnabled(true);
                }else if(prestadorActual.isEstado()==false){
                    jestado.setText("INACTIVO");
                    int confirmacion = JOptionPane.showConfirmDialog(null, "PRESTADOR INACTIVO ¿Desea Activarlo?",
                        "Confirmar Eliminacion",
                        JOptionPane.YES_NO_OPTION
                        );
                    if(confirmacion == JOptionPane.YES_OPTION){
                        prestadorActual.setEstado(true);
                        prest.modificarPrestador(prestadorActual);
                        jestado.setText("ACTIVO");
                        jModificar.setEnabled(true);
                    }
                }
            }else{
                JOptionPane.showMessageDialog(this, "Para dar de alta un prestador complete los campos y oprima agregar ");
                jAgregar.setEnabled(true);
                jModificar.setEnabled(false);
                jEliminar.setEnabled(false);
                jApellido.setEnabled(true);
                jNombre.setEnabled(true);
                jDomicilio.setEnabled(true);
                jTelefono.setEnabled(true);
                jCombo.setEnabled(true);
            }
       }catch(NumberFormatException nf){
           JOptionPane.showMessageDialog(this, "Debe ingresar un numero de documento ");
       }
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificarActionPerformed
        try {
            Integer dni = Integer.parseInt(jDocumento.getText());
            String nombre = jNombre.getText();
            String apellido = jApellido.getText();                        
            String telefono = jTelefono.getText();
            String domicilio = jDomicilio.getText();
            Especialidad especialidad = (Especialidad)jCombo.getSelectedItem();
            if(apellido.isEmpty() || nombre.isEmpty() || domicilio.isEmpty() || telefono.isEmpty() || especialidad.getIdEspecialidad()==0){
               JOptionPane.showMessageDialog(this, " No puede haber campos vacios");
              return;
            }
            Boolean estado = true;
            Prestador prestadorActual=new Prestador();
            prestadorActual.setNombre(nombre);
            prestadorActual.setApellido(apellido);
            prestadorActual.setDni(dni);
            prestadorActual.setDomicilio(domicilio);
            prestadorActual.setTelefono(telefono);
            prestadorActual.setEstado(true);
            prestadorActual.setEspecialidad(especialidad);
            prest.modificarPrestador(prestadorActual);
            eliminardtos();
        } catch(NumberFormatException nf ){
            JOptionPane.showMessageDialog(this, "Error al acceder a la base de datos. Verifique la informacion");
        }
    }//GEN-LAST:event_jModificarActionPerformed

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        try{
            int dni = Integer.parseInt(jDocumento.getText());
            Prestador eliminarPrestador = prest.buscarPrestadorDni(dni);
            if(eliminarPrestador != null){
                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estas seguro de que deseas eliminar a : "+eliminarPrestador.getApellido()
                + " "+eliminarPrestador.getNombre()+ "?",
                        "Confirmar Eliminacion",
                        JOptionPane.YES_NO_OPTION
                        );
                if(confirmacion == JOptionPane.YES_OPTION){
                    prest.eliminarPrestadro(dni);
                    eliminardtos();
                }else{
                    JOptionPane.showMessageDialog(null, "se Cancelo la operacion");
                }
            }
        }catch(NumberFormatException e ){
            JOptionPane.showMessageDialog(null, "DNI de prestador no valido");
        }
    }//GEN-LAST:event_jEliminarActionPerformed

    private void jDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDocumentoActionPerformed

    private void jDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDocumentoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros || jDocumento.getText().length() >= 8){
            evt.consume();
        }
    }//GEN-LAST:event_jDocumentoKeyTyped

    private void jLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimpiarActionPerformed
        eliminardtos();
    }//GEN-LAST:event_jLimpiarActionPerformed

    private void jNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNombreActionPerformed

    private void jNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNombreKeyTyped
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean Ñ = key =='\u00d1';
        boolean ñ = key =='\u00f1';
        if (!(minusculas || mayusculas || espacio || Ñ || ñ)){
            evt.consume();
        }
    }//GEN-LAST:event_jNombreKeyTyped

    private void jApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jApellidoKeyTyped
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean Ñ = key =='\u00d1';
        boolean ñ = key =='\u00f1';
        if (!(minusculas || mayusculas || espacio || Ñ || ñ)){
            evt.consume();
        }
    }//GEN-LAST:event_jApellidoKeyTyped

    private void jDomicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDomicilioKeyTyped
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90 ;
        boolean minusculas = key >= 97 && key <= 122 ;
        boolean espacio = key == 32;
        boolean numeros = key >= 48 && key <= 57;
        boolean Ñ = key =='\u00d1';
        boolean ñ = key =='\u00f1';
        if (!(minusculas || mayusculas || espacio || numeros)){
            evt.consume();
        }
    }//GEN-LAST:event_jDomicilioKeyTyped

    private void jTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTelefonoKeyPressed
        
    }//GEN-LAST:event_jTelefonoKeyPressed

    private void jTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTelefonoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros || jTelefono.getText().length() >= 10){
            evt.consume();
        }
    }//GEN-LAST:event_jTelefonoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAgregar;
    private javax.swing.JTextField jApellido;
    private javax.swing.JButton jBuscar;
    private javax.swing.JComboBox<Especialidad> jCombo;
    private javax.swing.JTextField jDocumento;
    private javax.swing.JTextField jDomicilio;
    private javax.swing.JButton jEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jLimpiar;
    private javax.swing.JButton jModificar;
    private javax.swing.JTextField jNombre;
    private javax.swing.JButton jSalida;
    private javax.swing.JTextField jTelefono;
    private javax.swing.JLabel jestado;
    // End of variables declaration//GEN-END:variables

    public void eliminardtos(){
        jDocumento.setEnabled(true);
        jDocumento.setText("");
        jNombre.setText("");
        jApellido.setText("");
        jDomicilio.setText("");
        jTelefono.setText("");
        jestado.setText("");
        jCombo.setSelectedIndex(0);
        jAgregar.setEnabled(true);
        jEliminar.setEnabled(false);
        jModificar.setEnabled(false);
    }
}

