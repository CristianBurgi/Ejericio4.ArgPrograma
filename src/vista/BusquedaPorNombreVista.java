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
public class BusquedaPorNombreVista extends javax.swing.JInternalFrame {
private DefaultTableModel modelo = new DefaultTableModel(){
    
    public boolean isCellEditable(int f, int c){
        if (c==2) {
            return true;
        }else{
        return false;
        }
    }
};
    /**
     * Creates new form BusquedaPorNombreVista
     */
    public BusquedaPorNombreVista() {
        initComponents();
        armarCabecera();
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

        jLabel2 = new javax.swing.JLabel();
        txtNombreAbuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Busqueda Por Nombre");
        setDoubleBuffered(true);
        setFocusCycleRoot(false);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/consulta-publica-1024x838 (1).png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Escriba nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 51, -1, -1));

        txtNombreAbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreAbuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txtNombreAbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 45, 185, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 79, 381, 158));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wallpaper-azul-papel-de-parede-azul-fundo-5.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreAbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreAbuscarKeyReleased
       
        borrarFilas();
        
        for (Producto producto : MenuDeTodoVista.listaProductos) {
            
            if (producto.getDescripcion().startsWith(txtNombreAbuscar.getText())) {
                
                modelo.addRow(new Object[]{
                    producto.getCodigo(),
                    producto.getDescripcion(),
                    producto.getPrecio(),
                    producto.getStock()
                });
                
            }
        }
    }//GEN-LAST:event_txtNombreAbuscarKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTextField txtNombreAbuscar;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera(){
        
        modelo.addColumn("Código");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        
        jTableProductos.setModel(modelo);
        
    }
        
    private void borrarFilas(){
        
        int f = jTableProductos.getRowCount()-1;
        
        for(;f>=0;f--){
            modelo.removeRow(f);
        }
    }
    
    
    
}
