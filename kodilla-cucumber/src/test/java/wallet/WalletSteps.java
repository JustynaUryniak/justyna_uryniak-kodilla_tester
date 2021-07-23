package wallet;

import io.cucumber.java8.Ca;
import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    Cashier cashier = new Cashier(cashSlot);
    private int accountBalance;


    public WalletSteps() {
        Given("I have deposit $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance",200, wallet.getBalance());
        });

        When("I request $30", () -> {
            cashier.withdrawal(wallet, 30);
        });

        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });

        Then("the balance of my wallet should be $170", () -> {
            Assert.assertEquals("Incorrect wallet balance", 170,  wallet.getBalance());
        });

         Given("I have deposit $200", () -> {
             wallet .deposit(200);
             Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

         When("I request $201", () -> {
             cashier.withdrawal(wallet, 201);
         });

        Then("Cash should not be withdrawn", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

        Then("the balance of my wallet should be $200", () -> {
            Assert.assertEquals("Incorrect wallet balance", 200,  wallet.getBalance());
        });

        Given("I have deposit $202", () -> {
            wallet.deposit(202);
            Assert.assertEquals("Incorrect wallet balance", 202, wallet.getBalance());
        });

        When("I request $202", () -> {
            cashier.withdrawal(wallet, 202);
        });

        Then("$202 should be dispensed", () -> {
            Assert.assertEquals(202, cashSlot.getContents());
        });

        Then("the balance of my wallet should be $0", () -> {
            Assert.assertEquals("Incorrect wallet balance", 0,  wallet.getBalance());
        });

        Given("I have deposit $201", () -> {
            wallet.deposit(201);
            Assert.assertEquals("Incorrect wallet balance", 201, wallet.getBalance());
        });

        When("I request $0", () -> {
            cashier.withdrawal(wallet, 0);
        });

        Then("$0 should be dispensed", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

        Given("I have deposit -$200", () -> {
            wallet.deposit(-200);
            Assert.assertEquals("Incorrect wallet balance", -200, wallet.getBalance());
        });

        When("I request $10", () -> {
            cashier.withdrawal(wallet, 0);
        });
        Then("$0 should be dispensed.", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

        Given("there is $ {int} in my wallet", (Integer int1) -> {
            wallet.deposit(int1);
        });

        When("I check the balance of my wallet", () -> {
            cashier.checkBalance(wallet);
        });

        Then("I should see that the balance is $ {int}", (Integer int1) -> {
            this.accountBalance = int1;
            Assert.assertEquals("Incorrect wallet balance", accountBalance, wallet.getBalance());
        });


        Given("There is $ {int} in my wallet", (Integer int1) -> {
            wallet.deposit(int1);
        });

        When("I withdraw $ {int}", (Integer int1) -> {
            cashier.withdrawal(wallet, int1);
        });

        Then("nothing should be dispensed", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

        Then("I should be told that I don't have enough money in my wallet for {int}", (Integer int1) -> {
            cashier.checkBalance(wallet);
            Assert.assertEquals("You don't have enough money", cashier.withdrawal(wallet, int1));
        });

    }
}
