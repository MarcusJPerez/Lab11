import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CarLot {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<LotManipulation> carList = new ArrayList<LotManipulation>(6);
		carList.add(new LotManipulation("Nikolai", "Model S", 2017, 54999.90));
		carList.add(new LotManipulation("Fourd", "Escapade", 2017, 30999.90));
		carList.add(new LotManipulation("Chewie", "Vette", 2017, 44989.95));
		carList.add(new UsedCars("Hyondai", "Prior", 2015, 14795.50, 35987.6));
		carList.add(new UsedCars("GC", "Chirpus", 2013, 8500.00, 12345.0));
		carList.add(new UsedCars("GC", "Witherell", 2016, 14500.00, 3500.3));
		//String[] carsBought = new String[6];
		boolean loop = true;
		//int i = 0;
		System.out.println("Welcome to the Grand Circus Carlot! Let me tell you a little about our cars. ");
		while (loop == true) {

			int listSize = carList.size();
			LotManipulation.printChart(carList, listSize);
			if (carList.size() <= 1) {
				loop = false;
				System.out.println("Sorry, we are out of cars. Please come back another time. ");
			}
			int carSelection = Validator.getInt(scan, "which car would you like to take a look at? ", 1,
					carList.size() + 1);

			System.out.println(carList.get(carSelection - 1));
			String purchase = (Validator.getYOrN(scan, "Would you like to buy this car(Y/N) "));
			if (purchase.equalsIgnoreCase("y")) {

				//carsBought[i] =System.arraycopy( carList,( carList.get(carSelection - 1)), carsBought, i, carList.size() );
				carList.remove(carSelection - 1);
				System.out.println("Excellent! Our finance department will be in touch shortly. ");
				//i++;
			}
			String moreCars = Validator.getYOrN(scan, "Would you like to look at another car? (Y/N) ");
			if (!moreCars.equalsIgnoreCase("y")) {
				loop = false;
			}

		}
//		if( i > 0) {
//			Random random = new Random();
//			int car = (random.nextInt(i)+1);
//			System.out.println("Thank you for visiting the Grand Circus Carlot!Please enjoy your " + carsBought[car]  + " Have a wonderful day!");
//		}
//		else { 
			System.out.println("Thank you for visiting the Grand Circus Carlot! Have a wonderful day!");
		}
	}
