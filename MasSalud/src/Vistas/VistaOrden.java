package Vistas;

import static Vistas.VistaMenuPrincipal.jEscritorio;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
//import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
//import java.util.Locale;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import massalud.AccesoADatos.Conexion;
import massalud.AccesoADatos.afiliadoData;
import massalud.AccesoADatos.especialidadData;
import massalud.AccesoADatos.ordenData;
import massalud.AccesoADatos.prestadorData;
import massalud.Entidades.Afiliados;
import massalud.Entidades.Especialidad;
import massalud.Entidades.Orden;
import massalud.Entidades.Prestador;

public class VistaOrden extends javax.swing.JInternalFrame {
    private Connection con = null;
    private prestadorData pData;
    private afiliadoData afiData;
    private ArrayList<Especialidad> listaE;
    private List<Prestador> listaP;
    private especialidadData eData;
    private Orden ord;
    private ordenData oData;
    private DefaultTableModel modelo;
    int codAfiliado;
    int codPrestador;
    LocalDate dia = LocalDate.now();
    String formaDepago;
    double importe;
    boolean salidaOrden=false;
    static int dni;
    
    public VistaOrden() {
        initComponents();
        con = Conexion.getConexion();
        pData = new prestadorData();
        afiData = new afiliadoData();
        oData = new ordenData();
        eData = new especialidadData();
        listaE = (ArrayList<Especialidad>)eData.listarEspecialidades();
        modelo = new DefaultTableModel();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String diaFormateado = dia.format(formatter);
        formaDepago="";
        importe=0;
        jFecha.setText(diaFormateado);
        cargaEspecialidad();
        obtenerEspecialista();
        armarCabeceraTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jBuscarAfiliado = new javax.swing.JButton();
        jDocumentoAfiliado = new javax.swing.JTextField();
        jEspeSelec = new javax.swing.JLabel();
        jEspecialidad = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jSalida = new javax.swing.JButton();
        jFecha = new javax.swing.JLabel();
        jImporte = new javax.swing.JTextField();
        jEfectivo = new javax.swing.JRadioButton();
        jTransfe = new javax.swing.JRadioButton();
        jDatosAfiliado = new javax.swing.JLabel();
        jDatosAfiliado2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLimpiar = new javax.swing.JButton();
        jComprarOrden = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Orden de Consulta");

        jLabel2.setText("DOCUMENTO AFILIADO");

        jLabel3.setText("ESPECIALIDAD");

        jLabel4.setText("FECHA");

        jLabel5.setText("IMPORTE");

        jLabel6.setText("FORMA DE PAGO");

        jBuscarAfiliado.setText("Buscar");
        jBuscarAfiliado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarAfiliadoActionPerformed(evt);
            }
        });

        jDocumentoAfiliado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDocumentoAfiliadoMouseClicked(evt);
            }
        });
        jDocumentoAfiliado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jDocumentoAfiliadoKeyTyped(evt);
            }
        });

        jEspeSelec.setBackground(new java.awt.Color(0, 0, 255));
        jEspeSelec.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jEspeSelec.setForeground(new java.awt.Color(0, 51, 255));
        jEspeSelec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jEspecialidad.setEditable(true);
        jEspecialidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEspecialidadMouseClicked(evt);
            }
        });
        jEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEspecialidadActionPerformed(evt);
            }
        });

        jLabel8.setText("PRESTADOR");

        jSalida.setText("Salir");
        jSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalidaActionPerformed(evt);
            }
        });

        jFecha.setForeground(new java.awt.Color(0, 0, 204));

        jImporte.setForeground(new java.awt.Color(0, 0, 204));
        jImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jImporteActionPerformed(evt);
            }
        });
        jImporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jImporteKeyTyped(evt);
            }
        });

        grupo.add(jEfectivo);
        jEfectivo.setText(" EFECTIVO");
        jEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEfectivoActionPerformed(evt);
            }
        });

        grupo.add(jTransfe);
        jTransfe.setText(" TRANSFERENCIA");
        jTransfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTransfeActionPerformed(evt);
            }
        });

        jDatosAfiliado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jDatosAfiliado.setForeground(new java.awt.Color(0, 51, 204));
        jDatosAfiliado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jDatosAfiliado2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jDatosAfiliado2.setForeground(new java.awt.Color(0, 51, 204));
        jDatosAfiliado2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLimpiar.setText("Limpiar");
        jLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLimpiarMouseClicked(evt);
            }
        });

        jComprarOrden.setText("comprar orden");
        jComprarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComprarOrdenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jEfectivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTransfe)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jComprarOrden)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLimpiar)
                                .addGap(44, 44, 44)
                                .addComponent(jSalida))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDatosAfiliado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDatosAfiliado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jEspeSelec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jDocumentoAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(63, 63, 63)
                                                .addComponent(jBuscarAfiliado))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(40, 40, 40)
                                        .addComponent(jEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(227, 227, 227)
                                        .addComponent(jLabel8)))
                                .addGap(0, 80, Short.MAX_VALUE)))
                        .addGap(25, 25, 25))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jBuscarAfiliado)
                    .addComponent(jDocumentoAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDatosAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDatosAfiliado2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jEspeSelec, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jEfectivo)
                    .addComponent(jTransfe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLimpiar)
                    .addComponent(jComprarOrden)
                    .addComponent(jSalida))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBuscarAfiliadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarAfiliadoActionPerformed
        if(jDocumentoAfiliado.getText().length()==0 || jDocumentoAfiliado.getText().length()<=7){
            JOptionPane.showMessageDialog(this, "Numero invalido");
            return;
        }
        try{
            dni = Integer.parseInt(jDocumentoAfiliado.getText());
            Afiliados afil = afiData.buscarAfiliado(dni);
            if (afil.isEstado()==true){
                if(afil == null){
                    int confirmacion = JOptionPane.showConfirmDialog( null, "¿Quiere ingresar un nuevo afiliado?",
                            " ",JOptionPane.YES_NO_OPTION);
                    if(confirmacion == JOptionPane.YES_OPTION){
                        VistaAgregarAfiliado afi=new VistaAgregarAfiliado();
                        jEscritorio.add(afi);
                        afi.toFront();
                        afi.setVisible(true);
                    }else{
                        jDocumentoAfiliado.getText();
                    }
                }else{
                    jDatosAfiliado.setText("  "+afil.getApellido()+" "+afil.getNombre()+"- DNI "+ afil.getDni());
                    jDatosAfiliado2.setText("  Domicilio "+afil.getDomicilio()+"- Telefono  "+afil.getTelefono());
                    codAfiliado = afil.getIdAfiliado();
                }
            }else{
                JOptionPane.showMessageDialog(this, "Afiliado INACTIVO");
            }
        }catch(NumberFormatException e){
        }
    }//GEN-LAST:event_jBuscarAfiliadoActionPerformed

    private void jEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEspecialidadActionPerformed
        obtenerEspecialista();
    }//GEN-LAST:event_jEspecialidadActionPerformed

    private void jEspecialidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEspecialidadMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jEspecialidadMouseClicked

    private void jSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalidaActionPerformed
        dispose();
    }//GEN-LAST:event_jSalidaActionPerformed

    private void jImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jImporteActionPerformed
        if(jImporte.getText().length()==0 || jImporte.getText().length()>=8){
            JOptionPane.showMessageDialog(this, "Numero invalido");
        }
    }//GEN-LAST:event_jImporteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int filaSelecc = jTable1.getSelectedRow();
        int buscarPrestador = (int) (jTable1.getValueAt(filaSelecc,0));
        Prestador pres =(pData.buscarPrestadorPorId(buscarPrestador));
        if (pres!=null){
            codPrestador = pres.getIdPrestador();
            jEspeSelec.setText("  "+pres.getApellido()+" "+pres.getNombre()+" Domicilio "+pres.getDomicilio()+" Tel:"+pres.getTelefono());
            verificarFecha(dia,codPrestador);
        }else{
            JOptionPane.showMessageDialog(null,"Prestador inactivo");
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLimpiarMouseClicked
        limpiar();
    }//GEN-LAST:event_jLimpiarMouseClicked

    private void jComprarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComprarOrdenActionPerformed
        if(formaDepago.isEmpty() || importe==0){
            JOptionPane.showMessageDialog(this, "Complete los campos vacios. Por Favor");
        }else{
            if (salidaOrden!=true){
                String sql = "INSERT INTO orden (fecha, formaDepago, importe, idAfiliado, idPrestador) " +
                 "SELECT ?, ?, ?, a.idAfiliados, p.idPrestador " +
                 "FROM afiliados a " +
                 "JOIN prestador p ON a.idAfiliados = ? AND p.idPrestador = ?";
                try {   
                    PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                    ps.setDate(1,Date.valueOf(dia));  
                    ps.setString(2, formaDepago);
                    ps.setDouble(3, importe);
                    ps.setInt(4, codAfiliado);
                    ps.setInt(5, codPrestador);
                    ps.executeUpdate();
                    ResultSet rs=ps.getGeneratedKeys();   
                    if(rs.next()){                         
                        JOptionPane.showMessageDialog(null,"Orden registrada");
                    }
                    limpiar();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ordenes"+ex.getLocalizedMessage());
                }
            }else{
                return;
            }
            limpiar();
        }
    }//GEN-LAST:event_jComprarOrdenActionPerformed

    private void jEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEfectivoActionPerformed
        formaDepago = "efectivo";
    }//GEN-LAST:event_jEfectivoActionPerformed

    private void jTransfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTransfeActionPerformed
        formaDepago = "Tranferencia";
    }//GEN-LAST:event_jTransfeActionPerformed

    private void jDocumentoAfiliadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDocumentoAfiliadoMouseClicked

    }//GEN-LAST:event_jDocumentoAfiliadoMouseClicked

    private void jDocumentoAfiliadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDocumentoAfiliadoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros || jDocumentoAfiliado.getText().length() >= 8){
            evt.consume();
        }
    }//GEN-LAST:event_jDocumentoAfiliadoKeyTyped

    private void jImporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jImporteKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 46 && key <= 57 || key == 46 ;
        if (!numeros || jImporte.getText().length() >= 7){
            evt.consume();
        }
        importe=evt.getKeyChar();
    }//GEN-LAST:event_jImporteKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JButton jBuscarAfiliado;
    private javax.swing.JButton jComprarOrden;
    private javax.swing.JLabel jDatosAfiliado;
    private javax.swing.JLabel jDatosAfiliado2;
    private javax.swing.JTextField jDocumentoAfiliado;
    private javax.swing.JRadioButton jEfectivo;
    private javax.swing.JLabel jEspeSelec;
    private javax.swing.JComboBox<Especialidad> jEspecialidad;
    private javax.swing.JLabel jFecha;
    private javax.swing.JTextField jImporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jLimpiar;
    private javax.swing.JButton jSalida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton jTransfe;
    // End of variables declaration//GEN-END:variables

    private void cargaEspecialidad() {
        Especialidad e = new Especialidad(0," ");
        jEspecialidad.addItem(e);
        for(Especialidad espe : listaE){
            jEspecialidad.addItem(espe);
        }
    }
    
    public void obtenerEspecialista(){
        Especialidad espeSelec = (Especialidad)jEspecialidad.getSelectedItem();
        modelo.setRowCount(0);
        if(espeSelec != null){
            int idEspecialidad = espeSelec.getIdEspecialidad();
            listaP = eData.obtenerEspecialista(idEspecialidad);
            if(!listaE.isEmpty()){
                for(Prestador pres : listaP){
                    modelo.addRow(new Object []{
                    pres.getIdPrestador(),
                    pres.getApellido(),
                    pres.getNombre()
                    });
                }
            }else{
                JOptionPane.showMessageDialog(null, "No hay prestadores en esta especialidad");
            }
        }
     }
    
    private void limpiar(){
        jDocumentoAfiliado.setText("");
        jDatosAfiliado.setText("");
        jDatosAfiliado2.setText("");
        jEspecialidad.removeAllItems();
        jEspeSelec.setText("");
        jImporte.setText("");
        jEfectivo.getModel();
        grupo.clearSelection();
        int indice= modelo.getRowCount()-1;
        for(int i=indice;i>=0; i--){
            modelo.removeRow(i);
        }
        cargaEspecialidad();
    }
    
    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Codigo");
        filaCabecera.add("Apellido");
        filaCabecera.add("Nombre");
        for(Object it: filaCabecera){
            modelo.addColumn(it);
        }
        jTable1.setModel(modelo);
    }

    private void verificarFecha(LocalDate fecha, int idPrestador){
        String sql="SELECT fecha, idPrestador FROM orden WHERE fecha=? AND idPrestador=?";
        PreparedStatement ss=null;
        try {
            ss=con.prepareStatement(sql);
            ss.setDate(1, Date.valueOf(fecha));
            ss.setInt(2, idPrestador);
            ResultSet rs=ss.executeQuery();
            if (rs.next()){
                JOptionPane.showMessageDialog(null,"No se puede emitir orden porque ya fue emitida en este dia para este prestador");
                jEspeSelec.setText("");
            }
            ss.close();
        } catch (SQLException xx){
            JOptionPane.showMessageDialog(null,"Error alacceder a la tabla Orden "+xx.getMessage());
        }
    }
}
    
    


