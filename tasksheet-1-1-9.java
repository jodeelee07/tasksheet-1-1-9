public class Math{
    public static int add(int a, int b) {
    return a + b;
    }
    public static int subtract(int a, int b) {
    return a - b;
    }
    public static int multiply(int a, int b) {
	return a * b;
	}
	public static double divide(double a, double b) {
	return a / b;
    }

public static void main (String[] args) {
int result = Math.add(15, 4);
System.out.println("Sum: "+result);
int result2 = Math.subtract(15, 4);
System.out.println("Difference: "+result2);
int result3 = Math.multiply(15, 4);
System.out.println("Product: "+result3);
double result4 = Math.divide(15, 4);
System.out.println("Quotient: "+result4);
}
}
