
package metodosnumericos;

import java.math.RoundingMode;
import java.text.NumberFormat;


public class tiperrores extends javax.swing.JFrame {
public String resultado;
  
   
    
    public tiperrores() {
        initComponents();
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        p = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        pa = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        truncamiento = new javax.swing.JRadioButton();
        redondeo = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        decimal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Ingrese el valor verdadero");

        jLabel2.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Ingrese el valor aproximado");

        jScrollPane1.setViewportView(p);

        jScrollPane2.setViewportView(pa);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        truncamiento.setText("Truncamiento");
        truncamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truncamientoActionPerformed(evt);
            }
        });

        redondeo.setText("Redondeo");
        redondeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redondeoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Ingrese el numero de decimales");

        decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 255, 102));
        jLabel4.setText("metodos numericos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(truncamiento)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(redondeo))))
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addGap(21, 21, 21))
                    .addComponent(decimal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redondeo)
                    .addComponent(truncamiento))
                .addGap(74, 74, 74)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
       //boton para mostrar el resultado
        System.exit(0);
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void truncamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_truncamientoActionPerformed

        //metodo trunck
    String primera,segunda,obde;
    int d;
    primera=p.getText();
    segunda=pa.getText();
    double pri,pro;
    pri=Double.parseDouble(primera);
    pro=Double.parseDouble(segunda);
    
    double P,Q;
    P=pri;
    Q=pro;
    double EA,ER;
    EA = Math.abs(P - Q);
    ER = Math.abs((P - Q) / P);
    
    
   
    obde=decimal.getText();
    d=Integer.parseInt(obde);
    
    // metodo trunk 
    NumberFormat numberFormat = NumberFormat.getInstance();
    numberFormat.setMaximumFractionDigits(d);
    numberFormat.setRoundingMode( RoundingMode.DOWN);
    
     String nueva=numberFormat.format(EA);
     String nuevaa=numberFormat.format(ER);
// truncamos un número
    
    ///
    resultadosmeto n = new resultadosmeto();
    n.ere.setText(nueva);
    n.era1.setText(nuevaa);
    
    n.setVisible(true);
    this.setVisible(false);    
    }//GEN-LAST:event_truncamientoActionPerformed

    private void decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalActionPerformed
        // metodo redondeo
    }//GEN-LAST:event_decimalActionPerformed

    private void redondeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redondeoActionPerformed
String primera,segunda,obde;
    int d;
    primera=p.getText();
    segunda=pa.getText();
    double pri,pro;
    pri=Double.parseDouble(primera);
    pro=Double.parseDouble(segunda);
    
    double P,Q;
    P=pri;
    Q=pro;
    double EA,ER;
    EA = Math.abs(P - Q);
    ER = Math.abs((P - Q) / P);
    
    
   
    obde=decimal.getText();
    d=Integer.parseInt(obde);     
            NumberFormat numberFormat = NumberFormat.getInstance();
            numberFormat.setMaximumFractionDigits(d);
            numberFormat.setRoundingMode(RoundingMode.HALF_UP);
            
            double resulf;
            String resulf2;
            String l =numberFormat.format(EA);
            String lL =numberFormat.format(ER);
            resultadosmeto n = new resultadosmeto();
            
            n.ere.setText(l);
            n.era1.setText(lL);
    
    n.setVisible(true);
    this.setVisible(false);    
    
    }//GEN-LAST:event_redondeoActionPerformed
  
    
    public static void main(String args[]) {
        
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tiperrores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tiperrores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tiperrores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tiperrores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tiperrores().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField decimal;
    public static javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextPane p;
    public static javax.swing.JTextPane pa;
    public static javax.swing.JRadioButton redondeo;
    public static javax.swing.JRadioButton truncamiento;
    // End of variables declaration//GEN-END:variables
}
