package Task_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import Task_2.Helm.Material;

public class Application {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Material material[] = Material.values();
		
		while (true) {
			menu();

			switch (scanner.next()) {

			case "1": {
				Car[][] arrayOfCars = new Car[getRandomValueFromRange(3, 10)][getRandomValueFromRange(3, 10)];
				
				for (int i = 0; i < arrayOfCars.length; i++) {
					for (int j = 0; j < arrayOfCars[i].length; j++) {
						arrayOfCars[i][j] = new Car(getRandomValueFromRange(100, 300),
								getRandomValueFromRange(1950, 2020),
								new Helm(getRandomValueFromRange(30, 50),
										material[getRandomValueFromRange(0, material.length - 1)]),
								new Engine(getRandomValueFromRange(2, 12)));
					}
				}
				
				System.out.println(Arrays.deepToString(arrayOfCars));

				break;
			}

			case "2": {
				Car randomCar = new Car(getRandomValueFromRange(100, 300),
						getRandomValueFromRange(1950, 2020),
						new Helm(getRandomValueFromRange(30, 50),
								material[getRandomValueFromRange(0, material.length - 1)]),
						new Engine(getRandomValueFromRange(2, 12)));
				
				Car[] arrayOfCars = new Car[getRandomValueFromRange(3, 10)];
				
				Arrays.fill(arrayOfCars, randomCar);
				
				System.out.println(Arrays.deepToString(arrayOfCars));

				break;
			}
			
			default: {
				System.out.println("Введіть число 1 або 2!");

				break;
			}
			
			}
		}
	}
	
	static void menu() {
		System.out.println("Натисніть 1, щоб вивести масив автомобілів");
		System.out.println("Натисніть 2, щоб заповнити масив одним видом автомобіля");
	}
			
	static int getRandomValueFromRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("Min value must be less than max value!");
		}

		Random randomValue = new Random();
		return randomValue.nextInt(max - min + 1) + min;
	}

}
