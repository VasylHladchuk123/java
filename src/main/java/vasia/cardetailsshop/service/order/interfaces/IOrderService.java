package vasia.cardetailsshop.service.order.interfaces;

import vasia.cardetailsshop.entity.Order;

import java.util.List;

public interface IOrderService {
    List<Order> getAll();
    Order getById(Long id);
    Order create(Order order);
    Order update(Long id, Order order);
    void delete(Long id);
}
