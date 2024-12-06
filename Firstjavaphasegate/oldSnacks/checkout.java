import java.util.ArrayList;
import java.util.Scanner;

public class Checkout {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> productBought = new ArrayList<>();
        ArrayList<Integer> productSize = new ArrayList<>();
        ArrayList<Double> productPrice = new ArrayList<>();
        
        System.out.println("What is the customer's name? ");
        String name = input.nextLine();
        displayQuestions(name, input, productBought, productSize, productPrice);
    }
    
    public static void displayQuestions(String name, Scanner input, ArrayList<String> productBought, ArrayList<Integer> productSize, ArrayList<Double> productPrice) {
        System.out.print("What did the user buy?: ");
        productBought.add(input.nextLine());
        
        System.out.print("How many pieces?: ");
        productSize.add(input.nextInt());
        
        System.out.print("How much per unit?: ");
        productPrice.add(input.nextDouble());
        input.nextLine();
        
        System.out.print("Add more items? (yes/no): ");
        if (input.nextLine().equalsIgnoreCase("yes")) {
            displayQuestions(name, input, productBought, productSize, productPrice);
        } else {
            System.out.print("Cashier: What is your name?: ");
            String cashier = input.nextLine();
            
            System.out.print("What is the discount amount?: ");
            double discount = input.nextDouble();
            
            displayCustomerInvoice(name, cashier, input, productBought, productSize, productPrice, discount);
        }
    }
    
    public static void displayCustomerInvoice(String name, String cashier, Scanner input, ArrayList<String> productBought, ArrayList<Integer> productSize, ArrayList<Double> productPrice, double discount) {
        System.out.println("""
        SEMICOLON STORES
        MAIN BRANCH
        LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
        TEL: 08083484717
        DATE: 25-JAN-24 6:35:12PM
        """);
        System.out.printf("Cashier: %s%nCustomer Name: %s%n", cashier, name);
        System.out.println("======================================================");
        System.out.printf("%s\t%s\t%s\t%s%n", "Item", "QTY", "PRICE", "TOTAL");
        
        double subTotal = displayItems(productBought, productSize, productPrice);
        double totalDiscount = subTotal * (discount / 100);
        double VAT = subTotal * 0.175;
        
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("Subtotal: %.2f%nDiscount: %.2f%nVAT @ 17.50: %.2f%n", subTotal, totalDiscount, VAT);
        System.out.println("------------------------------------------------------------------------------------");
        
        double billTotal = (subTotal - totalDiscount) + VAT;
        System.out.printf("Bill Total: %.2f%n", billTotal);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("THIS IS NOT A RECEIPT. KINDLY PAY " + billTotal);
        System.out.println("-------------------------------------------------------------------------------------");
        
        System.out.print("How much did the customer give you?: ");
        double payment = input.nextDouble();
        
        if (payment >= billTotal) {
            PaymentDetails(payment, billTotal);
        } else {
            System.out.println("Fund not enough.");
        }
    }
    
    public static double displayItems(ArrayList<String> productBought, ArrayList<Integer> productSize, ArrayList<Double> productPrice) {
        double subTotal = 0.0;
        for (int counter = 0; counter < productBought.size(); counter++) {
            double total = productSize.get(counter) * productPrice.get(counter);
            System.out.printf("%s\t%d\t%.2f\t%.2f%n", productBought.get(counter), productSize.get(counter), productPrice.get(counter), total);
            subTotal += total;
        }
        return subTotal;
    }
    
    public static void PaymentDetails(double payment, double billTotal) {
        System.out.println();
        System.out.printf("Amount paid: %.2f%n", payment);
        double change = payment - billTotal;
        System.out.printf("Balance: %.2f%n", change);
        System.out.println("------------------------------------------------------------------------------------");
    }
}
