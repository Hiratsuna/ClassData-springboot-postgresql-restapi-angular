package com.methcook.methacademy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MethacademyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MethacademyApplication.class, args);
	}

}
