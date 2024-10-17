/*
Stage1
	1. Store each line of the pattern
	2. Display each line

Stage2
	1. Store "   J" as phrase1
	2. Store "J aaa v vaaa" as phrase2
	3. Store "J J aa vv a  a" as phrase3
	4. Store "J aaa   v  aaaa"" as phrase4
*/

public JavaPattern {

	public static void main(String[] args) {

		String phrase1 = "   J";
		String phrase2 = "J aaa v vaaa";
		String phrase3 = "J J aa vv a  a";
		String phrase4 = "J aaa   v  aaaa";

		System.out.printf(" %s%n %s%n %s%n %s%n", phrase1, phrase2, phrase3, phrase4);

	}

}