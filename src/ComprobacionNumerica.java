
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pablo
 */
public class ComprobacionNumerica extends javax.swing.JFrame {

    /**
     * Creates new form ComprobacionNumerica
     */
    public ComprobacionNumerica() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblComprobacion = new javax.swing.JLabel();
        lblNum = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        lbnComprobar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblComprobacion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblComprobacion.setForeground(new java.awt.Color(153, 0, 51));
        lblComprobacion.setText("COMPROBACION");

        lblNum.setText("Ingrese un numero");

        lbnComprobar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbnComprobar.setForeground(new java.awt.Color(153, 0, 0));
        lbnComprobar.setText("COMPROBAR");
        lbnComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbnComprobarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(lblComprobacion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblNum)
                        .addGap(70, 70, 70)
                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(lbnComprobar)))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblComprobacion)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNum)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117)
                .addComponent(lbnComprobar)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbnComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbnComprobarActionPerformed
        // TODO add your handling code here:
        int i, suma = 0 , num;
        num= Integer.parseInt(txtNum.getText());
        for( i=1;i<num;i++){
            if(num %i==0){
                suma = suma +i;
            }            
            if(num == suma){ 
                JOptionPane.showMessageDialog(this,suma + " Es numero perfecto");
            }else if(num !=suma){
                JOptionPane.showMessageDialog(this,suma + " No es numero perfecto");
            }
            //System.out.println(i);
            //JOptionPane.showInputDialog(" Es numero prerfecto");
        }
    }//GEN-LAST:event_lbnComprobarActionPerformed

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
            java.util.logging.Logger.getLogger(ComprobacionNumerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComprobacionNumerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComprobacionNumerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComprobacionNumerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComprobacionNumerica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblComprobacion;
    private javax.swing.JLabel lblNum;
    private javax.swing.JButton lbnComprobar;
    private javax.swing.JTextField txtNum;
    // End of variables declaration//GEN-END:variables
}
