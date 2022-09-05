package com.apnabank.repository;

import com.apnabank.entity.BankAccount;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends CrudRepository<BankAccount,Integer> {

//    public List<BankAccount> findBankAccountByAcHolderName(String acHolderName);
//    public List<BankAccount> findBankAccountsByAcType(String acType);
//    public List<BankAccount> findBankAccountsByAcBalanceAndAcHolderName(float acBalance,String acHolderName);
//
//    @Query("select b from BankAccount b")
//    public List<BankAccount> getAllBankAccounts();
//
//    @Query("select b from BankAccount b where b.acHolderName= :n and b.acType= :a")
//    public List<BankAccount> getBankAccountByName(@Param("n") String acHolderName,@Param("a") String acType);
//
//    @Query(value="select * from bank_account",nativeQuery=true)
//    public List<BankAccount> getAllAccounts();

   // public List<BankAccount> getAllAccounts();

    //public BankAccount findAllBankAccounts();

    public BankAccount findBankAccountByAcNo(int acNo);

    public BankAccount deleteBankAccountByAcNo(int acNo);
}
