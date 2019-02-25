/*
public class LinkedList {
    Node head;

    public void append(String data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next; //하나씩 이동
        }
        //current.next가 null 일때 = 맨끝일때
        current.next = new Node(data);
    }

    public void prepend(String data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void delete(String data) {
        if (head == null) { return; }
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
}


class Node {
    Node next = null;
    String data;

    public Node(String data) {
            this.data = data;
        }
}
*/