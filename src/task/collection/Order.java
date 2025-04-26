package task.collection;

public class Order {
  int id;
  String customer;
  int totalAmount;

  public Order(int id, String customer, int totalAmount) {
    this.id = id;
    this.customer=customer;
    this.totalAmount=totalAmount;
  }
}
