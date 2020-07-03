package com.odazie.jpa.learningjpa.web;


import com.odazie.jpa.learningjpa.business.service.UserService;
import com.odazie.jpa.learningjpa.data.entity.UserRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/")
    public List<UserRecord> getAllUser()
    {
        return userService.getAllUsers();
    }
    @RequestMapping(value="/add-user", method=RequestMethod.POST)
    public void addUser(@RequestBody UserRecord userRecord)
    {
        userService.addUser(userRecord);
    }
}
