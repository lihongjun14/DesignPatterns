package strategyAndtemplet;

public abstract class MubanTest {
public void runall(){
	quiet1();
	move1();
	quiet2();
	if(isture()){
		move2();
	}
	
	
}
private FlyTest flytest;

public void setFlytest(FlyTest flytest) {
	this.flytest = flytest;
}
public void use(){
	flytest.FlyTest1();
}

protected boolean isture() {
	// TODO �Զ����ɵķ������
	return true;
}

protected abstract void move2();

protected void quiet2() {
	System.out.println("���з���2");
	
}

protected abstract void move1();

protected void quiet1() {
	System.out.println("���з���1");
	
}
}
