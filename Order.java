import java.util.ArrayList;

class Order {
  private int orderID;
  private Client client;
  private ArrayList<Product> products;
  private double totalPrice;
  
  public Order(int orderID, Client client, ArrayList<Product> products) {
    this.orderID = orderID;
    this.client = client;
    this.products = products;
    this.totalPrice = calculateTotalPrice();
  }
  
  private double caldulateTotalPrice() {
    double total = 0
    for(Product product : products) {
      total += product.getPrice();
    }
    return total;
  }
  
    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
