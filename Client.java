import java.util.ArrayList;

class Client extends Person {
  private int clientID;
  private ArrayList<Order> orders;
  
  public Client(int clientID, String name, String email, String phoneNumber) {
    super(name, email, phoneNumber)
      this.clientID = clientID
      this.orders = new ArrayList<>();
  }
  
  public int getClientID() {
    return clientID;
  }
  
  public void setClientID(int clientID) {
    this.clientID = clientID
  }
  
  public ArrayList<Order> getOrders() {
    return orders;
  }
  
  public void addOrder(Order order) {
    this.orders.add(order)
  }
}
