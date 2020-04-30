package com.kindsonthegenius.productserver2.repositories;


import com.kindsonthegenius.productserver2.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productdata",
        path = "productdata")
public interface ProductRepository
        extends MongoRepository<Product, String> {
}
