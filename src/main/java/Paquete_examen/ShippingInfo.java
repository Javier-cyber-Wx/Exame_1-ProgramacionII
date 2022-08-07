
package Paquete_examen;

public class ShippingInfo {
    private int shippingID;
    private String shippingType;
    private int shippingRegionID;

    private Order_1 order;
    
    public ShippingInfo(int shippingID, String shippingType, int shippingRegionID) {
        this.shippingID = shippingID;
        this.shippingType = shippingType;
        this.shippingRegionID = shippingRegionID;
    }
    
    public void updateShippingInfo()
    {
        
    }
    
}
