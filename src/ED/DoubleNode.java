/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ED;

/**
 *Clase genérica
 * @author Mariana Villegas
 */
public class DoubleNode<T> {

    DoubleNode next; //cuenta con variable next del tipo de la clase
    T data; //cuenta con data de cualquier tipo
    DoubleNode prev ; //cuenta con un anterior del tipo de la clase
//Constructor
    public DoubleNode(T data) {
        this.data = data;
    }
  //Getters
    public T getData(){
        return this.data;
    }

    public DoubleNode getNext() {
        return next;
    }

    public DoubleNode getPrev() {
        return prev;
    }
    //Setters
  public void setData(T d){
        this.data = d;
    }
    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public void setPrev(DoubleNode prev) {
        this.prev = prev;
    }
    
}
