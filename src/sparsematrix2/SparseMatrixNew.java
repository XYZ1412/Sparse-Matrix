package sparsematrix2;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class SparseMatrixNew {

    private static rowHead head1 = null;
    private rowHead tail1 = null;
    private static columnHead  head2 = null;
    private columnHead tail2 = null;
    private int size = 0;
    Node m1;
    Node m2;
    static int Numrow = 0;
    static int Numcol = 0;
   

    public SparseMatrixNew(double[][] d) {

        if (isSparseMatrix(d)) {
            Numrow=d.length;
            Numcol=d[0].length;
            for (int i = 0; i < d.length; i++) {
                this.addLastrow(i);
            }
            for (int j = 0; j < d[0].length; j++) {
                addLastColumn(j);
            }

            for (int i = 0; i < d.length; i++) {
                for (int j = 0; j < d[i].length; j++) {
                    if (d[i][j] != 0) {

                        Node n = new Node(d[i][j], i, j);
                        rowHead curr1 = head1;
                        columnHead curr2 = head2;
                        for (int k = 0; k < i; k++) {
                            curr1 = curr1.nextRow;

                        }

                        for (int k = 0; k < j; k++) {
                            curr2 = curr2.nextColumn;
                        }

                        if (curr1.firstElement == null) {
                            curr1.firstElement = n;

                        } else if (curr1.firstElement != null) {
                            m1 = curr1.firstElement;
                            while (m1.right != null) {
                                m1 = m1.right;
                        

                            }

                            m1.right = n;

                        }

                        if (curr2.firstElement == null) {
                            curr2.firstElement = n;

                        } else if (curr2.firstElement != null) {
                            m2 = curr2.firstElement;
                            while (m2.Down != null) {

                                m2 = m2.Down;

                            }

                            m2.Down = n;
                        }

                  
                    }
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "This is not a sparse matrix");
        }

    }

    public SparseMatrixNew(int row, int col) {
Numrow=row;
Numcol=col;
        for (int i = 0; i < row; i++) {
           addLastrow(i);
        }
        for (int j = 0; j < col; j++) {
            addLastColumn(j);
        }

    }

    private boolean isSparseMatrix(double[][] d) {

        int c = 0;
        int size = d.length * d[0].length;
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                if (d[i][j] == 0) {
                    c++;
                }
            }
        }
        if (c >= size / 2) {
            return true;
        }
        return false;

    }

   private void addLastrow(int value) {
        rowHead temp = new rowHead(value);
        if (tail1 == null || size == 0) {
            head1 = tail1 = temp;

        } else {
            tail1.nextRow = temp;
            tail1 = temp;
        }
        size++;
    }

    private void addLastColumn(int c) {

        columnHead temp;

        temp = new columnHead(c);
        if (tail2 == null || size == 0) {
            head2 = tail2 = temp;

        } else {
            tail2.nextColumn = temp;
            tail2 = temp;

        }
        size++;

    }

    public void insert(double value, int row, int col) {
     Node m;
     Node n;
      
        if (Numrow < row || Numcol < col) {

            JOptionPane.showMessageDialog(null, "out of range");
          
        }
        else{
        Node temp = new Node(value, row, col);       
         rowHead curr1 = head1;
         columnHead curr2 = head2;
                       for (int k = 0; k < row; k++) {
                            curr1 = curr1.nextRow;
                          
                        }
                        for (int k = 0; k < col; k++) {
                            curr2 = curr2.nextColumn;
                       
                        }   
                     
                      
             if(curr1.firstElement==null){
                 curr1.firstElement=temp;  
                
             } else if(curr1.firstElement!=null&&curr1.firstElement.column!=col){
                    m=curr1.firstElement;
                 temp.right=curr1.firstElement;
                 curr1.firstElement=temp;
              
             }else if(curr1.firstElement.column==col)
                 curr1.firstElement.value=value;
             
             if(curr2.firstElement==null){ 
                 curr2.firstElement=temp;
                 
            
             }
            else if(curr2.firstElement!=null&&curr2.firstElement.row!=row){
                   n=curr2.firstElement;
                temp.Down=curr2.firstElement;
                 curr2.firstElement=temp;
          
              
             }
            else if(curr2.firstElement.row==row)
                 curr2.firstElement.value=value;
 
    }
    }
            
    public boolean remove(int row, int col) {
        rowHead curr1 = head1;
        columnHead curr2 = head2;
        boolean res = true;
        if (Numrow < row || Numcol < col) {

            return false;

        }
        for (int i = 0; i < row; i++) {
            curr1 = curr1.nextRow;

        }

        if (curr1.firstElement == null) {
            return false;
        } else {
            curr1.firstElement = curr1.firstElement.right;
        }

        for (int i = 0; i < col; i++) {
            curr2 = curr2.nextColumn;
        }

        if (curr2.firstElement == null) {
           return false;

        } else {
            curr2.firstElement = curr2.firstElement.Down;
        }

        return true;

    }

    public void set(double value, int row, int column) {
        rowHead curr1 = head1;
        columnHead curr2 = head2;
        Node temp = new Node(value, row, column);
        for (int i = 0; i < row; i++) {

            curr1 = curr1.nextRow;
        }
        for (int j = 0; j <column; j++) {

            curr2 = curr2.nextColumn;
        }
        if (curr1.firstElement == null && curr2.firstElement == null) {
            curr1.firstElement = temp;
            curr2.firstElement = temp;

        } else {
            this.insert(value, row, row);
        }
    }
    public boolean search(double value) {
        rowHead curr1 = head1;   
      Node m;
             while(curr1!=null){
                 if(curr1.firstElement!=null){
            m=curr1.firstElement;
               while(m!=null){
                   if(m.value==value){
                return true;
                  
                   }
                   
                   m=m.right ; 
               }
             
                        
                 }  
               curr1=curr1.nextRow;      
             }   
       return false;         
    }

    public SparseMatrixNew add(SparseMatrixNew s) {
        double[][] d = new double[Numrow][Numcol];
        rowHead curr1 = head1;  
        rowHead curr10 = s.head1;
     
        Node m;
        Node m1;
       
         while(curr1!=null&&curr10!=null){
               
            m=curr1.firstElement;
            m1=curr10.firstElement;
               while(m!=null&&m1!=null){
                    d[m1.row][m1.column] = m.value + m1.value;
                   m1=m1.right;
                   m=m.right ;
                  
               }
       
               curr1=curr1.nextRow;
               curr10=curr10.nextRow;
         }  
  SparseMatrixNew fd = new SparseMatrixNew(d);  
        return fd;
    }

    public SparseMatrixNew subtract(SparseMatrixNew s) {

        double[][] d = new double[Numrow][Numcol];
        rowHead curr1 = head1;  
        rowHead curr10 = s.head1;
     
        Node m;
        Node m1;
       
         while(curr1!=null&&curr10!=null){
               
            m=curr1.firstElement;
            m1=curr10.firstElement;
               while(m!=null&&m1!=null){
                    d[m1.row][m1.column] = m.value - m1.value;
                   m1=m1.right;
                   m=m.right ;
                  
               }
       
               curr1=curr1.nextRow;
               curr10=curr10.nextRow;
         }  
  SparseMatrixNew fd = new SparseMatrixNew(d);  
        return fd;

    }

    public SparseMatrixNew mulitply(SparseMatrixNew s) {

         double[][] d = new double[Numrow][Numcol];
        rowHead curr1 = head1;  
        rowHead curr10 = s.head1;
     
        Node m;
        Node m1;
       
         while(curr1!=null&&curr10!=null){
               
            m=curr1.firstElement;
            m1=curr10.firstElement;
               while(m!=null&&m1!=null){
                    d[m1.row][m1.column] = m.value * m1.value;
                   m1=m1.right;
                   m=m.right ;
                  
               }
       
               curr1=curr1.nextRow;
               curr10=curr10.nextRow;
         }  
  SparseMatrixNew fd = new SparseMatrixNew(d);  
        return fd;

    }

    public void addRow(int row1, int row2, double c) {
        rowHead curr1 = head1;
        rowHead curr2 = head1;
        Node m;
        Node n;
        for (int i = 0; i < row1; i++) {

            curr1 = curr1.nextRow;

        }
        for (int j = 0; j < row2; j++) {

            curr2 = curr2.nextRow;

        }
        m = curr2.firstElement;
        n = curr1.firstElement;
        while (m.right != null && n.right != null) {
            n.value += c * m.value;
            m = m.right;
            n = n.right;

        }
    }

    public void subtractRow(int row1, int row2, double c) {
        rowHead curr1 = head1;
        rowHead curr2 = head1;
        Node m;
        Node n;
        for (int i = 0; i < row1; i++) {

            curr1 = curr1.nextRow;

        }
        for (int j = 0; j < row2; j++) {

            curr2 = curr2.nextRow;

        }
        m = curr2.firstElement;
        n = curr1.firstElement;
        while (m.right != null && n.right != null) {
            n.value -= c * m.value;
            m = m.right;
            n = n.right;

        }

    }

    public String toString() {

        rowHead curr1 = head1;

        String output = "";
        if (curr1 == null) {
            output = "is not found";
            return output;
        } else {
            while (curr1 != null) {
                output+="{";
                Node f = curr1.firstElement;
                while (f != null) {
 output += f.value;
 if(f.right!=null)
   output += ",";
 f=f.right;
                }
                  output += "}";
                 output += "\n";
                
                curr1=curr1.nextRow;
            }

         

          return output;

        }
    }

  public void transposeRC( int row,int col  ){
   double temp=0;
      rowHead curr1=head1;
         columnHead curr2=head2;
         for(int i=0;i<row;i++){    
      curr1=curr1.nextRow;
         }
        for(int j=0;j<col;j++){
      curr2=curr2.nextColumn;
        }
      Node n=curr1.firstElement;    
      Node m=curr2.firstElement;
      while(n!=null&&m!=null){
         temp=n.value;
         n.value=m.value;
         m.value=temp;
         n=n.right;
         m=m.Down;
             
      }
  }
  
  public void swapRows(int row1,int row2){
      
      rowHead curr1 = head1;
       rowHead curr2 = head1;
        Node m;
        Node n;
        Node temp;
        for (int i = 0; i < row1; i++) {

            curr1 = curr1.nextRow;

        }
        for (int j = 0; j < row2; j++) {

            curr2 = curr2.nextRow;

        }
        
  if(curr1.firstElement!=null&&curr2.firstElement!=null){
  temp=curr1.firstElement;     
    curr1.firstElement=curr2.firstElement;
    curr2.firstElement=temp;
      
  }
  else
      return;
   m=curr1.firstElement.right; 
      n=curr2.firstElement.right;  
      
      while(m!=null&&n!=null){
       temp=n.right;
   n.right=m.right  ;
      m.right=temp;
    
       m=m.right;
       n=n.right;
      }
     
  }
  
  public void insertRow(){
      
       this.addLastrow(Numrow+1);
      
      
  }
  public void insertColumn(){
      
       this.addLastrow(Numcol+1);
      
      
  }
 public void swapColumns(int col1,int col2){
      
      columnHead curr1 = head2;
       columnHead curr2 = head2;
        Node m;
        Node n;
        Node temp;
        for (int i = 0; i < col1; i++) {

            curr1 = curr1.nextColumn;

        }
        for (int j = 0; j < col2; j++) {

            curr2 = curr2.nextColumn;

        }
        
  if(curr1.firstElement!=null&&curr2.firstElement!=null){
  temp=curr1.firstElement;     
    curr1.firstElement=curr2.firstElement;
    curr2.firstElement=temp;
      
  }
  else
      return;
   m=curr1.firstElement.Down; 
      n=curr2.firstElement.Down;   
      while(m!=null&&n!=null){
       temp=n.Down;
   n.Down=m.Down  ;
      m.Down=temp;
    
       m=m.Down;
       n=n.Down;
      }
     
  }
  
  
    public static void main(String[] args) {

        double[][] a = {{0, 0, 3, 0, 4}, {0, 0, 5, 7, 0}, {0, 0, 0, 0, 0}, {0, 2, 6, 0, 0}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

            }

            System.out.println(Arrays.toString(a[i]));

        }
        SparseMatrixNew b = new SparseMatrixNew(a);
//          SparseMatrixNew c = new SparseMatrixNew(4,5);
//          c.insert(0,0,0);
//            c.insert(0, 0,1);
//              c.insert(3, 0,2);
                b.insert(4, 0,3);
//                  b.insert(0, 0,4);
//        SparseMatrix2 c=new SparseMatrix2(a);

//        System.out.println(b.toString());
//b.set(10,0,1);
//b.transposeRC(0,2);
//        System.out.println(b.toString());
//        System.out.println(   b.search(88) );
//        System.out.println(b.remove(1,2));
b.swapRows(0, 1);
b.swapColumns(0,4);
      System.out.println(   b.toString()        );;
//        System.out.println(b.toString());


   
    }

}
