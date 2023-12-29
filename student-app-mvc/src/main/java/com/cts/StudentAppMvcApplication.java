package com.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.cts.controller.*;
import com.cts.dao.*;
import com.cts.service.*;

@SpringBootApplication
public class StudentAppMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentAppMvcApplication.class, args);
		
	}

}
