package org.sid.bilingservice.feign;


import org.sid.bilingservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="PRODUCTS-SERVICE")
public interface ProductItemRestClient {
    @GetMapping(path="/products")
    PagedModel<Product> pageProducts();
    @GetMapping(path="/products/{id}")
    Product getProductById (@PathVariable(name="id") Long id);
}
