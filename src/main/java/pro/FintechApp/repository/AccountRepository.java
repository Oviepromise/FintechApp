package pro.FintechApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pro.FintechApp.model.Account;

import java.util.List;

    public interface AccountRepository extends MongoRepository<Account, String> {
        List<Account> findByUserId(String userId);
        java.util.Optional<Account> findByAccountNumber(String accountNumber);
    }

