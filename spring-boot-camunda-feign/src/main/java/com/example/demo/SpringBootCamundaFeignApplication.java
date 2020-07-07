package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.client.MyClient;

@SpringBootApplication
public class SpringBootCamundaFeignApplication implements CommandLineRunner{

	@Autowired
	private MyClient myClient;
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootCamundaFeignApplication.class, args);
	}

	@Override
	public void run(String... args) 
	throws Exception {
			
		int i = 0;
		
		while(i < 10) {
		
			myClient.start();
			
			i++;
			
			Thread.sleep(5000);
			
			System.out.println("Tarefa Start............");
		}
	}
}