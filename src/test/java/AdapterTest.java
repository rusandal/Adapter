import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AdapterTest {
    @Test
    @DisplayName("check sum")
    public void adapterSum() {
        int a = 4, b = 6;
        int expected = 10;

        Inst instCalculator = new IntsCalculator();

        int result = instCalculator.sum(a, b);

        Assertions.assertEquals(result, expected);
    }

    @Test
    @DisplayName("check mult")
    public void adapterMult() {
        int a = 4, b = 6;
        int expected = 24;

        Inst instCalculator = new IntsCalculator();

        int result = instCalculator.mult(a, b);

        Assertions.assertEquals(result, expected);
    }

    @Test
    @DisplayName("check pow")
    public void adapterPow() {
        int a = 4, b = 6;
        int expected = 4096;

        Inst instCalculator = new IntsCalculator();

        int result = instCalculator.pow(a, b);

        Assertions.assertEquals(result, expected);
    }
}
