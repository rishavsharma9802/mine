package com.test.hello;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Autowired
	public HelloApplication hm;
	@Test
	public void test() {
		String sr=hm.home();
		assertEquals(sr,"Hello World");
	}

}
