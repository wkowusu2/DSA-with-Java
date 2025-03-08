package DataStructures.dataStructures;


class Node{
    int data; 
    Node next;

    //making the constructor
    public Node(int data) {
        this.data = data;
        next = null;
    }
}
public class LinkedListClass {
    Node head = null; 
    Node current; 
    public void add(int data){

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }else{
            current = head; 
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
            return ;
        }

    }
    public void printList(){
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
