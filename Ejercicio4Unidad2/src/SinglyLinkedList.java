public class SinglyLinkedList {
    private Nodo head;

    public void add (int data){
        //Solo se le agrega el valor que es data
        //Creacion de un nodo
        Nodo newNode = new Nodo(data);
        //Si la lista esta vacia, entonces el nuevo nodo es el head
        if (head == null){
            head = newNode;
            return;
        }
        //En caso de que no este vacia la lista
        //Vamos a recorrer todos los nodos hasta encontrar el que tenga la referencia next en null
        //Comenzamos desde el primero
        Nodo current = head;
        while (current.next != null){
            current = current.next;
        }

        //Se agrega el nuevo nodo en la referencia del ultimo nodo
        current.next = newNode;
    }

    public boolean contains (int data){
        Nodo current = head;
        while (current != null){
            if(current.data == data) {
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }
    public void remove (int data){
        if (head == null) return;
        if (head.data == data){
            head = head.next;
        }
        Nodo current = head;
        while (current.next != null && current.data != data){
            current = current.next;
        }
        current.next = current.next.next;
    }

    public void printList(){
        if (head == null){
            System.out.println("Lista vacia");
            return;
        }
        Nodo current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;        
        }
        System.out.println("null");
    }

    public int conteo (int x){
        int contador = 0;
        Nodo temp = head;
        while (head != null){
            if (temp.data == x){
                contador++;
            }
            temp = temp.next;

        }
        return contador;
    }


    
}
