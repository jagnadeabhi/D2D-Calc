/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhi
 */
public class vatcalc extends javax.swing.JFrame {

    /**
     * Creates new form vatcalc
     */
    public vatcalc() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 220));
        setName("f4"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("D2D Calc..");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        l1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 0, 0));
        l1.setText("Enter Amount :");
        l1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        l2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 0, 0));
        l2.setText("VAT Rate :");
        l2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        tf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf1KeyTyped(evt);
            }
        });

        tf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf2ActionPerformed(evt);
            }
        });
        tf2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf2KeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("VAT/GST :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Gross Amount :");

        b1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b1.setText("Calculate");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        b1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b1KeyPressed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b2.setText("Reset");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        b2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b2KeyPressed(evt);
            }
        });

        jMenuBar1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 153)));

        jMenu1.setText("Menu");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_SPACE, 0));
        jMenuItem1.setText("Previous");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(l1)
                            .addComponent(l2)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf1)
                            .addComponent(tf2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l5)
                                    .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(31, 31, 31)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l1)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l2)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1)
                    .addComponent(b2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(l4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(l5))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     
        
        //previous
        
        new f2().setVisible(true);
 
        this.setVisible(false);
        
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        //Exit
        
        this.dispose();
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        //calculate

        if((tf1.getText()).equals("")||(tf2.getText()).equals(""))
        {
        
        l4.setText("Null");
        l5.setText("Null");
        tf1.setText("");
        tf2.setText("");
        tf1.requestFocus();
        }
        else
        {
        Double a=Double.parseDouble(tf1.getText()); //Amount
        Double b=Double.parseDouble(tf2.getText()); //VAT Rate
        
        //calculation
        Double c=a/100.0; 
        Double d=c*b;
        Double e=d+a;

//alocating part
        
        
        l4.setText(String.valueOf(d)); //VAT/GST
        
        l5.setText(String.valueOf(e));//Gross Amount
        
        }
        
        
        
        
        
        
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        //Clear
        
        tf1.setText("");
        tf2.setText("");
        l4.setText("");
        l5.setText("");
        
        tf1.requestFocus();
    }//GEN-LAST:event_b2ActionPerformed

    private void tf1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyTyped
        // TODO add your handling code here:
           char caracter = evt.getKeyChar();
 
        int j=0;
        
    if(caracter=='a'||caracter=='b'||caracter=='c'||caracter=='d'||caracter=='e'||caracter=='f'||caracter=='g'||caracter=='h'||caracter=='i'||caracter=='j'||caracter=='k'||caracter=='l'||caracter=='m'||caracter=='n'||caracter=='o'||caracter=='p'||caracter=='q'||caracter=='r'||caracter=='s'||caracter=='t'||caracter=='u'||caracter=='v'||caracter=='w'||caracter=='x'||caracter=='y'||caracter=='z'||caracter=='`'||caracter=='~'||caracter=='!'||caracter=='@'||caracter=='#'||caracter=='$'||caracter=='%'||caracter=='^'||caracter=='&'||caracter=='*'||caracter=='-'||caracter=='_'||caracter=='='||caracter=='+'||caracter=='|'||caracter=='"'||caracter==';'||caracter==':'||caracter=='?'||caracter=='/'||caracter=='>'||caracter=='<'||caracter==','||caracter==')'||caracter=='A'||caracter=='B'||caracter=='C'||caracter=='D'||caracter=='E'||caracter=='F'||caracter=='G'||caracter=='H'||caracter=='I'||caracter=='J'||caracter=='K'||caracter=='L'||caracter=='M'||caracter=='N'||caracter=='O'||caracter=='P'||caracter=='Q'||caracter=='R'||caracter=='S'||caracter=='T'||caracter=='U'||caracter=='V'||caracter=='W'||caracter=='X'||caracter=='Y'||caracter=='Z')
    {
    
        evt.consume();
    }
    
        
        if((tf1.getText().equals(""))&&(caracter=='.'))
                {
               tf1.setText("0");
               tf1.requestFocus();
                
                }
        
        if(!(tf1.getText()).equals(""))
        {
      
        
            String s=tf1.getText();
            
            int l=s.length();
            
          for(int i=0;i<l;i++)
            {
            
            if(s.charAt(i)=='.')
            {
               j=1;  
           
            }
           
            
            
            }
 if(j==1 && caracter=='.')
 {
 
                 evt.consume();
 
 }
 else if (((caracter < '0') || (caracter > '9'))
                        &&(caracter != '\b')&&(caracter != '.')) 
              {
                   
                    evt.consume();
                    
                 
                }
  

    }//GEN-LAST:event_tf1KeyTyped
    }
    private void tf2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf2KeyTyped
        // TODO add your handling code here:
        
           char caracter = evt.getKeyChar();
 
        int j=0;
        
    if(caracter=='a'||caracter=='b'||caracter=='c'||caracter=='d'||caracter=='e'||caracter=='f'||caracter=='g'||caracter=='h'||caracter=='i'||caracter=='j'||caracter=='k'||caracter=='l'||caracter=='m'||caracter=='n'||caracter=='o'||caracter=='p'||caracter=='q'||caracter=='r'||caracter=='s'||caracter=='t'||caracter=='u'||caracter=='v'||caracter=='w'||caracter=='x'||caracter=='y'||caracter=='z'||caracter=='`'||caracter=='~'||caracter=='!'||caracter=='@'||caracter=='#'||caracter=='$'||caracter=='%'||caracter=='^'||caracter=='&'||caracter=='*'||caracter=='-'||caracter=='_'||caracter=='='||caracter=='+'||caracter=='|'||caracter=='"'||caracter==';'||caracter==':'||caracter=='?'||caracter=='/'||caracter=='>'||caracter=='<'||caracter==','||caracter==')'||caracter=='A'||caracter=='B'||caracter=='C'||caracter=='D'||caracter=='E'||caracter=='F'||caracter=='G'||caracter=='H'||caracter=='I'||caracter=='J'||caracter=='K'||caracter=='L'||caracter=='M'||caracter=='N'||caracter=='O'||caracter=='P'||caracter=='Q'||caracter=='R'||caracter=='S'||caracter=='T'||caracter=='U'||caracter=='V'||caracter=='W'||caracter=='X'||caracter=='Y'||caracter=='Z')
    {
    
        evt.consume();
    }
    
        
        if((tf2.getText().equals(""))&&(caracter=='.'))
                {
               tf2.setText("0");
               tf2.requestFocus();
                
                }
        
        if(!(tf2.getText()).equals(""))
        {
      
        
            String s=tf2.getText();
            
            int l=s.length();
            
          for(int i=0;i<l;i++)
            {
            
            if(s.charAt(i)=='.')
            {
               j=1;  
           
            }
           
            
            
            }
 if(j==1 && caracter=='.')
 {
 
                 evt.consume();
 
 }
 else if (((caracter < '0') || (caracter > '9'))
                        &&(caracter != '\b')&&(caracter != '.')) 
              {
                   
                    evt.consume();
                    
                 
              }
  

    }//GEN-LAST:event_tf2KeyTyped
    }
    private void b1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b1KeyPressed
       if(evt.getKeyCode()==evt.VK_ENTER)
       {
           
            if((tf1.getText()).equals("")||(tf2.getText()).equals(""))
        {
        
        l4.setText("Null");
        l5.setText("Null");
        tf1.setText("");
        tf2.setText("");
        tf1.requestFocus();
        }
        else
        {
        Double a=Double.parseDouble(tf1.getText()); //Amount
        Double b=Double.parseDouble(tf2.getText()); //VAT Rate
        
        //calculation
        Double c=a/100.0; 
        Double d=c*b;
        Double e=d+a;

//alocating part
        
        
        l4.setText(String.valueOf(d)); //VAT/GST
        
        l5.setText(String.valueOf(e));//Gross Amount
        
        }   
           
       }  
           
           
       
    }//GEN-LAST:event_b1KeyPressed

    private void b2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b2KeyPressed
if(evt.getKeyCode()==evt.VK_ENTER)
{

 tf1.setText("");
        tf2.setText("");
        l4.setText("");
        l5.setText("");
        
        tf1.requestFocus();


}// TODO add your handling code here:
    }//GEN-LAST:event_b2KeyPressed

    
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
            java.util.logging.Logger.getLogger(vatcalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vatcalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vatcalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vatcalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vatcalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    // End of variables declaration//GEN-END:variables
}