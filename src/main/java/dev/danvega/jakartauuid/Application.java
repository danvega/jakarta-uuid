package dev.danvega.jakartauuid;

import dev.danvega.jakartauuid.model.Product;
import dev.danvega.jakartauuid.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ProductRepository productRepository) {
		return args -> {
			List<Product> products = List.of(new Product("Product 1"), new Product("Product 2"), new Product("Product 3"));
			productRepository.saveAll(products);

			productRepository.findAll().stream().forEach(System.out::println);
		};
	}

}
