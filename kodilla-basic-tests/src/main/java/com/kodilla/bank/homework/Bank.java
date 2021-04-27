package com.kodilla.bank.homework;

public class Bank {

        private CashMachine[] cashMachines;
        private int numberOfMachines;

        public Bank(int numberOfMachines) {
            this.numberOfMachines = numberOfMachines;
            this.cashMachines = new CashMachine[numberOfMachines];

            for (int i = 0; i < cashMachines.length; i++) {
                cashMachines[i] = new CashMachine();
            }
        }

        public int getNumberOfMachines() {
            return numberOfMachines;
        }

        public void addTransaction(int machineNumber, int value) {
            if (machineNumber < cashMachines.length) {
                cashMachines[machineNumber].addTransaction(value);
            }
        }

        public int getTotalBalance() {
            int sum = 0;
            for (int i = 0; i < cashMachines.length; i++) {
                sum += cashMachines[i].getBalance();
            }
            return sum;
        }

        public int getTotalNumberOfDeposits() {
            int sum = 0;
            for (int i = 0; i < cashMachines.length; i++) {
                sum += cashMachines[i].getNumberOfDeposits();
            }
            return sum;
        }

        public int getTotalNumberOfWithdrawals() {
            int sum = 0;
            for (int i = 0; i < cashMachines.length; i++) {
                sum += cashMachines[i].getNumberOfWithdrawals();
            }

            return sum;

        }

        public double getTotalAverageDeposit() {
            if (this.cashMachines.length == 0) {
                return 0;
            }

            double sum = 0;
            for (int i = 0; i < cashMachines.length; i++) {
                sum += cashMachines[i].getAverageDeposit();
            }

            return sum / cashMachines.length;
        }

        public double getTotalAverageWithdrawals() {
            if (this.cashMachines.length == 0) {
                return 0;
            }

            double sum = 0;
            for (int i = 0; i < cashMachines.length; i++) {
                sum += cashMachines[i].getAverageWithdrawals();
            }

            return (sum / cashMachines.length) * -1;
        }
    }
