import java.util.*;
 public class BinarytoDecimal{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the binary number: ");
		String binaryString =s.nextLine();
       System.out.println("result: "+Integer.parseInt(binaryString,2));
  	}
}