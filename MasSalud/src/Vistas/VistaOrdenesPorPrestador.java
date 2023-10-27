
package Vistas;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import massalud.AccesoADatos.afiliadoData;
import massalud.AccesoADatos.ordenData;
import massalud.AccesoADatos.prestadorData;
import massalud.Entidades.Orden;
import massalud.Entidades.Prestador;


public class VistaOrdenesPorPrestador extends javax.swing.JInternalFrame {
    
    private ArrayList<Prestador> listaPres;
    private ArrayList<Orden> listaOrden;
    
    private DefaultTableModel modelo1;
    
    private prestadorData presData;
    private ordenData ordenData;
    private afiliadoData afiData;
 
    
    
   
    public VistaOrdenesPorPrestador() {
        initComponents();
        presData= new prestadorData(); 
        listaPres=(ArrayList<Prestador>)presData.listarPrestador();
        modelo1=new DefaultTableModel();
        cargarPrestadores();
        armarCabecera();
        ordenData= new ordenData();
        afiData=new afiliadoData();
        cargaDatosTabla();
    
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcPrestadores = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtOrdenes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Ordenes por Prestador");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Selecciones un Prestador:");

        jcPrestadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcPrestadoresActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(54, 54, 54)
                                .addComponent(jcPrestadores, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcPrestadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcPrestadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcPrestadoresActionPerformed
        cargaDatos();
    }//GEN-LAST:event_jcPrestadoresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Prestador> jcPrestadores;
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
 private void cargarPrestadores(){
 for(Prestador i:listaPres){
  jcPrestadores.addItem(i);
  }
}

 private void cargaDatos(){
        //borrarFilaTabla();
        
        Prestador selec= (Prestador)jcPrestadores.getSelectedItem();
        modelo1.setRowCount(0);
        
       listaOrden = new ordenData().ordenPorPrestador(selec.getIdPrestador()); ;
        
        if(!listaOrden.isEmpty()){
            for(Orden m: listaOrden){
                modelo1.addRow(new Object[] {m.getIdAfiliado(),m.getFecha(),  m.getFormaDepago(), m.getImporte() });
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se encontro la orden.");
        
        }
    }

   
    private void cargaDatosTabla(){
        //borrarFilaTabla();
       Prestador selec= (Prestador)jcPrestadores.getSelectedItem();
        listaOrden = (ArrayList<Orden>) ordenData.ordenPorPrestador(selec.getIdPrestador());
        for(Orden m: listaOrden){
            modelo1.addRow(new Object[] {m.getFecha(), m.getFormaDepago(), m.getImporte(), m.getIdAfiliado(), m.getIdPrestador()});
        }
    }

private void borrarFilaTabla(){
  
    int indice= modelo1.getRowCount()-1;    
    for(int i=indice;i>=0; i--){
     
        modelo1.removeRow(i);
      }
  }




}
