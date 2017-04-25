package AP_QUICK_PRACTICE_CODE;

public class C extends B {

	public C() {
		super();
		System.out.println("C CONST");
	}
	
	
	public void doThis(){
		System.out.println("C");
	}


	public void doSomething() {
		super.doThis();
	}
	public static void main(String[] args) {
		
		C  c = new C();
	}
}
