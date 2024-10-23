import java.util.Scanner;
class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class doublelinked_list {
    Node head;
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }
    public void traverse() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node temp = head;
        System.out.print("List elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        doublelinked_list dll = new doublelinked_list();

        System.out.println("Enter the number of elements you want to add to the list:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            int data = scanner.nextInt();
            dll.insertAtEnd(data);
        }
      
        System.out.println("Traversing the doubly linked list:");
        dll.traverse();

        sc.close();
    }
}
