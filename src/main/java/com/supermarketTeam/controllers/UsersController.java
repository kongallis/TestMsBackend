
package com.supermarketTeam.controllers;

import com.supermarketTeam.entities.Users;
import com.supermarketTeam.services.UserServiceImplem;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/getusers")
public class UsersController {
    
    
    @Autowired
    private UserServiceImplem service;
    
    
    @GetMapping(value = "/", produces = "application/json")
    public List<Users> listAllUsers() {
        System.out.println("&&&&&&&& ITS IN &&&&&&&&");
        return service.listAll();
    }
    
    @GetMapping(value = "/{id}", produces = "application/json")
    public Users getOneUser(@PathVariable("id") int id) {
        Users user = service.findById(id);
        return user;

    }
    
}
