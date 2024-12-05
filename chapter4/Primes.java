public class Primes {

	public static void main(String[] args) {

		System.out.println(isPrime(11)?"11 is Prime":"11 is not prime");
		System.out.println(isPrime(15)?"15 is Prime":"15 is not prime");

	}

	public static boolean isPrime(int integer) {

		if (integer <=1 || integer % 2 == 0 || integer % 3 == 0) return false;

		for (int i = 5; i * i < integer; i += 6) {

			if (integer % i == 0 || integer % (i + 2) == 0) return false;

		}

		return true;

	}

}