/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author davba
 */
public class FrmInterfaz extends javax.swing.JFrame {

    /**
     * Creates new form FrmInterfaz
     */
    public FrmInterfaz() {
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

        Panel = new javax.swing.JPanel();
        btn0 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout());

        Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 215, 217)));
        Panel.setLayout(new java.awt.GridLayout(3, 3));

        btn0.setFont(new java.awt.Font("Sitka Small", 3, 36)); // NOI18N
        Panel.add(btn0);

        btn1.setFont(new java.awt.Font("Sitka Small", 3, 36)); // NOI18N
        Panel.add(btn1);

        btn2.setFont(new java.awt.Font("Sitka Small", 3, 36)); // NOI18N
        Panel.add(btn2);

        btn3.setFont(new java.awt.Font("Sitka Small", 3, 36)); // NOI18N
        Panel.add(btn3);

        btn4.setFont(new java.awt.Font("Sitka Small", 3, 36)); // NOI18N
        Panel.add(btn4);

        btn5.setFont(new java.awt.Font("Sitka Small", 3, 36)); // NOI18N
        Panel.add(btn5);

        btn6.setFont(new java.awt.Font("Sitka Small", 3, 36)); // NOI18N
        Panel.add(btn6);

        btn7.setFont(new java.awt.Font("Sitka Small", 3, 36)); // NOI18N
        Panel.add(btn7);

        btn8.setFont(new java.awt.Font("Sitka Small", 3, 36)); // NOI18N
        Panel.add(btn8);

        getContentPane().add(Panel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInterfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    public javax.swing.JButton btn0;
    public javax.swing.JButton btn1;
    public javax.swing.JButton btn2;
    public javax.swing.JButton btn3;
    public javax.swing.JButton btn4;
    public javax.swing.JButton btn5;
    public javax.swing.JButton btn6;
    public javax.swing.JButton btn7;
    public javax.swing.JButton btn8;
    // End of variables declaration//GEN-END:variables
}
