package com.apnabank;

import com.apnabank.entity.BankAccount;
import com.apnabank.repository.AccountRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class BankApplication {

    public static void main(String[] args) {

        ApplicationContext context=SpringApplication.run(BankApplication.class, args);

       // AccountRepository repository = context.getBean(AccountRepository.class);

        //Save Single BankAccount

//        BankAccount bankAccount=new BankAccount();
//        bankAccount.setAcNo(23213123);
//        bankAccount.setAcBalance(12000);
//        bankAccount.setAcHolderName("Preetam");
//        bankAccount.setAcType("Saving");
//
//        BankAccount bankAccount1=repository.save(bankAccount);
//        System.out.println(bankAccount1);

        //Save Multiple BankAccounts

//        BankAccount bankAccount=new BankAccount();
//        bankAccount.setAcNo(123);
//        bankAccount.setAcBalance(1000);
//        bankAccount.setAcHolderName("Suvam");
//        bankAccount.setAcType("Current");
//
//        BankAccount bankAccount1=new BankAccount();
//        bankAccount1.setAcNo(1234);
//        bankAccount1.setAcBalance(1200);
//        bankAccount1.setAcHolderName("Niharika");
//        bankAccount1.setAcType("Saving");
//
//        List<BankAccount> bankAccounts = List.of(bankAccount, bankAccount1);
//        Iterable<BankAccount> bankAccountIterable = repository.saveAll(bankAccounts);
//        bankAccountIterable.forEach(e->{
//            System.out.println(e);
//        });

        //Update BankAccount of no 123

//        Optional<BankAccount> optional = repository.findById(123);
//
//        BankAccount bankAccount = optional.get();
//
//        bankAccount.setAcHolderName("Suvam Mohapatra");
//        bankAccount.setAcType("Saving");
//
//        BankAccount updatedAccount = repository.save(bankAccount);
//
//        System.out.println(updatedAccount);

        //Get All Data
//        Iterable<BankAccount> bankAccounts = repository.findAll();
//        bankAccounts.forEach(e->{
//            System.out.println(e);
//        });

        //Delete BankAccount

//        repository.deleteById(23213123);
//        System.out.println("Deleted");

        //Delete All BankAccounts
//        repository.deleteAll();
//        System.out.println("Deleted All");

//        List<BankAccount> acHolderName = repository.findBankAccountByAcHolderName("Preetam");
//        acHolderName.forEach(e->{
//            System.out.println(e);
//        });
//
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
//
//        List<BankAccount> saving = repository.findBankAccountsByAcType("Saving");
//        saving.forEach(e->{
//            System.out.println(e);
//        });
//        List<BankAccount> preetam = repository.findBankAccountsByAcBalanceAndAcHolderName(1000, "Preetam");
//        preetam.forEach(e->{
//            System.out.println(e);
//        });
//        List<BankAccount> allBankAccounts = repository.getAllBankAccounts();
//        allBankAccounts.forEach(e->{
//            System.out.println(e);
//        });
//
//        List<BankAccount> name = repository.getBankAccountByName("Preetam","Saving");
//        System.out.println(name);
//
//        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//
//        List<BankAccount> accounts = repository.getAllAccounts();
//        accounts.forEach(e->{
//            System.out.println(e);
//        });
    }

}
