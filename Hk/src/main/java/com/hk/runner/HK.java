package com.hk.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class HK implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
     System.out.println("hello boss");
		 System.out.println("how are you");

	}

}
