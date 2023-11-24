package Vistas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import massalud.AccesoADatos.Conexion;
import massalud.AccesoADatos.especialidadData;
import massalud.AccesoADatos.prestadorData;
import massalud.Entidades.Especialidad;
import massalud.Entidades.Prestador;

public class VistaItemListaPrestadores extends javax.swing.JInternalFrame {
    Conexion con= new Conexion();
    private List<Especialidad> listaE;
    private List<Prestador> listaP;
    private prestadorData pData;
    private especialidadData eData;
    private DefaultTableModel modelo;
    
    public VistaItemListaPrestadores() {
        initComponents();
        pData = new prestadorData();
        listaE = pData.listarEspecialidad();
        modelo = new DefaultTableModel();
        eData = new especialidadData();
        listaE = (ArrayList<Especialidad>)eData.listarEspecialidades();
        cargaEspecialidad();
        obtenerEspecialista();
        armarCabeceraTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboEspecialidad = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Listado por Especialidad");

        jLabel2.setText("Especialidades");

        jComboEspecialidad.setEditable(true);
        jComboEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboEspecialidadActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        jButton1.setText("Salida");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(127, 127, 127))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(23, 23, 23)
                                .addComponent(jComboEspecialidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboEspecialidadActionPerformed
        // TODO add your handling code here:
       obtenerEspecialista(); 
    }//GEN-LAST:event_jComboEspecialidadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Especialidad> jComboEspecialidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void cargaEspecialidad() {
        Especialidad e = new Especialidad(0," ");
        jComboEspecialidad.addItem(e);
     
        for(Especialidad espe: listaE){
            jComboEspecialidad.addItem(espe);
        }
    }
    
    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Codigo");
        filaCabecera.add("Apellido");
        filaCabecera.add("Nombre");
        filaCabecera.add("Domicilio");
        filaCabecera.add("Telefono");
        for(Object it: filaCabecera){
            modelo.addColumn(it);
        }
        jTable1.setModel(modelo);
    }

    private void obtenerEspecialista(){
        Especialidad espeSelec = (Especialidad)jComboEspecialidad.getSelectedItem();
        modelo.setRowCount(0); 
        if(espeSelec != null){
           int idEspecialidad = espeSelec.getIdEspecialidad();
           listaP = eData.obtenerEspecialista(idEspecialidad);
           if(!listaE.isEmpty()){
               for(Prestador pres : listaP){
                   modelo.addRow(new Object []{
                        pres.getIdPrestador(),
                        pres.getApellido(),
                        pres.getNombre(),
                        pres.getDomicilio(),
                        pres.getTelefono(),
                   });
                }
            }else{
                JOptionPane.showMessageDialog(null, "No hay prestadores en esta especialidad");
            }
        }
    }
}

