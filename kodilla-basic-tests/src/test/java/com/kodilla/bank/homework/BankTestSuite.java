package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    Bank bank = new Bank(3);

    @Test
    public void shouldReturnNumberMachines(){
    assertEquals(3, bank.getNumberOfMachines());
    }

    @Test
    public void shouldAddCorrectlyMadeTransactions(){

    bank.addTransaction(0, 50);
    bank.addTransaction(0, 200);
    bank.addTransaction(0, -80);
    bank.addTransaction(0, -1000);

    bank.addTransaction(1, 50);
    bank.addTransaction(1, 20);
    bank.addTransaction(1, -100);
    bank.addTransaction(1, 100);

    bank.addTransaction(2, 50);
    bank.addTransaction(2, -50);
    bank.addTransaction(2, -200);
    bank.addTransaction(2, -10);

    assertEquals(8, bank.getTotalNumberOfDeposits() + bank.getTotalNumberOfWithdrawals());
    }

    @Test
    public void shouldCalcBalanceWithCorrectlyMadeTransactions(){

    bank.addTransaction(0, 50);
    bank.addTransaction(0, 20);
    bank.addTransaction(0, -70);
    bank.addTransaction(0, 10);

    bank.addTransaction(1, 50);
    bank.addTransaction(1, 50);
    bank.addTransaction(1, -80);
    bank.addTransaction(1, 20);

    bank.addTransaction(2, 50);
    bank.addTransaction(2, -100);
    bank.addTransaction(2, 20);
    bank.addTransaction(2, -20);

    assertEquals(100, bank.getTotalBalance());
    }

    @Test
    public void shouldAddNumberAllDeposits(){

    bank.addTransaction(0, 50);
    bank.addTransaction(0, 20);
    bank.addTransaction(0, -10);
    bank.addTransaction(0, 100);

    bank.addTransaction(1, 50);
    bank.addTransaction(1, 20);
    bank.addTransaction(1, -100);
    bank.addTransaction(1, 30);

    bank.addTransaction(2, 50);
    bank.addTransaction(2, -30);
    bank.addTransaction(2, -20);
    bank.addTransaction(2, 30);

    assertEquals(8, bank.getTotalNumberOfDeposits());
    }

    @Test
    public void shouldAddCorrectlyMadeWithdrawals(){

    bank.addTransaction(0, 50);
    bank.addTransaction(0, 20);
    bank.addTransaction(0, -10);
    bank.addTransaction(0, 100);

    bank.addTransaction(1, 50);
    bank.addTransaction(1, 20);
    bank.addTransaction(1, -100);
    bank.addTransaction(1, 30);

    bank.addTransaction(2, 50);
    bank.addTransaction(2, -30);
    bank.addTransaction(2, -20);
    bank.addTransaction(2, 30);

    assertEquals(3, bank.getTotalNumberOfWithdrawals());
    }

    @Test
    public void shouldCalcAverageAllDeposits(){

    bank.addTransaction(0, 50);
    bank.addTransaction(0, 20);
    bank.addTransaction(0, -10);
    bank.addTransaction(0, 100);

    bank.addTransaction(1, 50);
    bank.addTransaction(1, 20);
    bank.addTransaction(1, -100);
    bank.addTransaction(1, 30);

    bank.addTransaction(2, 50);
    bank.addTransaction(2, -30);
    bank.addTransaction(2, -20);
    bank.addTransaction(2, 80);

    assertEquals(51.67, bank.getTotalAverageDeposit(), 0.01);
    }

    @Test
    public void shouldCalcAverageAllCorrectlyMadeWithdrawals(){

    bank.addTransaction(0, 50);
    bank.addTransaction(0, 20);
    bank.addTransaction(0, -10);
    bank.addTransaction(0, 100);

    bank.addTransaction(1, 50);
    bank.addTransaction(1, 20);
    bank.addTransaction(1, -100);
    bank.addTransaction(1, 30);

    bank.addTransaction(2, 50);
    bank.addTransaction(2, -30);
    bank.addTransaction(2, -20);
    bank.addTransaction(2, 80);

    assertEquals(11.67, bank.getTotalAverageWithdrawals(), 0.01);
    }
}
