package com.greatlearning.ems.service;

import org.springframework.http.ResponseEntity;

import com.greatlearning.ems.model.Role;

public interface RoleService {

	public ResponseEntity<String> addNewRole(javax.management.relation.Role role);

	/**
	 * The addNewRole() function will check if there is a role with the same name.
	 * If exists, it returns 409-Conflict HTTP status with a message. Else it will
	 * create a new role and save it. It will return 201-Created HTTP status with
	 * message.
	 */
	ResponseEntity<String> addNewRole(Role role);

}
