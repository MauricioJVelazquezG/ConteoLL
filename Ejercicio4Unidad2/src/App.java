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
        list.conteo(1);
        list.conteo(2);
        list.conteo(3);
        System.out.println("--------------------");
    }
}
