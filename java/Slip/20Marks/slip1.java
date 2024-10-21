
//Q2. Construct a linked List containing names of colours: red, blue, yellow and orange. Then
//extend the program to do the following:
//i. Display the contents of the List using an Iterator
//ii. Display the contents of the List in reverse order using a ListIterator
//iii. Create another list containing pink and green. Insert the elements of this list between
//blue and yellow
//:-

import java.util.*;
//ColorsLinkedList
public class slip1 {
        public static void main(String[] args) {
            // Create a linked list of colors
            LinkedList<String> colorList = new LinkedList<>();
            colorList.add("red");
            colorList.add("blue");
            colorList.add("yellow");
            colorList.add("orange");

            // i. Display the contents of the List using an Iterator
            System.out.println("Contents of the list using an Iterator:");
            Iterator<String> iterator = colorList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

            // ii. Display the contents of the List in reverse order using a ListIterator
            System.out.println("\nContents of the list in reverse order using a ListIterator:");
            ListIterator<String> listIterator = colorList.listIterator(colorList.size());
            while (listIterator.hasPrevious()) {
                System.out.println(listIterator.previous());
            }

            // iii. Create another list containing pink and green. Insert elements between blue and yellow
            LinkedList<String> newColors = new LinkedList<>();
            newColors.add("pink");
            newColors.add("green");

            // Insert elements between "blue" and "yellow"
            ListIterator<String> insertionPoint = colorList.listIterator();
            while (insertionPoint.hasNext()) {
                if (insertionPoint.next().equals("blue")) {
                    insertionPoint.add(newColors.poll()); // Insert pink
                    insertionPoint.add(newColors.poll()); // Insert green
                    break;
                }
            }

            // Display the updated list
            System.out.println("\nUpdated list with pink and green inserted between blue and yellow:");
            for (String color : colorList) {
                System.out.println(color);
            }
        }
    }
