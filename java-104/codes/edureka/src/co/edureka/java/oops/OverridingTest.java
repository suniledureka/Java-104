package co.edureka.java.oops;

class A1{
	int a=10, b=20;
	
	public void display() {
		System.out.println("in class A - " + a + " | " + b);
	}
}

class B1 extends A1{
	int a=11, b=22;
	@Override
	public void display() {
		System.out.println("in class B - " + a + " | " + b + " | " + super.a + " | " + super.b);
		super.display();
	}
}

public class OverridingTest {

	public static void main(String[] args) {
		B1 obj = new B1();
		obj.display();
	}
}
