package com.xsd.demo;

import com.xsd.demo.bean.Product;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigInteger;

@SpringBootTest
class XsdDemoApplicationTests {

	@Test
	void contextLoads() {
		Product product = new Product();
		product.setProductId(new BigInteger("101"));
		product.setProductDescription("This is new Product");
		System.out.println(product);
	}

}
