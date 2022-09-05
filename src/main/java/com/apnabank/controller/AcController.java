package com.apnabank.controller;
import com.apnabank.entity.BankAccount;
import com.apnabank.services.AcServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AcController {

    @Autowired
    private AcServices acServices;

    @GetMapping("/allAccounts")
    public ResponseEntity<List<BankAccount>> getAllAccounts()
    {
        List<BankAccount> allAccounts = acServices.getAllAccounts();
        if(allAccounts.size()<=0)
        {
           return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        //return this.acServices.getAllAccounts();
        return ResponseEntity.of(Optional.of(allAccounts));
    }

    @GetMapping("/getAccount/{acNo}")
    public ResponseEntity<BankAccount> getAcByAcNo(@PathVariable("acNo") int acNo)
    {
        BankAccount bankAccount=acServices.getAccountByAcNo(acNo);
        if(bankAccount==null)
        {
            ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(bankAccount));
    }

    @PostMapping("/createAccount")
    public ResponseEntity<BankAccount> createAccount(@RequestBody BankAccount bankAccount)
    {
        BankAccount account=null;
        try {
            acServices.createAccount(bankAccount);
            return ResponseEntity.ok(account);
        }catch (Exception e)
        {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @DeleteMapping("/deleteAc/{acNo}")
    public ResponseEntity<?> deleteAcByAcNo(@PathVariable ("acNo") int acNo)
    {
        try {
            acServices.deleteAc(acNo);
            return ResponseEntity.status(HttpStatus.OK).build();
        }catch (Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
    @PutMapping("/updateAc/{acNo}")
    public ResponseEntity<BankAccount> updateByAcNo(@RequestBody BankAccount bankAccount,@PathVariable("acNo") int acNo)
    {
        try {
            acServices.updateAc(bankAccount, acNo);
           return ResponseEntity.ok().body(bankAccount);
        }catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
