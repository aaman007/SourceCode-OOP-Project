/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codehub1.pkg0;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Aaman
 */
public class BasicAlgorithms extends javax.swing.JFrame {

    /**
     * Creates new form BasicAlgorithms
     */
    public BasicAlgorithms() {
        initComponents();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        binarySearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        bisection = new javax.swing.JButton();
        linear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        binarySearch.setBackground(new java.awt.Color(0, 102, 153));
        binarySearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        binarySearch.setForeground(new java.awt.Color(255, 255, 255));
        binarySearch.setText("Binary Search");
        binarySearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binarySearchActionPerformed(evt);
            }
        });

        output.setEditable(false);
        output.setBackground(new java.awt.Color(0, 0, 0));
        output.setColumns(20);
        output.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        output.setForeground(new java.awt.Color(255, 255, 255));
        output.setRows(5);
        output.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(output);

        bisection.setBackground(new java.awt.Color(0, 102, 153));
        bisection.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bisection.setForeground(new java.awt.Color(255, 255, 255));
        bisection.setText("Binary Search Bisection");
        bisection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bisectionActionPerformed(evt);
            }
        });

        linear.setBackground(new java.awt.Color(0, 102, 153));
        linear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        linear.setForeground(new java.awt.Color(255, 255, 255));
        linear.setText("Linear Search");
        linear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linearActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 51, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Basic Algorithm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bisection, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(binarySearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(linear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(binarySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bisection, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(linear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new FrontPage().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void binarySearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binarySearchActionPerformed
        // TODO add your handling code here:
        output.setText("#include<bits/stdc++.h>\n" +
"using namespace std;\n" +
"int *a;\n" +
"int binary_search(int start,int endd,int key)\n" +
"{\n" +
"    int mid = (start+endd)/2;\n" +
"    if(a[mid]==key)\n" +
"        return mid+1;\n" +
"    else\n" +
"    {\n" +
"        if(start>=endd)\n" +
"            return 0;\n" +
"        else if(key<a[mid])\n" +
"            binary_search(start,mid-1,key);\n" +
"        else if(key>a[mid])\n" +
"            binary_search(mid+1,endd,key);\n" +
"    }\n" +
"}\n" +
"int main()\n" +
"{\n" +
"    cout << \"How many elements is in the Array?????????\\n\";\n" +
"    int n;\n" +
"    cin >> n;\n" +
" \n" +
"    a = new int[n];\n" +
"    cout << \"Enter the elements\"<< endl;\n" +
"    for(int i=0;i<n;i++)\n" +
"        cin >> a[i];\n" +
"    sort(a,a+n);\n" +
"    cout << \"\\nElements in ascending order\\n\";\n" +
"    for(int i=0;i<n;i++)\n" +
"        cout << a[i] << \" \";\n" +
"    cout << endl;\n" +
" \n" +
"    int k;\n" +
"    cout << \"\\nWhich number you wanna search?????????\\n\";\n" +
"    cin >> k;\n" +
" \n" +
"    int res = binary_search(0,n-1,k);\n" +
" \n" +
"    if(res)\n" +
"        cout << \"\\nFound at Position \" << res << endl;\n" +
"    else\n" +
"        cout << \"\\nValue not found!!!!!!!!\" << endl;\n" +
" \n" +
"     delete[] a;\n" +
"}");

    // set the content of file in text area
    }//GEN-LAST:event_binarySearchActionPerformed

    private void bisectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bisectionActionPerformed
        // TODO add your handling code here:
        output.setText("Code for finding square root of a number :\n\n"
                + "#include<bits/stdc++.h>\n" +
"using namespace std;\n" +
"double Sqrt(int n)\n" +
"{\n" +
"    double high = (double)n , low = 0.0 , mid;\n" +
"    while(high-low > 0.000001)\n" +
"    {\n" +
"        mid = (high+low)/2.0;\n" +
"        if(mid*mid > n)\n" +
"            high = mid;\n" +
"        else if(mid*mid < n)\n" +
"            low = mid;\n" +
"    }\n" +
"    return mid;\n" +
"}\n" +
"int main()\n" +
"{\n" +
"    int n;\n" +
"    cin >> n;\n" +
"    cout << Sqrt(n) << endl;\n" +
"}");
    }//GEN-LAST:event_bisectionActionPerformed

    private void linearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linearActionPerformed
        // TODO add your handling code here:
        output.setText("#include<bits/stdc++.h>\n" +
"using namespace std;\n" +
"int main()\n" +
"{\n" +
"    int ara[100],n,i,key,cas=1;\n" +
"    while(cin >> n)\n" +
"    {\n" +
"        for(i=0; i<n; i++)\n" +
"            scanf(\"%d\",&ara[i]);\n" +
" \n" +
"        cin >> key;\n" +
" \n" +
"        for(i=0; i<n; i++)\n" +
"        {\n" +
"            if(ara[i]==key)\n" +
"                break;\n" +
"        }\n" +
"        printf(\"Case %d: \",cas);\n" +
"        cas++;\n" +
"        if(i==n)\n" +
"            cout << \"Not Found!!\\n\";\n" +
"        else\n" +
"            cout << \"Found at : \" << i+1 << endl;;\n" +
"    }\n" +
"    return 0;\n" +
"}");
    }//GEN-LAST:event_linearActionPerformed

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
            java.util.logging.Logger.getLogger(BasicAlgorithms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BasicAlgorithms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BasicAlgorithms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BasicAlgorithms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasicAlgorithms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton binarySearch;
    private javax.swing.JButton bisection;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton linear;
    private javax.swing.JTextArea output;
    // End of variables declaration//GEN-END:variables
}
