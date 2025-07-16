

class Product {
    int itemNo;
    String name;
    double price;
    int quantity;
    Product(int itemNo, String name, double price, int quantity) {
        this.itemNo = itemNo;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public int getItemNo() { return itemNo; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public String toString() {
        return "ItemNo: " + itemNo + ", Name: " + name + ", Price: " + price + ", Quantity: " + quantity;
    }
}

 class ProductMain {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product(101, "Pen", 10.0, 100);
        products[1] = new Product(102, "Pencil", 5.0, 150);
        products[2] = new Product(103, "Notebook", 50.0, 60);
        products[3] = new Product(104, "Eraser", 3.0, 200);
        products[4] = new Product(105, "Sharpener", 7.0, 120);

        for (Product p : products) {
            System.out.println(p);
        }
    }
}