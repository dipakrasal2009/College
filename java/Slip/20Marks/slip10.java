

//Q2. Create a package “utility”. Define a class CapitalString under “utility” package which will contain
//a method to return String with first letter capital. Create a Person class (members – name, city)
//outside the package. Display the person name with first letter as capital by making use of
//CapitalString.
//:-



package utility;
public class CapitalString {
    public static String capitalizeFirstLetter(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
}

import utility.CapitalString;
class slip10
{
    public static void main(String[] args) {
        Person person=new Person("john","New York");

        String capitalizedName=CapitalString.capitalizeFirstLetter(person.getName());

        System.out.println("Persons Name:- "+capitalizedName);
        System.out.println("Persons city:- "+person.getCity());
    }
}
public class Person {
    private String name;
    private String city;

    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}

                                                       


