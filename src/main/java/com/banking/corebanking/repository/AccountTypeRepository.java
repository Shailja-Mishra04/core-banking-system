package com.banking.corebanking.repository;

import com.banking.corebanking.entity.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountTypeRepository extends JpaRepository<AccountType, Integer> {
    AccountType findByTypeName(String typeName);
}