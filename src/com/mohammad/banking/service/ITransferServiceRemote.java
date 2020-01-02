package com.mohammad.banking.service;

import com.mohammad.banking.entity.BankAccount;

public interface ITransferServiceRemote {
    
    void transfer(int sourceAccount, 
                  int destinationAccount,
                  long amount);
            
    BankAccount findByNumber2(int number);
    
}
