package duty;

public class Director extends PrinceHandler {

	@Override
	public void processDiscount(float discount) {
		if(discount<0.3){
			System.out.println(getClass().getName()+"��׼���ۿۣ�"+discount);
		}else{
			successor.processDiscount(discount);
		}

	}

}
