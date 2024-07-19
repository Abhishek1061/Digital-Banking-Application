package com.wecp.progressive.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wecp.progressive.entity.Accounts;

@Repository
public interface AccountRepository extends JpaRepository<Accounts , Integer>{

    // @Query("select a from Accounts a where a.customers.customerId = :customerId")
    // public List<Accounts> findByCustomerId(int customerId);

    public List<Accounts> findAccountsByCustomersCutomerId(int customerId);

    public List<Accounts> findAccountsByCutomerId(int customerId);

    @Query("select a from Accounts a order by a.balance")
    public List<Accounts> getAllAccountsSortedByBalance();
}
