package app.repository;

import app.domain.Music;
import app.domain.Order;

import java.util.List;
import java.util.UUID;

public interface OrderRepository {

    List<Order> getAll();

    Order findById(UUID id_order);

    void addOrder(Order order);
}
