package controlstatements.loops;

public class ForeachLoopDemo {

	public static void main(String[] args) {
		System.out.println("=========== foreach loop");
		int[] arr = { 1, 2, 3 };
		int sum = 0;
		for (int number : arr) {
			sum += number;
			System.out.println("Number: " + number);
		}
		System.out.println("Sum: " + sum);
		System.out.println("");
		System.out.println("Below are how for each works:");
		for (int i : arr) {
			System.out.println("values of array are: " + i);
		}
	}

}
