package vasia.cardetailsshop.service.order.impls;

import org.springframework.beans.factory.annotation.Autowired;
import vasia.cardetailsshop.entity.Order;
import vasia.cardetailsshop.repository.OrderRepository;
import vasia.cardetailsshop.service.order.interfaces.IOrderService;

import java.util.List;
import java.util.Optional;

public class OrderService implements IOrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Override
    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order getById(Long id) {
        Optional<Order> result = orderRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }

    @Override
    public Order create(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order update(Long id, Order order) {
        return orderRepository.save(order);
    }

    @Override
    public void delete(Long id) {
        orderRepository.deleteById(id);
    }
}
