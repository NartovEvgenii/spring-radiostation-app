package app.service;

import app.domain.Order;
import app.dto.OrderDto;
import app.mapper.OrderMapper;
import app.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderMapper orderMapper;

    public List<OrderDto> getAll() {
        List<Order> orders = orderRepository.findAll();
        return orderMapper.listOrderToListDto(orders);
    }

    public OrderDto findById(Long orderId) {
        Optional<Order> order = orderRepository.findById(orderId);
        return order.map(orderMapper::orderToDto).orElse(null);
    }

    public OrderDto addOrder(OrderDto orderDto) {
        Order order = orderMapper.dtoToOrder(orderDto);
        order = orderRepository.save(order);
        return orderMapper.orderToDto(order);
    }

    public void deleteAllOrder(){
        orderRepository.deleteAll();
    }

    public void deleteOrderById(Long orderId){
        orderRepository.deleteById(orderId);
    }
}
