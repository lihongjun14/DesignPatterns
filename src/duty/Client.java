package duty;

import java.util.Random;

public class Client {
	private PrinceHandler princehandler;

	public void setPrincehandler(PrinceHandler princehandler) {
		this.princehandler = princehandler;
	}

	public void RequestDiscount(float discount) {
		princehandler.processDiscount(discount);
	}

	public static void main(String[] args) {
		Client a = new Client();
		a.setPrincehandler(PrinceHandler.createPrinceHandler());
		Random rand=new Random();
		for(int i=0;i<=100;i++){
			a.RequestDiscount(rand.nextFloat());
		}

	}

}
