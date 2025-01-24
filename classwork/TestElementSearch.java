import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestElementSearch {

	ElementSearch run = new ElementSearch();

	@Test

	public void testIfFunctionReturnCorrectlyIfPresent() {

		Object[] elements = {4, true, false, 2.5, 0, "Nice"};
		Object search = 4;

		String actual = run.elementSearch(elements, search);
		String expected = "Value present at Index 0";
		assertEquals(actual, expected);

	}


	@Test

	public void testIfFunctionReturnCorrectlyIfAbsent() {

		Object[] elements = {4, true, false, 2.5, 0, "Nice"};
		Object search = "hello";

		String actual = run.elementSearch(elements, search);
		String expected = "Not present";
		assertEquals(actual, expected);

	}

}