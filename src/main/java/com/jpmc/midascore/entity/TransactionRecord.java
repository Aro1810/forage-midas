package com.jpmc.midascore.entity;

import jakarta.persistence.*;

@Entity
public class TransactionRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double amount;
    private double incentiveAmount;

    @ManyToOne
    @JoinColumn(name = "sender_id", nullable = false)
    private UserRecord sender;

    @ManyToOne
    @JoinColumn(name = "recipient_id", nullable = false)
    private UserRecord recipient;

    public TransactionRecord() {
    }

    public TransactionRecord(double amount, UserRecord sender, UserRecord recipient, double incentiveAmount) {
        this.amount = amount;
        this.sender = sender;
        this.recipient = recipient;
        this.incentiveAmount = incentiveAmount;
    }
}