
package Paquete_examen;

public class ShippingInfo {
    private int shippingID;
    private String shippingType;
    private int shippingRegionID;
    private int shoppingCost;

    private Order_1 order;

    public ShippingInfo(int shippingID, String shippingType, int shippingRegionID, int shoppingCost, Order_1 order) {
        this.shippingID = shippingID;
        this.shippingType = shippingType;
        this.shippingRegionID = shippingRegionID;
        this.shoppingCost = shoppingCost;
        this.order = order;
    }
    
    
    
    public void updateShippingInfo()
    {
        
    }
    
}
