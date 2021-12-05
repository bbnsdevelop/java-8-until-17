package br.com.bbnsdevelop.inner;

public class Outer1 {
	
	private static int x = 50;
	private int y;	
	
	public Outer1(int y) {	
		this.y = y;
	}

	void f1() {
		System.out.println("Outer classes non static method");
	}
	

	class Inner{
		private int y;
				
		public Inner(int y) {
			this.y = y;
		}

		void f2() {
			System.out.println("Inner class non static method");
			System.out.println(Outer1.x);
			System.out.println(Outer1.this.y);
			System.out.println(this.y);
		}
	}
	
	public static void main(String[] args) {
		
		Outer1 outer = new Outer1(80);
		outer.f1();
		
		Outer1.Inner inner = outer.new Inner(30);
		inner.f2();
		
		
	}
}
