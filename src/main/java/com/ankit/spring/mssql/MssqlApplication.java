package com.ankit.spring.mssql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class MssqlApplication {
	public static void main(String[] args) {
		SpringApplication.run(MssqlApplication.class, args);
	}

}