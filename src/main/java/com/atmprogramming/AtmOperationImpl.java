package com.atmprogramming;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperation {

    ATM atm = new ATM();
    Map<Double, String> miniState = new HashMap<>();

    @Override
    public void viewBalance() {

        System.out.println("Available Balance is : " + atm.getBalance());

    }

    @Override
    public void depositAmount(double depositAmount) {
        miniState.put(depositAmount, "Amount Deposited");
        System.out.println(depositAmount + " Amount Deposited Successfully");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();

    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount%500==0) {
            if (withdrawAmount < atm.getBalance()) {
                miniState.put(withdrawAmount, "Amount Withdraw");
                System.out.println(withdrawAmount + " Amount Withdraw Successfully");
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            } else {
                System.out.println("----Insufficient Balance---- ");
            }
        }else {
            System.out.println("Please enter amount multiple of 500");
        }
    }

    @Override
    public void viewMiniStatement() {

        for (Map.Entry<Double, String> m : miniState.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}
