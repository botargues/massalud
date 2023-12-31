package Vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class VistaMenuPrincipal extends javax.swing.JFrame {

    public VistaMenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/images.jpg"));
        Image image = icon.getImage();
        jEscritorio = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jAfiliados = new javax.swing.JMenu();
        jOrdenes = new javax.swing.JMenu();
        jPrestadores = new javax.swing.JMenu();
        jListados = new javax.swing.JMenu();
        jLAfiliadosAct = new javax.swing.JMenuItem();
        jPrestadoresAct = new javax.swing.JMenuItem();
        jOrdenSegunFecha = new javax.swing.JMenuItem();
        jSalida = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jEscritorio.setBackground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout jEscritorioLayout = new javax.swing.GroupLayout(jEscritorio);
        jEscritorio.setLayout(jEscritorioLayout);
        jEscritorioLayout.setHorizontalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
        );
        jEscritorioLayout.setVerticalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );

        jAfiliados.setText("Afiliados");
        jAfiliados.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jAfiliadosComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jAfiliadosComponentRemoved(evt);
            }
        });
        jAfiliados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAfiliadosMouseClicked(evt);
            }
        });
        jAfiliados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAfiliadosActionPerformed(evt);
            }
        });
        jMenuBar1.add(jAfiliados);

        jOrdenes.setText("Ordenes");
        jOrdenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jOrdenesMouseClicked(evt);
            }
        });
        jOrdenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOrdenesActionPerformed(evt);
            }
        });
        jMenuBar1.add(jOrdenes);

        jPrestadores.setText("Prestadores");
        jPrestadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPrestadoresMouseClicked(evt);
            }
        });
        jPrestadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrestadoresActionPerformed(evt);
            }
        });
        jPrestadores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPrestadoresKeyPressed(evt);
            }
        });
        jMenuBar1.add(jPrestadores);

        jListados.setText("Listados");
        jListados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListadosMouseClicked(evt);
            }
        });

        jLAfiliadosAct.setText("Listas de Afiliados y Prestadores");
        jLAfiliadosAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLAfiliadosActActionPerformed(evt);
            }
        });
        jListados.add(jLAfiliadosAct);

        jPrestadoresAct.setText("Listas por Especialidad");
        jPrestadoresAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrestadoresActActionPerformed(evt);
            }
        });
        jListados.add(jPrestadoresAct);

        jOrdenSegunFecha.setText("Listados de Ordenes");
        jOrdenSegunFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOrdenSegunFechaActionPerformed(evt);
            }
        });
        jListados.add(jOrdenSegunFecha);

        jMenuBar1.add(jListados);

        jSalida.setText("Salir");
        jSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSalidaMouseClicked(evt);
            }
        });
        jSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalidaActionPerformed(evt);
            }
        });
        jMenuBar1.add(jSalida);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalidaActionPerformed
        dispose();
    }//GEN-LAST:event_jSalidaActionPerformed

    private void jAfiliadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAfiliadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAfiliadosActionPerformed

    private void jAfiliadosComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jAfiliadosComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jAfiliadosComponentAdded

    private void jAfiliadosComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jAfiliadosComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jAfiliadosComponentRemoved

    private void jAfiliadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAfiliadosMouseClicked
        jEscritorio.removeAll();
        jEscritorio.repaint();
        VistaMenuAfiliado afil=new VistaMenuAfiliado();
        jEscritorio.add(afil);
        jEscritorio.moveToFront(afil);
        afil.setVisible(true);
    }//GEN-LAST:event_jAfiliadosMouseClicked

    private void jPrestadoresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPrestadoresKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPrestadoresKeyPressed

    private void jPrestadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPrestadoresMouseClicked
        jEscritorio.removeAll();
        jEscritorio.repaint();
        VistaMenuPrestadores pres=new VistaMenuPrestadores();
        jEscritorio.add(pres);
        jEscritorio.moveToFront(pres);
        pres.setVisible(true);
    }//GEN-LAST:event_jPrestadoresMouseClicked

    private void jListadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListadosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jListadosMouseClicked

    private void jOrdenSegunFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOrdenSegunFechaActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        VistaItemListaOrden list = new VistaItemListaOrden();
        jEscritorio.add(list);
        jEscritorio.moveToFront(list);
        list.setVisible(true);
    }//GEN-LAST:event_jOrdenSegunFechaActionPerformed

    private void jPrestadoresActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPrestadoresActActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        VistaItemListaPrestadores list = new VistaItemListaPrestadores();
        jEscritorio.add(list);
        jEscritorio.moveToFront(list);
        list.setVisible(true);
    }//GEN-LAST:event_jPrestadoresActActionPerformed

    private void jLAfiliadosActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLAfiliadosActActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        VistaMenuListados list=new VistaMenuListados();
        jEscritorio.add(list);
        jEscritorio.moveToFront(list);
        list.setVisible(true);
    }//GEN-LAST:event_jLAfiliadosActActionPerformed

    private void jPrestadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPrestadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPrestadoresActionPerformed

    private void jOrdenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOrdenesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOrdenesActionPerformed

    private void jOrdenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jOrdenesMouseClicked
        jEscritorio.removeAll();
        jEscritorio.repaint();
        VistaOrden list = new VistaOrden();
        jEscritorio.add(list);
        jEscritorio.moveToFront(list);
        list.setVisible(true);
    
    }//GEN-LAST:event_jOrdenesMouseClicked

    private void jSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSalidaMouseClicked
        dispose();
    }//GEN-LAST:event_jSalidaMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jAfiliados;
    public static javax.swing.JDesktopPane jEscritorio;
    private javax.swing.JMenuItem jLAfiliadosAct;
    private javax.swing.JMenu jListados;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jOrdenSegunFecha;
    private javax.swing.JMenu jOrdenes;
    private javax.swing.JMenu jPrestadores;
    private javax.swing.JMenuItem jPrestadoresAct;
    private javax.swing.JMenu jSalida;
    // End of variables declaration//GEN-END:variables
}
