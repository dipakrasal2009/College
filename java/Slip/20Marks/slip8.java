

//Q2. Define a class MyDate (day, month, year) with methods to accept and display MyDate object. Accept date as dd, mm, yyyy. Throw user defined exception “InvalidDateException” ifthe date is
//invalid. Examples of invalid dates : 12 15 2015, 31 6 1990, 29 2 2001
//:-

class InvalidDateException extends Exception {
    public InvalidDateException(String message) {
        super(message);
    }
}

class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) throws InvalidDateException {
        if (!isValidDate(day, month, year)) {
            throw new InvalidDateException("Invalid date entered.");
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    private boolean isValidDate(int day, int month, int year) {
        if (month < 1 || month > 12 || day < 1) {
            return false;
        }

        int maxDays = 31;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                maxDays = 30;
                break;
            case 2:
                maxDays = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28;
                break;
        }

        return day <= maxDays;
    }

    public void displayDate() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }
}

public class slip8 {
    public static void main(String[] args) {
        try {
            MyDate date1 = new MyDate(12, 5, 2015); // Invalid date
            date1.displayDate();
        } catch (InvalidDateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            MyDate date2 = new MyDate(31, 6, 1990); // Invalid date
            date2.displayDate();
        } catch (InvalidDateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            MyDate date3 = new MyDate(29, 2, 2001); // Invalid date
            date3.displayDate();
        } catch (InvalidDateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
