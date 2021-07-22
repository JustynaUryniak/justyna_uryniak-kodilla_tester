package wallet;

import io.cucumber.java8.Ca;
import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot() ;

    public WalletSteps() {
        Given("I have deposit $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance",200, wallet.getBalance());
        });

        When("I request $30", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdrawal(wallet, 30);
        });

        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });

         Given("I have deposit $200", () -> {
             wallet .deposit(200);
             Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

         When("I request $201", () -> {
             Cashier cashier = new Cashier(cashSlot);
             cashier.withdrawal(wallet, 0);
         });

        Then("Cash should not be withdrawn", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

        Given("I have deposit $202", () -> {
            wallet.deposit(202);
            Assert.assertEquals("Incorrect wallet balance", 202, wallet.getBalance());
        });

        When("I request $202", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdrawal(wallet, 202);
        });

        Then("$202 should be dispensed", () -> {
            Assert.assertEquals(202, cashSlot.getContents());
        });

        Given("I have deposit $201", () -> {
            wallet.deposit(201);
            Assert.assertEquals("Incorrect wallet balance", 201, wallet.getBalance());
        });

        When("I request $0", () -> {
            Cashier cashier = new Cashier(cashSlot);
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
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdrawal(wallet, 0);
        });
        Then("$0 should be dispensed.", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

    }
}
