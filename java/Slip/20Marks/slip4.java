





//Q2. Write a program which define class Product with data member as id, name and price. Store
//the information of 5 products and Display the name of product having minimum price (Use arrayof
//object
//:-
//
class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

  class ProductDemo {
    public static void main(String[] args) {
        // Create an array to store 5 products
        Product[] products = new Product[5];

        // Initialize the products
        products[0] = new Product(1, "Product A", 10.50);
        products[1] = new Product(2, "Product B", 8.75);
        products[2] = new Product(3, "Product C", 15.25);
        products[3] = new Product(4, "Product D", 6.99);
        products[4] = new Product(5, "Product E", 12.50);

        // Find the product with the minimum price
        Product minPriceProduct = products[0];
        for (int i = 1; i < products.length; i++) {
            if (products[i].price < minPriceProduct.price) {
                minPriceProduct = products[i];
            }
        }

        // Display the name of the product with the minimum price
        System.out.println("Product with the minimum price: " + minPriceProduct.name);
    }
}
