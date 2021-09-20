/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.m;
import javax.swing.JOptionPane;
/**
 *
 * @author Oskar
 */
public class Formulariomatriz extends javax.swing.JFrame {
    
static Integer MatrizA [][];
static Integer MatrizB [][];
static Integer MatrizR [][];
    /**
     * Creates new form Formulariomatrizg
     */
    public Formulariomatriz() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        respuesta1 = new javax.swing.JLabel();
        respuesta2 = new javax.swing.JLabel();
        respuesta3 = new javax.swing.JLabel();
        respuesta4 = new javax.swing.JLabel();
        respuesta5 = new javax.swing.JLabel();
        respuesta6 = new javax.swing.JLabel();
        respuesta7 = new javax.swing.JLabel();
        respuesta8 = new javax.swing.JLabel();
        respuesta9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Matriz A");

        jLabel2.setText("Matriz B");

        jLabel3.setText("0");

        jLabel4.setText("0");

        jLabel5.setText("0");

        jLabel6.setText("0");

        jLabel7.setText("0");

        jLabel8.setText("0");

        jLabel9.setText("0");

        jLabel10.setText("0");

        jLabel11.setText("0");

        jLabel12.setText("0");

        jLabel13.setText("0");

        jLabel14.setText("0");

        jLabel15.setText("0");

        jLabel16.setText("0");

        jLabel17.setText("0");

        jLabel18.setText("0");

        jLabel19.setText("0");

        jLabel20.setText("0");

        jLabel21.setText("Resultado = Matriz A +/-/* Matriz B");

        respuesta1.setText("0");

        respuesta2.setText("0");

        respuesta3.setText("0");

        respuesta4.setText("0");

        respuesta5.setText("0");

        respuesta6.setText("0");

        respuesta7.setText("0");

        respuesta8.setText("0");

        respuesta9.setText("0");

        jButton1.setText("Sumar Matriz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Restar Matriz");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Determinante");

