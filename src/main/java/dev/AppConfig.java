package dev;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("dev")
@PropertySource("application.properties")
public class AppConfig {
	@Bean
	public Scanner scanner(){
		return new Scanner(System.in);
	}
}
