package utility;

public class CapitalString {

    // Method to capitalize the first letter of a string
    public String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str; // Return the original string if null or empty
        }
        // Capitalize the first letter and concatenate with the remaining string
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}

