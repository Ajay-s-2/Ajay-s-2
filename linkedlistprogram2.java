import java.util.Scanner;

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

    // Method to add elements at the end of the list
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    // Merge two lists by interleaving the nodes
    public void mergeAlternate(LinkedList otherList,int n) {
        Node p1 = this.head;
        Node p2 = otherList.head;
        Node next1, next2;

        // while (p1 != null && p2 != null) {
        //     next1 = p1.next;
        //     next2 = p2.next;

        //     p1.next = p2;  // Link p1 -> p2
        //     if (next1 == null) {
        //         break;
        //     }
        //     p2.next = next1;  // Link p2 -> next1

        //     p1 = next1;
        //     p2 = next2;
        // }
        for(int i=0;i<n;i++){
            if(p1!=null){
                System.out.print(p1.data+" ");
                p1=p1.next;
            }
            else{
                System.out.print("_");
            }
            if(p2!=null){
                System.out.print(p2.data+" ");
                p2=p2.next;
            }
            else{
                System.out.print("_");
            }
        }
    }
}

public class linkedlistprogram2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        // Input for List 1
        System.out.println("Enter the number of elements in List 1:");
        int n1 = sc.nextInt();
        System.out.println("Enter the elements of List 1:");
        for (int i = 0; i < n1; i++) {
            int element = sc.nextInt();
            list1.append(element);
        }

        // Input for List 2
        System.out.println("Enter the number of elements in List 2:");
        int n2 = sc.nextInt();
        System.out.println("Enter the elements of List 2:");
        for (int i = 0; i < n2; i++) {
            int element = sc.nextInt();
            list2.append(element);
        }

        // Print the lists before merging
        System.out.println("List 1:");
        list1.printList();

        System.out.println("List 2:");
        list2.printList();

        // Merge lists by interleaving
        list1.mergeAlternate(list2,n2);

        // Print the merged list
        // System.out.println("Merged List:");
        // list1.printList();

        sc.close();
    }
}
