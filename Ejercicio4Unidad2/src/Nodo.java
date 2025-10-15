public class Nodo {
    int data;
    Nodo next;
    //Fabrica de elementos

    public Nodo (int data) {
        this.data = data;
        this.next = null; //Opcional pero no esta mal que lo pongamos para que no se nos olvide que 
        //la referencia al instanciarlo es null
    }

    
}
