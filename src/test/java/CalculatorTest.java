import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        calculator.sum(4, 5);
        Assert.assertEquals(calculator.sum(4, 5), 9);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        calculator.subtract(42, 7);
        Assert.assertEquals(calculator.subtract(42, 7), 35);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        calculator.divide(42, 7);
        Assert.assertEquals(calculator.divide(42, 7), 6);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        calculator.multiply(42, 7);
        Assert.assertEquals(calculator.multiply(42, 7), 294);
    }
}
