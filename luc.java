/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhi
 */
public class luc extends javax.swing.JFrame {

    /**
     * Creates new form luc
     */
    public luc() {
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

        jSeparator4 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        l8 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        l11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jLabel11.setText("jLabel8");

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

        cb1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Milimeter", "Centimeter", "Meter", "Kilometer" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("   Select Unit :");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Enter :");

        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        tf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf1KeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Milimeter :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Centimeter :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Meter :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Kilometer :");

        b1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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

        b2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        b2.setText("C");
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(b1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(b2))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(26, 26, 26)
                                        .addComponent(l11))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(49, 49, 49)
                                        .addComponent(l10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(l9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(31, 31, 31)
                                        .addComponent(l8))
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(l8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(l9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(l10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(l11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        new f2().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        
        
            this.dispose();        // TODO add your handling code here:

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed

//Clear
        
        tf1.setText("");
        l8.setText("");
        l9.setText("");
        l10.setText("");
        l11.setText("");

        tf1.requestFocus();
        
// TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        
        //Calculation
       
        if(tf1.getText().equals(""))
        {

        l8.setText("Null");
        l9.setText("Null");
        l10.setText("Null");
        l11.setText("Null");
        tf1.requestFocus();

        
        }
        
        else if(cb1.getSelectedItem()=="Milimeter")
        {
    
        Double a=Double.parseDouble(tf1.getText());
            
        l8.setText(String.valueOf(a));

        Double cm=a/10;                //  CM
        
        l9.setText(String.valueOf(cm));
        
        Double m=a/1000;                //M
        
        l10.setText(String.valueOf(m));
        
        Double km=a/1000000;
        
        l11.setText(String.valueOf(km));
        
        }
        else if(cb1.getSelectedItem()=="Centimeter")
        {
          
        Double a=Double.parseDouble(tf1.getText());
        
        l9.setText(String.valueOf(a));
        
        Double mm=a*10;                //  CM
        
        l8.setText(String.valueOf(mm));
        
        Double m=a/100;                //M
        
        l10.setText(String.valueOf(m));
        
        Double km=a/100000;
        
        l11.setText(String.valueOf(km));
        
        }

        else if(cb1.getSelectedItem()=="Meter")
        {
         
        Double a=Double.parseDouble(tf1.getText());
         
        l10.setText(String.valueOf(a));
        
        Double mm=a*1000;                //  CM
        
        l8.setText(String.valueOf(mm));
        
        Double cm=a*100;                //M
        
        l9.setText(String.valueOf(cm));
        
        Double km=a/1000;
        
        l11.setText(String.valueOf(km));
        
        }

        else if(cb1.getSelectedItem()=="Kilometer")
        {
        
        Double a=Double.parseDouble(tf1.getText());
        
        l11.setText(String.valueOf(a));
        
        Double mm=a*1000000;                //  CM
        
        l8.setText(String.valueOf(mm));
        
        Double cm=a*100000;                //M
        
        l9.setText(String.valueOf(cm));
        
        Double m=a*1000;
        
        l10.setText(String.valueOf(m));
        
        }
        else
        {
        
        
        }
        //end
    }//GEN-LAST:event_b1ActionPerformed

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

    private void tf1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyPressed

if(evt.getKeyCode()==evt.VK_ENTER)
{

       if(tf1.getText().equals(""))
        {

        l8.setText("Null");
        l9.setText("Null");
        l10.setText("Null");
        l11.setText("Null");
        tf1.requestFocus();

        
        }
        
        else if(cb1.getSelectedItem()=="Milimeter")
        {
    
        Double a=Double.parseDouble(tf1.getText());
            
        l8.setText(String.valueOf(a));

        Double cm=a/10;                //  CM
        
        l9.setText(String.valueOf(cm));
        
        Double m=a/1000;                //M
        
        l10.setText(String.valueOf(m));
        
        Double km=a/1000000;
        
        l11.setText(String.valueOf(km));
        
        }
        else if(cb1.getSelectedItem()=="Centimeter")
        {
          
        Double a=Double.parseDouble(tf1.getText());
        
        l9.setText(String.valueOf(a));
        
        Double mm=a*10;                //  CM
        
        l8.setText(String.valueOf(mm));
        
        Double m=a/100;                //M
        
        l10.setText(String.valueOf(m));
        
        Double km=a/100000;
        
        l11.setText(String.valueOf(km));
        
        }

        else if(cb1.getSelectedItem()=="Meter")
        {
         
        Double a=Double.parseDouble(tf1.getText());
         
        l10.setText(String.valueOf(a));
        
        Double mm=a*1000;                //  CM
        
        l8.setText(String.valueOf(mm));
        
        Double cm=a*100;                //M
        
        l9.setText(String.valueOf(cm));
        
        Double km=a/1000;
        
        l11.setText(String.valueOf(km));
        
        }

        else if(cb1.getSelectedItem()=="Kilometer")
        {
        
        Double a=Double.parseDouble(tf1.getText());
        
        l11.setText(String.valueOf(a));
        
        Double mm=a*1000000;                //  CM
        
        l8.setText(String.valueOf(mm));
        
        Double cm=a*100000;                //M
        
        l9.setText(String.valueOf(cm));
        
        Double m=a*1000;
        
        l10.setText(String.valueOf(m));
        
        }
        else
        {
        
        
        }
 
    
    
    
    
    

}
// TODO add your handling code here:
    }//GEN-LAST:event_tf1KeyPressed

    private void b1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==evt.VK_ENTER)
{

       if(tf1.getText().equals(""))
        {

        l8.setText("Null");
        l9.setText("Null");
        l10.setText("Null");
        l11.setText("Null");
        tf1.requestFocus();

        
        }
        
        else if(cb1.getSelectedItem()=="Milimeter")
        {
    
        Double a=Double.parseDouble(tf1.getText());
            
        l8.setText(String.valueOf(a));

        Double cm=a/10;                //  CM
        
        l9.setText(String.valueOf(cm));
        
        Double m=a/1000;                //M
        
        l10.setText(String.valueOf(m));
        
        Double km=a/1000000;
        
        l11.setText(String.valueOf(km));
        
        }
        else if(cb1.getSelectedItem()=="Centimeter")
        {
          
        Double a=Double.parseDouble(tf1.getText());
        
        l9.setText(String.valueOf(a));
        
        Double mm=a*10;                //  CM
        
        l8.setText(String.valueOf(mm));
        
        Double m=a/100;                //M
        
        l10.setText(String.valueOf(m));
        
        Double km=a/100000;
        
        l11.setText(String.valueOf(km));
        
        }

        else if(cb1.getSelectedItem()=="Meter")
        {
         
        Double a=Double.parseDouble(tf1.getText());
         
        l10.setText(String.valueOf(a));
        
        Double mm=a*1000;                //  CM
        
        l8.setText(String.valueOf(mm));
        
        Double cm=a*100;                //M
        
        l9.setText(String.valueOf(cm));
        
        Double km=a/1000;
        
        l11.setText(String.valueOf(km));
        
        }

        else if(cb1.getSelectedItem()=="Kilometer")
        {
        
        Double a=Double.parseDouble(tf1.getText());
        
        l11.setText(String.valueOf(a));
        
        Double mm=a*1000000;                //  CM
        
        l8.setText(String.valueOf(mm));
        
        Double cm=a*100000;                //M
        
        l9.setText(String.valueOf(cm));
        
        Double m=a*1000;
        
        l10.setText(String.valueOf(m));
        
        }
        else
        {
        
        
        }
 
    
    
    
    
    

}

        
    }//GEN-LAST:event_b1KeyPressed

    private void b2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b2KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==evt.VK_ENTER)
        {
        tf1.setText("");
        l8.setText("Null");
        l9.setText("Null");
        l10.setText("Null");
        l11.setText("Null");
        tf1.requestFocus();

        
        }
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
            java.util.logging.Logger.getLogger(luc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(luc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(luc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(luc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new luc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JComboBox cb1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables
}
