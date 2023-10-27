    package Vistas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import massalud.AccesoADatos.Conexion;
import massalud.AccesoADatos.ordenData;
import massalud.Entidades.Orden;

public class VistaItemListaOrden extends javax.swing.JInternalFrame {
    Conexion con= new Conexion();
    private ArrayList<Orden> listaO;
    
    private DefaultTableModel modelo;
    private ordenData ordData;

    public VistaItemListaOrden() {
        initComponents();
        ordData= new ordenData();
        listaO=(ArrayList<Orden>)ordData.listarOrdenes();
        modelo = new DefaultTableModel();
        cargaOrden();
        armarCabecera();
        cargaDatosTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Listado de Ordenes");

        jLabel2.setText("Fecha Emitida de la Orden:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

        cargaDatos();
    }//GEN-LAST:event_jComboBox2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Orden> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void cargaOrden() {
        for(Orden items : listaO){
            jComboBox2.addItem(items);
        }
    }
    
    private void armarCabecera(){
    ArrayList<Object> fila=new ArrayList<>();
    fila.add("Fecha");
    fila.add("Forma De Pago");
    fila.add("Importe");
    fila.add("Afiliado");
    fila.add("Prestador");
    for(Object it:fila){
    modelo.addColumn(it);
    }
    jTable1.setModel(modelo);
    }
    
    private void cargaDatosTabla(){
        //borrarFilaTabla();
        Orden selec= (Orden)jComboBox2.getSelectedItem();
         = (ArrayList<Orden>) new ordenData().obtenerOrdenes(selec.getFecha());
        for(Orden m: listaO){
            modelo.addRow(new Object[] {m.getFecha(), m.getFormaDepago(), m.getImporte(), m.getIdAfiliado(), m.getIdPrestador()});
        }
    }
    
    private void cargaDatosTablav2(){
        //borrarFilaTabla();
        Orden selec= (Orden)jComboBox2.getSelectedItem();
        listaO = (ArrayList<Orden>) new ordenData().buscarOrdenPorFecha(selec.getFecha());
        for(Orden m: listaO){
            modelo.addRow(new Object[] {m.getFecha(), m.getFormaDepago(), m.getImporte(), m.getIdAfiliado(), m.getIdPrestador()});
        }
    }
    
    private void cargaDatos(){
        //borrarFilaTabla();
        Orden selec= (Orden)jComboBox2.getSelectedItem();
        modelo.setRowCount(0);
        
        listaO = (ArrayList<Orden>) new ordenData().buscarOrdenPorFecha(selec.getFecha());
        
        if(!listaO.isEmpty()){
            for(Orden m: listaO){
                modelo.addRow(new Object[] {m.getFecha(), m.getFormaDepago(), m.getImporte(), m.getIdAfiliado(), m.getIdPrestador()});
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se encontro la orden.");
        
        }
    }
    
    private void borrarFilaTabla(){
        int indice = modelo.getRowCount() -1;
        
        for (int i = indice;i>=0;i--){
            modelo.removeRow(i);
        }
    }
    
}
