
package Vistas;

import javax.swing.JOptionPane;
import massalud.AccesoADatos.afiliadoData;
import massalud.Entidades.Afiliados;

public class VistaMenuAfiliado extends javax.swing.JInternalFrame {
    private afiliadoData afiData= new afiliadoData();
    private Afiliados afiliadoActual=null;
    
    public VistaMenuAfiliado() {
        initComponents();
        jAgregar.setEnabled(false);
        jModificar.setEnabled(false);
        jEliminar.setEnabled(false);
        jApellido.setEnabled(false);
        jNombre.setEnabled(false);
        jDomicilio.setEnabled(false);
        jTelefono.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDocumentoAfiliado = new javax.swing.JTextField();
        jBuscarAfiliado = new javax.swing.JButton();
        jSalida = new javax.swing.JButton();
        jModificar = new javax.swing.JButton();
        jEliminar = new javax.swing.JButton();
        jAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jApellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jDomicilio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLimpiar = new javax.swing.JButton();
        jestado = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        jLabel1.setText("AFILIADOS");

        jLabel2.setText("Documento:");

        jDocumentoAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDocumentoAfiliadoActionPerformed(evt);
            }
        });
        jDocumentoAfiliado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jDocumentoAfiliadoKeyTyped(evt);
            }
        });

        jBuscarAfiliado.setText("Buscar");
        jBuscarAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarAfiliadoActionPerformed(evt);
            }
        });

        jSalida.setText("Salir");
        jSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalidaActionPerformed(evt);
            }
        });

        jModificar.setText("Modificar");
        jModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificarActionPerformed(evt);
            }
        });

        jEliminar.setText("Eliminar");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });

        jAgregar.setText("Agregar");
        jAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombre:");

        jNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jNombreKeyTyped(evt);
            }
        });

        jLabel6.setText("Apellido:");

        jApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jApellidoKeyTyped(evt);
            }
        });

        jLabel8.setText("Telefono:");

        jTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTelefonoKeyTyped(evt);
            }
        });

        jLabel9.setText("Domicilio:");

        jDomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jDomicilioKeyTyped(evt);
            }
        });

        jLabel10.setText("Estado:");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(222, 222, 222))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jDomicilio))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(jLimpiar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jDocumentoAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jBuscarAfiliado))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(27, 27, 27)))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jestado, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(18, 18, 18)
                        .addComponent(jSalida)))
                .addGap(34, 34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jDocumentoAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBuscarAfiliado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jestado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSalida)
                    .addComponent(jModificar)
                    .addComponent(jEliminar)
                    .addComponent(jAgregar)
                    .addComponent(jLimpiar))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalidaActionPerformed
        dispose();
    }//GEN-LAST:event_jSalidaActionPerformed

    private void jDocumentoAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDocumentoAfiliadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDocumentoAfiliadoActionPerformed

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        try{
            int dni = Integer.parseInt(jDocumentoAfiliado.getText());
            Afiliados eliminarAfiliado = afiData.buscarAfiliado(dni);
            if(eliminarAfiliado != null){
                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estas seguro de que deseas eliminar a : "+eliminarAfiliado.getApellido()
                + " "+eliminarAfiliado.getNombre()+ "?",
                        "Confirmar Eliminacion",
                        JOptionPane.YES_NO_OPTION
                        );
                if(confirmacion == JOptionPane.YES_OPTION){
                    afiData.eliminarAfiliado(dni);
                    limpiarCampos();
                }else{
                    JOptionPane.showMessageDialog(null, "se Cancelo la operacion");
                }
            }
        }catch(NumberFormatException e ){
            JOptionPane.showMessageDialog(null, "DNI de alumno no valido");
        }
    }//GEN-LAST:event_jEliminarActionPerformed

    private void jBuscarAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarAfiliadoActionPerformed
        if(jDocumentoAfiliado.getText().length()<=7){
            JOptionPane.showMessageDialog(this, "Numero invalido");
            return;
        }
        try{
            int dni = Integer.parseInt(jDocumentoAfiliado.getText());
            afiliadoActual = afiData.buscarAfiliado(dni);
            if(afiliadoActual != null){
               jNombre.setEnabled(true);
               jNombre.setText(afiliadoActual.getNombre());
               jApellido.setEnabled(true);
               jApellido.setText(afiliadoActual.getApellido());
               jTelefono.setEnabled(true);
               jTelefono.setText(String.valueOf(afiliadoActual.getTelefono()));
               jDomicilio.setEnabled(true);
               jDomicilio.setText(afiliadoActual.getDomicilio());
               jDocumentoAfiliado.setEnabled(false);
                if (afiliadoActual.isEstado()==true){
                    jestado.setText("ACTIVO");
                    jModificar.setEnabled(true);
                    jEliminar.setEnabled(true);
                }else if(afiliadoActual.isEstado()==false){
                    jestado.setText("INACTIVO");
                    int confirmacion = JOptionPane.showConfirmDialog(null, "AFILIADO INACTIVO ¿Desea Activarlo?",
                        "Confirmar Eliminacion",
                        JOptionPane.YES_NO_OPTION
                        );
                    if(confirmacion == JOptionPane.YES_OPTION){
                        afiliadoActual.setEstado(true);
                        afiData.modificarAfiliado(afiliadoActual);
                        jestado.setText("ACTIVO");
                        jModificar.setEnabled(true);
                    }
                }
            }else{
                JOptionPane.showMessageDialog(this, "Para dar de alta un afiliado complete los campos y oprima agregar ");
                jAgregar.setEnabled(true);
                jModificar.setEnabled(false);
                jEliminar.setEnabled(false);
                jApellido.setEnabled(true);
                jNombre.setEnabled(true);
                jDomicilio.setEnabled(true);
                jTelefono.setEnabled(true);
            }
       }catch(NumberFormatException nf){
           JOptionPane.showMessageDialog(this, "Debe ingresar un numero de documento ");
       }
    }//GEN-LAST:event_jBuscarAfiliadoActionPerformed

    private void jAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarActionPerformed
        Integer dni = Integer.parseInt(jDocumentoAfiliado.getText());
        String apellido = jApellido.getText();
        String nombre = jNombre.getText();
        String telefono = jTelefono.getText();
        String domicilio = jDomicilio.getText();
        if(apellido.isEmpty() || nombre.isEmpty() || domicilio.isEmpty() || telefono.isEmpty()){
            JOptionPane.showMessageDialog(this, "Complete los campos vacios. Por Favor");
            return;           
        }
        Boolean estado = true;
        afiliadoActual=new Afiliados(nombre, apellido, dni, domicilio,telefono,estado);
        afiData.guardarAfiliado(afiliadoActual);
        limpiarCampos();
    }//GEN-LAST:event_jAgregarActionPerformed

    private void jModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificarActionPerformed
        try {
            Integer dni = Integer.parseInt(jDocumentoAfiliado.getText());
            String nombre = jNombre.getText();
            String apellido = jApellido.getText();                        
            String telefono = jTelefono.getText();
            String domicilio = jDomicilio.getText();
            if (apellido.isEmpty() || nombre.isEmpty() || domicilio.isEmpty() || telefono.isEmpty() ){
               JOptionPane.showMessageDialog(this, " No puede haber campos vacios");
              return;
            }
            Boolean estado = true;
            Afiliados afiliadoActual=new Afiliados();
            afiliadoActual.setNombre(nombre);
            afiliadoActual.setApellido(apellido);
            afiliadoActual.setDni(dni);
            afiliadoActual.setDomicilio(domicilio);
            afiliadoActual.setTelefono(telefono);
            afiliadoActual.setEstado(true);
            afiData.modificarAfiliado(afiliadoActual);
            limpiarCampos();
        } catch(NumberFormatException nf ){
            JOptionPane.showMessageDialog(this, "Error al acceder a la base de datos. Verifique la informacion");
        }
    }//GEN-LAST:event_jModificarActionPerformed

    private void jLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jLimpiarActionPerformed

    private void jDocumentoAfiliadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDocumentoAfiliadoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros || jDocumentoAfiliado.getText().length() >= 8){
            evt.consume();
        }
    }//GEN-LAST:event_jDocumentoAfiliadoKeyTyped

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

    private void jDomicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDomicilioKeyTyped
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean numeros = key >= 48 && key <= 57;
        boolean Ñ = key =='\u00d1';
        boolean ñ = key =='\u00f1';
        if (!(minusculas || mayusculas || espacio || numeros || Ñ || ñ)){
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
    private javax.swing.JButton jAgregar;
    private javax.swing.JTextField jApellido;
    private javax.swing.JButton jBuscarAfiliado;
    private javax.swing.JTextField jDocumentoAfiliado;
    private javax.swing.JTextField jDomicilio;
    private javax.swing.JButton jEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jLimpiar;
    private javax.swing.JButton jModificar;
    private javax.swing.JTextField jNombre;
    private javax.swing.JButton jSalida;
    private javax.swing.JTextField jTelefono;
    private javax.swing.JLabel jestado;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos(){
        jDocumentoAfiliado.setText("");  ;
        jApellido.setText("");
        jNombre.setText("");
        jTelefono.setText("");
        jDomicilio.setText("");
        jestado.setText("");
        jDocumentoAfiliado.setEnabled(true);
        jAgregar.setEnabled(false);
        jModificar.setEnabled(false);
        jEliminar.setEnabled(false);
        jApellido.setEnabled(false);
        jNombre.setEnabled(false);
        jDomicilio.setEnabled(false);
        jTelefono.setEnabled(false);
    }
}
