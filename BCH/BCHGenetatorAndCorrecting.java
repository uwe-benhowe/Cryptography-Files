package practicals.BCH;

public class BCHGenetatorAndCorrecting extends javax.swing.JFrame {

    public BCHGenetatorAndCorrecting() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtInput = new javax.swing.JTextField();
        btnVerify = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaResults = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        txtGenerate = new javax.swing.JTextField();
        btnGenerate = new javax.swing.JButton();
        lblGenerate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVerify.setText("Verify");
        btnVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyActionPerformed(evt);
            }
        });

        txtaResults.setColumns(20);
        txtaResults.setRows(5);
        jScrollPane1.setViewportView(txtaResults);

        jLabel1.setText("BCH(10, 6)");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnGenerate.setText("Generate");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        lblGenerate.setText("Generate four check digits");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtInput)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerify))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtGenerate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGenerate))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGenerate)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGenerate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerify))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyActionPerformed
        //Input String
        String input = txtInput.getText();
        int[] digits = new int[10];

        //Validation checking
        if (input.length() == 10) {
            if (input.matches("[0-9]+")) {
                //Storing input string in an array
                for (int i = 0; i < digits.length; i++) {
                    digits[i] = Character.getNumericValue(input.charAt(i));
                }
            }
        }

        //Show the input in the output
        txtaResults.append("Input: " + input + "\n");

        //Performing the BCH(10, 6) on the string and storing sydromes as a string
        int[] s = bch10(digits);
        String syndromes = s[0] + ", " + s[1] + ", " + s[2] + ", " + s[3];

        //Loop through array to check if any values are 0
        //If all syndromes are 0 then no error
        boolean error = false;
        for (int i : s) {error = (i != 0);}

        //If there is an error...
        if (error) {
            //Output the syndromes
            txtaResults.append("Syndromes: " + syndromes + "\n");

            //Work out p, q and r. ensuring to mod
            int p = mod((s[1] * s[1]) - (s[0] * s[2]));
            int q = mod((s[0] * s[3]) - (s[1] * s[2]));
            int r = mod((s[2] * s[2]) - (s[1] * s[3]));

            //If p, q, r are all 0 then one error exists
            if (p == 0 && q == 0 && r == 0) {
                //One Error
                int errorPos = s[1] / s[0]; //Error position
                int magnitude = s[0]; //Magnitude

                //Show the error position and magnitude to user
                txtaResults.append("Position: " + errorPos + "\n");
                txtaResults.append("Magnitude: " + magnitude + "\n");

                //Error pos cant be 0
                if (errorPos == 0) {
                    txtaResults.append("More than two errors" + "\n\n");
                    return;
                }

                //Correcting the error
                digits[errorPos - 1] = mod(digits[errorPos - 1]) - mod(magnitude);

                //Outputing the corrected error
                txtaResults.append("Single Error: " + atos(digits) + "\n\n");

            } else {
                //Two Errors
                
                //Showing pqr to user
                txtaResults.append("PQR: " + p + ", " + q + ", " + r + "\n");

                //Working out Positions
                int i = quadratic(p, q, r, "plus");
                int j = quadratic(p, q, r, "minus");

                //If positions are 0 or are the same then there are more than two errors
                if (i == 0 || j == 0 || i == j) {
                    txtaResults.append("More than two errors" + "\n\n");
                    return; //Stop running
                }

                //Showing the positions
                txtaResults.append("Positions: " + i + ", " + j + "\n");

                //Working out Magnitudes
                int b = modFraction((i * s[0] - s[1]), (i - j));
                int a = mod(s[0] - b);

                //Showing the magnitudes
                txtaResults.append("Magnitudes: " + a + ", " + b + "\n");

                //Replacing digits. (-1 as array starts from 0)
                int newNum1 = mod(digits[i - 1] + (mod(-a)));
                int newNum2 = mod(digits[j - 1] + (mod(-b)));

                //If any of the corrected numbers are 10 then there are more than two erros
                if (newNum1 == 10 || newNum2 == 10) {
                    txtaResults.append("More than two errors" + "\n\n");
                    return;
                } else {
                    //Otherwise correct the errors.
                    digits[i - 1] = newNum1;
                    digits[j - 1] = newNum2;
                }

                //Output the corrected error
                txtaResults.append("Double Error: " + atos(digits) + "\n\n");
            }
        } else {
            //No errors, so just print out origonal message
            txtaResults.append("No Error" + "\n\n");
        }
    }//GEN-LAST:event_btnVerifyActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtaResults.setText(null);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
       
        int[] digits = new int[6];
        String input = txtGenerate.getText();
        for (int i = 0, j = 0; i < input.length() && j < digits.length; i++, j++) {
            if (Character.isDigit(input.charAt(i))) {
                digits[j] = Integer.parseInt(String.valueOf(input.charAt(i)));
            }
        }
        
        if (generateBch(digits) == null) {
            txtInput.setText("Invalid");
        }else{
            txtInput.setText(atos(digits) + generateBch(digits));
        }


    }//GEN-LAST:event_btnGenerateActionPerformed

    //Takes array of any length and outputs it in string format
    public static String atos(int[] a) {
        StringBuilder builder = new StringBuilder();
        for (int value : a) {
            builder.append(value);
        }
        String text = builder.toString();
        return text;
    }

    //Calculating the syndromes
    public static int[] bch10(int[] d) {
        int s1 = (d[0] + d[1] + d[2] + d[3] + d[4] + d[5] + d[6] + d[7] + d[8] + d[9]) % 11;
        int s2 = (d[0] + 2 * d[1] + 3 * d[2] + 4 * d[3] + 5 * d[4] + 6 * d[5] + 7 * d[6] + 8 * d[7] + 9 * d[8] + 10 * d[9]) % 11;
        int s3 = (d[0] + 4 * d[1] + 9 * d[2] + 5 * d[3] + 3 * d[4] + 3 * d[5] + 5 * d[6] + 9 * d[7] + 4 * d[8] + d[9]) % 11;
        int s4 = (d[0] + 8 * d[1] + 5 * d[2] + 9 * d[3] + 4 * d[4] + 7 * d[5] + 2 * d[6] + 6 * d[7] + 3 * d[8] + 10 * d[9]) % 11;
        int[] out = {s1, s2, s3, s4};
        return out;
    }
    
    public static String generateBch(int[] d) {

        int d7 = (4 * d[0] + 10 * d[1] + 9 * d[2] + 2 * d[3] + d[4] + 7 * d[5]) % 11;
        int d8 = (7 * d[0] + 8 * d[1] + 7 * d[2] + d[3] + 9 * d[4] + 6 * d[5]) % 11;
        int d9 = (9 * d[0] + d[1] + 7 * d[2] + 8 * d[3] + 7 * d[4] + 7 * d[5]) % 11;
        int d10 = (d[0] + 2 * d[1] + 9 * d[2] + 10 * d[3] + 4 * d[4] + d[5]) % 11;

        if (d7 == 10 || d8 == 10 || d9 == 10 || d10 == 10) {
            return null;
        } else {
            return Integer.toString(d7) + Integer.toString(d8) + Integer.toString(d9) + Integer.toString(d10);
        }
    }

    //Working out the quadratic part of the equation to solve for two errors.
    public static int quadratic(int p, int q, int r, String flag) {
        int root = mod((q * q) - (4 * p * r));

        //Square root doesnt exist
        if (root < 0) {
            return 0;
        }

        int rooty = modSquareRoot(root);

        if (rooty == 0) {
            rooty = (int) Math.sqrt(root);
        }

        int numerator = 0;
        switch (flag) {
            case "plus":
                numerator = mod(-q + rooty);
                break;
            case "minus":
                numerator = mod(-q - rooty);
                break;
        }

        int denominator = mod(2 * p);

        if (denominator == 0) {
            //Divide by 0 error
            return 0;
        }

        return modFraction(numerator, denominator);
    }

    //Takes in a numerator value and denomentor value and mods it
    public static int modFraction(int n, int d) {
        return mod(mod(n) * mod(inverseMod(d)));
    }

    //Modulos a number until it can not be moded anymore
    //Works for negatives also
    public static int mod(int num) {
        while (num < 0) {
            num += 11;
        }

        if (num > 11) {
            return mod(num % 11);
        }
        return num;
    }

    //Works out the inveres of a mod e.g 1/9 mod 11
    public static int inverseMod(int x) {
        x = mod(x);
        int q = x;
        while (q % 11 != 1) {
            q += x;
        }
        return q / x;
    }

    //Works out the square root of a mod e.g. 9^1/2 mod 11
    public static int modSquareRoot(int root) {
        int x = 0;
        while (((x * x) % 11) != root && x < 11) {
            x++;
        }
        return mod(x);
    }

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
            java.util.logging.Logger.getLogger(BCHGenetatorAndCorrecting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BCHGenetatorAndCorrecting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BCHGenetatorAndCorrecting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BCHGenetatorAndCorrecting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new BCHGenetatorAndCorrecting().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JButton btnVerify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGenerate;
    private javax.swing.JTextField txtGenerate;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextArea txtaResults;
    // End of variables declaration//GEN-END:variables
}
