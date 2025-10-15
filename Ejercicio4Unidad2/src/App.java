public class App {
    public static void main(String[] args) throws Exception {
        SinglyLinkedList list = new SinglyLinkedList();
        System.out.println("--------------------");
        list.printList();
        System.out.println("--------------------");
        System.out.println("Metiendo datos");
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(3);
        list.printList();
        System.out.println("--------------------");
        System.out.println("El conteo de 1 es: "+list.conteo(1));
        System.out.println("El conteo de 2 es: "+list.conteo(2));
        System.out.println("El conteo de 3 es: "+list.conteo(3));
        System.out.println("--------------------");
    }
}

