package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void deposit(double sum)throws LimitException{
         amount += sum;
        System.out.println("Вы успешно пополнили счет на: " + (int) getAmount() + " Сом");

    }
    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            System.out.println("Недостаточно средств на счету:" + amount);
        } else {
            amount -= sum;
            System.out.println("Вы сняли:" + sum + "сом" + "Остаток на счету:" + amount);
        }


    }


}
