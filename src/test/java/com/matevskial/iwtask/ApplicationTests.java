package com.matevskial.iwtask;

import static org.assertj.core.api.Assertions.assertThat;

import org.apache.catalina.core.ApplicationContext;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
	
	ApplicationContext ctx;
	
	@Test
	void contextLoads() {
		assertThat(ctx).isNotNull();
	}

}
