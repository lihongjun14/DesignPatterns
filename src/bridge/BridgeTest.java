package bridge;

public class BridgeTest {

	public static void main(String[] args) {
		Road a=new HighRoad();
		a.setCar(new Bike());
		a.roadtype();
		Road b=new NormalRoad();
		b.setCar(new Bus());
		b.roadtype();

	}

}
