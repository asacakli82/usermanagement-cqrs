package com.springbank.user.oauth.api.repositories;

import com.springbank.user.core.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User,String> {

    @Query("{'account.username': ?0}")
    Optional<User> findByUsername(String username);

}
