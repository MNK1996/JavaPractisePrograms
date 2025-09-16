package DSA;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;


    public LinkedList(int value) {
        Node n = new Node(value);
        head = n;
        tail = n;
        length = 1;
    }

    class Node {
        Node next;
        int value;

        Node(int value) {
            this.value = value;
        }
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength(int length) {
        return length;
    }


    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node n = new Node(value);
        if (length == 0) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
        length++;
    }

    public Node removeLast() {
        Node pre = head;
        Node temp = head;
        if (length == 0) return null;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }


}