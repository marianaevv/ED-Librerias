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
public class Stack <T> {
    private SimpleNode top;
    private int size;

    //constructor
    public Stack() {
        this.top = null;
        this.size = 0;
    }
    //Getters

    /*
 @return stack's top
     */
    public SimpleNode getTop() {
        return top;
    }

    /*
 *Método que devuelve el tamñano de la pila
     */
    public int getSize() {
        return size;
    }
/*
*Método para ver si esta vacia la pila
*/
    public boolean isEmpty() {
        return top == null;
    }
/**
*Método para insertar datos en la pila, recibe como parametro data
*/
    public  void push(T data) {
        SimpleNode node = new SimpleNode(data);
        if (isEmpty()) {//si la pila esta vacia
            top = node;
        } else {//sino
            node.setNext(top);// Apunta al valor de arriba
            top = node;//le damos el valor del nodo a agregar.
        }
        ++size;//Aumentamos el tamaño de la pila
    }

    /**
     *
     * Elimina un elemento de la pila
     */
    public void pop() {
        if (!isEmpty()) {//Preguntamos si NO esta vacia, si es asi:
            top = top.getNext(); //top se va a recorrer y desaparece el nodo anterior
            --size;//disminuimos el tamñao de la pila
        } else {
            System.out.println("La pila esta vacía");
        }

    }

    /**
     * Vacía los elementos de la pila
     */
    public void empty() {
        top = null;
        size = 0;
    }
/**
*Método para mostrar los elementos de la pila
*/
    public void showStack() {
        if (!isEmpty()) {
            SimpleNode aux = top;
            do {

                System.out.println(aux.getData());
                System.out.println("|");
                System.out.println("V");
                aux = aux.getNext();
            } while (aux != null);
        }
        System.out.println("null");
    }
}
