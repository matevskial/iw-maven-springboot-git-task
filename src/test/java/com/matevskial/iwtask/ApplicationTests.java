package com.matevskial.iwtask;

import static org.assertj.core.api.Assertions.assertThat;

import org.apache.catalina.core.ApplicationContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
class ApplicationTests {
	
	private ApplicationContext ctx;
	
	@Test
	void contextLoads() {
		
	}

}
