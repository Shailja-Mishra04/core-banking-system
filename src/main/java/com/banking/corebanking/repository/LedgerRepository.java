package com.banking.corebanking.repository;

import com.banking.corebanking.entity.Ledger;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LedgerRepository extends JpaRepository<Ledger, Integer> {
    List<Ledger> findByAccountId(int accountId);
}