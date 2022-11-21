package com.domain.models.repos;

import com.domain.models.entities.User;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<User, Long>  {

    List<User> findByUsernameContains(String username);

}
