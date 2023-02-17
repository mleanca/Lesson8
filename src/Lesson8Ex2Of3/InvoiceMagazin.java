package Lesson8Ex2Of3;

public class InvoiceMagazin {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("LG Masina de Spalat A10", "Culoare alb, din otel", 2, 15000 );
        System.out.println("Device Model: " + invoice1.getDeviceModel());
        System.out.println("Product Description: " + invoice1.getProductDescription());
        System.out.println("Quantity Purchased: " + invoice1.getQuantityPurchased());
        System.out.println("Unit Price: " + invoice1.getUnitPrice());
        System.out.println("TOTAL AMOUNT: " + invoice1.getInvoice());
        //Device Model: LG Masina de Spalat A10
        //Product Description: Culoare alb, din otel
        //Quantity Purchased: 2
        //Unit Price: 15000.0
        //TOTAL AMOUNT: 30000.0

        System.out.println();

        Invoice invoice2 = new Invoice("N/A", "N/A", -1, -1500);
        System.out.println("Device Model: " + invoice2.getDeviceModel());
        System.out.println("Product Description: " + invoice2.getProductDescription());
        System.out.println("Quantity Purchased: " + invoice2.getQuantityPurchased());
        System.out.println("Unit Price: " + invoice2.getUnitPrice());
        System.out.println("TOTAL AMOUNT: " + invoice2.getInvoice());
        //Device Model: N/A
        //Product Description: N/A
        //Quantity Purchased: -1
        //Unit Price: -1500.0
        //Error
        //TOTAL AMOUNT: 0.0
    }
}
