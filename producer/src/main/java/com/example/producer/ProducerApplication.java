package com.example.producer;

import com.example.producer.stream.WikiStreamConsumer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducerApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(WikiStreamConsumer wikiStreamConsumer) {
		return runner -> {
			wikiStreamConsumer.consumeStreamAndPublish();
		};
	}
}
