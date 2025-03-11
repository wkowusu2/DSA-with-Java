package DataStructures.dataStructures;
import java.util.LinkedList;


public class LinkedListCode {
    public static void main(String[] args) {
        // using java's inbuilt LinkedList Class 
        // LinkedList nums = new LinkedList<>();
        // nums.add(5); 
        // nums.add(10);
        // nums.addFirst(13);
        // System.out.println(nums.get(2));
        // System.out.println(nums.element());
        // System.out.println(nums); // prints [5, 10] 
        LinkedListClass nums = new LinkedListClass();
        nums.add(5);
        nums.add(10);
        // nums.add(15);
        nums.add(20);
        nums.addFirst(15);
        nums.deleteNode(10);
        nums.printList();
    }
}
