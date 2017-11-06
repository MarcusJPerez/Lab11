
public class UsedCars extends LotManipulation{
private double usedCarMiles;
public UsedCars() {
	
}
public UsedCars(String carMake, String carModel, int carYear, double carPrice, double usedCarMiles) {
	super(carMake , carModel, carYear, carPrice);
	this.setUsedCarMiles(usedCarMiles);
}
public double getUsedCarMiles() {
	return usedCarMiles;
}
public void setUsedCarMiles(double usedCarMiles) {
	this.usedCarMiles = usedCarMiles;
}
@Override
public String toString() {
					
return String.format("%-20s %-20s %-15d $%,15.2f (Used) %,.0f miles \n", super.getCarMake(), super.getCarModel(),
		super.getCarYear(), super.getCarPrice(), this.usedCarMiles);

}
}
