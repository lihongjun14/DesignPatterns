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
		// TODO �Զ����ɵķ������
		System.out.println("ʹ�ò�ͷBת��ͷA���");
	}

}