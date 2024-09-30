import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//file world count
public class SetA4 {
    public static void main(String[] args) {
        String filePath = "/home/hppc/Desktop/github/College/java/assignment2/assignment3/SetA4.java"; // Replace with the actual file path
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int charCount = 0, wordCount = 0, lineCount = 0;
            String line;
            
            // Reading each line of the file
            while ((line = reader.readLine()) != null) {
                lineCount++; // Incrementing line count
                charCount += line.length(); // Counting characters in each line
                
                // Splitting the line into words based on spaces
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            
            // Displaying the counts
            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);
            
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

