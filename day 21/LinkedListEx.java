class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;


    public void insertAtFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }


    public void deleteAtFirst() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        head = head.next;
    }

    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;//next.next is used to stop at the second last node, so you can remove the last node safely.
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // Insert at a specific position (0-based index)
    public void insertAtPosition(int value, int position) {
        if (position < 0) {
            System.out.println("Invalid position.");
            return;
        }
        if (position == 0) {
            insertAtFirst(value);
            return;
        }
        Node newNode = new Node(value);
        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // Delete at a specific position (0-based index)
    public void deleteAtPosition(int position) {
        if (position < 0 || head == null) {
            System.out.println("Invalid position or list is empty.");
            return;
        }
        if (position == 0) {
            deleteAtFirst();
            return;
        }
        Node current = head;
        for (int i = 0; i < position - 1 && current.next != null; i++) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        current.next = current.next.next;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");  
    }
}

// Main class to test
public class LinkedListEx {
    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();

        list.insertAtFirst(30);
        list.insertAtFirst(20);
        list.insertAtFirst(10);

        list.display();  // Output: Linked List: 10 -> 20 -> 30 -> null

        list.deleteAtFirst();
        list.display();  // Output: Linked List: 20 -> 30 -> null

        list.insertAtEnd(40);
        list.display();  // Output: Linked List: 20 -> 30 -> 40 -> null

        list.deleteAtEnd();
        list.display();  // Output: Linked List: 20 -> 30 -> null

        list.insertAtPosition(25, 1);
        list.display();  // Output: Linked List: 20 -> 25 -> 30 -> null

        list.deleteAtPosition(1);
        list.display();  // Output: Linked List: 20 -> 30 -> null

    }
}
