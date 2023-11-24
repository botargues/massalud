
package Vistas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import massalud.AccesoADatos.afiliadoData;
import massalud.AccesoADatos.prestadorData;
import massalud.Entidades.Afiliados;
import massalud.Entidades.Prestador;

public class VistaMenuListados extends javax.swing.JInternalFrame {

private ArrayList<Afiliados> listaAfi;
private afiliadoData afiData;
private DefaultTableModel modelo;
private ArrayList<Prestador> listaPres;
private prestadorData pData;

    public VistaMenuListados() {
        initComponents();
        pData=new prestadorData();
        afiData= new afiliadoData();
        modelo=new DefaultTableModel();
        armarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSalida = new javax.swing.JButton();
        jAfiliadoActivos = new javax.swing.JRadioButton();
        jprestadoresActivos = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAfiliados = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Listados de Afiliados y Prestadores");

        jSalida.setText("Salida");
        jSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalidaActionPerformed(evt);
            }
        });

        jAfiliadoActivos.setText("Afiliados Activos");
        jAfiliadoActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAfiliadoActivosActionPerformed(evt);
            }
        });

        jprestadoresActivos.setText("Prestadores Activos");
        jprestadoresActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jprestadoresActivosActionPerformed(evt);
            }
        });

        jtAfiliados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtAfiliados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jAfiliadoActivos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jprestadoresActivos)
                .addGap(97, 97, 97))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSalida)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAfiliadoActivos)
                    .addComponent(jprestadoresActivos))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSalida)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalidaActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jSalidaActionPerformed

    private void jAfiliadoActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAfiliadoActivosActionPerformed
        borrarFilaTabla();
        jprestadoresActivos.setSelected(false);
        cargarAfiliadosActivos();
    }//GEN-LAST:event_jAfiliadoActivosActionPerformed

    private void jprestadoresActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jprestadoresActivosActionPerformed
        borrarFilaTabla();
        jAfiliadoActivos.setSelected(false);
        cargarPrestadoresAtivos();
    }//GEN-LAST:event_jprestadoresActivosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton jAfiliadoActivos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jSalida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jprestadoresActivos;
    private javax.swing.JTable jtAfiliados;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera(){
        ArrayList<Object> fila=new ArrayList<>();
        fila.add("nombre");
        fila.add("aprellido");
        fila.add("dni");
        fila.add("domicilio");
        fila.add("telefono");
        for(Object it:fila){
            modelo.addColumn(it);
        }
        jtAfiliados.setModel(modelo);
    }
    
    private void cargarAfiliadosActivos(){
        listaAfi=(ArrayList)afiData.listarAfiliadosActivos();
        for(Afiliados a:listaAfi){
            modelo.addRow(new Object[]{a.getNombre(), a.getApellido(),a.getDni(), a.getDomicilio(),a.getTelefono()});
        }
    }

    private void cargarAfiliadosNoActivos(){
        listaAfi=(ArrayList)afiData.listarAfiliados();
        for(Afiliados a:listaAfi){
            modelo.addRow(new Object[]{a.getNombre(), a.getApellido(),a.getDni(), a.getDomicilio(),a.getTelefono()});
        }
    }

    private void cargarPrestadoresAtivos(){
        listaPres= (ArrayList)pData.listarPrestador()  ; 
        for(Prestador m:listaPres){
            modelo.addRow(new Object[]{m.getNombre(), m.getApellido() ,m.getDni(),m.getDomicilio(), m.getTelefono()});
        }
    }
 
    private void borrarFilaTabla(){
        int indice= modelo.getRowCount()-1;    
        for(int i=indice;i>=0; i--){
            modelo.removeRow(i);
        }
    }
}
