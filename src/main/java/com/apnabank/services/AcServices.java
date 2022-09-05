package com.apnabank.services;

import com.apnabank.entity.BankAccount;
import com.apnabank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AcServices {

    @Autowired
    private AccountRepository accountRepository;

//    @Autowired
//    public AccountRepository accountRepository;

//    private static List<BankAccount> list=new ArrayList<>();
//    static {
//        list.add(new BankAccount(11,1000,"Preetam","Current"));
//        list.add(new BankAccount(12,2000,"Niharika","Current"));
//        list.add(new BankAccount(13,3000,"Nibedita","Current"));
//    }

    //Get All Accounts
    public List<BankAccount> getAllAccounts()
    {
        List<BankAccount> list=(List<BankAccount>)accountRepository.findAll();
        return list;
    }
    //Get Single Account By AcNo.
    public BankAccount getAccountByAcNo(int acNo)
    {
        BankAccount bankAccount=null;
        try {
//            bankAccount = list.stream().filter(e ->
//                    e.getAcNo() == acNo
//            ).findFirst().get();
            bankAccount = accountRepository.findBankAccountByAcNo(acNo);
        }catch (Exception e){
            e.printStackTrace();
        }
                return bankAccount;
    }
    //Create New BankAccount
    public void createAccount(BankAccount bankAccount)
    {
        //list.add(bankAccount);
        bankAccount=accountRepository.save(bankAccount);
    }
    //Delete Account By AcNo
    public void deleteAc(int acNo)
    {
        //list.stream().filter(bankAccount -> bankAccount.getAcNo()!=acNo).collect(Collectors.toList());
        accountRepository.deleteBankAccountByAcNo(acNo);
    }
    //Update Account By AcNo
    public BankAccount updateAc(BankAccount bankAccount,int acNo)
    {
//        List<BankAccount> list = AcServices.list.stream().map(e -> {
//            if (e.getAcNo() == acNo) {
//                e.setAcHolderName(bankAccount.getAcHolderName());
//                e.setAcType(bankAccount.getAcType());
//                e.setAcBalance(bankAccount.getAcBalance());
//            }
//            return e;
//        }).collect(Collectors.toList());
        BankAccount account = accountRepository.save(bankAccount);
        return account;
    }

}
