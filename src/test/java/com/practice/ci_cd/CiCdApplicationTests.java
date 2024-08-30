package com.practice.ci_cd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

@SpringBootTest
class CiCdApplicationTests {
	static Logger log = Logger.getLogger(CiCdApplicationTests.class.getName());

	@Test
	void contextLoads() {
		log.info("Hello! THIS a demo project for CI_CD");
	}

}
