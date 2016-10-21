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
public class CircularList<T> {

    SimpleNode pivot;
//Constructor
    public CircularList() {
        pivot = null;
    }
    }
/**
 * Método para insertar nodos
 * @param d 
 */
    public void insert(T d) {
        SimpleNode node = new SimpleNode(d); //Creación de un objeto de tipo nodo simple 
        if (!isEmpty()) {//Si no esta vacia
            //Insertamos nodo al inicio y recorremos el primero
            node.next = pivot;
            findLast().next = node;
            pivot = node;

        } else { //Si esta vacia
           //Se crea un nuevo nodo el cual apuntara a pivote
            pivot = node;
            node.next = pivot;
        }
    }
/**
* Método para verificar si la pila esta vacia
*/
    private boolean isEmpty() {
        return pivot == null;
    }
/**
* Método  para encontrar el ultimo nodo de la lista
*/
    private SimpleNode findLast() {
        SimpleNode aux = pivot; //Se crea variable auxiliar de tipo nodo simple y tendrá el valor de pivote
        do {//Ciclo do while que recorrera la lista
            aux = aux.next;// La variable auxiliar seguira avanzando hasta que el que siga de aux sea otra vez pivote
        } while (aux.next != pivot);
        return aux;//regresamos la variable aux;
    }
/**
*Método para mostrar la lista
*/
    public void showList() {
        SimpleNode aux;//declaramos una variable auxiliar de tipo node simple para guardar los valores de nuestros nodos
        aux = pivot;// aux será igual a pivote
        if (isEmpty()) {//Preguntamos si la lista esta vacia
            System.out.println("La lista está vacia");

        } else {// sino 

            do {//Imprimira cada dato contenido en los nodos hasta que el siguiente del auxiliar sea igual a pivote.
                System.out.print("[" + aux.getData() + "]" + "->");
                aux = aux.next;
            } while (aux.next != pivot.next);

        }

    }

    public SimpleNode searchNode(T data) {
        SimpleNode aux;
        if (isEmpty()) {//Si esta vacío retorna falso
            return null;
        } else {//Si contiene elementos 
            aux = pivot;//colocamos auxiliar en el pivote
            while (aux.data != data && aux != pivot) {//Mientras que no ecuentre el dato, recorre la lista
                aux = aux.next;
            }
            if (aux.data == data) {//Si  la informacion mandada coincide  con el auxiliar regresaremos el valor del auxiliar
                return aux;
            } else {//Si no regresamos nulo porque no se encontro el nodo
                return null;
            }

        }

    }
/**
*Método para borrar la información de algún nodo
*/
    public void eNode(T data) {
        SimpleNode aux; //variable auxiliar de tipo nodo simple
        aux = pivot;// le damos a la variable el valor de pivote
        while (aux.next != pivot && aux.data != data) {/*Mientras el valor siguiente del aux sea diferente de pivote
            y la data de aux no coincida con la data requerida ira recorriendo la lista.*/
            aux = aux.next;
        }
        //Al salir del ciclo preguntamos si el valor que sigue es igual a pivote, si es verdad significa que la data no fue encontrada 
        if (aux.next == pivot) {
            System.out.println("No se encuentra el nodo");
        }
        //Si la data del auxiliar es igual a la que queremos eliminar simplemente nos brincaremos ese nodo y asi lo desaparecemos.
        if (aux.data == data) {
            aux.next = aux.next.next;
        }
    }

}
