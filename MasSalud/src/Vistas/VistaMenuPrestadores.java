package Vistas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import massalud.AccesoADatos.especialidadData;
import massalud.AccesoADatos.prestadorData;
import massalud.Entidades.*;

public class VistaMenuPrestadores extends javax.swing.JInternalFrame {
    private prestadorData prest = new prestadorData();
    private especialidadData esp = new especialidadData();
    private ArrayList<Especialidad> listaEsp;

    public VistaMenuPrestadores() {
        initComponents();
        listaEsp = (ArrayList<Especialidad>)esp.listarEspecialidades();
        cargarCheckBox();
        jModificar.setEnabled(false);
        jEliminar.setEnabled(false);
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
        jEstado = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jAgregar = new javax.swing.JButton();
        jEliminar = new javax.swing.JButton();
        jModificar = new javax.swing.JButton();
        jCombo = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("PRESTADORES");

        jSalida.setText("Salida");
        jSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalidaActionPerformed(evt);
            }
        });

        jLabel2.setText("Documento:");

        jBuscar.setBackground(new java.awt.Color(92, 210, 230));
        jBuscar.setForeground(new java.awt.Color(51, 51, 51));
        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellido:");

        jApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jApellidoActionPerformed(evt);
            }
        });

        jLabel5.setText("Domicilio:");

        jLabel6.setText("Telefono:");

        jTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTelefonoActionPerformed(evt);
            }
        });

        jLabel7.setText("Estado:");

        jLabel8.setText("Especialidad:");

        jAgregar.setBackground(new java.awt.Color(51, 255, 0));
        jAgregar.setForeground(new java.awt.Color(51, 51, 51));
        jAgregar.setText("Agregar");
        jAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarActionPerformed(evt);
            }
        });

        jEliminar.setBackground(new java.awt.Color(255, 0, 0));
        jEliminar.setForeground(new java.awt.Color(51, 51, 51));
        jEliminar.setText("Eliminar");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });

        jModificar.setBackground(new java.awt.Color(249, 148, 23));
        jModificar.setForeground(new java.awt.Color(51, 51, 51));
        jModificar.setText("Modificar");
        jModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jEstado)
                                .addComponent(jTelefono)
                                .addComponent(jCombo, 0, 195, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBuscar)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(jEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jModificar)
                        .addGap(18, 18, 18)
                        .addComponent(jSalida)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jEstado)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSalida)
                    .addComponent(jAgregar)
                    .addComponent(jEliminar)
                    .addComponent(jModificar))
                .addContainerGap(14, Short.MAX_VALUE))
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
        try{
            String dniTexto = jDocumento.getText();
            String telefonoTexto = jTelefono.getText();
            int dni = Integer.parseInt(dniTexto);
            String nombre = jNombre.getText();
            String apellido = jApellido.getText();
            String domicilio = jDomicilio.getText();
            long telefono = Long.parseLong(telefonoTexto);
            boolean estado =  jEstado.isSelected();
            Especialidad es = (Especialidad)jCombo.getSelectedItem();
            if(!esString(nombre)){
                throw new IllegalArgumentException("el bloque nombre es invalido, Revicelo por favor");
            }else if(!esString(apellido)){
                throw new IllegalArgumentException("el bloque apellido es invalido, Revicelo por favor");
            }else if(!esString(domicilio)){
                throw new IllegalArgumentException("el bloque domicilio es invalido, Revicelo por favor");
            }
            if(prest.ValidacionDni(dni)){
                JOptionPane.showMessageDialog(null, "El dni o documento ya esta en la Base de Datos");
                eliminardtos();
            }else{
            Prestador agregarPrestador = new Prestador();
            agregarPrestador.setDni(dni);
            agregarPrestador.setNombre(nombre);
            agregarPrestador.setApellido(apellido);
            agregarPrestador.setDomicilio(domicilio);
            agregarPrestador.setTelefono(telefono);
            agregarPrestador.setEstado(estado);
            agregarPrestador.setEspecialidad(es);
            prest.guardarPrestadores(agregarPrestador);
            eliminardtos();
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null,"Hay datos vacios"+ e.getLocalizedMessage());
        }catch(IllegalArgumentException ex){
            JOptionPane.showMessageDialog(null, "Error al guardar los datos "+ ex.getLocalizedMessage());
        }
    }//GEN-LAST:event_jAgregarActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        try{
            String dniTexto = jDocumento.getText();
            if(dniTexto.length()!= 8){
                JOptionPane.showMessageDialog(null, "el numero de Documento es invalido");
                return;
            }
            int documento = Integer.parseInt(dniTexto);
            Prestador pres = prest.buscarPrestadorDniActivos(documento);
            if(pres != null){
                jNombre.setText(pres.getNombre());
                jApellido.setText(pres.getApellido());
                jDocumento.setText(String.valueOf(pres.getDni()));
                jDomicilio.setText(pres.getDomicilio());
                jTelefono.setText(String.valueOf(pres.getTelefono()));
                jEstado.setSelected(pres.isEstado());
                if (pres.getEspecialidad() != null ) {
                    Especialidad especial = pres.getEspecialidad();
                    for(int i = 0 ; i < jCombo.getItemCount(); i++){
                        Especialidad especialidaCombo = jCombo.getItemAt(i);
                        if(especial.equals(especialidaCombo)){
                            jCombo.setSelectedItem(i);
                            break;
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "no se pudo obtener el dato de Especialidad");
                }
                jCombo.setSelectedItem(pres.getEspecialidad());
                jEliminar.setEnabled(true);
                jModificar.setEnabled(true);
                jAgregar.setEnabled(false);
            }else{
                int confirmacion = JOptionPane.showConfirmDialog( null, "El dni :"+ documento + " No Esta registrado o fue eliminado, Desea incorporarlo de nuevo o Agregar uno nuevo?"," ",
                    JOptionPane.YES_NO_OPTION);
                if(confirmacion == JOptionPane.YES_OPTION){
                    Prestador presNoActivos = prest.buscarPrestadorDniNoActivos(documento);
                    if(presNoActivos != null){
                        jNombre.setText(presNoActivos.getNombre());
                        jApellido.setText(presNoActivos.getApellido());
                        jDocumento.setText(String.valueOf(presNoActivos.getDni()));
                        jDomicilio.setText(presNoActivos.getDomicilio());
                        jTelefono.setText(String.valueOf(presNoActivos.getTelefono()));
                        jEstado.setSelected(presNoActivos.isEstado());
                        if (presNoActivos.getEspecialidad() != null ) {
                            Especialidad especial = presNoActivos.getEspecialidad();
                            for(int i = 0 ; i < jCombo.getItemCount(); i++){
                                Especialidad especialidaCombo = jCombo.getItemAt(i);
                                if(especial.equals(especialidaCombo)){
                                    jCombo.setSelectedItem(i);
                                    break;
                                }
                            }
                        }
                        jCombo.setSelectedItem(presNoActivos.getEspecialidad());  
                        jModificar.setEnabled(true);
                        jAgregar.setEnabled(false);
                    }else{
                        jAgregar.setEnabled(true);
                    }
                }else{
                    eliminardtos();
                }
            }
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Los campos estan vacios "+e.getLocalizedMessage());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "el documento no esta registrado en la Base de Datos");
        }
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificarActionPerformed
        try{
            String dniTexto = jDocumento.getText();
            String telTexto = jTelefono.getText();
            if(dniTexto.length() != 8){
                JOptionPane.showMessageDialog(null, "el numero de Documento es invalido");
                return;
            }
            if(telTexto.length() != 10){
                JOptionPane.showMessageDialog(null, "el numero de telefono es muy corto o paso los limites de 10 digitos");
                return;
            }
            int dni = Integer.parseInt(dniTexto);
            String nombre = jNombre.getText();
            String apellido = jApellido.getText();
            String domicilio = jDomicilio.getText();
            long telefono = Long.parseLong(telTexto);
            boolean estado =  jEstado.isSelected();
            Especialidad es = (Especialidad)jCombo.getSelectedItem();
        //Validacion de datos ingresados en nombre, apellido,domicilio
            if(!esString(nombre)){
                throw new IllegalArgumentException();
            }else if(!esString(apellido)){
                throw new IllegalArgumentException();
            }else if(!esString(domicilio)){
                throw new IllegalArgumentException();
            }
        Prestador modificarPrestador = new Prestador();
        modificarPrestador.setNombre(nombre);
        modificarPrestador.setApellido(apellido);
        modificarPrestador.setDomicilio(domicilio);
        modificarPrestador.setTelefono(telefono);
        modificarPrestador.setEstado(estado);
        modificarPrestador.setEspecialidad(es);
        prest.modificarPrestador(modificarPrestador);
        eliminardtos();
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null,"Hay datos vacios"+ e.getLocalizedMessage());
        }catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(null,"se detecto un ingreso de numero en una de las casillas nombre, apellido y domicilio");
        }
    }//GEN-LAST:event_jModificarActionPerformed

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        // TODO add your handling code here:
        try {
            if(jEliminar.isEnabled() == true){
                
                 int dni = Integer.parseInt(jDocumento.getText());
            
            Prestador eliminarprestador = prest.buscarPrestadorDniActivos(dni);
            
            if(eliminarprestador != null){
                
                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estas seguro de que deseas eliminar a : "+eliminarprestador.getApellido()
                + " "+eliminarprestador.getNombre()+ "?",
                        "Confirmar Eliminacion",
                        JOptionPane.YES_NO_OPTION
                        );
                
                if(confirmacion == JOptionPane.YES_OPTION){
                    prest.eliminarPrestadro(dni);
                    eliminardtos();
                   
                }else{
                    JOptionPane.showMessageDialog(null, "Se cancelo la operacion");
                }
            
            }
                
                
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAgregar;
    private javax.swing.JTextField jApellido;
    private javax.swing.JButton jBuscar;
    private javax.swing.JComboBox<Especialidad> jCombo;
    private javax.swing.JTextField jDocumento;
    private javax.swing.JTextField jDomicilio;
    private javax.swing.JButton jEliminar;
    private javax.swing.JRadioButton jEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jModificar;
    private javax.swing.JTextField jNombre;
    private javax.swing.JButton jSalida;
    private javax.swing.JTextField jTelefono;
    // End of variables declaration//GEN-END:variables
 public void eliminardtos(){
     
     jDocumento.setText("");
     jNombre.setText("");
     jApellido.setText("");
     jDomicilio.setText("");
     jTelefono.setText("");
     jEstado.setSelected(false);
   
     jCombo.setSelectedIndex(0);
     
     jAgregar.setEnabled(true);
     jEliminar.setEnabled(false);
     jModificar.setEnabled(false);
 }
 
 public void cargarCheckBox(){
     Especialidad e = new Especialidad(0," ");
     jCombo.addItem(e);
     for(Especialidad ep : listaEsp){
         
         jCombo.addItem(ep);
     }
 
 
 }
 
 private boolean esString(String letra){
 
     if(letra == null || letra.trim().isEmpty()){
     return false;
     
     }
     return letra.matches("^[a-zA-Z ]+$");
 }
 
}

