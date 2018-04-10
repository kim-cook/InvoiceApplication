package chapter3;

public class Invoice {

    private String partNumber;
    private String partDescription;
    private int quantityPurchased;
    private double pricePerItem;

    //class Invoice constructor
    public Invoice (String partNumber, String partDescription, int quantityPurchased, double pricePerItem){

        this.partNumber = partNumber;
        this.partDescription = partDescription;

        //checks if quantityPurchased and pricePerItem is a negative number
        if(quantityPurchased > 0){
            this.quantityPurchased = quantityPurchased;
        }

        if(pricePerItem > 0.0){
            this.pricePerItem = pricePerItem;
        }
    }

    //getters and setter for class Invoice instance variables
    public String getPartNunber() {
        return partNumber;
    }

    public void setPartNunber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantityPurchased() {
        return quantityPurchased;
    }

    public void setQuantityPurchased(int quantityPurchased) {
        this.quantityPurchased = quantityPurchased;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount(){

        double invoiceAmount = quantityPurchased * pricePerItem;

        return invoiceAmount;
    }




}
