package constructorPractice;

public class GreensTech extends Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new GreensTech();		

	}

	public GreensTech() {
		this("GreensTech argument based const");		
		System.out.println("GreensTech default const");
	}
	
	public GreensTech(String s) {
		
		super(120);
		System.out.println(s);
		
	}
}
