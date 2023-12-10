package co.edureka.java.oops;
class A2{
	A2(int n){
		System.out.println("in class A2 constructor");
	}
}

class B2 extends A2{
	B2(){	
		super(12);
		System.out.println("in class B2 constructor");
	}
}

public class SuperConstructors {

	public static void main(String[] args) {
		B2 obj = new B2();
	}

}
