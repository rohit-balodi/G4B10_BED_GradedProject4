package com.greatlearning.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.ems.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

	Role findOneByName(String name);
}
