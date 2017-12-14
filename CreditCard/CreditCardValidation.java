package practicals.CreditCard;

public class CreditCardValidation extends javax.swing.JFrame {

    public CreditCardValidation() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblISBN = new javax.swing.JLabel();
        lblCardNumber = new javax.swing.JLabel();
        txtISBN = new javax.swing.JTextField();
        txtCardNumber = new javax.swing.JTextField();
        btnVerifyCardNumber = new javax.swing.JButton();
        btnVerifyISBN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaResults = new javax.swing.JTextArea();
        lblResults = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblISBN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblISBN.setText("Verify ISBN");

        lblCardNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCardNumber.setText("Credit Card");

        btnVerifyCardNumber.setText("Verify");
        btnVerifyCardNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyCardNumberActionPerformed(evt);
            }
        });

        btnVerifyISBN.setText("Verify");
        btnVerifyISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyISBNActionPerformed(evt);
            }
        });

        txtaResults.setColumns(20);
        txtaResults.setRows(5);
        jScrollPane1.setViewportView(txtaResults);

        lblResults.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblResults.setText("Results");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblISBN)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerifyISBN))
                    .addComponent(lblResults, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCardNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCardNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerifyCardNumber)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerifyISBN)
                    .addComponent(lblISBN))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerifyCardNumber)
                    .addComponent(lblCardNumber))
                .addGap(22, 22, 22)
                .addComponent(lblResults)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerifyCardNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyCardNumberActionPerformed

        //Storing credit card numbers in an array.
        int[] digits = new int[16];
           
        //Getting user input
        String input = txtCardNumber.getText();
        
        //Putting user input into the array
        int index = 0;
        for (int i = 0; i < input.length(); i++) {
            //Checking if character is valid
            if (Character.isDigit(input.charAt(i))) {
                //Parseing integer from string and Adding digit to the array
                digits[index] = Integer.parseInt(String.valueOf(input.charAt(i)));
                index++;
            }
        }

        //If there arent 16 digits stored in the array then the number is invalid.
        if (index != 16) {
            txtaResults.append("Invalid Input\n");
            return;
        }

        //Verifying the creddit card number
        int sum = 0;
        for (int i = 0; i < digits.length; i = i + 2) {
            digits[i] = digits[i] * 2;
            if (digits[i] >= 10) {
                digits[i] = digits[i] - 9;
            }
        }

        
        //Summing the entire array
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }

        //If the remainder when divided by 10 is 0, then the number is valid.
        if (sum % 10 == 0) {
            txtaResults.append("Credit Card: " + input + " is valid.\n");
        }else{
            txtaResults.append("Credit Card: " + input + " is invalid.\n");
        } 
        
    }//GEN-LAST:event_btnVerifyCardNumberActionPerformed

    private void btnVerifyISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyISBNActionPerformed

        int[] digits = new int[10];

        String input;
        input = txtISBN.getText();

        if (input.length() == 10) {
            if (input.matches("[0-9]+")) {
                
                for (int i = 0; i < digits.length; i++) {
                    digits[i] = Integer.parseInt(String.valueOf(input.charAt(i)));
                }

                int i, s = 0, t = 0;
                for (i = 0; i < 10; i++) {
                    t += digits[i];
                    s += t;
                }
                
                if (s % 11 == 0) {
                    txtaResults.append("ISBN: " + input + " is valid.\n");
                    return;
                }
            }
        }
        
        txtaResults.append("ISBN: " + input + " is invalid.\n");
        
    }//GEN-LAST:event_btnVerifyISBNActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtaResults.setText(null);
    }//GEN-LAST:event_btnClearActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new CreditCardValidation().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnVerifyCardNumber;
    private javax.swing.JButton btnVerifyISBN;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCardNumber;
    private javax.swing.JLabel lblISBN;
    private javax.swing.JLabel lblResults;
    private javax.swing.JTextField txtCardNumber;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextArea txtaResults;
    // End of variables declaration//GEN-END:variables
}
