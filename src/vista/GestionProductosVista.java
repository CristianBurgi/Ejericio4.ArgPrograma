/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Categoria;
import modelo.Producto;

/**
 *
 * @author Cristian
 */
public class GestionProductosVista extends javax.swing.JInternalFrame {
  

    /**
     * Creates new form GestionProductosVista
     */
    public GestionProductosVista() {
        initComponents();
        this.setClosable(true);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmb1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jButtonBuscarProducto = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        escritorioGestionProducto = new javax.swing.JDesktopPane();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Gestion de Productos");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoSuper.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 51));
        jLabel1.setFont(new java.awt.Font("Clarendon Lt BT", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestión de Productos");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 6, -1, -1));

        jLabel2.setText("Código");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 52, -1, -1));

        jLabel3.setText("Descripción");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 98, -1, -1));

        jLabel4.setText("Precio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 144, -1, -1));

        cmb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alimento", "Limpieza", "Perfumeria" }));
        cmb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb1ActionPerformed(evt);
            }
        });
        getContentPane().add(cmb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 184, 155, -1));

        jLabel5.setText("Rubro");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 189, -1, -1));

        jLabel6.setText("Stock");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 228, -1, -1));
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 92, 201, -1));
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 46, 67, -1));
        getContentPane().add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 222, 63, -1));
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 138, 64, -1));

        jButtonBuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/552330-icone-de-de-lupa-grátis-v.jpg"))); // NOI18N
        jButtonBuscarProducto.setOpaque(true);
        jButtonBuscarProducto.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 281, 65, -1));

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 281, 77, -1));

        jButton3.setText("Eliminar");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 281, 84, -1));

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 281, 65, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wallpaper-azul-papel-de-parede-azul-fundo-5.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 440));
        getContentPane().add(escritorioGestionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        if (txtCodigo.getText().isEmpty() && txtDescripcion.getText().isEmpty()
                && txtPrecio.getText().isEmpty() && txtStock.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Hay campos vacios.");

        } else {
            try {
                int codigo = Integer.parseInt(txtCodigo.getText());
                String descripcion = txtDescripcion.getText();
                double precio = Double.parseDouble(txtPrecio.getText());
                int stock = Integer.parseInt(txtStock.getText());
                String rubro = (String) cmb1.getSelectedItem();

                Producto p1 = new Producto(codigo, descripcion, precio, stock, rubro);

                MenuDeTodoVista.listaProductos.add(p1);
                JOptionPane.showMessageDialog(this, "El producto se cargó Correctamente");
                //seteo a cero los textos
                txtCodigo.setText("");
                txtDescripcion.setText("");
                txtPrecio.setText("");
                txtStock.setText("");
            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(this, "Debe ingresar numeros en el campo 'Código', 'Precio' y 'Stock'");
            }
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtCodigo.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
        txtStock.setText("");


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        // TODO add your handling code here:
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarProductoActionPerformed

//        MenuDeTodoVista.escritorio1.removeAll();
//        MenuDeTodoVista.escritorio1.repaint();
        
        BusquedaLupa lupa = new BusquedaLupa();
        
        lupa.setVisible(true);
        this.getDesktopPane().add(lupa);
        this.dispose();
//        MenuDeTodoVista.escritorio1.moveToFront(gestion);

    }//GEN-LAST:event_jButtonBuscarProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb1;
    private javax.swing.JDesktopPane escritorioGestionProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonBuscarProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables

    
}
