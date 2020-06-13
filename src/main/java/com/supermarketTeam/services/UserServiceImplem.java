
package com.supermarketTeam.services;

import com.supermarketTeam.dao.UserRepo;
import com.supermarketTeam.entities.Users;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserServiceImplem implements IUserService{

    @Autowired
    private UserRepo repo;
    
    @Override
    public Users findById(int id) {
        return repo.findById(id).get();
    }

    @Override
    public List<Users> listAll() {
        return repo.findAll();
    }
    
}
