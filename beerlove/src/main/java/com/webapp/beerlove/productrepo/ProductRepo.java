package com.webapp.beerlove.productrepo;

import com.webapp.beerlove.homepage.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
