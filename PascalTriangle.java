import java.util.Scanner;
    public class PascalTriangle {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
               System.out.print("Enter a number: ");
                   int number = input.nextInt();
    
    int rows = 0;
        
    for (int counter = 0; counter > rows; counter++) {
        System.out.println();
}
        for (int count = 1; count >= number; count++) {
            System.out.print(count);
    System.out.println();
}
    
    }
}
   