        jButton4.setText("Multiplicar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(163, 163, 163))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel7))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addGap(24, 24, 24)
                                                    .addComponent(jLabel4)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(24, 24, 24)
                                                .addComponent(jLabel10)))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel11)))
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel18))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel19))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel1)
                                .addGap(96, 96, 96)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(respuesta7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel21)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(respuesta1)
                                .addComponent(respuesta4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(respuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(respuesta5)
                                .addComponent(respuesta8))
                            .addGap(60, 60, 60)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(respuesta9)
                                .addComponent(respuesta6)
                                .addComponent(respuesta3)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(respuesta1)
                    .addComponent(respuesta2)
                    .addComponent(respuesta3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(respuesta4)
                    .addComponent(respuesta5)
                    .addComponent(respuesta6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(respuesta7)
                    .addComponent(respuesta8)
                    .addComponent(respuesta9))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         MatrizA = new Integer [3][3]; 
        
          for (int f = 0 ; f < 3 ; f ++){
              for (int c=0 ; c < 3 ; c++) {
                  MatrizA [f][c] = Integer.parseInt(JOptionPane.showInputDialog("Digita el valor de la matriz (A) en posicion "+f+"y"+c));
              
            }
          }
          
          jLabel3.setText(Integer.toString(MatrizA [0][0]));
          jLabel4.setText(Integer.toString(MatrizA [0][1]));
          jLabel5.setText(Integer.toString(MatrizA [0][2]));
          jLabel6.setText(Integer.toString(MatrizA [1][0]));
          jLabel7.setText(Integer.toString(MatrizA [1][1]));
          jLabel8.setText(Integer.toString(MatrizA [1][2]));
          jLabel9.setText(Integer.toString(MatrizA [2][0]));
          jLabel10.setText(Integer.toString(MatrizA [2][1]));
          jLabel11.setText(Integer.toString(MatrizA [2][2]));
          
          
         MatrizB = new Integer [3][3]; 
        
          for (int f = 0 ; f < 3 ; f ++){
              for (int c=0 ; c < 3 ; c++) {
                  MatrizB [f][c] = Integer.parseInt(JOptionPane.showInputDialog("Digita el valor de la matriz (B) en posicion "+f+"y"+c)); 
          
              }
          }
          
          jLabel12.setText(Integer.toString(MatrizB [0][0]));
          jLabel13.setText(Integer.toString(MatrizB [0][1]));
          jLabel14.setText(Integer.toString(MatrizB [0][2]));
          jLabel15.setText(Integer.toString(MatrizB [1][0]));
          jLabel16.setText(Integer.toString(MatrizB [1][1]));
          jLabel17.setText(Integer.toString(MatrizB [1][2]));
          jLabel18.setText(Integer.toString(MatrizB [2][0]));
          jLabel19.setText(Integer.toString(MatrizB [2][1]));
          jLabel20.setText(Integer.toString(MatrizB [2][2]));
          
          
          MatrizR = new Integer [3][3];
             
            for (int f = 0 ; f < 3; f ++){
                for (int c = 0 ; c < 3 ; c ++){
                    
                    MatrizR [f][c] = MatrizA [f][c] + MatrizB [f][c];
                }
            }
          
          respuesta1.setText(Integer.toString(MatrizR [0][0]));
          respuesta2.setText(Integer.toString(MatrizR [0][1]));
          respuesta3.setText(Integer.toString(MatrizR [0][2]));
          respuesta4.setText(Integer.toString(MatrizR [1][0]));
          respuesta5.setText(Integer.toString(MatrizR [1][1]));
          respuesta6.setText(Integer.toString(MatrizR [1][2]));
          respuesta7.setText(Integer.toString(MatrizR [2][0]));
          respuesta8.setText(Integer.toString(MatrizR [2][1]));
          respuesta9.setText(Integer.toString(MatrizR [2][2]));
          
          
          
          
          
          
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        MatrizA = new Integer [3][3]; 
        
          for (int f = 0 ; f < 3 ; f ++){
              for (int c=0 ; c < 3 ; c++) {
                  MatrizA [f][c] = Integer.parseInt(JOptionPane.showInputDialog("Digita el valor de la matriz (A) en posicion "+f+"y"+c));
              
          }
          }
          jLabel3.setText(Integer.toString(MatrizA [0][0]));
          jLabel4.setText(Integer.toString(MatrizA [0][1]));
          jLabel5.setText(Integer.toString(MatrizA [0][2]));
          jLabel6.setText(Integer.toString(MatrizA [1][0]));
          jLabel7.setText(Integer.toString(MatrizA [1][1]));
          jLabel8.setText(Integer.toString(MatrizA [1][2]));
          jLabel9.setText(Integer.toString(MatrizA [2][0]));
          jLabel10.setText(Integer.toString(MatrizA [2][1]));
          jLabel11.setText(Integer.toString(MatrizA [2][2]));
          
          
         MatrizB = new Integer [3][3]; 
        
          for (int f = 0 ; f < 3 ; f ++){
              for (int c=0 ; c < 3 ; c++) {
                  MatrizB [f][c] = Integer.parseInt(JOptionPane.showInputDialog("Digita el valor de la matriz (B) en posicion "+f+"y"+c)); 
          
              }
          }
          
          jLabel12.setText(Integer.toString(MatrizB [0][0]));
          jLabel13.setText(Integer.toString(MatrizB [0][1]));
          jLabel14.setText(Integer.toString(MatrizB [0][2]));
          jLabel15.setText(Integer.toString(MatrizB [1][0]));
          jLabel16.setText(Integer.toString(MatrizB [1][1]));
          jLabel17.setText(Integer.toString(MatrizB [1][2]));
          jLabel18.setText(Integer.toString(MatrizB [2][0]));
          jLabel19.setText(Integer.toString(MatrizB [2][1]));
          jLabel20.setText(Integer.toString(MatrizB [2][2]));
          
          
          MatrizR = new Integer [3][3];
             
            for (int f = 0 ; f < 3; f ++){
                for (int c = 0 ; c < 3 ; c ++){
                    
                    MatrizR [f][c] = MatrizA [f][c] - MatrizB [f][c];
                }
            }
          
          respuesta1.setText(Integer.toString(MatrizR [0][0]));
          respuesta2.setText(Integer.toString(MatrizR [0][1]));
          respuesta3.setText(Integer.toString(MatrizR [0][2]));
          respuesta4.setText(Integer.toString(MatrizR [1][0]));
          respuesta5.setText(Integer.toString(MatrizR [1][1]));
          respuesta6.setText(Integer.toString(MatrizR [1][2]));
          respuesta7.setText(Integer.toString(MatrizR [2][0]));
          respuesta8.setText(Integer.toString(MatrizR [2][1]));
          respuesta9.setText(Integer.toString(MatrizR [2][2]));// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
        MatrizA = new Integer [3][3]; 
        
          for (int f = 0 ; f < 3 ; f ++){
              for (int c=0 ; c < 3 ; c++) {
                  MatrizA [f][c] = Integer.parseInt(JOptionPane.showInputDialog("Digita el valor de la matriz (A) en posicion "+f+"y"+c));
              
          }
          }
          jLabel3.setText(Integer.toString(MatrizA [0][0]));
          jLabel4.setText(Integer.toString(MatrizA [0][1]));
          jLabel5.setText(Integer.toString(MatrizA [0][2]));
          jLabel6.setText(Integer.toString(MatrizA [1][0]));
          jLabel7.setText(Integer.toString(MatrizA [1][1]));
          jLabel8.setText(Integer.toString(MatrizA [1][2]));
          jLabel9.setText(Integer.toString(MatrizA [2][0]));
          jLabel10.setText(Integer.toString(MatrizA [2][1]));
          jLabel11.setText(Integer.toString(MatrizA [2][2]));
          
          
         MatrizB = new Integer [3][3]; 
        
          for (int f = 0 ; f < 3 ; f ++){
              for (int c=0 ; c < 3 ; c++) {
                  MatrizB [f][c] = Integer.parseInt(JOptionPane.showInputDialog("Digita el valor de la matriz (B) en posicion "+f+"y"+c)); 
          
              }
          }
          
          jLabel12.setText(Integer.toString(MatrizB [0][0]));
          jLabel13.setText(Integer.toString(MatrizB [0][1]));
          jLabel14.setText(Integer.toString(MatrizB [0][2]));
          jLabel15.setText(Integer.toString(MatrizB [1][0]));
          jLabel16.setText(Integer.toString(MatrizB [1][1]));
          jLabel17.setText(Integer.toString(MatrizB [1][2]));
          jLabel18.setText(Integer.toString(MatrizB [2][0]));
          jLabel19.setText(Integer.toString(MatrizB [2][1]));
          jLabel20.setText(Integer.toString(MatrizB [2][2]));
          
          
          MatrizR = new Integer [3][3];
             
            for (int f = 0 ; f < 3; f ++){
                for (int c = 0 ; c < 3 ; c ++){
                    
                    MatrizR [f][c] = MatrizA [f][c] * MatrizB [f][c];
                }
            }
          
          respuesta1.setText(Integer.toString(MatrizR [0][0]));
          respuesta2.setText(Integer.toString(MatrizR [0][1]));
          respuesta3.setText(Integer.toString(MatrizR [0][2]));
          respuesta4.setText(Integer.toString(MatrizR [1][0]));
          respuesta5.setText(Integer.toString(MatrizR [1][1]));
          respuesta6.setText(Integer.toString(MatrizR [1][2]));
          respuesta7.setText(Integer.toString(MatrizR [2][0]));
          respuesta8.setText(Integer.toString(MatrizR [2][1]));
          respuesta9.setText(Integer.toString(MatrizR [2][2]));
    
    }//GEN-LAST:event_jButton4ActionPerformed
    
       // TODO add your handling code here:
    
          
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulariomatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    //</editor-fold>
    
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Formulariomatriz().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel respuesta1;
    private javax.swing.JLabel respuesta2;
    private javax.swing.JLabel respuesta3;
    private javax.swing.JLabel respuesta4;
    private javax.swing.JLabel respuesta5;
    private javax.swing.JLabel respuesta6;
    private javax.swing.JLabel respuesta7;
    private javax.swing.JLabel respuesta8;
    private javax.swing.JLabel respuesta9;
    // End of variables declaration//GEN-END:variables
}
