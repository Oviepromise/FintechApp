package pro.FintechApp.repository;

import pro.FintechApp.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;
import pro.FintechApp.model.Account;
import pro.FintechApp.model.Transaction;

import java.util.List;


public interface UserRepository extends MongoRepository<User , String> {
    Optional<User>findByEmail(String email);
    Boolean existByEmail(String email);
}



