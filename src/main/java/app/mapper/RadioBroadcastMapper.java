package app.mapper;

import app.domain.RadioBroadcast;
import app.dto.RadioBroadcastDto;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface RadioBroadcastMapper {

    RadioBroadcast dtoToRadioBroadcast(RadioBroadcastDto radioBroadcastDto);

    RadioBroadcastDto radioBroadcastToDto(RadioBroadcast radioBroadcast);

    List<RadioBroadcast> listDtoToListRadioBroadcast(List<RadioBroadcastDto> radioBroadcastDtoList);

    List<RadioBroadcastDto> listRadioBroadcastToListDto(List<RadioBroadcast> radioBroadcastList);
}
