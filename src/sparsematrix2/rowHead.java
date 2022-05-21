/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sparsematrix2;

/**
 *
 * @author Lenovo
 */
public class rowHead {
       public int row;
    public rowHead nextRow;
    public Node firstElement;
    public rowHead(int row) {
        this.row = row;
    }
    
    
}
