package vasia.cardetailsshop.controller;

import org.springframework.web.bind.annotation.*;
import vasia.cardetailsshop.entity.Product;
import vasia.cardetailsshop.service.product.impls.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    ProductService productService;
    @GetMapping
    public List<Product> getAll(@RequestParam(required = false, defaultValue = "1") Integer page,
                                @RequestParam(required = false, defaultValue = "10") Integer size){
        return productService.getAll();
    }
    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id){
        return productService.getById(id);
    }

    @PostMapping
    public Product create(@RequestBody Product product){
        return productService.create(product);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product product){
        return productService.update(id, product);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id){
        productService.delete(id);
    }
}
