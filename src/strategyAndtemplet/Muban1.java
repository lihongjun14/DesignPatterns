package strategyAndtemplet;

public class Muban1 extends MubanTest {

	
	public Muban1(){
		super();
		super.setFlytest(new FlyOne());
	}
	protected void move2() {
		System.out.println("����ʵ�ַ���2");

	}

	@Override
	protected void move1() {
		// TODO �Զ����ɵķ������
		System.out.println("����ʵ�ַ���1");
	}
	
	@Override
	protected boolean isture(){
		return false;
	}
	public static void main(String[] args) {
		MubanTest a=new Muban1();
		a.move1();
		a.move2();
		a.quiet1();
		a.quiet2();
		a.use();
		
	}

}
