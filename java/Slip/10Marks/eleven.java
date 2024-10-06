//Q1. Write a program create class as MyDate with dd,mm,yy as data members. Write
//parameterized constructor. Display the date in dd-mm-yy format. (Use this keyword)
//:-

public class MyDate {
    private int dd;
    private int mm;
    private int yy;

    public MyDate(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    public void displayDate() {
        System.out.printf("%02d-%02d-%02d%n", this.dd, this.mm, this.yy);
    }

    public static void main(String[] args) {
        MyDate date = new MyDate(4, 11, 2023);
        date.displayDate();
    }
}

