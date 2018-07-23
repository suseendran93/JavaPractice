package practice;

public class ArmstrongNumber {

	static int ArmstrongNo = 371;
	static int sum = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmstrongNumber am = new ArmstrongNumber();
		int out = am.Armstrong();
		System.out.println(out);
		if (ArmstrongNo == out)
			System.out.println("It is an Armstrong number");
		else
			System.out.println("Not an Armstrong number");

	}

	public int Armstrong() {
		int ArmstrongNoCopy=ArmstrongNo;//Copy as operating on ArmstrongNo will change the real value
		int length = String.valueOf(ArmstrongNoCopy).length();// To find the length of integer
		for (int x = 0; x < length; x++) {
			int i = ArmstrongNoCopy % 10;
			int cube = i * i * i;
			sum += cube;

			ArmstrongNoCopy = ArmstrongNoCopy / 10;
		}
		return sum;
	}

}
