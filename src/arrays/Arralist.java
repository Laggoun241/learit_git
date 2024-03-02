package arrays;

import java.util.ArrayList;

public class Arralist {

	public static void main(String[] args) {
		String[] fruits = new String[4];
		fruits[1]="Apple";
		fruits[2]="Strwberry";
		fruits[3]="Orange";
		System.out.println(fruits[2]);
		
		ArrayList fruit = new ArrayList();
		fruit.add("Orange");
		fruit.add("Watermelon");
		fruit.add("Apple");
		fruit.remove("Orange");
		
		System.out.println(fruit);
		
	}

}
