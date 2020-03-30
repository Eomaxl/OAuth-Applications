package com.eomaxl.spring.mockito.api;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class SpringSingleSignOnApplication 
{

	@GetMapping("/login")
	public String welcome2User(Principal principal)
	{
		return "Hi "+principal.getName()+" Welcome to junkyard";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringSingleSignOnApplication.class, args);
	}

}
