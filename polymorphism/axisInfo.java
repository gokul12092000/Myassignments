package polymorphism;

public class axisInfo extends banhInfo {
	public void deposit() {
		System.out.println("money deposited");
	}

	public static void main(String[] args) {
		axisInfo axis=new axisInfo();
		axis.deposit();
		axis.fixed();
		axis.saving();
		

	}

}
