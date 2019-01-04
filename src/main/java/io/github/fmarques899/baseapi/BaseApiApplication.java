package io.github.fmarques899.baseapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.jwtme.security.WebSecurityConfig;

@SpringBootApplication(exclude= { SecurityAutoConfiguration.class } )
@ComponentScan(basePackageClasses= { WebSecurityConfig.class} )
public class BaseApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseApiApplication.class, args);
		
	}

}

