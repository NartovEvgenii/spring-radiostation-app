package app.mapper;

import app.domain.Genre;
import app.dto.GenreDto;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;


@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface GenreMapper {

    Genre dtoToGenre(GenreDto genreDto);

    GenreDto genreToDto(Genre genre);

    List<Genre> listDtoToListGenre(List<GenreDto> genreDtoList);

    List<GenreDto> listGenreToListDto(List<Genre> genreList);
}
