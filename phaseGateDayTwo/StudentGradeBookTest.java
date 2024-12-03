import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StudentGradeBookTest {

	StudentGradeBook caller = new StudentGradeBook("Phase Gate", 4, 3);
	@Test
	
	public void test() {

		caller.gradeBook();

	}

}