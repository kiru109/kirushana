package com.kiruthi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiruthi.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
