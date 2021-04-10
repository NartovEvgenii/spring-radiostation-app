package app.service;

import app.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrderService {

    @Autowired
    private OrderService orderService;

    public List<Order> getAll() {
        return orderService.getAll();
    }

    public Order findById(UUID id_order) {
        return orderService.findById(id_order);
    }

    public void addOrder(Order order) {
        orderService.addOrder(order);
    }
}
