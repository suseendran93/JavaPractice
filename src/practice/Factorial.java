package practice;

public class Factorial {
	//Factorial program using recursion
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y=fact(4);
		System.out.println(y);

	}

	private static int fact(int i) {
		while (i > 1) {
			return i *= fact(i - 1);//Recursive method
		}
		return 1;

	}
}
