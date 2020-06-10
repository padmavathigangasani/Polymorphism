import java.util.ArrayList;
import java.util.List;

public class TestBikes {
	public static void main(String[] args) {

		List<Bicycle> bikes = new ArrayList<Bicycle>();

		Bicycle bike01 = new Bicycle(20, 10, 1);
		Bicycle bike02 = new MountainBike(20, 10, 5, "Dual");
		Bicycle bike03 = new RoadBike(40, 20, 8, 23);

		bikes.add(bike01);
		bikes.add(bike02);
		bikes.add(bike03);
		printBikes(bikes);
		/*
		 * bike01.printDescription(); bike02.printDescription(); bike02.printStates();
		 * bike03.printDescription();
		 */

	}

	public static void printBikes(List<Bicycle> Bikes) {
		for (Bicycle b : Bikes) {
			System.out.println(b);
		}
	}
}