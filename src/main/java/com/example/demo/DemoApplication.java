package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping // get sth out from our server  // run localhost:8080 on your local machine
	public String Hello(){
		return "Hello World";
	}

//	@GetMapping    // is seems like @GetMapping can only exist once???
//	public List<String> hello(){
//		return List.of("Hello","World");
//	}

// new line test!
	// new test 2!
	// this is a branch test
}
