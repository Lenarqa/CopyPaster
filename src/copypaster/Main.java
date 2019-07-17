/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copypaster;


import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author lenar
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() throws IOException {
        initComponents();
        this.setTitle("CopyPasterByLenarqa");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("mainIcon.png")));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ReadFromTextFileBtn = new javax.swing.JButton();
        WayToFile = new javax.swing.JButton();
        comand1 = new javax.swing.JButton();
        comand2 = new javax.swing.JButton();
        comand3 = new javax.swing.JButton();
        comand4 = new javax.swing.JButton();
        comand5 = new javax.swing.JButton();
        comand6 = new javax.swing.JButton();
        comand7 = new javax.swing.JButton();
        comand8 = new javax.swing.JButton();
        comand9 = new javax.swing.JButton();
        comment1 = new javax.swing.JTextField();
        comment2 = new javax.swing.JTextField();
        comment3 = new javax.swing.JTextField();
        comment4 = new javax.swing.JTextField();
        comment5 = new javax.swing.JTextField();
        comment6 = new javax.swing.JTextField();
        comment7 = new javax.swing.JTextField();
        comment8 = new javax.swing.JTextField();
        comment9 = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        FileName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ReadFromTextFileBtn.setText("Считать из текстового файла");
        ReadFromTextFileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReadFromTextFileBtnActionPerformed(evt);
            }
        });

        WayToFile.setText("Путь");
        WayToFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WayToFileActionPerformed(evt);
            }
        });

        comand1.setText("1");
        comand1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comand1ActionPerformed(evt);
            }
        });

        comand2.setText("2");
        comand2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comand2ActionPerformed(evt);
            }
        });

        comand3.setText("3");
        comand3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comand3ActionPerformed(evt);
            }
        });

        comand4.setText("4");
        comand4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comand4ActionPerformed(evt);
            }
        });

        comand5.setText("5");
        comand5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comand5ActionPerformed(evt);
            }
        });

        comand6.setText("6");
        comand6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comand6ActionPerformed(evt);
            }
        });

        comand7.setText("7");
        comand7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comand7ActionPerformed(evt);
            }
        });

        comand8.setText("8");
        comand8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comand8ActionPerformed(evt);
            }
        });

        comand9.setText("9");
        comand9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comand9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(FileName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WayToFile, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(comand9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comment9, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(comand2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comment2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(comand1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comment1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comand4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comand3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comment4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comment3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comand8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comand7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comand6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comand5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comment6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comment5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comment8, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comment7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ReadFromTextFileBtn)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WayToFile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReadFromTextFileBtn)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comand1)
                                    .addComponent(comment1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comand2))
                            .addComponent(comment2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comand3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comand4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(comment3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addComponent(comment4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(comand5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comand6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comand7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comand8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(comment5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
                            .addComponent(comment6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(comment7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addComponent(comment8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comand9)
                    .addComponent(comment9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReadFromTextFileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReadFromTextFileBtnActionPerformed

        try {
            ReadFromTextFile();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        comment1.setText(linesAsArray[0]);
        comment2.setText(linesAsArray[1]);
        comment3.setText(linesAsArray[2]);
        comment4.setText(linesAsArray[3]);
        comment5.setText(linesAsArray[4]);
        comment6.setText(linesAsArray[5]);
        comment7.setText(linesAsArray[6]);
        comment8.setText(linesAsArray[7]);
        comment9.setText(linesAsArray[8]);
        
    }//GEN-LAST:event_ReadFromTextFileBtnActionPerformed

    private void comand1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comand1ActionPerformed
         CopyInBufer(linesAsArray[0]);   
    }//GEN-LAST:event_comand1ActionPerformed
  
    private void comand5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comand5ActionPerformed
        CopyInBufer(linesAsArray[4]);
    }//GEN-LAST:event_comand5ActionPerformed

    private void comand3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comand3ActionPerformed
         CopyInBufer(linesAsArray[2]);
    }//GEN-LAST:event_comand3ActionPerformed

    private void comand2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comand2ActionPerformed
         CopyInBufer(linesAsArray[1]);
    }//GEN-LAST:event_comand2ActionPerformed

    private void comand4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comand4ActionPerformed
        CopyInBufer(linesAsArray[3]);
    }//GEN-LAST:event_comand4ActionPerformed

    private void comand6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comand6ActionPerformed
        CopyInBufer(linesAsArray[5]);
    }//GEN-LAST:event_comand6ActionPerformed

    private void comand7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comand7ActionPerformed
        CopyInBufer(linesAsArray[6]);
    }//GEN-LAST:event_comand7ActionPerformed

    private void comand8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comand8ActionPerformed
        CopyInBufer(linesAsArray[7]);
    }//GEN-LAST:event_comand8ActionPerformed

    private void comand9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comand9ActionPerformed
        CopyInBufer(linesAsArray[8]);
    }//GEN-LAST:event_comand9ActionPerformed

    private void WayToFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WayToFileActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String fileName = f.getAbsolutePath();
        FileName.setText(fileName);
        wayToTextFile = fileName;   
    }//GEN-LAST:event_WayToFileActionPerformed

    public void CopyInBufer(String massage){
        Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection msg = new StringSelection(massage);
        cb.setContents(msg, null);
    }
    
    public void ReadFromTextFile() throws FileNotFoundException, IOException{
        
        BufferedReader reader = new BufferedReader(new FileReader(wayToTextFile));
        String line;
        
        List<String> lines = new ArrayList<String>();
        
        for (int i = 0; i < 9; i++) {
            line = reader.readLine();
            lines.add(line);
        }
        
        //если нужен массив то список можно запросто преобрпзовать
        linesAsArray = lines.toArray(new String[9]);
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Main().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private String wayToTextFile;
    private String [] linesAsArray;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FileName;
    private javax.swing.JButton ReadFromTextFileBtn;
    private javax.swing.JButton WayToFile;
    private javax.swing.JButton comand1;
    private javax.swing.JButton comand2;
    private javax.swing.JButton comand3;
    private javax.swing.JButton comand4;
    private javax.swing.JButton comand5;
    private javax.swing.JButton comand6;
    private javax.swing.JButton comand7;
    private javax.swing.JButton comand8;
    private javax.swing.JButton comand9;
    private javax.swing.JTextField comment1;
    private javax.swing.JTextField comment2;
    private javax.swing.JTextField comment3;
    private javax.swing.JTextField comment4;
    private javax.swing.JTextField comment5;
    private javax.swing.JTextField comment6;
    private javax.swing.JTextField comment7;
    private javax.swing.JTextField comment8;
    private javax.swing.JTextField comment9;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
