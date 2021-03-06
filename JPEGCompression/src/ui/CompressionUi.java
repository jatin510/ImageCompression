/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import testJava.JPEGCompressor;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author Jatin
 */
public class CompressionUi extends javax.swing.JFrame  {

    /**
     * Creates new form Compression
     */
    public CompressionUi() {
        initComponents();
    }
    
    /**data members
     * 
     * 
     */
    File originalImage,compressedImage;
    
    String str[] = new String[10];
    String imagePath,extension;
    int complete;
    float compressionFactor;
       
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        chooseFile = new javax.swing.JButton();
        txtCompressionFactor = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        Done = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Image Compression", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(51, 51, 255))); // NOI18N

        jLabel1.setText("Compression Factor");

        jLabel2.setText("Image Location");

        chooseFile.setText("Choose File");
        chooseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseFileActionPerformed(evt);
            }
        });

        txtCompressionFactor.setForeground(new java.awt.Color(153, 153, 153));
        txtCompressionFactor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCompressionFactor.setText("Enter value 0 to 1");
        txtCompressionFactor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCompressionFactorMouseClicked(evt);
            }
        });
        txtCompressionFactor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompressionFactorActionPerformed(evt);
            }
        });

        submit.setText("Done");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        Done.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Done.setForeground(new java.awt.Color(255, 0, 0));
        Done.setText("Done!!!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Done, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(txtCompressionFactor, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(submit)
                        .addGap(27, 27, 27)))
                .addComponent(chooseFile)
                .addGap(12, 12, 12))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(233, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseFile)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCompressionFactor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(submit)
                .addGap(18, 18, 18)
                .addComponent(Done)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(170, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCompressionFactorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompressionFactorActionPerformed

      
    }//GEN-LAST:event_txtCompressionFactorActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        
        //originalImage Path
        originalImage = new File(imagePath);
        
        //input compression Factor
        try{
             compressionFactor = Float.parseFloat(""+txtCompressionFactor.getText()+"");
        }
        catch(Exception e){
            
        }
        // String compressionFactor = txtCompressionFactor.getText();
        // System.out.println(compressionFactor);
         
         //System.out.println(this.str.length);
         
         //Object creation to call compressJPEGImage
         JPEGCompressor compressing =  new JPEGCompressor();
         
         //this.str = imagePath.split(".",-6);
         
         //finding extenstion of the file
         int i= imagePath.indexOf(".");
         if(i>0){
              extension = imagePath.substring(i+1);
         }
         
         //String buffer to make compressed file using copy
         StringBuffer sb = new StringBuffer(imagePath);
         sb.insert(i,"copy");
         
         //c
         compressedImage = new File(sb.toString());
         //System.out.println(sb);
         //compressedImage = new compressedImage(sb);
         //System.out.println(extension);
         /*
         for(String k:this.str){
             System.out.println(k);
         }
          */
         
          
          //System.out.println(imagePath);
          
          try{
          complete=compressing.compressJPEGImage(originalImage,compressedImage,compressionFactor,extension) ;
          }
          catch(Exception e)
          {
              e.printStackTrace();
          }
          
          System.out.println(complete);
        /* 
        try {
            compressing.compressJPEGImage(this.originalImage,this.compressedImage,compressionFactor);
        } catch (IOException e) {
            System.out.println("Exception" + e);
        }
         */
         
    }//GEN-LAST:event_submitActionPerformed

    private void chooseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseFileActionPerformed
        // TODO add your handling code here:
        /*
         Location location = new Location();
         location.setVisible(true);
         */
         JFileChooser chooser = new JFileChooser();
         chooser.showOpenDialog(null);
         originalImage = chooser.getSelectedFile();
         String path = originalImage.getAbsolutePath();
         jTextField1.setText(path);
         imagePath = path;
         
         /*
         System.out.println("location");
         this.str = path.split(".",0);
         
         
         for(String k:this.str){
             System.out.println(k);
         }
         */
         
    }//GEN-LAST:event_chooseFileActionPerformed

    private void txtCompressionFactorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCompressionFactorMouseClicked
        // TODO add your handling code here:
        txtCompressionFactor.selectAll();
    }//GEN-LAST:event_txtCompressionFactorMouseClicked

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
            java.util.logging.Logger.getLogger(CompressionUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompressionUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompressionUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompressionUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompressionUi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Done;
    private javax.swing.JButton chooseFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton submit;
    private javax.swing.JTextField txtCompressionFactor;
    // End of variables declaration//GEN-END:variables
}
