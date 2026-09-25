package pro.FintechApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pro.FintechApp.model.Transaction;

import java.util.List;

    public interface TransactionRepository extends MongoRepository<Transaction, String> {
        List<Transaction> findByFromAccountOrToAccount(String from, String To);
    }


