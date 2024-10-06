//Q1. Construct a Linked List having names of Fruits: Apple, Banana, Guava and Orange. Displaythe
//contents of the List in reverse order using an appropriate interface.
//:-

import java.util.LinkedList;
        import java.util.List;
        import java.util.ListIterator;

//fruits	
public class fifteen {
    public static void main(String[] args) {
        // Create a linked list of fruit names
        List<String> fruitList = new LinkedList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Guava");
        fruitList.add("Orange");

        // Use ListIterator to traverse the list in reverse order
        ListIterator<String> listIterator = fruitList.listIterator(fruitList.size());

        System.out.println("Fruit List in Reverse Order:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}

