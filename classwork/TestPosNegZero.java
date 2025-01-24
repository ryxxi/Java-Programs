import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPosNegZero {

	PosNegZero run = new PosNegZero();

	@Test
	public void returnsCorrectValues() {

		int[] numbers = {-23, -222, 0, 7, 23, -534, 0, 93612};

		String actual = run.posNegZero(numbers);
		String expected = """
			Positives: 3
			Negatives: 3
			Zeros: 2""";
		assertEquals(actual, expected);

	}

}