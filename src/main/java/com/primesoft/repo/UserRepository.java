package com.primesoft.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.primesoft.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
