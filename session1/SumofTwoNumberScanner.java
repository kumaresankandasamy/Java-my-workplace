import java.util.Scanner;
 class SumofTwoNumberScanner{
	public static void main(String[] args) {
	
	int num1,num2,sum;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter first number: ");
	num1 = s.nextInt();
	System.out.println("Enter Second nuber: ");
	num2 = s.nextInt();
	s.close();
	sum = num1+num2;
	System.out.println("Sum is : "+sum);

	}
}