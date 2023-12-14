package com.rtp.service;

public class NetBankingServiceImpl implements NetBankingService{

    @Override
    public double getBalance(String accountNo) {
        System.out.print("getBalance() -> ");
        return 10000.0;
    }

    @Override
    public String getAccountHolderName(String accountN) {
        System.out.print("getAccountHolderName() -> ");
        return "Kamal patels";
    }
}
