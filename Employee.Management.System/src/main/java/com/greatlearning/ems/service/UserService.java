package com.greatlearning.ems.service;

import org.springframework.http.ResponseEntity;

import com.greatlearning.ems.model.User;

public interface UserService {


	public ResponseEntity<String> addNewUser(org.springframework.security.core.userdetails.User user);

	/**
	 * addNewUser() will check if the input user is available. If user not
	 * available, check if the role names and their corresponding id of the input
	 * user are correct. If not, update with the correct id. If the role name itself
	 * is unavailable, set the role to the default - "db_admin" & its id. Update the
	 * password by encoding and then save this user. Return a message with
	 * 201-Created HTTP status. If the input user is available, return a
	 * 409-Conflict HTTP status with a message.
	 */
	ResponseEntity<String> addNewUser(User user);
}
