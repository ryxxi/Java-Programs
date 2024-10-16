/*
Stage1
	1. Store integers 1-10
	2. Add together
	3. Display result

Stage2
	1. Store values 1, 2, 3,... 10 as num1, num2, num3,... num10
	4. Calculate [ num1 + num2 + num3 +... + num10 ]
	5. Store result as sum
	6. Display sum
*/

import java.util.ArrayList;

public class Summation {

	public static void main(String[] args) {

		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		int num5 = 5;
		int num6 = 6;
		int num7 = 7;
		int num8 = 8;
		int num9 = 9;
		int num10 = 10;

		int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;

		System.out.printf("Summation is %d%n", sum);

	}

}