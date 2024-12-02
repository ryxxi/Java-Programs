import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.IntStream.range;
import java.util.stream.IntStream.rangeClosed;

public class PrimeFactor {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int integer = input.nextInt();

		getPrimeFactors(integer);

	}

	public static int[] primesBeforeNumber(int integer) {

		





	public static boolean checkIfPrime(int number) {

		boolean isPrime = IntStream.range(2, number).filter(x -> if(number % x == 				0)).toArray() == 0;

		return isPrime;

	}