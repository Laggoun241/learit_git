package methods;

import java.util.Arrays;

public class PassByValueDemo {

	public static void main(String[] args) {
		int i = 10;

		changeIntValue(i); // will return the value of i not the one changed
		System.out.println("i after changeIntValue():\t" + i);

		
	// copy the value of i changed into i; so the method will return the value changed
		i = changeInt(i);
		System.out.println("i after chngeInt():\t\t" + i);

		int[] array = { 1, 2, 3 };

		System.out.println("array before changeArray():\t" + Arrays.toString(array));
		changeArray(array);
		System.out.println("array after changeArray():\t" + Arrays.toString(array));

		clearArray(array);
		System.out.println("array after clearArray():\t" + Arrays.toString(array));
	
		
	}

	private static void changeIntValue(int i) {
		i += 100;
	}

	private static int changeInt(int i) {
		i += 100;
		return i;
	}

	private static void changeArray(int[] array) {
		array[1] = 200;
	}

	private static void clearArray(int[] array) {
		array = null;
	}
}
