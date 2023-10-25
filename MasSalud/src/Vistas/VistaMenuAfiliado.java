
package Vistas;



import javax.swing.JOptionPane;
import massalud.AccesoADatos.afiliadoData;
import massalud.Entidades.Afiliados;

/**
 *
 * @author Danienka
 */
public class VistaMenuAfiliado extends javax.swing.JInternalFrame {

   
 
    private afiliadoData afiData= new afiliadoData();
    private Afiliados afiliadoActual=null;
    



    public VistaMenuAfiliado() {
        initComponents();
       
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
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jApellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jDomicilio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jEstado = new javax.swing.JRadioButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        jLabel1.setText("AFILIADOS");

        jLabel2.setText("Documento:");

        jDocumentoAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDocumentoAfiliadoActionPerformed(evt);
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

        jLabel3.setText("Datos personales");

        jLabel5.setText("Nombre:");

        jLabel6.setText("Apellido:");

        jLabel7.setText("Domicilio y telefono:");

        jLabel8.setText("Telefono:");

        jLabel9.setText("Domicilio:");

        jLabel10.setText("Estado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(222, 222, 222))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jAgregar)
                        .addGap(29, 29, 29)
                        .addComponent(jEliminar)
                        .addGap(27, 27, 27)
                        .addComponent(jModificar)
                        .addGap(30, 30, 30)
                        .addComponent(jSalida)
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDomicilio))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jEstado))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jDocumentoAfiliado))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jApellido))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jBuscarAfiliado)
                                        .addGap(0, 74, Short.MAX_VALUE)))))
                        .addGap(54, 54, 54))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jEstado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSalida)
                    .addComponent(jModificar)
                    .addComponent(jEliminar)
                    .addComponent(jAgregar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalidaActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jSalidaActionPerformed

    private void jDocumentoAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDocumentoAfiliadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDocumentoAfiliadoActionPerformed

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        // TODO add your handling code here:
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
                    jDocumentoAfiliado.setText("");
                    jNombre.setText("");
                    jApellido.setText("");
                    jTelefono.setText("");
                    jDomicilio.setText("");
                    jEstado.setSelected(false);    
                }else{
                    JOptionPane.showMessageDialog(null, "se Cancelo la operacion");
                }
            }
        }catch(NumberFormatException e ){
            JOptionPane.showMessageDialog(null, "DNI de alumno no valido");
        }
    }//GEN-LAST:event_jEliminarActionPerformed

    private void jBuscarAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarAfiliadoActionPerformed
       
        try{
            Integer dni = Integer.parseInt(jDocumentoAfiliado.getText());
            afiliadoActual = afiData.buscarAfiliado(dni);
            if(afiliadoActual != null){
             
               jNombre.setText(afiliadoActual.getNombre());
               jApellido.setText(afiliadoActual.getApellido());
               jTelefono.setText(String.valueOf(afiliadoActual.getTelefono()));
               jDomicilio.setText(afiliadoActual.getDomicilio());
            }
               
          
       }catch(NumberFormatException nf){
           JOptionPane.showMessageDialog(this, "Debe ingresar un alido ");
       }
    }//GEN-LAST:event_jBuscarAfiliadoActionPerformed

    private void jAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarActionPerformed
        // TODO add your handling code here:
        try {
            
            Integer dni = Integer.parseInt(jDocumentoAfiliado.getText());
            String apellido = jApellido.getText();
            String nombre = jNombre.getText();
            Integer telefono = Integer.parseInt(jTelefono.getText());
            String domicilio = jDomicilio.getText();
            
            if(apellido.isEmpty() || nombre.isEmpty() || domicilio.isEmpty() || telefono==0){
            JOptionPane.showMessageDialog(this, "Complete los campos vacios. Por Favor");
             return;           
            }
             
             Boolean estado = jEstado.isSelected();
            afiliadoActual=new Afiliados(nombre, apellido, dni, domicilio,telefono,estado);
            afiData.guardarAfiliado(afiliadoActual);
            limpiarCampos();
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "debe Ingresar un numero de dni ");
        }
            
               
            
           
    }//GEN-LAST:event_jAgregarActionPerformed

    private void jModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificarActionPerformed
        
        try {
            Integer dni = Integer.parseInt(jDocumentoAfiliado.getText());
            String nombre = jNombre.getText();
            String apellido = jApellido.getText();                        
            Integer telefono = Integer.parseInt(jTelefono.getText());
            String domicilio = jDomicilio.getText();
           
            
            if (apellido.isEmpty() || nombre.isEmpty() || domicilio.isEmpty() || telefono==0 ){
               JOptionPane.showMessageDialog(this, " No pueden haber campos vacios");
              return;
             }
          
            Boolean estado = jEstado.isSelected();
            
            if(afiliadoActual ==null){
                
                 afiliadoActual=new Afiliados(nombre, apellido, dni,domicilio,telefono,estado);
                 afiData.guardarAfiliado(afiliadoActual);
                 limpiarCampos();
            }else {  
            
                afiliadoActual.setDni(dni);
                afiliadoActual.setApellido(apellido);
                afiliadoActual.setNombre(nombre);
                afiliadoActual.setTelefono(telefono);
                afiliadoActual.setDomicilio(domicilio);
                afiliadoActual.setEstado(estado);
                afiData.modificarAfiliado(afiliadoActual);
                limpiarCampos();
            
            } 
        
        } catch(NumberFormatException nf ){
            JOptionPane.showMessageDialog(this, "Debe ingresar un DNI correcto");
        }

           
         
    }//GEN-LAST:event_jModificarActionPerformed

                
                
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAgregar;
    private javax.swing.JTextField jApellido;
    private javax.swing.JButton jBuscarAfiliado;
    private javax.swing.JTextField jDocumentoAfiliado;
    private javax.swing.JTextField jDomicilio;
    private javax.swing.JButton jEliminar;
    private javax.swing.JRadioButton jEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jModificar;
    private javax.swing.JTextField jNombre;
    private javax.swing.JButton jSalida;
    private javax.swing.JTextField jTelefono;
    // End of variables declaration//GEN-END:variables

  private void limpiarCampos(){
    
    jDocumentoAfiliado.setText("");  ;
    jApellido.setText("");
    jNombre.setText("");
    jTelefono.setText("");
    jDomicilio.setText("");
    jEstado.setSelected(false);
               
    
    
    
    
    }

}
