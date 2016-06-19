package com.cassandra.users.config.validation;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserValidationTest {

	@Test
	public void testValidName() {
		String name ="";
		UserValidation validation = new UserValidation();
		assertFalse(validation.isValidName(name));
	}

}
