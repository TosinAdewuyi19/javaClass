import java.util.Scanner;
public class TaxCalculator {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
for (int i = 0; i < 3; i++) {
	System.out.print("Enter citizen's name: ");
	String name = input.nextLine();
	System.out.print("Enter" + name + "'s earnings: ");
double earnings = input.nextDouble();

	double tax;
if (earnings <= 30000) {
	tax = earnings * 0.15;
}else {
	tax = earnings *0.20;
}
	System.out.printf("%s owes $%.2f in taxes.%n", name, tax);

		}

	}


}
