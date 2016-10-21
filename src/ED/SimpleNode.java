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
public class SimpleNode <T> {
 T data;
SimpleNode next;
//constructor
    SimpleNode(T d) {
        this.data = d;
        this.next = null;
    }   
    //Getters
    public T getData(){
        return this.data;
    }
 public SimpleNode getNext(){
        return this.next;
    }
 //Setters
    public void setData(T d){
        this.data = d;
    }
      public void setNext(SimpleNode n){
        this.next= n;
    }
   
}
