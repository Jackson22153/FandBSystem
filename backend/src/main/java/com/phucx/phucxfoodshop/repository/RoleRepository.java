package com.phucx.phucxfoodshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phucx.phucxfoodshop.model.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{
    
}
