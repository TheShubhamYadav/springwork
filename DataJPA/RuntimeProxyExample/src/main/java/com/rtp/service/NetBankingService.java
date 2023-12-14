package com.rtp.service;

public interface NetBankingService {

    double getBalance(String accountNo);
    String getAccountHolderName(String accountN);
}
