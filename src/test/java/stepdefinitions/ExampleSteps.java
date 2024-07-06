package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class ExampleSteps {
    @Given("I have an example {int}")
    public void i_have_an_example(int i) {
        System.out.println("Given I have an example-" + i);
    }

    @When("I run the test {int}")
    public void i_run_the_test(int i) {
        System.out.println("When I run the test-" + i);
    }

    @Then("I should see the result {int}")
    public void i_should_see_the_result(int i) {
        System.out.println("Then I should see the result-" + i);
        System.out.println(i == 4 && !System.getProperties().containsKey("passTest"));
        if (i == 4 && !System.getProperties().containsKey("passTest")) {
            Assertions.assertEquals(i, 5, i + " is not equal to 5");
        }
    }
}
