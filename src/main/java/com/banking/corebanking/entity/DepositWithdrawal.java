package com.banking.corebanking.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "DEPOSIT_WITHDRAWAL")
public class DepositWithdrawal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dw_id")
    private int dwId;

    @Column(name = "account_id", nullable = false)
    private int accountId;

    @Column(name = "transaction_id", nullable = false)
    private int transactionId;

    @Column(name = "dw_type", nullable = false)
    private String dwType;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;

    @Column(name = "channel", nullable = false)
    private String channel;

    @Column(name = "reference_number", unique = true, nullable = false)
    private String referenceNumber;

    @Column(name = "initiated_at")
    private LocalDateTime initiatedAt;

    @Column(name = "status", nullable = false)
    private String status;

    // Getters and Setters
    public int getDwId() { return dwId; }
    public void setDwId(int dwId) { this.dwId = dwId; }

    public int getAccountId() { return accountId; }
    public void setAccountId(int accountId) { this.accountId = accountId; }

    public int getTransactionId() { return transactionId; }
    public void setTransactionId(int transactionId) { this.transactionId = transactionId; }

    public String getDwType() { return dwType; }
    public void setDwType(String dwType) { this.dwType = dwType; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public String getChannel() { return channel; }
    public void setChannel(String channel) { this.channel = channel; }

    public String getReferenceNumber() { return referenceNumber; }
    public void setReferenceNumber(String referenceNumber) { this.referenceNumber = referenceNumber; }

    public LocalDateTime getInitiatedAt() { return initiatedAt; }
    public void setInitiatedAt(LocalDateTime initiatedAt) { this.initiatedAt = initiatedAt; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}