package duty;

public class CEO extends PrinceHandler {

	@Override
	public void processDiscount(float discount) {
		if(discount<0.55){
			System.out.println(getClass().getName()+"��׼���ۿۣ�"+discount);
		}else{
			System.out.println(getClass().getName()+"�ܾ����ۿ�");
		}

	}

}
