public class SingleGradeBook {

	private String courseName;
	private int[] grades;

	public SingleGradeBook(String courseName, int[] grades) {

		this.courseName = courseName;
		this.grades = grades;

	}

	public void setCourseName(String courseName) {

		this.courseName = courseName;

	}

	public String getCourseName() {

		return courseName;

	}

	public void processGrades() {

		outputGrades();

		System.out.printf("Total grades: %d%n%n", getTotal());

		System.out.printf("Class average: %f%n%n", getAverage());

		System.out.printf("Highest Grade: %d%nLowest Grade: %d%n%n", getHighest(), getLowest());

		outputChart();

	}

	public void outputGrades() {

		for (int index = 1; index <= grades.length; index++) {

			System.out.printf("Student %d: %2d%n", index, grades[index - 1]);

		}

	}

	public int getTotal() {

		int total = 0;

		for (int grade : grades) total += grade;

		return total;

	}

	public double getAverage() {

		int total = 0;

		for (int grade : grades) total += grade;

		return (double) total / grades.length;

	}

	public int getLowest() {

		int lowest = grades[0];

		for (int grade : grades) {

			if (grade < lowest) lowest = grade;

		}

		return lowest;

	}

	public int getHighest() {

		int highest = grades[0];

		for (int grade : grades) {

			if (grade > highest) highest = grade;

		}

		return highest;

	}

	public void outputChart() {

		System.out.println("Distribution of Grades:");

		int[] frequency = new int[11];

		for (int grade : grades) {

			frequency[grade / 10]++;

		}

		for (int count = 0; count < frequency.length; count++) {

			if (count == 10) System.out.printf("%5d:", 100);

			else {

				System.out.printf("%02d-%02d:", count * 10, (count * 10) + 9);

			}

			for (int stars = 0; stars < frequency[count]; stars++) {

				System.out.print("* ");

			}

			System.out.println();

		}

	}

}
		








































