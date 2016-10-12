/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ED;

/**
 *
 * @author Mariana Villegas
 */
public class DoubleNode<T> {

    DoubleNode next;
    T data;
    DoubleNode prev ;

    public DoubleNode(T data) {
        this.data = data;
    }
}
