package com.jpmc.midascore.foundation;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class TransactionService {

    @Transactional
    public void processTransaction(Transaction transaction) {

    }
}