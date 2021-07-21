package gameChecker;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsANumberDivisibleSteps implements En {
    private int number;
    private String result;

    public IsANumberDivisibleSteps() {
        Given("The number is three", () -> {
            this.number = 3;
        });

        Given("The number is fifteen", () -> {
            this.number = 15;
        });

        Given("The number is sixteen", () -> {
            this.number = 16;
        });

        Given("The number is twenty-one", () -> {
            this.number = 21;
        });

        Given("The number is thirty", () -> {
            this.number = 30;
        });

        Given("The number is fifty", () -> {
            this.number = 50;
        });

        Given("The number is fifty-one", () -> {
            this.number = 51;
        });

        Given("The number is sixty", () -> {
            this.number = 60;
        });

        Given("The number is sixty-five", () -> {
            this.number = 65;
        });

        Given("The number is ninety", () -> {
            this.number = 90;
        });

        When("I divide them", () -> {
            GameChecker gameChecker = new GameChecker();
            this.result = gameChecker.checkIfDivisible(this.number);
        });

        Then("I expect the result to be {string}", (String string) -> {
           Assert.assertEquals(string, this.result);
        });

    }

}
