package Lesson8Ex2Of3;

public class Invoice {
    private String deviceModel;
    private String productDescription;
    public int quantityPurchased;
    public double unitPrice;

    public Invoice(String deviceModel, String productDescription, int quantityPurchased, double unitPrice) {
        //constructor Invoice care va initializa atributele
        this.deviceModel = deviceModel;
        this.productDescription = productDescription;
        this.quantityPurchased = quantityPurchased;
        this.unitPrice = unitPrice;
    }
    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setQuantityPurchased(int quantityPurchased) {
        //conditie in caz pretul e negativ
        if (quantityPurchased > 0) {
            this.quantityPurchased = quantityPurchased;
        } else {
            this.quantityPurchased = 0;
        }
    }

    public int getQuantityPurchased() {
        return quantityPurchased;
    }

    public void setUnitPrice(double unitPrice) {
        //conditie in caz pretul e negativ
        if (unitPrice > 0.0) {
            this.unitPrice = unitPrice;
        } else {
            this.unitPrice = 0.0;
        }
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getInvoice() {
        if (unitPrice > 0.0 && quantityPurchased > 0) {
            return unitPrice * quantityPurchased;
        } else if (unitPrice < 0.0 || quantityPurchased < 0) {
            System.out.println("Error");
        }
        return 0;
    } //chemat la clasa InvoiceMagazin
}


