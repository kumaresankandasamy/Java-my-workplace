import java.util.Scanner;
public class  UserAddElementArraySum{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] array = new int[10];
		int sum = 0;
		System.out.println("Enter the elements; ");
		for(int i=0;i<array.length;i++){
			array[i]=s.nextInt();
		}
		for(int num : array){
			sum = sum + num;
		}
		System.out.println("sum is: "+sum);
	}
}