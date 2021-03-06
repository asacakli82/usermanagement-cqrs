package com.springbank.user.query.api;

import com.springbank.user.core.config.AxonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(AxonConfig.class)
public class UserQueryApp {

	public static void main(String[] args) {
		SpringApplication.run(UserQueryApp.class, args);
	}

}
