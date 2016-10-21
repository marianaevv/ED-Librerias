/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ED;

import ED.SimpleNode;

/**
 * Clase de tipo genérica
 * @author Mariana Villegas
 */
public class Queue<T> {
//Atributos
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
/**
*Método para insertar el ultimo, recibo como parametro cualquier tipo de data
*/
    public void insertLast(T data) {
        SimpleNode node = new SimpleNode(data);
        if (isEmpty()) {/*Preguntamos si la fila esta vacia, si es asi se crean los nodos primero y ultimo y al tamaño de la fila
            se le suma uno*/
            first = node; 
            last = node;
            ++this.size;
        } else { //Sino al que sigue del nodo se le dará el valor de otro nodo, ademas last será igual a nodo
            node.setNext(node);
            last = node;
        }
    }
/**
* Método para eliminar el primer nodo
*/
    public void deleteFirst() {
        SimpleNode temp;//Creamos un temporal
        if (!isEmpty()) {//Preguntamos si la fila no esta vacia, si no es asi
            temp = last; //temporal va a ser igual al ultimo nodo
            while (temp.getNext() != first) { //recorremos la fila mientras que el que sigue del temporar sea diferente del primero
                temp = temp.getNext();
            }
            temp.setNext(null);//cuando lo haya encontrado, le damos el valor de null para desaparecerlo
            first = temp;//ahora el primero tendra el valor del temporal
            --this.size; // y al tamaño se le resta 1
        } else {
            System.out.println("No hay data en la fila");
        }
    }
/**
*Método para vaciar la fila, se igual el primero y el ultimo a null y el tamaño a 0
*/
    public void setEmpty() {
        this.first = null;
        this.last = null;
        size = 0;
    }
/**
*Método para ver si esta vacia la fila
*/
    public boolean isEmpty() {
        return first == null;
    }
/**
*Método para obtener la data del primer nodo
*/
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
