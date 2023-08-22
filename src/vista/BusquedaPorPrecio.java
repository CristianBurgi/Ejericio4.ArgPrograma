/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;

/**
 *
 * @author Cristian
 */
public class BusquedaPorPrecio extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form BusquedaPorPrecio
     */
    public BusquedaPorPrecio() {
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

        jLabel1 = new javax.swing.JLabel();
        jTextFinal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextInicial = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsultaPrecio = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        setClosable(true);
        setIconifiable(true);
        setTitle("Busqueda Por Precio");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/consulta-publica-1024x838 (1).png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setText("Precio entre ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 46, -1, -1));

        jTextFinal.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jTextFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFinalKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 40, 50, -1));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setText("Y");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 46, -1, -1));

        jTextInicial.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        getContentPane().add(jTextInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 40, 51, -1));

        jTableConsultaPrecio.setBackground(new java.awt.Color(102, 153, 255));
        jTableConsultaPrecio.setBorder(new javax.swing.border.MatteBorder(null));
        jTableConsultaPrecio.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jTableConsultaPrecio.setForeground(new java.awt.Color(255, 255, 255));
        jTableConsultaPrecio.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableConsultaPrecio.setSelectionBackground(new java.awt.Color(153, 204, 255));
        jTableConsultaPrecio.setSelectionForeground(new java.awt.Color(204, 255, 255));
        jTableConsultaPrecio.setShowVerticalLines(true);
        jScrollPane1.setViewportView(jTableConsultaPrecio);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 83, 479, 229));

        jLabel3.setBackground(new java.awt.Color(102, 153, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wallpaper-azul-papel-de-parede-azul-fundo-5.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jTextFinalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFinalKeyReleased
        
        borrarFilas();
        
        try {

            double Pinicial = 0.0;
            double Pfinal = 0.0;

            if (!jTextInicial.getText().isEmpty()) {
                Pinicial = Double.parseDouble(jTextInicial.getText());
            }
            
            if (!jTextFinal.getText().isEmpty()) {
                Pfinal = Double.parseDouble(jTextFinal.getText());
            }
            

            for (Producto producto : MenuDeTodoVista.listaProductos) {
                if (producto.getPrecio() >= Pinicial && producto.getPrecio() <= Pfinal) {

                    modelo.addRow(new Object[]{
                        producto.getCodigo(),
                        producto.getDescripcion(),
                        producto.getPrecio(),
                        producto.getStock(),
                        producto.getRubro()
                    });
                }

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Escriba numeros");
        }
    
    }//GEN-LAST:event_jTextFinalKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableConsultaPrecio;
    private javax.swing.JTextField jTextFinal;
    private javax.swing.JTextField jTextInicial;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {

        modelo.addColumn("Código");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");

        jTableConsultaPrecio.setModel(modelo);

    }
    private void borrarFilas(){
        
        int f = jTableConsultaPrecio.getRowCount()-1;
        
        for(;f>=0;f--){
            modelo.removeRow(f);
        }
    }

}
