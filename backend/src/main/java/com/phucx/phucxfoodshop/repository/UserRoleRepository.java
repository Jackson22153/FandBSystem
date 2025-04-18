package com.phucx.phucxfoodshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phucx.phucxfoodshop.compositeKey.UserRoleID;
import com.phucx.phucxfoodshop.model.entity.UserRole;


@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, UserRoleID> {
}
