package com;

class Sample{
	
	void testMethod() {
		
	}
	void fun(Test testObj) {
		testObj.f2();
	}
}

public class Test {
	
	Test obj=new Test(); //  // Dangerous
	
	void f2() {
		
	}
	static void f3() {
		
	}
	final void f4() {
		
	}
	
	void f1() { // f1 is accessble to only some actor
		// Create object to Test :? 
		//Test t=new Test(); // why?
		Sample s=new Sample(); // Dangerous
		s.fun(obj); 
	}
	
	public static void main(String[] args) { // accessble to all

		// Create object to Test
		
		Test t=new Test(); // to access non static methods from static method
		
		
		
	}

}
