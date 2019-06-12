public class SumofArray{
	public static void main(String[] args) {
		int[] array = {2,6,7,8,9};
		int sum = 0;
		
		for(int num : array){
			sum = sum + num;
		}
		System.out.println("Sum is: "+sum);

	}
}