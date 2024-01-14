package com.hotel.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HotelServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelServiceApplication.class, args);
	}


	void min(){
		System.out.println("at least 20 minutes required");
	}


	public void start(){
		System.out.println("I am started running");
	}

	public void max(){
		System.out.println("max time of runing is 30 minutes");
	}


	public void mins(){
		System.out.println("max time of runing is 30 minutes");
	}


	//removed some thing in this java file

}
