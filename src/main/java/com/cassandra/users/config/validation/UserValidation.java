package com.cassandra.users.config.validation;

public class UserValidation {
	public boolean isValidName(String name){
		return name != null && !"".equals(name);
	}
}
