public class Kata {

    public static void main(String[] args) {  
        System.out.println(isPrimeNumber(7));  
        System.out.println(isPrimeNumber(10)); 
    }

    	public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int count = 2; count <= Math.sqrt(number); count++) {
            if (number % count == 0) {
                return false;
            }
        }
        return true;
 }

    	public static void main(String[] args) {
        System.out.println(subtract(3, 7));  
        System.out.println(subtract(7, 3));      

    	public static int subtract(int a, int b) {
        return Math.abs(a - b);
    }
}

	public static void main(String[] args) {
        System.out.println(isEven(4));  
        System.out.println(isEven(7));
}
  
  
	public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    

 	public static void main(String[] args) {
        System.out.println(divide(10, 2));  
        System.out.println(divide(10, 0));  
    }

    	public static float divide(int a, int b) {
        if (b == 0) {
            return 0.0f;
        }
        return (float) a / b;
    }

 	public static void main(String[] args) {
        System.out.println(factorOf(10));  
        System.out.println(factorOf(15)); 
    }

    	public static int factorOf(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }

 	public static void main(String[] args) {
        System.out.println(isSquare(25));  
        System.out.println(isSquare(26));  
    }

    	public static boolean isSquare(int number) {
        if (number < 0) {
            return false;
        }
        int root = (int) Math.sqrt(number);
        return root * root == number;
    }

 	public static void main(String[] args) {
        System.out.println(isPalindrome(54145));         
    }

    	public static boolean isPalindrome(int number) {
        String strNumber = String.valueOf(number);
        return strNumber.charAt(0) == strNumber.charAt(4) && strNumber.charAt(1) == strNumber.charAt(3);
    }


 	public static void main(String[] args) {
        System.out.println(factorialOf(5));  
        System.out.println(factorialOf(7));  
    }

   	 public static long factorialOf(int number) {
        if (number == 0) {
            return 1;
        }
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

	public static void main(String[] args) {
        System.out.println(squareOf(5));  
        System.out.println(squareOf(7));  
    }

    	public static long squareOf(int number) {
        return number * number;
    }


}
