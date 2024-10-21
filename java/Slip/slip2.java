
//Q2. Write a program to accept Doctor Name from 
//the user and check whether it is valid or not.(It
//should not contain digits and special symbol) If it is not valid then throw user defined Exception - Name is Invalid -- otherwise display it
//:-

import java.util.Scanner;
class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

//docter name validator
public slip2 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        try 
		{
            System.out.print("Enter the doctor's name: ");
            String doctorName = scanner.nextLine();
            validateDoctorName(doctorName);
            System.out.println("Doctor's name is valid: " + doctorName);
        }
		catch (InvalidNameException e) 
		{
            System.out.println("Error: " + e.getMessage());
        }
		finally 
		{
            scanner.close();
        }
    }

    public static void validateDoctorName(String name) throws InvalidNameException {
        // Check if the name contains digits or special symbols
        if (name.matches(".[0-9!@#$%^&()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*")) 
		{
            throw new InvalidNameException("Name is Invalid. It should not contain digits or special symbols.");
        }
    }
}
