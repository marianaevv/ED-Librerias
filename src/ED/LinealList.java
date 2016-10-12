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
public class LinealList <T> {
     private SimpleNode first;// declaracion de variable first tipo nodeClass
    private SimpleNode last;//declaración de variable last tipo nodeClass
//Métodos

    public void insertFirst(T n) {//Método para insertar el primer nodo
        SimpleNode node = new SimpleNode(n);//creamos un objeto llamado node de tipo nodeClass
        if (isEmpty()) {//Preguntamos si la lista esta vacia
            first = node;//si es asi, a la variables firts le asignamos el valor de un nodo
            last = node;// a la variable last le asignamos le asignamos el valor de un nodo
        } else {// en caso de que no este vacia
            node.next = first;//utilizamos node.next para que el nodo lleno apunte a otro nodo y a este se le da la variable firts
            first = node; //y first sera igual a un nodo
        }
    }

    public void insertLast(T n) {// Métpdo para insertar el ultimo nodo de la lista
        SimpleNode node = new SimpleNode(n);//Creación del objeto tipo nodeClass
        /* if(isEmpty()){//Preguntamos
            first = node;
            last = node;
        }else{*/
        node.next = null;// hacemos que no exista un nodo siguiente
        last = node;// y asignamos el ultimo nodo
        //}
    }

    public void borrarInicio() {//Método para borrar el primer nodo
        /* nodeClass aux;
     aux = (nodeClass) first;//se la da a la variable first el valor de null para que no exista
     first = aux.next;*/
        first = first.next;
    }

    public void borrarFinal() {//Método para borrar el ultimo nodo
        SimpleNode aux;
        aux = first;
        while (aux.next.next != null) {
            aux = aux.next;
        }
        last = aux;
        last.next = null;
    }

    public boolean borrarNodo(T d) {
        SimpleNode aux, aux2;
        aux = first;
        aux2 = null;
        while (aux != null && !d.equals(aux.data)) {
            aux2 = aux;
            aux = aux.next;
        }
        if (aux == null) {
            return false;
        }
        if (aux == first) {
            first = first.next;

        } else {
            aux2.next = aux.next;
            return true;
        }
        return true;
    }

    private boolean isEmpty() {//Método para ver si la lista esta vacia
        return first == null;
    }

    public void showList() {//Método para mostrar la lista
        SimpleNode aux1;//declaramos dos variables auxiliares tipo nodeClass para guardar los valores de nuestros nodos
        aux1 = (SimpleNode) first;// aux1 sera igual a first

        if (!isEmpty()) {//Preguntamos si la lista esta llena
            while (aux1 != null) {//Mientras aux1 sea diferente de 1 imprimiremos la informacion
                System.out.print("[" + aux1.data + "]");
                System.out.print(" ->" + " ");
                aux1 = aux1.next;
                
            }System.out.println("");
        
        } else {
            System.out.println("La lista está vacia");

        }
    }
}
