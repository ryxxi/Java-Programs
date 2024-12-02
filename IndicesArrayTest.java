import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class IndicesArrayTest {

	@Test
	public void testIfFunctionReturnsCorrectly() {

		IndicesArray functionCall = new IndicesArray();

		int[] array = {1, 3, 5, 6, 7, 9, 12, 0};
		int[] actual = functionCall.getIndicesSmallestLargest(array);
		int[] expected = {7, 6};

		assertArrayEquals(expected, actual);

	}

}