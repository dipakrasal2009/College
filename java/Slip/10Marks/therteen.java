//Q1. Construct a Linked List having names of Fruits: Apple, Banana, Guava and Orange. Display the
//contents of the List using an Iterator. 
//:-

import java.util.LinkedList;
import java.util.Iterator;

public class therteen {
    public static void main(String[] args) {
        // Create a LinkedList of fruit names
        LinkedList<String> fruitList = new LinkedList<>();

        // Add fruit names to the list
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Guava");
        fruitList.add("Orange");

        // Create an iterator to traverse the list
        Iterator<String> iterator = fruitList.iterator();

        // Display the contents using the iterator
        System.out.println("Fruit List:");
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}

