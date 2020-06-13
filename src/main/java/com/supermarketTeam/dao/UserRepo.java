
package com.supermarketTeam.dao;

import com.supermarketTeam.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Integer>{
    
}
