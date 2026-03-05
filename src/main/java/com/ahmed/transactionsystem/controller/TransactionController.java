package com.ahmed.transactionsystem.controller;

import com.ahmed.transactionsystem.model.Transaction;
import com.ahmed.transactionsystem.service.TransactionService;
import com.ahmed.transactionsystem.kafka.TransactionProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    private final TransactionService service;
    private final TransactionProducer producer;

    public TransactionController(TransactionService service, TransactionProducer producer) {
        this.service = service;
        this.producer = producer;
    }

    @PostMapping
    public ResponseEntity<Transaction> create(@RequestBody Transaction transaction) {
        Transaction saved = service.createTransaction(transaction);
        producer.sendTransaction("New transaction: " + saved.getSender() + " -> " + saved.getReceiver() + " $" + saved.getAmount());
        return ResponseEntity.ok(saved);
    }

    @GetMapping
    public ResponseEntity<List<Transaction>> getAll() {
        return ResponseEntity.ok(service.getAllTransactions());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transaction> getById(@PathVariable Long id) {
        return service.getTransactionById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}