public class MultiplicationTable{
	public static void main(String [] args){
	
		for(int i = 1; i < 10; i++){
			for(int t = 1; t < 10; t++){
				int product = i * t;
				System.out.printf("%4d * %d = %d\t" , t, i, product);
			}
			System.out.println();

		}

	}


}