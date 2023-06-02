package com.main.mainassgn.repositories;

import com.main.mainassgn.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductsRepository extends JpaRepository<ProductsRepository, Long> {
    @Query("select Products (p.product_id as productId ,p.name as product, p.description as description,c.name as category,\n" +
            "p.price as price, p.quantity as quantity) \n" +
            "from Products p, Category c, ProductCategory pc \n" +
            "\n" +
            "where pc.product_id = p.product_id and pc.category_id = c.category_id;")
     List<Products> productList();
}
