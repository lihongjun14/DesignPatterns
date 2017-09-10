package bridge;

public class NormalRoad extends Road {

	@Override
	public void roadtype() {
		car.cartype();
		System.out.println("普通公路行驶");

	}

}
