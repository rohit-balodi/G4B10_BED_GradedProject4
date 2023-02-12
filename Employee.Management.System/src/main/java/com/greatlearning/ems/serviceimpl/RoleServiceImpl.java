package com.greatlearning.ems.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.greatlearning.ems.model.Role;
import com.greatlearning.ems.repository.RoleRepository;
import com.greatlearning.ems.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepository repo;

	/**
	 * The addNewRole() function will check if there is a role with the same name.
	 * If exists, it returns 409-Conflict HTTP status with a message. Else it will
	 * create a new role and save it. It will return 201-Created HTTP status with
	 * message.
	 */

	@Override
	public ResponseEntity<String> addNewRole(Role role) {
		Role existingRole = repo.findOneByName(role.getName());
		if (existingRole == null) {
			repo.save(role);
			return new ResponseEntity<String>("New role added.", HttpStatus.CREATED);
		} else {
			return new ResponseEntity<String>("Role already exists.", HttpStatus.CONFLICT);
		}
	}

	@Override
	public ResponseEntity<String> addNewRole(javax.management.relation.Role role) {
		// TODO Auto-generated method stub
		return null;
	}
}
