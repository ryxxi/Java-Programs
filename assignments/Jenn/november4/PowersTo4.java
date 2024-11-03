import java.util.Scanner;

public class PowersTo4 {

	public static void main(String[] args) {

		System.out.println("N\tN^2\tN^3\tN^4");

		int num = 1;
		int counter = 0;

		while (counter < 5) {
			System.out.println(num + "\t" + num*num + "\t" + num*num*num + "\t" + num*num*num*num);
			num++;
			counter++;
		}

	}

}