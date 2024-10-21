public class PowerOfAnB {

	public static void main(String[] args) {

System.out.printf("%s\t%s\t%s%n", "a", "b", "pow(a,b)");

	for (int count = 1; count<=5; count++) {
	System.out.printf("%d\t%d\t%d%n", count,count + 1, (int)Math.pow(count, count + 1));

}
}
	} 