package vasia.cardetailsshop.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import vasia.cardetailsshop.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
