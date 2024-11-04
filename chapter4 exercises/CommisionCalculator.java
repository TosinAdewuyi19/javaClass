import java.util.Scanner;
public class CommissionCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
    final double BASE_PAY = 250;
    final double COMMISSION_RATE = 0.09; 
    double totalSales = 0;
while (true) {
    System.out.print("Enter item value sold (0 to end): ");
    double item = input.nextDouble();
    if (item == 0) {
        break;
}
    totalSales += item;
}
    double totalEarnings = BASE_PAY +(COMMISSION_RATE * totalSales);
    System.out.print("Total earnings: $" + totalEarnings); 
    input.close();



	}


}