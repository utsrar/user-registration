package com.cassandra.users.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories("com.cassandra.users.repository")
public class CassandraConfiguration  {

	
}
