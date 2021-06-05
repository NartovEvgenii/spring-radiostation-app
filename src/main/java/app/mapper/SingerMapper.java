package app.mapper;

import app.domain.Singer;
import app.dto.SingerDto;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface SingerMapper {

    Singer dtoToSinger(SingerDto singerDto);

    SingerDto singerToDto(Singer singer);

    List<Singer> listDtoToListSinger(List<SingerDto> singerDtoList);

    List<SingerDto> listSingerToListDto(List<Singer> singerList);
}
