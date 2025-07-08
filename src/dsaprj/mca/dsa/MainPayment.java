package dsaprj.mca.dsa;

public class MainPayment extends Payment{

	@Override
	void pay() {
		System.out.println("cash payment");
		// TODO Auto-generated method stub
		
	}
	public static void main (String[]args) {
		MainPayment p=new MainPayment();
		p.pay();
		p.printbill();
	}
	

}
