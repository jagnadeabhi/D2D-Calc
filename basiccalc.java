
import java.awt.event.KeyEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhi
 */
public class basiccalc extends javax.swing.JFrame {

    /**
     * Creates new form basiccalc
     */
    public basiccalc() {
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

        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        l1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        b7 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        l5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenu4.setText("jMenu4");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("f3"); // NOI18N
        setUndecorated(true);

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

        tf2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf2KeyTyped(evt);
            }
        });

        l1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 0, 0));
        l1.setText("Enter First Number :");
        l1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Enter Second Number :");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        l3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        l3.setName(""); // NOI18N

        l4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        l4.setForeground(new java.awt.Color(255, 0, 0));
        l4.setText("Result :");
        l4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        b7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        b7.setText("Result+");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        b7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b7KeyPressed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b1.setText("C");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        b1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                b1KeyReleased(evt);
            }
        });

        b2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b2.setText("+");
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

        b3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        b3.setText("-");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        b3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b3KeyPressed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b4.setText("/");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        b4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b4KeyPressed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b5.setText("*");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        b5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b5KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(b2)
                        .addGap(43, 43, 43)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(b5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(b1)
                        .addGap(45, 45, 45)
                        .addComponent(b4)))
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        l5.setText("0");

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("D2D Calc..");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(352, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 153)));

        jMenu5.setText("Menu");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_SPACE, 0));
        jMenuItem1.setText("Previous");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);
        jMenu5.add(jSeparator1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem2);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(l4)
                                            .addComponent(jLabel2)
                                            .addComponent(l1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(l5))))
                                .addGap(71, 71, 71)
                                .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l1)
                            .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(l3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tf2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l4)
                    .addComponent(l5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //previous
        new f2().setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       
//Exit

        this.dispose();
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        tf1.setText(null);
        tf2.setText(null);
        l5.setText(null);
        l3.setText(null);
        
        l5.setText("0");
        tf1.requestFocus();
        
        
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed

        
        if(tf1.getText().equals("")||tf2.getText().equals(""))
        {
        
        tf1.setText("");
        tf2.setText("");
        
        l5.setText("0");   
        l3.setText("+"); 
        tf1.requestFocus();
        
        }
       else
        {
        Double a=Double.parseDouble(tf1.getText());
        Double b=Double.parseDouble(tf2.getText());
        Double c=a+b;
        
        l5.setText(String.valueOf(c));   
        l3.setText("+");
        b7.requestFocus();
        }  
        
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
       
        if(tf1.getText().equals("")||tf2.getText().equals(""))
        {
        
        tf1.setText("");
        tf2.setText("");
        
        l5.setText("0");   
        l3.setText("-"); 
        tf1.requestFocus();
        
        }
        else
        {
            Double a=Double.parseDouble(tf1.getText());
        Double b=Double.parseDouble(tf2.getText());
        Double c=a-b;
        l5.setText(String.valueOf(c));
        l3.setText("-");
        
        b7.requestFocus();
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
if(tf1.getText().equals("")||tf2.getText().equals(""))
        {
        
        tf1.setText("");
        tf2.setText("");
        
        l5.setText("0");   
        l3.setText("*"); 
        tf1.requestFocus();
        
        }
else
{
        Double a=Double.parseDouble(tf1.getText());
        Double b=Double.parseDouble(tf2.getText());
        Double c=a*b;
        l5.setText(String.valueOf(c));
        l3.setText("*");
        
        b7.requestFocus();
}
    }//GEN-LAST:event_b5ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        
        if(tf1.getText().equals("")||tf2.getText().equals(""))
        {
        
        tf1.setText("");
        tf2.setText("");
        
        l5.setText("0");   
        l3.setText("/"); 
        tf1.requestFocus();
        
        }
        else
        {
        Double a=Double.parseDouble(tf1.getText());
        Double b=Double.parseDouble(tf2.getText());
        Double c=a/b;
        l5.setText(String.valueOf(c));
        l3.setText("/");
        
        b7.requestFocus();
        }
    }//GEN-LAST:event_b4ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
        tf1.setText(l5.getText());
        l5.setText("0");
        tf2.setText("");
     
        l3.setText("+");
        
        tf2.requestFocus();
    }//GEN-LAST:event_b7ActionPerformed

    private void tf1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf1KeyTyped
        // xTODO add your handling code here:
        
        
        char caracter = evt.getKeyChar();
 
        int j=0;
        
    if(caracter=='a'||caracter=='b'||caracter=='c'||caracter=='d'||caracter=='e'||caracter=='f'||caracter=='g'||caracter=='h'||caracter=='i'||caracter=='j'||caracter=='k'||caracter=='l'||caracter=='m'||caracter=='n'||caracter=='o'||caracter=='p'||caracter=='q'||caracter=='r'||caracter=='s'||caracter=='t'||caracter=='u'||caracter=='v'||caracter=='w'||caracter=='x'||caracter=='y'||caracter=='z'||caracter=='`'||caracter=='~'||caracter=='!'||caracter=='@'||caracter=='#'||caracter=='}'||caracter=='{'||caracter=='$'||caracter=='%'||caracter=='^'||caracter=='&'||caracter=='*'||caracter=='-'||caracter=='_'||caracter=='='||caracter=='+'||caracter=='|'||caracter=='"'||caracter==';'||caracter==':'||caracter=='?'||caracter=='/'||caracter=='>'||caracter=='<'||caracter==','||caracter==')'||caracter=='('||caracter=='A'||caracter=='B'||caracter=='C'||caracter=='D'||caracter=='E'||caracter=='F'||caracter=='G'||caracter=='H'||caracter=='I'||caracter=='J'||caracter=='K'||caracter=='L'||caracter=='M'||caracter=='N'||caracter=='O'||caracter=='P'||caracter=='Q'||caracter=='R'||caracter=='S'||caracter=='T'||caracter=='U'||caracter=='V'||caracter=='W'||caracter=='X'||caracter=='Y'||caracter=='Z')
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
  
                    
                 
                }        

