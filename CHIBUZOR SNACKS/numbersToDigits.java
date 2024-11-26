public class NumberToDigits {
    public static void main(String[] args) {
        int number = 2342;
        int[] digits = numberToDigits(number);
        for (int count = 0; count < digits.length; count++) {
            System.out.print(digits[count] + " ");
        }
    }

    public static int[] numberToDigits(int number) {
         String numberString = String.valueOf(number);
        int[] digits = new int[numberString.length()];
        for (int count = 0; count < numberString.length(); count++) {
            digits[count] = Character.getNumericValue(numberString.charAt(count));
        }
        return digits;
    }
}
