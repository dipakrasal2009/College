//Q2. Write a program to read the contents of “abc.txt” file. Display the contents of file in uppercase
//as output. 
//:-
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//abstractfile
public class slip18 {
    public static void main(String[] args) {
        try {
            // Specify the file path
            String filePath = "input.txt";

            // Create a BufferedReader to read the file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            String line;
            StringBuilder content = new StringBuilder();

            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

            // Close the file
            reader.close();

            // Convert the content to uppercase
            String upperCaseContent = content.toString().toUpperCase();

            // Display the content in uppercase
            System.out.println(upperCaseContent);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
