
import java.util.Scanner;

public class Obelisk {

	public static void main(String[] args) {

		Scanner monomania = new Scanner(System.in);

		int i = 0;
		int r = 0;
		double a = 0;
		int even = 0;
		int odd = 0;

		while (true) {
			System.out.println("Type numbers: ");
			int num = Integer.parseInt(monomania.nextLine());
			if (num == -1) {
				break;
			}
			r++;
			i += num;
			if (num % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			a = i / (double) r;
			

		}

		System.out.println("Thank you and see you later!");
		System.out.println("The sum is " + i);
		System.out.println("How many numbers: " + r);
		System.out.println("Average: " + a);
		System.out.println("Even numbers: " + even);
		System.out.println("Odd numbers: " + odd);
	}

}
