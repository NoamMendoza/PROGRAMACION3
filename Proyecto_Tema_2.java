
package Tema_2;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;
import libreriaproyecto.Metodos_Proyecto_Tema2;

public class Proyecto_Tema_2 extends javax.swing.JFrame {

    DefaultListModel<String> modelo1=new DefaultListModel<>();
    DefaultListModel<String> modelo2=new DefaultListModel<>();
    DefaultListModel<String> modelo3=new DefaultListModel<>();
    
    
    public Proyecto_Tema_2() {
        initComponents();
        
    }
    String c = "0";
    int cantidad;
    Metodos_Proyecto_Tema2 obj = new Metodos_Proyecto_Tema2();
    int precio_total;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lbl_precio = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lista_precio = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        lista_numero = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        lista_cantidad = new javax.swing.JList<>();
        lbl_foto = new javax.swing.JLabel();
        lbl_pregunta = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        btn_comprar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caguamas \"Raul\"");

        jPanel3.setBackground(new java.awt.Color(0, 0, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_precio.setText("Total a pagar:");
        jPanel4.add(lbl_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        txt_total.setEditable(false);
        txt_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalActionPerformed(evt);
            }
        });
        jPanel4.add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 80, -1));

        jLabel2.setText("NO:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel3.setText("Cantidad:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        jLabel4.setText("Precio:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        jScrollPane4.setViewportView(lista_precio);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 90, 200));

        jScrollPane5.setViewportView(lista_numero);

        jPanel4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 60, 200));

        jScrollPane6.setViewportView(lista_cantidad);

        jPanel4.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 70, 200));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 300, 300));

        lbl_foto.setIcon(new javax.swing.ImageIcon("D:\\Descargas 2\\caguamas raul (1).png")); // NOI18N
        lbl_foto.setText("jLabel1");
        jPanel3.add(lbl_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 430, 240));

        lbl_pregunta.setText("¿Cuantas caguamas desea comprar?");
        jPanel3.add(lbl_pregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        txt_cantidad.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                if(txt_cantidad.getText().length() >= 25){
                    evt.consume();
                }else{
                    int key = evt.getKeyChar();
                    boolean numeros = (key >= 49 && key <= 57);
                    if (!numeros){
                        evt.consume();
                    }
                }
            }
        });
        txt_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cantidadActionPerformed(evt);
            }
        });
        jPanel3.add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 80, -1));

        btn_comprar.setText("Comprar");
        btn_comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comprarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cantidadActionPerformed

    private void btn_comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comprarActionPerformed
        lista_numero.setModel(modelo1);
        c = Integer.toString((Integer.parseInt(c)+1));
        modelo1.addElement(c);
        
        lista_cantidad.setModel(modelo2);
        cantidad = Integer.parseInt(txt_cantidad.getText());
        modelo2.addElement(Integer.toString(cantidad));
        
        lista_precio.setModel(modelo3);
        modelo3.addElement(Integer.toString(obj.Calcular_Precio_Caguama(cantidad)));
        
        precio_total+=obj.Calcular_Precio_Caguama(cantidad);
        txt_total.setText(precio_total+"");
        txt_cantidad.requestFocus();
    }//GEN-LAST:event_btn_comprarActionPerformed

    private void txt_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_totalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Proyecto_Tema_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proyecto_Tema_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proyecto_Tema_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proyecto_Tema_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proyecto_Tema_2().setVisible(true);
            }
            
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_comprar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lbl_foto;
    private javax.swing.JLabel lbl_precio;
    private javax.swing.JLabel lbl_pregunta;
    private javax.swing.JList<String> lista_cantidad;
    private javax.swing.JList<String> lista_numero;
    private javax.swing.JList<String> lista_precio;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
