package com.veron.spoclo_back.usercontext.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veron.spoclo_back.usercontext.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
