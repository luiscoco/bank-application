package com.luxoft.bankapp.service;

import com.luxoft.bankapp.domain.Bank;
import com.luxoft.bankapp.domain.Client;

public class BankReport {

    public int getNumberOfClients(Bank bank) {
        return bank.getClients().size();
    }

    public int getNumberOfAccounts(Bank bank) {
        int numberOfAccounts = 0;
        for (Client client : bank.getClients()) {
            numberOfAccounts += client.getAccounts().size();
        }
        return numberOfAccounts;
    }
}
