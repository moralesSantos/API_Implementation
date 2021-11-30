package com.tts.UsersAPI.repository;

import com.tts.UsersAPI.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByState(String state);


}
