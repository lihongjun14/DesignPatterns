package adapter;

public class Adapter extends Adaptee implements Target{
	private Adaptee adaptee;
	public Adapter(Adaptee adaptee) {
		this.adaptee=adaptee;
	}

	@Override
	public void infrtance1() {
		this.adaptee.inferance1();
	}

	@Override
	public void infrtance2() {
		// TODO 自动生成的方法存根
		System.out.println("使用插头B转插头A充电");
	}

}