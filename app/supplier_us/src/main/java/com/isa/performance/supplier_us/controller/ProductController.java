package com.isa.performance.supplier_us.controller;

import com.isa.performance.supplier_us.entity.Product;
import com.isa.performance.supplier_us.repository.ProductsData;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

  private final ProductsData productsData;

  public ProductController(ProductsData productsData) {
    this.productsData = productsData;
  }

  @RequestMapping(method = RequestMethod.GET, path = "/products")
  public List<Product> getProducts(){
    return productsData.findAll();
  }

  @ResponseStatus(HttpStatus.CREATED)
  @RequestMapping(method = RequestMethod.POST, path = "/product")
  public Product addProduct(@RequestBody Product product){
    product.setId(null);
    return productsData.save(product);
  }

  @RequestMapping(method = RequestMethod.PUT, path = "/product")
  public Product updateProduct(@RequestBody Product product){
    return productsData.save(product);
  }

  @RequestMapping(method = RequestMethod.DELETE, path = "/product/{id}")
  public Boolean deleteProduct(@PathVariable("id") Integer id){
    productsData.findById(id).orElseThrow(NotFoundException::new);
    productsData.deleteById(id);
    return !productsData.findById(id).isPresent();
  }

  @RequestMapping(method = RequestMethod.GET, path = "/product/{id}")
  public Product getProduct(@PathVariable("id") Integer id){
    return productsData.findById(id).orElseThrow(NotFoundException::new);
  }

  @ResponseStatus(HttpStatus.NOT_FOUND)
  private class NotFoundException extends RuntimeException { }
}

