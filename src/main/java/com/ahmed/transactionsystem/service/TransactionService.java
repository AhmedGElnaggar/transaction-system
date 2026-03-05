package com.ahmed.transactionsystem.service;

import com.ahmed.transactionsystem.model.Transaction;
import com.ahmed.transactionsystem.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {

    private final TransactionRepository repo;

    public TransactionService(TransactionRepository repo) { this.repo = repo; }

    public Transaction createTransaction(Transaction t) { return repo.save(t); }
    public List<Transaction> getAllTransactions() { return repo.findAll(); }
    public Optional<Transaction> getTransactionById(Long id) { return repo.findById(id); }
}