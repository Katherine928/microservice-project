package net.katherine.microserviceaccount.controller;


import net.katherine.microserviceaccount.model.Accounts;
import net.katherine.microserviceaccount.model.Customer;
import net.katherine.microserviceaccount.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AccountsController {

    @Autowired
    private AccountsRepository accountsRepository;

    @PostMapping("/myAccount")
    public Accounts getAccountDetails(@RequestBody Customer customer) {
        Accounts accounts = accountsRepository.findByCustomerId(customer.getCustomerId());
        return accounts;
    }

    @GetMapping("/accounts")
    public List<Accounts> getAllAccount() {
        List<Accounts> accounts = new ArrayList<>();
        accountsRepository.findAll().forEach(accounts::add);
        return accounts;
    }


}
