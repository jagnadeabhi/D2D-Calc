/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhi
 */
public class pon extends javax.swing.JFrame {

    /**
     * Creates new form pon
     */
    public pon() {
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
        tf1 = new javax.swing.JTextField();
        l1 = new javax.swing.JLabel();
        square = new javax.swing.JButton();
        cube = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        l2 = new javax.swing.JLabel();
        other = new javax.swing.JButton();
        tf2 = new javax.swing.JTextField();
        b = new javax.swing.JButton();
        l3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        l4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 220));
        setUndecorated(true);

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

        l1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        l1.setText("Enter Number :");

        square.setText("Square");
        square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareActionPerformed(evt);
            }
        });
        square.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                squareKeyPressed(evt);
            }
        });

        cube.setText("Cube");
        cube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cubeActionPerformed(evt);
            }
        });
        cube.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cubeKeyPressed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 102));

        l2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        l2.setText("Enter Power :");

        other.setText("Other");
        other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherActionPerformed(evt);
            }
        });

        tf2.setEnabled(false);
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

        b.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b.setText("-->");
        b.setEnabled(false);
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        l3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        l3.setText("Result :");

        jSeparator2.setForeground(new java.awt.Color(255, 255, 102));

        l4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jSeparator3.setForeground(new java.awt.Color(255, 255, 102));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 102)));

        jMenu1.setText("Menu");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(other)
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(b)
                        .addGap(100, 100, 100))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(l3)
                            .addComponent(l1)
                            .addComponent(l2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(square)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(cube, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf1)
                            .addComponent(tf2, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(l4))
                        .addGap(0, 27, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l1)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(square)
                    .addComponent(cube))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(other)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l2)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l3)
                    .addComponent(l4))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:

            new f2().setVisible(true);
            this.dispose();



    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        
        this.dispose();
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf2ActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
if(tf2.getText().equals(""))
        {
        l4.setText("Wrong Enter ");
        tf2.requestFocus();
        }
else
{

Double x=Double.parseDouble(tf1.getText());
Double y=Double.parseDouble(tf2.getText());
Double z=x;

for(int i=1;i<y;i++ )
{

    if(i==1)
    {
        z=x*x;
    }
    else
    {
    
    z=z*x;
    
    }



}
        l4.setText(String.valueOf(z));
}
        

    }//GEN-LAST:event_bActionPerformed

    private void tf1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyTyped
        
        
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
        }
    }//GEN-LAST:event_tf1KeyTyped

    private void tf2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf2KeyTyped
        
        
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
                b.setEnabled(true);
        }
        
    }//GEN-LAST:event_tf2KeyTyped

    private void squareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareActionPerformed

        if(tf1.getText().equals(""))
        {
            l4.setText("Wrong Enter ");
            tf1.requestFocus();
        }
      else
        {
            tf2.setEnabled(false);
            tf2.setText("");
            b.setEnabled(false);
            
            Double a=Double.parseDouble(tf1.getText());
            l4.setText(String.valueOf(a*a));
        }

    }//GEN-LAST:event_squareActionPerformed

    private void cubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cubeActionPerformed
        
        if(tf1.getText().equals(""))
        {
            l4.setText("Wrong Enter ");
            tf1.requestFocus();
        }
        else
        {
            
            tf2.setEnabled(false);
            tf2.setText("");
            b.setEnabled(false);
            
            Double b=Double.parseDouble(tf1.getText());
            l4.setText(String.valueOf(b*b*b));
        }
        
    }//GEN-LAST:event_cubeActionPerformed

    private void otherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherActionPerformed
       
       
        if(tf1.getText().equals(""))
        {
            l4.setText("Wrong Enter ");
            tf1.requestFocus();
        }
        else
        {
            tf2.setText("");
            l4.setText("");
            tf2.setEnabled(true);
            tf2.requestFocus();
        }
        
    }//GEN-LAST:event_otherActionPerformed

    private void squareKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_squareKeyPressed
if(evt.getKeyCode()==evt.VK_ENTER) 
{



if(tf1.getText().equals(""))
        {
            l4.setText("Wrong Enter ");
            tf1.requestFocus();
        }
      else
        {
            tf2.setEnabled(false);
            tf2.setText("");
            b.setEnabled(false);
            
            Double a=Double.parseDouble(tf1.getText());
            l4.setText(String.valueOf(a*a));
        }

}// TODO add your handling code here:
    }//GEN-LAST:event_squareKeyPressed

    private void cubeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cubeKeyPressed
   if(evt.getKeyCode()==evt.VK_ENTER)
   {
   
   if(tf1.getText().equals(""))
        {
            l4.setText("Wrong Enter ");
            tf1.requestFocus();
        }
        else
        {
            
            tf2.setEnabled(false);
            tf2.setText("");
            b.setEnabled(false);
            
            Double b=Double.parseDouble(tf1.getText());
            l4.setText(String.valueOf(b*b*b));
        }
   
   
   
   }   
    }//GEN-LAST:event_cubeKeyPressed

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
            java.util.logging.Logger.getLogger(pon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b;
    private javax.swing.JButton cube;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JButton other;
    private javax.swing.JButton square;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    // End of variables declaration//GEN-END:variables
}
