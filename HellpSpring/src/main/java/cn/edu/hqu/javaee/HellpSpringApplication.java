package cn.edu.hqu.javaee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellpSpringApplication {

	public static void main(String[] args) {
		System.out.println("hello");
		SpringApplication.run(HellpSpringApplication.class, args);
	}

}
