package vasia.cardetailsshop.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import vasia.cardetailsshop.entity.Client;


public interface ClientRepository extends JpaRepository<Client, Long> {
}
