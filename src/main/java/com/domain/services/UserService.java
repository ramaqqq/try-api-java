package com.domain.services;

import com.domain.models.entities.User;
import com.domain.models.repos.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User save(User user){
        return userRepo.save(user);
    }

    public User findOne(Long id) {
        Optional<User> temp = userRepo.findById(id);
        if(!temp.isPresent()) {
            return null;
        }
        return temp.get();
    }

    public Iterable<User> findAll() {
        return userRepo.findAll();
    }

    public void removeOne(Long id){
        userRepo.deleteById(id);
    }

    public List<User> findByUsername(String user){
        return userRepo.findByUsernameContains(user);
    }


}
