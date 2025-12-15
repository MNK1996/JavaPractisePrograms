package DSA.DoublyLinkedList;

public class DoublyLLMain {
    public static void main(String[] args) {
        DoublyLL dl = new DoublyLL(1);
        dl.append(2);
        dl.append(4);
        dl.append(5);
        dl.append(6);
        dl.append(7);
//        dl.removeFirst();
//        dl.removeFirst();
        System.out.println("Get Method : "+dl.get(1).value);

        dl.printNodes();
    }
}