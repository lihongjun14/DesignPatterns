package observer;

public class ObserverTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ConcreteSubject cs=new ConcreteSubject();
		ConcreteObserver a=new ConcreteObserver();
		a.setObservername("Jack");
		a.setActionthing("go home");
		ConcreteObserver b=new ConcreteObserver();
		b.setObservername("John");
		b.setActionthing("fuck off");
		cs.attach(b);
		cs.attach(a);
		cs.setNewstate("attention");
	}

}
