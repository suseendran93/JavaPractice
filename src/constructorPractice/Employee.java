package constructorPractice;

public class Employee extends Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

	public Employee() {
		// TODO Auto-generated constructor stub
		
		
		System.out.println("Employee default const");
	}
	public Employee(int a) {
		// TODO Auto-generated constructor stub
		super("Sample argument based const");
		System.out.println(a);
	}
}
