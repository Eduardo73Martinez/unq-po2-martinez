package calculadora;

public class Calculadora {
	private int num1;
	private int num2;
	
	public Calculadora (int a, int b) {
		this.setNum1(a);
		this.setNum2(b);
	}
	
	
	public int getNum1() {
		return num1;
	}


	public void setNum1(int num1) {
		this.num1 = num1;
	}


	public int getNum2() {
		return num2;
	}


	public void setNum2(int num2) {
		this.num2 = num2;
	}


	public int suma() {
		return this.getNum2() + this.getNum1();
	}
	public int resta() {
		return this.getNum1() - this.getNum2();
	}
	
	public int multiplica() {
		return this.getNum1() * this.getNum2();
	}
	
}
