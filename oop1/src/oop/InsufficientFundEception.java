package oop;

public class InsufficientFundEception extends Exception {
    double amount;
    public InsufficientFundEception(double v) {
        amount=v;
    }
}
