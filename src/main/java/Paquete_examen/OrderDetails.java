package Paquete_examen;

public class OrderDetails {
    private int orderID;
    private int productID;
    private String productName;
    private int Quantify;
    private float unitCoast;
    private float subCoast;

    private Customer customer;
    
    public OrderDetails(int orderID, int productID, String productName, int Quantify, float unitCoast, float subCoast) {
        this.orderID = orderID;
        this.productID = productID;
        this.productName = productName;
        this.Quantify = Quantify;
        this.unitCoast = unitCoast;
        this.subCoast = subCoast;
    }
    
    
    
    public void calcPrice()
    {
        
    }
    
}
