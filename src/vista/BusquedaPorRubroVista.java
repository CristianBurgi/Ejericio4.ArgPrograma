/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.table.DefaultTableModel;
import modelo.Producto;

/**
 *
 * @author Cristian
 */
public class BusquedaPorRubroVista extends javax.swing.JInternalFrame {
    
    private DefaultTableModel modelo = new DefaultTableModel();
    /**
     * Creates new form BusquedaPorRubroVista
     */
    public BusquedaPorRubroVista() {
        initComponents();
        armarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxRubro = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBoxRubro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alimento", "Limpieza", "Perfumeria" }));
        jComboBoxRubro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxRubroMouseClicked(evt);
            }
        });
        jComboBoxRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRubroActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxRubro, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 35, 160, -1));

        jLabel1.setText("Rubro");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 40, -1, -1));

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableProductos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 73, 381, 236));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setText("Busqueda por Rubro");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 4, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wallpaper-azul-papel-de-parede-azul-fundo-5.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRubroActionPerformed
//         TODO add your handling code here:
        borrarFilas();
        
        
        for (Producto producto : MenuDeTodoVista.listaProductos) {
            
            if (producto.getRubro().equals(jComboBoxRubro.getSelectedItem())) {
                
                modelo.addRow(new Object[]{
                    producto.getCodigo(),
                    producto.getDescripcion(),
                    producto.getPrecio(),
                    producto.getStock(),
                    producto.getRubro()
                });
                
            }
        }
    }//GEN-LAST:event_jComboBoxRubroActionPerformed

    private void jComboBoxRubroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxRubroMouseClicked
        // TODO add your handling code here:
//        for (Producto producto : MenuDeTodoVista.listaProductos) {
//            
//            if (producto.getRubro().equals(jComboBoxRubro.getSelectedItem())) {
//                
//                modelo.addRow(new Object[]{
//                    producto.getCodigo(),
//                    producto.getDescripcion(),
//                    producto.getPrecio(),
//                    producto.getStock(),
//                    producto.getRubro()
//                      
//                });
//                
//            }
//        }
    }//GEN-LAST:event_jComboBoxRubroMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxRubro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProductos;
    // End of variables declaration//GEN-END:variables
    
    private void armarCabecera(){
        
        modelo.addColumn("Código");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        modelo.addColumn("Rubro");
        
        jTableProductos.setModel(modelo);
    }
    
    private void borrarFilas(){
        
        int f = jTableProductos.getRowCount()-1;
        
        for(;f>=0;f--){
            modelo.removeRow(f);
        }
    }
}
