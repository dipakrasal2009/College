
//Q2. Create an abstract class “order” having members id, description. Create a subclass “Purchase
//Order” having member as customer name. Define methods accept and display. Create 3 objects
//each of Purchase Order. Accept and display the details. 
//:-
abstract class Order {
    protected int id;
    protected String description;

    public Order(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public abstract void accept();
    public abstract void display();
}

class PurchaseOrder extends Order {
    private String customerName;

    public PurchaseOrder(int id, String description, String customerName) {
        super(id, description);
        this.customerName = customerName;
    }

    @Override
    public void accept() {
        // You can implement the input logic here to accept the customer name
    }

    @Override
    public void display() {
        System.out.println("Order ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Customer Name: " + customerName);
    }
}

class slip19 {
    public static void main(String[] args) {
        PurchaseOrder order1 = new PurchaseOrder(1, "First Order", "John Doe");
        PurchaseOrder order2 = new PurchaseOrder(2, "Second Order", "Jane Smith");
        PurchaseOrder order3 = new PurchaseOrder(3, "Third Order", "Alice Johnson");

        order1.accept();  // You can implement logic to accept details here
        order2.accept();
        order3.accept();

        order1.display();
        order2.display();
        order3.display();
    }
}
