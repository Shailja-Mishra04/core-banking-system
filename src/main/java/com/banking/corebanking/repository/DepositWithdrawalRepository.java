package com.banking.corebanking.repository;

import com.banking.corebanking.entity.DepositWithdrawal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepositWithdrawalRepository extends JpaRepository<DepositWithdrawal, Integer> {
    DepositWithdrawal findByReferenceNumber(String referenceNumber);
}