package chapter3;

public class InvoiceTest {

    public static void main (String [] args){

        Invoice purchase = new Invoice ("A123456Q", "Hammer", 10, 12.0);

        System.out.println("Invoice amount is: " + purchase.getInvoiceAmount());

    }
}
