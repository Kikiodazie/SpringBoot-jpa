package com.odazie.jpa.learningjpa.business.service;

import com.odazie.jpa.learningjpa.data.entity.UserRecord;
import com.odazie.jpa.learningjpa.data.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<UserRecord> getAllUsers(){
        List<UserRecord> userRecords = new ArrayList<>();
        userRepository.findAll().forEach(userRecords::add);
        return userRecords;
    }

    public void addUser(UserRecord userRecord){
        userRepository.save(userRecord);
    }

}
