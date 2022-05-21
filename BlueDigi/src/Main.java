import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class Main {
	
	Pets pet = new Pets();
	Scanner sc = new Scanner(System.in);
	
	public Main() {
		title();
		int choose;
		do {
			petStatus();
			menu();
			System.out.print("What do you want to do? ");
			choose = getInput();
			String animal = choosePet(choose);
			switch(choose) {
			case 1:
				play(animal);
				break;
			case 2:
				eat(animal);
				break;
			case 3:
				bath(animal);
				break;
			case 4:
				break;
			}
		}while(choose != 4);
	}
	
	private void bath(String animal) {
		
		if(animal.equals("Dochie")) {
			pet.getHedgehog().validateBath();
		}else if(animal.equals("Soju")) {
			pet.getDog().validateBath();
		}
		System.out.println();
		System.out.println("Press enter to continue...");
		sc.nextLine();
	}

	private void eat(String animal) {

		ArrayList<String> foods = new ArrayList<>(Arrays.asList("Wet Food", "Dry Food"));
		int food;
		
		if(animal.equals("Dochie")) {
			for(int i = 0; i < foods.size(); i++) {
				System.out.println(i+1 + ". " + foods.get(i));
			}
			System.out.print("Give Dochie what food?: ");
			food = getInput();
			System.out.println("Dochie is eating " + foods.get(food-1));
			pet.getHedgehog().validateEat();
		}else if(animal.equals("Soju")) {
			for(int i = 0; i < foods.size(); i++) {
				System.out.println(i+1 + ". " + foods.get(i));
			}
			System.out.print("Give Soju what food?: ");
			food = getInput();
			System.out.println("Soju is eating " + foods.get(food-1));
			pet.getDog().validateEat();
		}
		System.out.println();
		System.out.println("Press enter to continue...");
		sc.nextLine();
	}

	private void play(String animal) {
		
		if(animal.equals("Dochie")) {
			pet.getHedgehog().validatePlay();
		}else if(animal.equals("Soju")) {
			pet.getDog().validatePlay();
		}
		System.out.println();
		System.out.println("Press enter to continue...");
		sc.nextLine();
	}
	
	private String choosePet(int choose) {
		String animal = null;
		do {
			if(choose == 1) {
				System.out.print("Which pet do you want to play with? [Dochie | Soju] (case sensitive): ");
				animal = sc.nextLine();
			}else if(choose == 2) {
				System.out.print("Which pet do you want to feed? [Dochie | Soju] (case sensitive): ");
				animal = sc.nextLine();
			}else if(choose == 3) {
				System.out.print("Which pet do you want to give a bath? [Dochie | Soju] (case sensitive): ");
				animal = sc.nextLine();
			}
		}while(!animal.equals("Dochie") && !animal.equals("Soju"));
		return animal;
	}

	private int getInput() {
		int input = 0;
		try {
			input = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Input must be a number!");
		}
		sc.nextLine();
		return input;
	}
	
	private void menu() {
		System.out.println("----------------------");
		System.out.println("|        Menu        |");
		System.out.println("----------------------");
		System.out.println("| 1. Play            |");
		System.out.println("| 2. Eat             |");
		System.out.println("| 3. Bath            |");
		System.out.println("| 4. Exit            |");
		System.out.println("----------------------");
	}
	
	private void petStatus() {
		System.out.println("----------------------");
		System.out.println("|     Pet Status     |");
		System.out.println("----------------------");
		pet.getHedgehog().petStatus();
		System.out.println("----------------------");
		pet.getDog().petStatus();
		System.out.println("----------------------");
	}
	
	private void title() {
		System.out.println("----------------------");
		System.out.println("| Welcome to Digipet |");
		System.out.println("----------------------");
		System.out.println();
	}

	public static void main(String[] args) {
		new Main();
	}

}
