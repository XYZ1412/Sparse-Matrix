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
public class columnHead {
    public int col;
    public columnHead nextColumn;
    public Node firstElement;

    public columnHead(int col) {
        this.col = col;
    }
    
    
    
}
