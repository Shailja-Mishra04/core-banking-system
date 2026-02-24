package com.banking.corebanking.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "ACCOUNT_TYPE")
public class AccountType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_type_id")
    private int accountTypeId;

    @Column(name = "type_name", nullable = false)
    private String typeName;

    @Column(name = "min_balance", nullable = false)
    private BigDecimal minBalance;

    @Column(name = "overdraft_allowed", nullable = false)
    private boolean overdraftAllowed;

    @Column(name = "interest_rate")
    private BigDecimal interestRate;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    // Getters and Setters
    public int getAccountTypeId() { return accountTypeId; }
    public void setAccountTypeId(int accountTypeId) { this.accountTypeId = accountTypeId; }

    public String getTypeName() { return typeName; }
    public void setTypeName(String typeName) { this.typeName = typeName; }

    public BigDecimal getMinBalance() { return minBalance; }
    public void setMinBalance(BigDecimal minBalance) { this.minBalance = minBalance; }

    public boolean isOverdraftAllowed() { return overdraftAllowed; }
    public void setOverdraftAllowed(boolean overdraftAllowed) { this.overdraftAllowed = overdraftAllowed; }

    public BigDecimal getInterestRate() { return interestRate; }
    public void setInterestRate(BigDecimal interestRate) { this.interestRate = interestRate; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
