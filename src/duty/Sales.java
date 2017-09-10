package duty;

public class Sales extends PrinceHandler {

	@Override
	public void processDiscount(float discount) {
		if(discount<0.05){
			System.out.println(getClass().getName()+"Åú×¼ÁËÕÛ¿Û£º"+discount);
		}else{
			successor.processDiscount(discount);
		}

	}

}
