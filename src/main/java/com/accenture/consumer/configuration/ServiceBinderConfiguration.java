package com.accenture.consumer.configuration;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import com.accenture.consumer.service.OperationsService;
import com.accenture.proxy.binding.ServiceBinder;

@Configuration
public class ServiceBinderConfiguration {
	
	private static final Logger log = LoggerFactory.getLogger(ServiceBinderConfiguration.class);

	private ServiceBinder serviceBinder;
	
	public ServiceBinderConfiguration(ServiceBinder serviceBinder) {
		this.serviceBinder = serviceBinder;
	}
	
	@PostConstruct
	private void init() {
		serviceBinder.bindServiceInstance(OperationsService.class, result -> {
			if (result) {
				log.debug("Service binded succesfully");
			}
		});
	}
}
