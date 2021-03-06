package com.springbank.user.cmd.api;

import com.springbank.user.core.config.AxonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(AxonConfig.class)
public class UserCommandApp {

	public static void main(String[] args) {
		SpringApplication.run(UserCommandApp.class, args);
	}

}
