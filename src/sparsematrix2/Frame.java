
package sparsematrix2;

import javax.swing.JOptionPane;

public class Frame extends javax.swing.JFrame {
String result="";
 double[][] a ;
  SparseMatrixNew r1 ;
   SparseMatrixNew r2 ;
int n;
    public Frame() {
       
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Groupe = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        Groupe.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(51, 51, 255));
        jRadioButton2.setText("create a new Sparse Matrix");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(210, 160, 280, 31);

        Groupe.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(51, 51, 255));
        jRadioButton1.setText("Enter an arry");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(210, 110, 180, 30);

        jLabel3.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jLabel3.setText("How do you want to begin?");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(290, 60, 290, 40);

        jLabel2.setFont(new java.awt.Font("Urdu Typesetting", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Sparse Matrix");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(290, -10, 300, 70);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("insert a new element");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(90, 270, 200, 60);

        jLabel5.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jLabel5.setText("What is your next step?");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(210, 210, 470, 60);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 255));
        jButton2.setText("Remove an element");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(300, 270, 210, 60);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 255));
        jButton3.setText("Set an element");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(520, 270, 210, 60);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 255));
        jButton4.setText("Search for an element");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(520, 410, 210, 60);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 51, 255));
        jButton5.setText("add two matrix");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(90, 340, 200, 60);

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 255));
        jButton6.setText("subtract two matrix");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(300, 340, 210, 60);

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 255));
        jButton7.setText("multibly two matrix");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(520, 340, 210, 60);

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 204));
        jButton8.setText("add row");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(90, 410, 200, 60);

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 255));
        jButton9.setText("subtract row");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(300, 410, 210, 60);

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 0, 255));
        jButton10.setText("Transpose RC");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(520, 480, 200, 50);

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 0, 255));
        jButton11.setText("insert a new raw");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(300, 480, 210, 50);

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 51, 255));
        jButton12.setText("insert a new column");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);
        jButton12.setBounds(90, 480, 200, 50);

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton13.setForeground(new java.awt.Color(0, 0, 255));
        jButton13.setText("print the current array");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13);
        jButton13.setBounds(520, 540, 210, 60);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 255));
        jLabel4.setText("when you press the buttons the results will be shown down");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(160, 510, 490, 270);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sparsematrix2/num.jpg"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(710, 0, 240, 150);

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton14.setForeground(new java.awt.Color(0, 51, 255));
        jButton14.setText("Swap Row");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14);
        jButton14.setBounds(90, 540, 200, 60);

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton15.setForeground(new java.awt.Color(0, 51, 204));
        jButton15.setText("Swap Column");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15);
        jButton15.setBounds(300, 540, 200, 60);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(90, 680, 600, 160);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("By Amal Amer & Jasmin Abualrub");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(700, 700, 240, 120);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sparsematrix2/4-2-s.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-10, 0, 980, 900);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
     result="b";
     String s=JOptionPane.showInputDialog("Enter the number of rows");
     int m=Integer.parseInt(s);
       String t=JOptionPane.showInputDialog("Enter the number of columns");
     int d=Integer.parseInt(t);
     r2=new SparseMatrixNew(m,d);
        
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
  String s=""; 
  result="a";
  try{
   int row=Integer.parseInt(  JOptionPane.showInputDialog("Enter the numberof row"));
   int col=Integer.parseInt(  JOptionPane.showInputDialog("Enter the numberof columns"));
  a =new double[row][col];
  } catch(Exception e){
        
        JOptionPane.showMessageDialog(null, "try");
        
        
    }
    try{
  for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
            s= JOptionPane.showInputDialog("enter");
 n=Integer.parseInt(s);      
               a[i][j]=n;
            }

          
  }
       r1=new SparseMatrixNew(a);  
    } catch(Exception e){
        
        JOptionPane.showMessageDialog(null, "try");
        
        
    }
    
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   if(result=="a"){
     
     
  int n=Integer.parseInt(  JOptionPane.showInputDialog("Enter the value"));
   int row=Integer.parseInt(  JOptionPane.showInputDialog("Enter the numberof row"));
   int col=Integer.parseInt(  JOptionPane.showInputDialog("Enter the numberof columns"));
    r1.insert(n, row, col);
     jTextField1.setText("\n"+r1.toString());
   }
   
   if(result=="b"){
       
     int n=Integer.parseInt(  JOptionPane.showInputDialog("Enter the value"));
   int row=Integer.parseInt(  JOptionPane.showInputDialog("Enter the numberof row"));
   int col=Integer.parseInt(  JOptionPane.showInputDialog("Enter the numberof columns"));
    r2.insert(n, row, col);
  jTextField1.setText("\n"+r2.toString());   
       
       
   }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
         if(result=="a"){
     
   int row=Integer.parseInt(  JOptionPane.showInputDialog("Enter the numberof row"));
   int col=Integer.parseInt(  JOptionPane.showInputDialog("Enter the numberof columns"));

   jTextField1.setText(   r1.remove(row, col) +"\n"+r1.toString());
   }
   
   if(result=="b"){
      
   int row=Integer.parseInt(  JOptionPane.showInputDialog("Enter the numberof row"));
   int col=Integer.parseInt(  JOptionPane.showInputDialog("Enter the numberof columns"));
    jTextField1.setText(   r2.remove( row, col)    +"\n"+r2.toString());   
       
       
   }
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        if(result=="a"){
     
  int value=Integer.parseInt(  JOptionPane.showInputDialog("Enter the value"));
 
    jTextField1.setText("\n"+  r1.search(value));
     
   }
     
    if(result=="b"){
     
  int value=Integer.parseInt(  JOptionPane.showInputDialog("Enter the value"));
 
    jTextField1.setText("\n"+ r2.search(value));
     
   }
          
        
        
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    if(result=="a"){
    double[][] b;         
 try{
         
   int row=Integer.parseInt(  JOptionPane.showInputDialog("Enter the numberof rows to the another matrix"));
   int col=Integer.parseInt(  JOptionPane.showInputDialog("Enter the numberof columns to the another matrix"));
 b =new double[row][col];  
  for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
           String s= JOptionPane.showInputDialog("Enter the values");
int w=Integer.parseInt(s);      
               b[i][j]=w;
            }

          
  }
    SparseMatrixNew ad=new SparseMatrixNew(b);  
 jTextField1.setText(  "\n" + r1.add(ad).toString()       );  
    } catch(Exception e){
        
        JOptionPane.showMessageDialog(null, "try");
        
        
    }
    }
     if(result=="b"){
    double[][] b;         
 try{
         
   int row=Integer.parseInt(  JOptionPane.showInputDialog("Enter the numberof rows to the another matrix"));
   int col=Integer.parseInt(  JOptionPane.showInputDialog("Enter the numberof columns to the another matrix"));
 b =new double[row][col];  
  for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
           String s= JOptionPane.showInputDialog("Enter the values");
int w=Integer.parseInt(s);      
               b[i][j]=w;
            }

          
  }
    SparseMatrixNew ad=new SparseMatrixNew(b);  
  jTextField1.setText( "\n" +  r2.add(ad).toString()       );  
    } catch(Exception e){
        
        JOptionPane.showMessageDialog(null, "try");
        
        
    }
    }
    
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    if(result=="a"){
     
     
  int n=Integer.parseInt(  JOptionPane.showInputDialog("Enter the value"));
   int row=Integer.parseInt(  JOptionPane.showInputDialog("Enter the numberof row"));
   int col=Integer.parseInt(  JOptionPane.showInputDialog("Enter the numberof columns"));
    r1.set(n, row, col);
    jTextField1.setText("\n"+r1.toString());
   }
   
   if(result=="b"){
       
     int n=Integer.parseInt(  JOptionPane.showInputDialog("Enter the value"));
   int row=Integer.parseInt(  JOptionPane.showInputDialog("Enter the numberof row"));
   int col=Integer.parseInt(  JOptionPane.showInputDialog("Enter the numberof columns"));
    r2.set(n, row, col);
    jTextField1.setText("\n"+r2.toString());   
       
       
   }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
   if(result=="a"){
      int row1=Integer.parseInt(  JOptionPane.showInputDialog("Enter the number of row1"));
   int row2=Integer.parseInt(  JOptionPane.showInputDialog("Enter the number of row2"));
     int n=Integer.parseInt(  JOptionPane.showInputDialog("Enter the value"));   
       r1.addRow(row1, row2, n);
         jTextField1.setText("\n"+r1.toString());
   }
    if(result=="b"){
      int row1=Integer.parseInt(  JOptionPane.showInputDialog("Enter the number of row1"));
   int row2=Integer.parseInt(  JOptionPane.showInputDialog("Enter the number of row2"));
     int n=Integer.parseInt(  JOptionPane.showInputDialog("Enter the value"));   
       r2.addRow(row1, row2, n);
        jTextField1.setText("\n"+r2.toString());
   }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
     
      if(result=="a"){
      int row1=Integer.parseInt(  JOptionPane.showInputDialog("Enter the number of row1"));
   int row2=Integer.parseInt(  JOptionPane.showInputDialog("Enter the number of row2"));
     int n=Integer.parseInt(  JOptionPane.showInputDialog("Enter the value"));   
       r1.subtractRow(row1, row2, n);
      jTextField1.setText("\n"+r1.toString());
   }
    if(result=="b"){
      int row1=Integer.parseInt(  JOptionPane.showInputDialog("Enter the number of row1"));
   int row2=Integer.parseInt(  JOptionPane.showInputDialog("Enter the number of row2"));
     int n=Integer.parseInt(  JOptionPane.showInputDialog("Enter the value"));   
       r2.subtractRow(row1, row2, n);
       jTextField1.setText("\n"+r2.toString());
   }  
        
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
   
         if(result=="a"){
     
   int row=Integer.parseInt(  JOptionPane.showInputDialog("Enter the numberof row"));
   int col=Integer.parseInt(  JOptionPane.showInputDialog("Enter the numberof columns"));
    r1.transposeRC(row, col);
  jTextField1.setText("\n"+r1.toString());
   }
   
   if(result=="b"){
      
   int row=Integer.parseInt(  JOptionPane.showInputDialog("Enter the numberof row"));
   int col=Integer.parseInt(  JOptionPane.showInputDialog("Enter the numberof columns"));
    r2.transposeRC(row, col);
    jTextField1.setText("\n"+r2.toString());   
       
       
   }
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
      if(result=="a"){
        r1.insertColumn();
       JOptionPane.showMessageDialog(null,"insert of column is completed");
          
          
      }
        if(result=="b"){
        r2.insertColumn();
       JOptionPane.showMessageDialog(null,"insert of column is completed");
          
          
      }
      
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
      
        
       if(result=="a"){
        r1.insertRow();
       JOptionPane.showMessageDialog(null,"insert of row is completed");
          
          
      }
        if(result=="b"){
        r2.insertRow();
       JOptionPane.showMessageDialog(null,"insert of row is completed");
          
          
      }   
          
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
     if(result=="a"){
         
  jTextField1.setText("\n"+r1.toString());
         
     }
    if(result=="b") {
        
        jTextField1.setText("\n"+r2.toString());  
        
        
    }   
        
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
 if(result=="a"){
    double[][] b;         
 try{
         
   int row=Integer.parseInt(  JOptionPane.showInputDialog("Enter the numberof rows to the another matrix"));
   int col=Integer.parseInt(  JOptionPane.showInputDialog("Enter the numberof columns to the another matrix"));
 b =new double[row][col];  
  for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
           String s= JOptionPane.showInputDialog("Enter the values");
int w=Integer.parseInt(s);      
               b[i][j]=w;
            }

          
  }
    SparseMatrixNew ad=new SparseMatrixNew(b);  
 jTextField1.setText(  "\n" + r1.mulitply(ad).toString()       );  
    } catch(Exception e){
        
        JOptionPane.showMessageDialog(null, "try");
        
        
    }
    }
     if(result=="b"){
    double[][] b;         
 try{
         
   int row=Integer.parseInt(  JOptionPane.showInputDialog("Enter the numberof rows to the another matrix"));
   int col=Integer.parseInt(  JOptionPane.showInputDialog("Enter the numberof columns to the another matrix"));
 b =new double[row][col];  
  for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
           String s= JOptionPane.showInputDialog("Enter the values");
int w=Integer.parseInt(s);      
               b[i][j]=w;
            }

          
  }
    SparseMatrixNew ad=new SparseMatrixNew(b);  
  jTextField1.setText( "\n" +  r2.mulitply(ad).toString()       );  
    } catch(Exception e){
        
        JOptionPane.showMessageDialog(null, "try");
        
        
    }
    }      
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       if(result=="a"){
    double[][] b;         
 try{
         
   int row=Integer.parseInt(  JOptionPane.showInputDialog("Enter the numberof rows to the another matrix"));
   int col=Integer.parseInt(  JOptionPane.showInputDialog("Enter the numberof columns to the another matrix"));
 b =new double[row][col];  
  for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
           String s= JOptionPane.showInputDialog("Enter the values");
int w=Integer.parseInt(s);      
               b[i][j]=w;
            }

          
  }
    SparseMatrixNew ad=new SparseMatrixNew(b);  
 jTextField1.setText(  "\n" + r1.subtract(ad).toString()       );  
    } catch(Exception e){
        
        JOptionPane.showMessageDialog(null, "try");
        
        
    }
    }
     if(result=="b"){
    double[][] b;         
 try{
         
   int row=Integer.parseInt(  JOptionPane.showInputDialog("Enter the numberof rows to the another matrix"));
   int col=Integer.parseInt(  JOptionPane.showInputDialog("Enter the numberof columns to the another matrix"));
 b =new double[row][col];  
  for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
           String s= JOptionPane.showInputDialog("Enter the values");
int w=Integer.parseInt(s);      
               b[i][j]=w;
            }

          
  }
    SparseMatrixNew ad=new SparseMatrixNew(b);  
