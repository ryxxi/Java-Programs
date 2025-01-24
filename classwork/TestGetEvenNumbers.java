import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestGetEvenNumbers {

        GetEvenNumbers run = new GetEvenNumbers();

        @Test
        public void TestFunctionReturnsCorrectly() {
            int actual = run.getEvens("hello345987");
            int expected = 2;
            assertEquals(actual, expected);
        }
}