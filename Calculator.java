package week2day3;

public class Calculator {
	
	public void addTwoNumbers(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	
	public void subTwoNum(int e,int f) {
	int d=e-f;
	System.out.println(d);
	}
	public void  multiplyTwoNumbers(double i, double j) {
	double k=i*j;
	System.out.println(k);
	}
	public void divideTwoNumbers(float x , float y ) {
	float z=x%y;
	System.out.println(z);
	}
	
	public Calculator() {
		
	}
	
		public static void main(String[] args) {
		Calculator calc= new Calculator();
		calc.addTwoNumbers(10,68);
		calc.subTwoNum(10, 30);
		calc.multiplyTwoNumbers(10,30 );
		calc.divideTwoNumbers(10.0f, 2.0f);

	}

}
