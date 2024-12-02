import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CapitaliseEachWordTest {

	@Test
	public void testIfFunctionReturnsCorrectly() {

		CapitaliseFirstLetter functionCall = new CapitaliseFirstLetter();

		String text = "Hello my name      is Leke and I'm in Semicolon Africa";
		String actual = functionCall.capitaliseEachWord(text);
		String expected = "Hello My Name      Is Leke And I'm In Semicolon Africa";

		assertEquals(expected, actual);

	}

}