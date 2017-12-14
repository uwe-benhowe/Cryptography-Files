package practicals.RainbowTable;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;

import java.util.*;
import java.util.logging.*;

public class Interface extends javax.swing.JFrame {

    public static String rainbowtable = "Table.ser";

    public static FileOperations fileOp = new FileOperations();
    public RainbowTable table = fileOp.loadRainbowTable(rainbowtable);

    public Reduction reduce = new Reduction(table.alphabet, table.maxLength, table.chainLength);

    public Interface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnCrackHash = new javax.swing.JButton();
        lblResults = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        txtHashText = new javax.swing.JTextField();
        txtPlainText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        results = new javax.swing.JTextArea();
        lblHashText = new javax.swing.JLabel();
        btnHash = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        alphabetText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        chainLengthText = new javax.swing.JTextField();
        maxLengthText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        chainResults = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        clear1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rainbow Tables");

        btnCrackHash.setText("Crack Hash");
        btnCrackHash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrackHashActionPerformed(evt);
            }
        });

        lblResults.setText("Results");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearPasswordForm(evt);
            }
        });

        results.setColumns(20);
        results.setRows(5);
        jScrollPane1.setViewportView(results);

        lblHashText.setText("Hash");

        btnHash.setText("Hash");
        btnHash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHashActionPerformed(evt);
            }
        });

        jLabel1.setText("Plaintext");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPlainText, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtHashText, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCrackHash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHashText)
                            .addComponent(lblResults)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHash)
                            .addComponent(txtPlainText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHashText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHashText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrackHash))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResults)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Crack", jPanel1);

        jLabel4.setText("Enter Alphabet");

        jLabel5.setText("Max Password Length");

        jLabel6.setText("Length of Chain");

        jLabel7.setText("Results");

        chainResults.setColumns(20);
        chainResults.setRows(5);
        jScrollPane2.setViewportView(chainResults);

        jButton1.setText("Create Table");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateTable(evt);
            }
        });

        clear1.setText("Clear");
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearTableForm(evt);
            }
        });

        jButton2.setText("View Table Details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDetails(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(alphabetText, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(maxLengthText)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                            .addGap(41, 41, 41)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(chainLengthText)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(clear1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alphabetText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maxLengthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chainLengthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear1)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Make Table", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClearPasswordForm(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearPasswordForm
        txtPlainText.setText("");
        txtHashText.setText("");
        results.setText("");
    }//GEN-LAST:event_ClearPasswordForm

    private void btnCrackHashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrackHashActionPerformed
        HashMap pairs = table.getPairs();
        try {
            if (pairs.size() > 0) {
                String cypherText = txtHashText.getText();
                String result = "Not Found";
                Boolean found = false;

                int chainLength = table.chainLength;
                String rString;

                long timer = System.currentTimeMillis();
                
                //Hash last item in a chain  to check 
                Set last = pairs.keySet();
                Iterator iter = last.iterator();
                String test ,temp;
                while (iter.hasNext()) {
                    temp = (String) iter.next();
                    test = Sha1.SHA1(temp);
                    if (test.equals(cypherText)) {
                        result = temp;
                        found = true;
                        break;
                    }
                }

                // Checks everything after the last value in chain
                if (found == false) {
                    for (int i = chainLength - 1; i >= 0; i--) {
                        
                        //Using the reduction function object
                        rString = reduce.chainReduce(cypherText, i, chainLength);
                        
                        //Checking for key if exists
                        if (pairs.containsKey(rString)) {
                            String nextInChain = pairs.get(rString).toString();
                            
                            //Looping through chain length
                            for (int j = 0; j <= chainLength; j++) {
                                String hashed = Sha1.SHA1(nextInChain);
                                
                                //Checking if hash exists
                                if (hashed.equals(cypherText)) {
                                    result = nextInChain;
                                    i = 0;
                                    break;
                                    
                                } else {
                                    nextInChain = reduce.reduce(hashed, j);
                                }
                            }
                        }
                    }
                }

                timer = System.currentTimeMillis() - timer;
                String times = new SimpleDateFormat("mm:ss:SSS").format(new Date(timer));

                results.setText("Hash:    " + cypherText + "\nDecryped: " + result + "\nRun Time:   "
                        + times + "\nAlphabet: " + table.alphabet + "\nMax password legnth: " + table.maxLength);
                
            } else {
                results.setText("No Table on file. Please create table.");
            }
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCrackHashActionPerformed

    private void ClearTableForm(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearTableForm
        alphabetText.setText("");
        maxLengthText.setText("");
        chainLengthText.setText("");
        chainResults.setText("");
    }//GEN-LAST:event_ClearTableForm

    private void CreateTable(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateTable
        String alphabet = alphabetText.getText();
        char[] chars = alphabet.toCharArray();
        Set<Character> charSet = new LinkedHashSet<>();
        
        for (char c : chars) {
            charSet.add(c);
        }
        
        StringBuilder sb = new StringBuilder();
        charSet.forEach((character) -> {
            sb.append(character);
        });
        
        alphabet = sb.toString();

        //Getting values
        String chainLengthString = chainLengthText.getText();
        String maxLengthString = maxLengthText.getText();

        //Checking for verification checks and valdidation
        if ((alphabet.equals(""))
                || (chainLengthString.equals(""))
                || (maxLengthString.equals(""))) {
            
            chainResults.setText("Please enter all the fields");
            
            //Sretting timer and other varaibles
        } else {
            long timer = System.currentTimeMillis();
            int chainLength = Integer.parseInt(chainLengthString);
            int maxLength = Integer.parseInt(maxLengthString);
            
            try {
                reduce = new Reduction(alphabet, maxLength, chainLength);
                TableGenerator tableManager = new TableGenerator(reduce);
                table.setPairs(tableManager.createMap(maxLength, chainLength));
                table.setAlphabet(alphabet);
                table.setMaxLength(maxLength);
                table.setChainLength(chainLength);
                FileOperations.saveToFile(table, rainbowtable);

            } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }
      
            timer = System.currentTimeMillis() - timer;
            String times = new SimpleDateFormat("mm:ss:SSS").format(new Date(timer));
            chainResults.setText("Table created.\nRun Time:   " + times);
        }
    }//GEN-LAST:event_CreateTable

    private void ViewDetails(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDetails
        chainResults.setText("Alphabet: " + table.alphabet
                + "\nMax password legnth: "+ table.maxLength 
                + "\nLength of chains: " + table.chainLength
                + "\nNumber of chains: " + table.pairs.size()); 
    }//GEN-LAST:event_ViewDetails

    private void btnHashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHashActionPerformed
        String s = txtPlainText.getText();
        String hashed = "Error";
        if (s.length() <= table.maxLength) {
            try {
                hashed = Sha1.SHA1(s);
            } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
                System.out.println(ex);
            }
            txtHashText.setText(hashed);
        } else {
            results.setText("Does not match table settings, password length is wrong");
        }
    }//GEN-LAST:event_btnHashActionPerformed


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }

        FileOperations.fileExists(rainbowtable);

        java.awt.EventQueue.invokeLater(() -> {
            new Interface().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alphabetText;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCrackHash;
    private javax.swing.JButton btnHash;
    private javax.swing.JTextField chainLengthText;
    private javax.swing.JTextArea chainResults;
    private javax.swing.JButton clear1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblHashText;
    private javax.swing.JLabel lblResults;
    private javax.swing.JTextField maxLengthText;
    private javax.swing.JTextArea results;
    private javax.swing.JTextField txtHashText;
    private javax.swing.JTextField txtPlainText;
    // End of variables declaration//GEN-END:variables
}
