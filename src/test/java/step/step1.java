import io.cucumber.java.en.Given; to me
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class CalculatorSteps {
    private int result;
    private Calculator calculator = new Calculator();

    @Given("I have a calculator")
    public void iHaveACalculator() {
        // Typically, you might initialize your calculator or set up some context here.
    }

    @When("I add {int} and {int}")
    public void iAdd(int num1, int num2) {
        result = calculator.add(num1, num2);
    }

    @Then("the result should be {int}")
    public void theResultShouldBe(int expectedResult) {
        assertEquals(expectedResult, result);
    }
}
