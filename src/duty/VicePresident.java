package duty;

public class VicePresident extends PrinceHandler {

	@Override
	public void processDiscount(float discount) {
		if(discount<0.4){
			System.out.println(getClass().getName()+"��׼���ۿۣ�"+discount);
		}else{
			successor.processDiscount(discount);
		}

	}

}
