
package Vistas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import massalud.AccesoADatos.afiliadoData;
import massalud.AccesoADatos.ordenData;
import massalud.AccesoADatos.prestadorData;
import massalud.Entidades.Afiliados;
import massalud.Entidades.Orden;
import massalud.Entidades.Prestador;

/**
 *
 * @author DADY
 */
public class VistaOrdenesPorAfiliado extends javax.swing.JInternalFrame {

   
   private ArrayList<Afiliados> listaAfi;
   private ArrayList<Orden> listaOrden;
   
   private afiliadoData afiData;   
   private ordenData ordenData;
   private prestadorData presData;
   private DefaultTableModel modelo1;
   
   
   
   public VistaOrdenesPorAfiliado() {
        initComponents();
        afiData=new afiliadoData();  
        listaAfi=(ArrayList<Afiliados>)afiData.listarAfiliadosActivos();      
        ordenData=new ordenData();     
        modelo1= new DefaultTableModel();
                       
        cargarAfiliados();
        armarCabecera();
        cargarOrdenesTabla();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtOrdenes = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Ordenes Sacadas por Afiliado");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Seleccione un Afiliado");

        jtOrdenes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtOrdenes);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        cargaDatos();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Afiliados> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtOrdenes;
    // End of variables declaration//GEN-END:variables
private void armarCabecera(){
    
    ArrayList<Object> fila=new ArrayList<>();
    fila.add("Prestador");
    fila.add("Fecha");
    fila.add("Forma de Pago");
    fila.add("Importe");
    for(Object it:fila){
    modelo1.addColumn(it);
    }
    jtOrdenes.setModel(modelo1);
    
}
private void cargarAfiliados(){
 for(Afiliados i:listaAfi){
  jComboBox1.addItem(i);
  }
}

private void borrarFilaTabla(){
  
    int indice= modelo1.getRowCount()-1;    
    for(int i=indice;i>=0; i--){
     
        modelo1.removeRow(i);
      }
  }


private void cargarOrdenesTabla(){
    //borrarFila();
    Afiliados selec=(Afiliados)jComboBox1.getSelectedItem(); //selecciona del combo un Afiliado
    modelo1.setRowCount(0);
    listaOrden=ordenData.ordenPorAfiliado(selec.getIdAfiliado()) ;     
    for(Orden or:listaOrden){
    modelo1.addRow(new Object[]{or.getIdPrestador().getNombre(), or.getFecha(), or.getFormaDepago(), or.getImporte()});
    }
      
 }  

 private void cargaDatos(){
        //borrarFilaTabla();
        Afiliados selec= (Afiliados)jComboBox1.getSelectedItem();
        modelo1.setRowCount(0);
        
        listaOrden=ordenData.ordenPorAfiliado(selec.getIdAfiliado()) ;
        
        if(!listaOrden.isEmpty()){
            for(Orden m: listaOrden){
                modelo1.addRow(new Object[] {m.getIdPrestador().getNombre(),m.getFecha(),  m.getFormaDepago(), m.getImporte(), });
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se encontro la orden.");
        
        }
    }


}
