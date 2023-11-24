    package Vistas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import massalud.AccesoADatos.Conexion;
import massalud.AccesoADatos.afiliadoData;
import massalud.AccesoADatos.ordenData;
import massalud.Entidades.Afiliados;
import massalud.Entidades.Orden;

    public class VistaItemListaOrden extends javax.swing.JInternalFrame {
        Conexion con= new Conexion();
        private List<Orden> listaO;
        private List<Afiliados> listaA;
        private DefaultTableModel modelo;
        private ordenData ordData;
        private afiliadoData afilData;
        private Date fch;
        private String afil;
        private String pres;
        
    public VistaItemListaOrden() {
        initComponents();
        ordData= new ordenData();
        afilData= new afiliadoData();
        modelo = new DefaultTableModel();
        armarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jFecha = new com.toedter.calendar.JDateChooser();
        jBuscarFecha = new javax.swing.JButton();
        jLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jAfiliado = new javax.swing.JTextField();
        jBuscarAfiliado = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPrestador = new javax.swing.JTextField();
        jBuscarPrestador = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Listados de Ordenes");

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

        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });

        jLabel3.setText("Por Fecha ");

        jFecha.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jFechaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFechaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFechaKeyTyped(evt);
            }
        });

        jBuscarFecha.setText("Buscar");
        jBuscarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarFechaActionPerformed(evt);
            }
        });

        jLimpiar.setText("Limpiar");
        jLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimpiarActionPerformed(evt);
            }
        });

        jLabel2.setText("AFILIADO Por apellido");

        jAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAfiliadoActionPerformed(evt);
            }
        });
        jAfiliado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jAfiliadoKeyTyped(evt);
            }
        });

        jBuscarAfiliado.setText("Buscar");
        jBuscarAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarAfiliadoActionPerformed(evt);
            }
        });

        jLabel4.setText("PRESTADOR Por apellido");

        jPrestador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPrestadorKeyTyped(evt);
            }
        });

        jBuscarPrestador.setText("Buscar");
        jBuscarPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarPrestadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jAfiliado)
                                    .addComponent(jPrestador, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBuscarFecha)
                            .addComponent(jBuscarAfiliado, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBuscarPrestador))
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSalir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jPrestador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBuscarFecha)
                        .addGap(9, 9, 9)
                        .addComponent(jBuscarAfiliado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBuscarPrestador)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSalir)
                    .addComponent(jLimpiar))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jSalirActionPerformed

    private void jFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFechaKeyTyped
        
    }//GEN-LAST:event_jFechaKeyTyped

    private void jFechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFechaKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jFechaKeyPressed

    private void jBuscarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarFechaActionPerformed
        fch= jFecha.getDate();
        if(jFecha.getDate()==null){
            JOptionPane.showMessageDialog(this, "Fecha invalida");
            return;
        }
        cargaDatos();
    }//GEN-LAST:event_jBuscarFechaActionPerformed

    private void jLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jLimpiarActionPerformed

    private void jBuscarAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarAfiliadoActionPerformed
        if(jAfiliado.getText().length()==0){
            JOptionPane.showMessageDialog(this, "Apellido invalido");
            return;
        }
        afil=jAfiliado.getText();
        modelo.setRowCount(0);
        listaO=ordData.ordenPorAfiliado(afil);
        if(!listaO.isEmpty()){
            for(Orden m: listaO){
                modelo.addRow(new Object []{
                    m.getFecha(),
                    m.getIdPrestador(),
                    m.getIdAfiliado(),
                    m.getImporte(),
                });
            }
        }
    }//GEN-LAST:event_jBuscarAfiliadoActionPerformed

    private void jAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAfiliadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAfiliadoActionPerformed

    private void jAfiliadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jAfiliadoKeyTyped
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean Ñ = key =='\u00d1';
        boolean ñ = key =='\u00f1';
        if (!(minusculas || mayusculas || espacio|| Ñ || ñ)){
            evt.consume();
        }
    }//GEN-LAST:event_jAfiliadoKeyTyped

    private void jFechaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jFechaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jFechaAncestorAdded

    private void jPrestadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPrestadorKeyTyped
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean Ñ = key =='\u00d1';
        boolean ñ = key =='\u00f1';
        if (!(minusculas || mayusculas || espacio|| Ñ || ñ)){
            evt.consume();
        }
    }//GEN-LAST:event_jPrestadorKeyTyped

    private void jBuscarPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarPrestadorActionPerformed
        if(jPrestador.getText().length()==0){
            JOptionPane.showMessageDialog(this, "Apellido invalido");
            return;
        }
        pres=jPrestador.getText();
        modelo.setRowCount(0);
        listaO=ordData.ordenPorPrestador(pres);
        if(!listaO.isEmpty()){
            for(Orden m: listaO){
                modelo.addRow(new Object []{
                    m.getFecha(),
                    m.getIdPrestador(),
                    m.getIdAfiliado(),
                    m.getImporte(),
                });
            }
        }
    }//GEN-LAST:event_jBuscarPrestadorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAfiliado;
    private javax.swing.JButton jBuscarAfiliado;
    private javax.swing.JButton jBuscarFecha;
    private javax.swing.JButton jBuscarPrestador;
    private com.toedter.calendar.JDateChooser jFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jLimpiar;
    private javax.swing.JTextField jPrestador;
    private javax.swing.JButton jSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    
    private void armarCabecera(){
        //jTable1.getTableHeader().setVisible(true);
        ArrayList<Object> fila=new ArrayList<>();
        fila.add("Fecha");
        fila.add("Prestador");
        fila.add("Afiliado");
        fila.add("Importe");
        for(Object it:fila){
            modelo.addColumn(it);
        }
        jTable1.setModel(modelo);
    }
    
    private void cargaDatos(){
        ZoneId defaultZoneId = ZoneId.systemDefault();
        Instant instant = fch.toInstant();
        LocalDate Date = instant.atZone(defaultZoneId).toLocalDate();
        modelo.setRowCount(0);
        if (Date !=null){
            listaO = ordData.obtenerOrdenes(Date);
            if(!listaO.isEmpty()){
                for(Orden m: listaO){
                    modelo.addRow(new Object []{
                        m.getFecha(),
                        m.getIdPrestador(),
                        m.getIdAfiliado(),
                        m.getImporte(),
                    });
                }
        }else{
            JOptionPane.showMessageDialog(null, "No se encontro orden ");
        }
        }
    }
    
    private void limpiar(){
        jFecha.setDate(null);
        jAfiliado.setText("");
        jPrestador.setText("");
        int indice = modelo.getRowCount()-1;
        for (int i = indice;i>=0;i--){
            modelo.removeRow(i);
        }
    }
}
