import utility.CapitalString;

public class SetA4 {
    private String name;
    private String city;

    // Constructor to initialize name and city
    public SetA4(String name, String city) {
        this.name = name;
        this.city = city;
    }

    // Method to display the person's details with capitalized first letter of the name
    public void display() {
        // Create an instance of CapitalString class
        CapitalString capitalString = new CapitalString();
        
        // Capitalize the first letter of the person's name
        String capitalizedName = capitalString.capitalizeFirstLetter(this.name);
        
        // Display person's name and city
        System.out.println("Name: " + capitalizedName);
        System.out.println("City: " + this.city);
    }
    
    // Main method to test the functionality
    public static void main(String[] args) {
        // Create a Person object with name and city
        SetA4 person = new SetA4("john", "New York");
        
        // Display the person's details with name capitalized
        person.display();
    }
}


//Output:
//
//If you run the Person class, the output will be:
//
//vbnet

//Name: John
//City: New York

//Directory Structure:

//css
/*
src/
   utility/
      CapitalString.java
   Person.java

Compilation and Running:

    Compile the CapitalString class:

    bash

javac -d . utility/CapitalString.java

Compile the Person class:

bash

javac -d . Person.java

Run the Person class:

bash

java Person
*/
