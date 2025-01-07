import java.util.Scanner;
public class CompoundInterestCalculator {
    public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);
        System.out.println("Step 1: Initial Investment");
        System.out.print("Initial Investment\nAmount of money that you have available to invest initially: ");
        double initialInvestment = input.nextDouble();

        System.out.println("Step 2: Contribute");
        System.out.print("Monthly Contribution\nAmount tht you plan to add to the principal every month, or a negative number for the amount that you plan to withdraw every month.: ");
        double monthlyContribution = input.nextDouble();
        System.out.print("Length of time in year\nLength of time in years that you plan to save: ");
        int year = input.nextInt();

        System.out.println("Step 3: Interest Rate");
        System.out.print(" Your Estimated Interest Rate\nYour Estimated Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();
        System.out.println("Interest Rate Variance Range\nRange of interest rate (above and below the rate set above) that you desire to see result for.: ");
        double varianceRange = input.nextDouble();

        double totalAmount = calculateCompoundInterest(initialInvestment, monthlyContribution, annualInterestRate, year, varianceRange);
        System.out.printf("Total Amount of Interest Rate: %.2f\n", totalAmount);


    }

    private static double calculateCompoundInterest(double initialInvestment, double monthlyContribution, double annualInterestRate, int year, double varianceRange ) {
        double ratePerPeriod = annualInterestRate / 100 / varianceRange;
        int totalPeriod = (int) (year * varianceRange);
        int totalAmount = (int) initialInvestment;

        for (int i = 0; i < totalPeriod; i++) {
            totalAmount += (int) (monthlyContribution * 12 / varianceRange);
            totalAmount *= (ratePerPeriod);


        }
        return totalAmount;
    }
}







		
		