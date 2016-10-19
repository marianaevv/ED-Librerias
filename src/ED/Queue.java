/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ED;

import ED.SimpleNode;

/**
 *
 * @author Mariana Villegas
 */
public class Queue<T> {

    private SimpleNode first;
    private SimpleNode last;
    private int size;

    //Constructor
    public Queue() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public Queue(T data) {
        insertLast(data);

    }
    //Métodos

    public void insertLast(T data) {
        SimpleNode node = new SimpleNode(data);
        if (isEmpty()) {
            first = node;
            last = node;
            ++this.size;
        } else {
            node.setNext(node);
            last = node;
        }
    }

    public void deleteFirst() {
        SimpleNode temp;
        if (!isEmpty()) {
            temp = last;
            while (temp.getNext() != first) {
                temp = temp.getNext();
            }
            temp.setNext(null);
            first = temp;
            --this.size;
        } else {
            System.out.println("No hay data en la fila");
        }
    }

    public void setEmpty() {
        this.first = null;
        this.last = null;
        size = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public Object getFirst() {
        return first.getData();
    }
//Getters

    public SimpleNode getLast() {
        return last;
    }

    public int getSize() {
        return size;
    }

}
