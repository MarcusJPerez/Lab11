import java.util.ArrayList;

public class LotManipulation {
	private String carMake;
	String carModel;
	private int carYear;
	private double carPrice;
	private ArrayList<LotManipulation> arr1;

	public LotManipulation() {

	}

	public LotManipulation(String carMake, String carModel, int carYear, double carPrice) {
		this.carMake = carMake;
		this.carModel = carModel;
		this.carYear = carYear;
		this.carPrice = carPrice;
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public int getCarYear() {
		return carYear;
	}

	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}

	public double getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}

	public ArrayList<LotManipulation> getArr1() {
		return arr1;
	}

	public void setArr1(ArrayList<LotManipulation> arr1) {
		this.arr1 = arr1;
	}
	public static ArrayList printChart(ArrayList<LotManipulation> arr1, int listSize) {
		for (int i = 0; i < listSize; i++) {
			System.out.println((i + 1) + ". " + arr1.get(i));
		}

		// Add Quit as the last option in the menu
		System.out.println((arr1.size() + 1) + ". Quit");
		System.out.println();

		return arr1;
	}
	@Override
	public String toString() {
		return String.format("%-20s %-20s %-15s $%,15.2f\n", carMake, carModel, carYear,  carPrice);

	}

}
