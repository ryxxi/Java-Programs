import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ContainsAllLettersTest {

	@Test

	public void testIfFunctionReturnsCorrectly() {

		//given

		ContainsAllLetters functionCall = new ContainsAllLetters();

		//action

		String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		//check

		assertTrue(functionCall.checkAllLetters(text));

	}
	

	@Test

	public void testIfFunctionReturnsFalseCorrectly() {

		//given

		ContainsAllLetters functionCall = new ContainsAllLetters();

		//action

		String text = "ABCDEF1234KLMNOPQRSTUVWXYZ";

		//check

		assertFalse(functionCall.checkAllLetters(text));

	}

}
