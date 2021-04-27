package com.kodilla.bank.homework;

public class CashMachine {

    private int[] transactions;
    private int size;

    public CashMachine() {
        this.transactions = new int[0];
        this.size = 0;
    }

    public void addTransaction(int value){

        if ((getBalance() + value) >= 0) {
            this.size++;
            int[] newTab = new int[size];
            System.arraycopy(transactions, 0, newTab, 0, transactions.length);
            newTab[size -1] = value;
            this.transactions = newTab;

            if (value < 0){
                System.out.println("Insufficient funds");
            }
        }
    }

    public int getBalance() {
        int sum = 0;
        for (int i = 0; i < transactions.length; i++){
            sum += transactions[i];
        }
        return sum;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public int getNumberOfDeposits() {
        int counter = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0){
                counter ++;
            }
        }
        return counter;
    }

    public int getNumberOfWithdrawals() {
        int counter = 0;
        for (int i=0; i < transactions.length; i++) {
            if (transactions[i] < 0){
                counter ++;
            }
        }
        return counter;
    }

    public double getAverageDeposit() {
        if (this.transactions.length == 0 || getNumberOfDeposits() == 0) {
            return 0.0;
        }

        double sum = 0;
        for (int i = 0; i < transactions.length; i++){
            if (transactions[i] > 0){
                sum += transactions[i];
            }
        }
        return sum/getNumberOfDeposits();
    }

    public double getAverageWithdrawals() {
        if (this.transactions.length == 0 || getNumberOfWithdrawals() == 0) {
            return 0.0;
        }
        double sum = 0;
        for (int i = 0; i < transactions.length; i++){
            if (transactions[i] < 0){
                sum += transactions[i];
            }
        }
        return sum/getNumberOfWithdrawals();
    }
}


