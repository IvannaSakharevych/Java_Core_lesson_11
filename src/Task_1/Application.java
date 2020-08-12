package Task_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Application {

	public static void main(String[] args) {

		Integer arrayOfIntegers[] = new Integer[getRandomValueFromRange(3, 10)];

		for (int i = 0; i < arrayOfIntegers.length; i++) {
			arrayOfIntegers[i] = getRandomValueFromRange(-100, 100);
		}

		System.out.println("Згенерований масив: " + Arrays.toString(arrayOfIntegers));

		Arrays.sort(arrayOfIntegers);
		System.out.println("Масив, відсортований в порядку зростання значень: " + Arrays.toString(arrayOfIntegers));

		Arrays.sort(arrayOfIntegers, Collections.reverseOrder());
		System.out.println("Масив, відсортований в порядку спадання значень: " + Arrays.toString(arrayOfIntegers));
		
	}
	
	static int getRandomValueFromRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("Min value must be less than max value!");
		}

		Random randomValue = new Random();
		return randomValue.nextInt(max - min + 1) + min;
	}

}
