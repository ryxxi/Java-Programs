import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StudentGradeBookTest {
	
	@Test
	public void testGetCourseName() {

		StudentGradeBook tester = new StudentGradeBook("Phase Gate", 2, 2);

		String actual = tester.getCourseName();
		String expected = "Phase Gate";
		
		assertEquals(actual, expected);

	}
	
	@Test
	public void testInvalidGrade() {

		StudentGradeBook tester = new StudentGradeBook("Phase Gate", 2, 2);

		assertFalse(tester.isGradeValid("-1"));
		assertFalse(tester.isGradeValid("101"));
		assertFalse(tester.isGradeValid("hello"));
		assertTrue(tester.isGradeValid("0"));
		assertTrue(tester.isGradeValid("68"));
		assertTrue(tester.isGradeValid("100"));

	}

	@Test
	public void testInvalidExamNumber() {

		StudentGradeBook tester = new StudentGradeBook("Phase Gate", 2, 2);

		assertFalse(tester.isExamValid("0"));
		assertFalse(tester.isExamValid("4"));
		assertFalse(tester.isExamValid("hello"));
		assertTrue(tester.isExamValid("1"));
		assertTrue(tester.isExamValid("2"));

	}


	@Test
	public void testGetAllMeanAndTotal() {

		StudentGradeBook tester = new StudentGradeBook("Phase Gate", 2, 2);

		tester.obtainGrades()[0][0] = 55;
   		tester.obtainGrades()[0][1] = 98;
    		tester.obtainGrades()[1][0] = 100;
    		tester.obtainGrades()[1][1] = 49;

		assertEquals(302, tester.getAllTotal());

	}
		
}