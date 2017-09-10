package observer;

public class ConcreteSubject extends Subject{
private String newstate;

public String getNewstate() {
	return newstate;
}

public void setNewstate(String newstate) {
	this.newstate = newstate;
	this.nodifyObserver();
}
}
