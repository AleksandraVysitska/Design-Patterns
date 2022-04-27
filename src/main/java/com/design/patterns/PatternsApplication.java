package com.design.patterns;

import com.design.patterns.creational.CandyFactory;
import com.design.patterns.creational.ChocolateFactory;
import com.design.patterns.creational.HardCandyFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PatternsApplication {
	private static final CandyFactory chocolateFactory = new ChocolateFactory();
	private static final CandyFactory hardCandyFactory = new HardCandyFactory();

	private static final String CANDY_CANE = "candy cane";
	private static final String LOLLIPOP = "lollipop";
	private static final String DARK = "dark";

	public static void main(String[] args) {
		SpringApplication.run(PatternsApplication.class, args);
		chocolateFactory.getCandyPackage(7, DARK);
		hardCandyFactory.getCandyPackage(14, LOLLIPOP);
		hardCandyFactory.getCandyPackage(50, CANDY_CANE);

	}

}
