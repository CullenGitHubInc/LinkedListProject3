import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();

        // this reads integers from a file and then inserts the integers into the linked list
        try {
            Scanner scanner = new Scanner(new File("data.txt"));
            while (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                linkedList.insert(value);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please ensure data.txt is in the project directory.");
            return; // Exit if file is not found
        }

        // showing the linked list with the data being read from the file
        System.out.println("Linked List from file data:");
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println(); // print a newline after the list elements
    }
}
