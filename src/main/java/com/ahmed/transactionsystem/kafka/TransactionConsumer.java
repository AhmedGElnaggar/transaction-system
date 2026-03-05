package com.ahmed.transactionsystem.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TransactionConsumer {

    @KafkaListener(topics = "transactions", groupId = "transaction-group")
    public void consume(ConsumerRecord<String, String> record) {
        System.out.println("Transaction received: " + record.value());
    }
}