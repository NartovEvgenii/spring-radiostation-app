package app.mapper;

import app.domain.Order;
import app.dto.OrderDto;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface OrderMapper {

    Order dtoToOrder(OrderDto orderDto);

    OrderDto orderToDto(Order order);

    List<Order> listDtoToListOrder(List<OrderDto> orderDtoList);

    List<OrderDto> listOrderToListDto(List<Order> orderList);
}
