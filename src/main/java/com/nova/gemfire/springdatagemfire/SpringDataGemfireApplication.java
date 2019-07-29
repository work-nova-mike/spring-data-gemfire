package com.nova.gemfire.springdatagemfire;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ImportResource("gemfire-context.xml")
@EnableGemfireRepositories(basePackages="com.nova.gemfire.springdatagemfire.repository")
@EnableTransactionManagement
@EnableDiscoveryClient
public class SpringDataGemfireApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringDataGemfireApplication.class, args);
	}
}