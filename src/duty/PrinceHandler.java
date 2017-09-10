package duty;

public abstract class PrinceHandler {
protected PrinceHandler successor;
public void setSuccessor(PrinceHandler successor){
	this.successor=successor;
}
public abstract void processDiscount(float discount);
public static PrinceHandler createPrinceHandler(){
	PrinceHandler sale=new Sales();
	PrinceHandler man=new Manager();
	PrinceHandler dir=new Director();
	PrinceHandler vp=new VicePresident();
	PrinceHandler ceo=new CEO();
	sale.setSuccessor(man);
	man.setSuccessor(dir);
	dir.setSuccessor(vp);
	vp.setSuccessor(ceo);
	return sale;
}
}
