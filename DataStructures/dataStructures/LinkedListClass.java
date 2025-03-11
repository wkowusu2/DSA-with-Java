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
        current = head; 
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void addFirst(int data){
        Node newNode = new Node(data); 
        //my own logic but requries extral time
        // if(head == null){
        //     head = newNode;
        // }else{
        //     Node tempNode = head;
        //     head = newNode; 
        //     head.next = tempNode;
        // }
        
        //actual logic, requires less time
        newNode.next = head;
        head = newNode;
    }

    public void deleteNode(int data){
        current = head; 
        while(current != null && current.next.data != data){
             current = current.next;
        }
        current.next = current.next.next;
    }
}
