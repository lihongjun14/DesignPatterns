package duty;

public class Manager extends PrinceHandler {

	@Override
	public void processDiscount(float discount) {
		if(discount<0.1){
			System.out.println(getClass().getName()+"��׼���ۿۣ�"+discount);
		}else{
			successor.processDiscount(discount);
		}

	}

}
