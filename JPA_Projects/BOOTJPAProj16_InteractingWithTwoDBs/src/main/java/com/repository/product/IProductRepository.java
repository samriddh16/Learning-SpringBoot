package com.repository.product;
import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.product.Product;

public interface IProductRepository extends JpaRepository<Product, Integer> {

}