// TODO add your handling code here:
    }//GEN-LAST:event_tf2KeyTyped

    private void b2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b2KeyPressed
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
        Double a=Double.parseDouble(tf1.getText());
        Double b=Double.parseDouble(tf2.getText());
        Double c=a+b;
        l5.setText(String.valueOf(c));   
        l3.setText("+");
        
        b7.requestFocus();
        }
      
        
       
    }//GEN-LAST:event_b2KeyPressed

    private void b1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_b1KeyReleased

    private void b1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b1KeyPressed
if(evt.getKeyCode()==evt.VK_ENTER)
{

        tf1.setText(null);
        tf2.setText(null);
        l5.setText(null);
        l3.setText(null);
        
        l5.setText("0");

}// TODO add your handling code here:
    }//GEN-LAST:event_b1KeyPressed

    private void b3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b3KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==evt.VK_ENTER)
        {
        
         Double a=Double.parseDouble(tf1.getText());
        Double b=Double.parseDouble(tf2.getText());
        Double c=a-b;
        l5.setText(String.valueOf(c));
        l3.setText("-");
        
        b7.requestFocus();
        
        
        }
        
    }//GEN-LAST:event_b3KeyPressed

    private void b4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b4KeyPressed

        if(evt.getKeyCode()==evt.VK_ENTER)
           {
        
         Double a=Double.parseDouble(tf1.getText());
        Double b=Double.parseDouble(tf2.getText());
        Double c=a/b;
        l5.setText(String.valueOf(c));
        l3.setText("/");
        
        b7.requestFocus();
        
        
        }// TODO add your handling code here:
    }//GEN-LAST:event_b4KeyPressed

    private void b5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b5KeyPressed
        
        if(evt.getKeyCode()==evt.VK_ENTER)
        {
            
            Double a=Double.parseDouble(tf1.getText());
        Double b=Double.parseDouble(tf2.getText());
        Double c=a*b;
        l5.setText(String.valueOf(c));
        l3.setText("*");
        
        b7.requestFocus(); 
            
            
        }
    }//GEN-LAST:event_b5KeyPressed

    private void b7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b7KeyPressed

if(evt.getKeyCode()==evt.VK_ENTER)
{
    tf1.setText(l5.getText());
        tf2.setText("");
        l5.setText("");
        l3.setText("+");
        
        tf2.requestFocus();
}


// TODO add your handling code here:
    }//GEN-LAST:event_b7KeyPressed
    
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
            java.util.logging.Logger.getLogger(basiccalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(basiccalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(basiccalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(basiccalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new basiccalc().setVisible(true);
            }
        });
}   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    // End of variables declaration//GEN-END:variables
}
