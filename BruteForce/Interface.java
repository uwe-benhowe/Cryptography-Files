package practicals.BruteForce;

import static practicals.BruteForce.BruteForce.possibleStrings;

public class Interface extends javax.swing.JFrame {

    public static Thread t1, t2, t3, t4;

    public Interface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInputString = new javax.swing.JLabel();
        lblHash = new javax.swing.JLabel();
        txtInputString = new javax.swing.JTextField();
        txtInputHash = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaHashes = new javax.swing.JTextArea();
        btnAddHash = new javax.swing.JButton();
        btnHash = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnCrack = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblInputString.setText("Enter String you want to hash");

        lblHash.setText("Enter hashes you want to crack (multiple):");

        txtaHashes.setColumns(20);
        txtaHashes.setRows(5);
        jScrollPane1.setViewportView(txtaHashes);

        btnAddHash.setText("Add");
        btnAddHash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddHashActionPerformed(evt);
            }
        });

        btnHash.setText("Hash");
        btnHash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHashActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnCrack.setText("Crack");
        btnCrack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrackActionPerformed(evt);
            }
        });

        btnStop.setText("Stop");
        btnStop.setEnabled(false);
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblInputString)
                                    .addComponent(txtInputHash, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtInputString, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnHash)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddHash)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnCrack, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 10, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInputString)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInputString, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHash))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHash)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInputHash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddHash))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrack)
                    .addComponent(btnClear)
                    .addComponent(btnStop))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHashActionPerformed
        String input = txtInputString.getText();
        txtInputHash.setText(BruteForce.SHA1(input));
    }//GEN-LAST:event_btnHashActionPerformed

    private void btnAddHashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddHashActionPerformed
        txtaHashes.append(txtInputHash.getText() + "\n");
    }//GEN-LAST:event_btnAddHashActionPerformed

    private void btnCrackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrackActionPerformed
        btnHash.setEnabled(false);
        btnStop.setEnabled(true);
        btnCrack.setEnabled(false);
        btnClear.setEnabled(false);
        txtInputHash.setText("");
        txtInputString.setText("");
        btnAddHash.setEnabled(false);

        BruteForce.hashes = txtaHashes.getText().split("\\n");
        BruteForce.numHashes = BruteForce.hashes.length;
        txtaHashes.setText(null);

        //Specifying char set
        char[] charset = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
        final long startTime = System.currentTimeMillis();

        //Running algorithm
        possibleStrings(1, charset, "", startTime);
        possibleStrings(2, charset, "", startTime);

        t1 = new Thread(new Threader(3, charset, "", startTime));
        t2 = new Thread(new Threader(4, charset, "", startTime));
        t3 = new Thread(new Threader(5, charset, "", startTime));
        t4 = new Thread(new Threader(6, charset, "", startTime));

        //Starting threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }//GEN-LAST:event_btnCrackActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtaHashes.setText(null);
        btnHash.setEnabled(true);
        btnAddHash.setEnabled(true);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        Interface.t1.interrupt();
        Interface.t2.interrupt();
        Interface.t3.interrupt();
        Interface.t4.interrupt();
        btnCrack.setEnabled(true);
    }//GEN-LAST:event_btnStopActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Interface().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddHash;
    public static javax.swing.JButton btnClear;
    private javax.swing.JButton btnCrack;
    private javax.swing.JButton btnHash;
    public static javax.swing.JButton btnStop;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHash;
    private javax.swing.JLabel lblInputString;
    private javax.swing.JTextField txtInputHash;
    private javax.swing.JTextField txtInputString;
    public static javax.swing.JTextArea txtaHashes;
    // End of variables declaration//GEN-END:variables
}
