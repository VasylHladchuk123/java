package vasia.cardetailsshop.service.product.interfaces;

import vasia.cardetailsshop.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();
    Product getById(Long id);
    Product create(Product product);
    Product update(Long id, Product product);
    void delete(Long id);
}