jTextField1.setText( "\n" +  r2.subtract(ad).toString()       );  
    } catch(Exception e){
        
        JOptionPane.showMessageDialog(null, "try");
        
        
    }
    }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
 if(result=="a"){
      int row1=Integer.parseInt(  JOptionPane.showInputDialog("Enter the number of row1"));
   int row2=Integer.parseInt(  JOptionPane.showInputDialog("Enter the number of row2"));
 
       r1.swapRows(row1, row2);
         jTextField1.setText("\n"+r1.toString());
   }  
     if(result=="b"){
      int row1=Integer.parseInt(  JOptionPane.showInputDialog("Enter the number of row1"));
   int row2=Integer.parseInt(  JOptionPane.showInputDialog("Enter the number of row2"));
 
       r2.swapRows(row1, row2);
         jTextField1.setText("\n"+r2.toString());
   }     
        
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
       
      if(result=="a"){
      int col1=Integer.parseInt(  JOptionPane.showInputDialog("Enter the number of col1"));
   int col2=Integer.parseInt(  JOptionPane.showInputDialog("Enter the number of col2"));
 
       r1.swapRows(col1, col2);
         jTextField1.setText("\n"+r1.toString());
   }  
        if(result=="b"){
      int col1=Integer.parseInt(  JOptionPane.showInputDialog("Enter the number of col1"));
   int col2=Integer.parseInt(  JOptionPane.showInputDialog("Enter the number of col2"));
 
       r2.swapColumns(col1, col2);
         jTextField1.setText("\n"+r2.toString());
   }  
        
        
    }//GEN-LAST:event_jButton15ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Groupe;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
