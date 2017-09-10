package bridge;

public abstract class Road {
protected Car car;

public void setCar(Car car) {
	this.car = car;
}

public abstract void roadtype();
}
