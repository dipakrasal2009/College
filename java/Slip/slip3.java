
//Q2.Write a program to copy the contents from one file into another file in upper case
//:-

import java.io.*;
//copy Upper
public class slip3 {
    public static void main(String[] args) {
        try {
            // Specify the input and output file names
            String inputFile = "input.txt";  // Replace with your input file
            String outputFile = "output.txt";  // Replace with your output file

            // Create File and BufferedReader for input
            FileReader fileReader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Create FileWriter for output
            FileWriter fileWriter = new FileWriter(outputFile);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                // Convert the line to uppercase and write it to the output file
                String upperCaseLine = line.toUpperCase();
                fileWriter.write(upperCaseLine + "\n");
            }

            // Close the input and output streams
            fileReader.close();
            bufferedReader.close();
            fileWriter.close();

            System.out.println("Contents copied to " + outputFile + " in uppercase.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
