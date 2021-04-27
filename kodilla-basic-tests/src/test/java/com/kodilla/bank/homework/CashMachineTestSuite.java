package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    CashMachine cashMachine = new CashMachine();

    @Test
    public void shouldHaveZeroLength() {
    int[] transactions = cashMachine.getTransactions();
    assertEquals(0, transactions.length);
    }

    @Test
    public void shouldAddCorrectlyMadeTransactions(){
    cashMachine.addTransaction(50);
    cashMachine.addTransaction(-50);
    cashMachine.addTransaction(-10);
    cashMachine.addTransaction(100);
    assertEquals(3, cashMachine.getTransactions().length);
    }

    @Test
    public void shouldCalcBalanceWithCorrectlyMadeTransactions(){
    cashMachine.addTransaction(50);
    cashMachine.addTransaction(-50);
    cashMachine.addTransaction(-10);
    cashMachine.addTransaction(100);
    assertEquals(100, cashMachine.getBalance());
    }

    @Test
    public void shouldReturnBalanceZeroIfNoTransactionsWereMade(){
    assertEquals(0, cashMachine.getBalance());
    }

    @Test
    public void shouldReturnAverageZeroIfNoTransactionsWereMade(){
    assertEquals(0.0, cashMachine.getAverageDeposit() + cashMachine.getAverageWithdrawals(), 0.01);
    }
    @Test
    public void shouldReturnAverageDepositZeroIfNoDeposits(){
    assertEquals(0.0, cashMachine.getAverageDeposit(), 0.01);
    }

    @Test
    public void shouldAddNumberOfDeposit(){
    cashMachine.addTransaction(50);
    cashMachine.addTransaction(40);
    cashMachine.addTransaction(-20);
    assertEquals(2,cashMachine.getNumberOfDeposits());
    }

    @Test
    public void shouldNotAddWithdrawTransactionIfEmpty(){
    cashMachine.addTransaction(-50);
    cashMachine.addTransaction(-10);
    cashMachine.addTransaction(-20);
    assertEquals(0,cashMachine.getNumberOfWithdrawals());
    }

    @Test
    public void shouldNotAddWithdrawTransactionIfNotEnoughMoney(){
    cashMachine.addTransaction(50);
    cashMachine.addTransaction(-50);
    cashMachine.addTransaction(-100);
    assertEquals(1,cashMachine.getNumberOfWithdrawals());
    }

    @Test
    public void shouldReturnAverageWithdrawalZeroIfNoWithdrawals(){
    cashMachine.addTransaction(50);
    cashMachine.addTransaction(200);
    cashMachine.addTransaction(50);
    assertEquals(0.0, cashMachine.getAverageWithdrawals(), 0.02);
    }
}
