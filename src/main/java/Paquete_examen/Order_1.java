package Paquete_examen;

public class Order_1 {
    private int orderid;
    private String dateCreated;
    private String dateShipped;
    private String CustomerName;
    private String CustomerID;
    private String status;
    private String shippingID;

    private Customer customer;
    
    public Order_1(int orderid, String dateCreated, String dateShipped, String CustomerName, String CustomerID, String status, String shippingID) {
        this.orderid = orderid;
        this.dateCreated = dateCreated;
        this.dateShipped = dateShipped;
        this.CustomerName = CustomerName;
        this.CustomerID = CustomerID;
        this.status = status;
        this.shippingID = shippingID;
    }
    
    
    
    public void placeOrder()
    {
        
    }
    
}
