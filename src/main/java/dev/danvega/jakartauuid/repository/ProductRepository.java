package dev.danvega.jakartauuid.repository;

import dev.danvega.jakartauuid.model.Product;
import org.springframework.data.repository.ListCrudRepository;

import java.util.UUID;

public interface ProductRepository extends ListCrudRepository<Product, UUID> {
}
