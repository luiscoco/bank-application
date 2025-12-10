package com.luxoft.bankapp.tests;

import com.luxoft.bankapp.domain.*;
import com.luxoft.bankapp.exceptions.ClientExistsException;
import com.luxoft.bankapp.service.BankReport;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankReportTest {

    private Bank bank;
    private BankReport bankReport;

    @Before
    public void setUp() throws ClientExistsException {
        bank = new Bank();
        bankReport = new BankReport();

        Client client1 = new Client("John Doe", Gender.MALE);
        client1.addAccount(new SavingAccount(1, 1000));
        client1.addAccount(new CheckingAccount(2, 2000, 1000));
        bank.addClient(client1);

        Client client2 = new Client("Jane Smith", Gender.FEMALE);
        client2.addAccount(new SavingAccount(3, 3000));
        bank.addClient(client2);
    }

    @Test
    public void testGetNumberOfClients() {
        assertEquals(2, bankReport.getNumberOfClients(bank));
    }

    @Test
    public void testGetNumberOfAccounts() {
        assertEquals(3, bankReport.getNumberOfAccounts(bank));
    }
}
