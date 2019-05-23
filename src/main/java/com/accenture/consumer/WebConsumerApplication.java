package com.accenture.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.accenture.consumer.configuration.ServiceBinderConfiguration;
import com.accenture.proxy.binding.ServiceBinder;

@SpringBootApplication
@ComponentScan({"com.accenture.proxy", "com.accenture"})
public class WebConsumerApplication {
	
	@Autowired
	private ServiceBinderConfiguration binderConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(WebConsumerApplication.class, args);
	}

}
