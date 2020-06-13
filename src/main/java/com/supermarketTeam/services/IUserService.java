
package com.supermarketTeam.services;

import com.supermarketTeam.entities.Users;
import java.util.List;

public interface IUserService {
    
    public Users findById(int id);
    
    public List<Users> listAll();
    
    
    
}
