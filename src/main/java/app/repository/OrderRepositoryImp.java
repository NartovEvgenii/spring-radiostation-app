package app.repository;

import app.domain.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class OrderRepositoryImp implements OrderRepository{

    List<Order> orders = new ArrayList<>();

    @Override
    public List<Order> getAll() {
        return orders;
    }

    @Override
    public Order findById(UUID id_order) {
        return orders.stream().filter(o -> o.getId_order().equals(id_order)).findAny().orElse(null);
    }

    @Override
    public void addOrder(Order order) {
        orders.add(order);
    }
}
