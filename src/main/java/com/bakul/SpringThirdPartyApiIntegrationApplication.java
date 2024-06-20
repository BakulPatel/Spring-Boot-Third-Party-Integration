package com.bakul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringThirdPartyApiIntegrationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext confAppContext =SpringApplication.run(SpringThirdPartyApiIntegrationApplication.class, args);
		List<String> list=List.of(confAppContext.getBeanDefinitionNames());

		list.stream().forEach(e->{
			System.out.println("Bean : "+e);
		});

		//confAppContext.
	}

}
