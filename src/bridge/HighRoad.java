package bridge;

public class HighRoad extends Road {

	@Override
	public void roadtype() {
		car.cartype();
		System.out.println("高速公路行驶");

	}

}
