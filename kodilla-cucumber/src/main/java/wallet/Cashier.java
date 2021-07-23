package wallet;

import java.sql.SQLOutput;

public class Cashier {
    private CashSlot cashSlot;
    private String notification;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public String withdrawal(Wallet wallet, int amount) {
        if (amount >= 0 && amount > wallet.getBalance()) {
            this.notification = "You don't have enough money";
        } else {
            wallet.debit(amount);
            cashSlot.dispense(amount);
            this.notification = "Thank you for using the services";
        }
        return notification;
    }
    public void checkBalance(Wallet wallet) {
        wallet.getBalance();
        System.out.println("Balance  $" + wallet.getBalance());
    }

}
