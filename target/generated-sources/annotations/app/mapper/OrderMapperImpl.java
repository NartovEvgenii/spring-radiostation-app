package app.mapper;

import app.domain.Order;
import app.dto.OrderDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-05T02:51:09+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Override
    public Order dtoToOrder(OrderDto orderDto) {
        if ( orderDto == null ) {
            return null;
        }

        Order order = new Order();

        if ( orderDto.getIdOrder() != null ) {
            order.setIdOrder( orderDto.getIdOrder() );
        }
        if ( orderDto.getFullNameOrders() != null ) {
            order.setFullNameOrders( orderDto.getFullNameOrders() );
        }

        return order;
    }

    @Override
    public OrderDto orderToDto(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderDto orderDto = new OrderDto();

        if ( order.getIdOrder() != null ) {
            orderDto.setIdOrder( order.getIdOrder() );
        }
        if ( order.getFullNameOrders() != null ) {
            orderDto.setFullNameOrders( order.getFullNameOrders() );
        }

        return orderDto;
    }

    @Override
    public List<Order> listDtoToListOrder(List<OrderDto> orderDtoList) {
        if ( orderDtoList == null ) {
            return null;
        }

        List<Order> list = new ArrayList<Order>( orderDtoList.size() );
        for ( OrderDto orderDto : orderDtoList ) {
            list.add( dtoToOrder( orderDto ) );
        }

        return list;
    }

    @Override
    public List<OrderDto> listOrderToListDto(List<Order> orderList) {
        if ( orderList == null ) {
            return null;
        }

        List<OrderDto> list = new ArrayList<OrderDto>( orderList.size() );
        for ( Order order : orderList ) {
            list.add( orderToDto( order ) );
        }

        return list;
    }
}
