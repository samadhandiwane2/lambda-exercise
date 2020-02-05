package io.javabrains.unit2;

public class ThisReferenceExample {
	
	public void doProcess(int i, Process p) {
		p.process(i);
	}
	
	public void execute() {
		doProcess(10, i -> {
			System.out.println("Value od i is " +i);
			// this points to the object of calling method
			System.out.println(this);
		});	
	}

	public static void main(String[] args) {
		
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		
		/*thisReferenceExample.doProcess(10, i -> {
			System.out.println("Value od i is " +i);
			// This is not allowed. we can not use this key word in static block
			// System.out.println(this);
		});*/
		
		thisReferenceExample.execute();
	}
	
	public String toString() {
		return "This is TheReferenceExample class instance";
	}

}
