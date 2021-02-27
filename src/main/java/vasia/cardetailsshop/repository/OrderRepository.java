package vasia.cardetailsshop.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import vasia.cardetailsshop.entity.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
}
