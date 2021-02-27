package vasia.cardetailsshop.controller;

import org.springframework.web.bind.annotation.*;
import vasia.cardetailsshop.entity.Order;
import vasia.cardetailsshop.service.order.impls.OrderService;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    OrderService orderService;
    @GetMapping
    public List<Order> getAll(@RequestParam(required = false, defaultValue = "1") Integer page,
                              @RequestParam(required = false, defaultValue = "10") Integer size){
        return orderService.getAll();
    }
    @GetMapping("/{id}")
    public Order getById(@PathVariable Long id){
        return orderService.getById(id);
    }

    @PostMapping
    public Order create(@RequestBody Order order){
        return orderService.create(order);
    }

    @PutMapping("/{id}")
    public Order update(@PathVariable Long id, @RequestBody Order order){
        return orderService.update(id, order);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id){
        orderService.delete(id);
    }
}
