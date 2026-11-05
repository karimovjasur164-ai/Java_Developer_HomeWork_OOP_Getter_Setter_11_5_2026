
public class Order {
    private int OrderID;
    private Product2 Product;
    private Customer Customer;
    private int quantity;

    public Order(int OrderID, Product2 Product, Customer Customer, int quantity) {
        setOrderID(OrderID);
        this.Product = Product;
        this.Customer = Customer;
        setQuantity(quantity);
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        if (OrderID > 0) {
            this.OrderID = OrderID;
        }
    }

    public Product2 getProduct() {
        return Product;
    }

    public void setProduct(Product2 Product) {
        this.Product = Product;
    }

    public Customer getCustomer() {
        return Customer;
    }

    public void setCustomer(Customer Customer) {
        this.Customer = Customer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }

    public String toString() {
        return "Buyurtma: " + OrderID +
                "\nMijoz: " + Customer.getCustomerLastName() +
                "\nMahsulot: " + Product.getName() +
                "\nJami: " + (Product.getPrice() * quantity);
    }
}