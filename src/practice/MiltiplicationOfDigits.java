package practice;

public class MiltiplicationOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1234768;
		int n1=0;
		int mult=1;
		int length = String.valueOf(x).length();// To find the length of integer
			for(int i=0;i<length;i++) {
				n1=x%10;
				mult*=n1;
				x=x/10;
			}
			System.out.println(mult);
	}

}
