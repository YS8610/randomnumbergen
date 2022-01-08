package tfip.modserver.randomnumbergen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
public class RandomnumbergenApp {

	public static void main(String[] args) {

		Logger logger = LoggerFactory.getLogger(RandomnumbergenApp.class);
		SpringApplication app = new SpringApplication(RandomnumbergenApp.class);

		app.run(args);

	}

}
