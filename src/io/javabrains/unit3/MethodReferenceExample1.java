package io.javabrains.unit3;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		
		Thread t = new Thread(MethodReferenceExample1::printMessege); // MethodReferenceExample1::printMessege === () -> printMessege()
		t.start();

	}
	
	public static void printMessege() {
		System.out.println("Hello");
	}

}
