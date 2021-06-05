package app.mapper;

import app.domain.Genre;
import app.dto.GenreDto;
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
public class GenreMapperImpl implements GenreMapper {

    @Override
    public Genre dtoToGenre(GenreDto genreDto) {
        if ( genreDto == null ) {
            return null;
        }

        Genre genre = new Genre();

        if ( genreDto.getIdGenre() != null ) {
            genre.setIdGenre( genreDto.getIdGenre() );
        }
        if ( genreDto.getName() != null ) {
            genre.setName( genreDto.getName() );
        }

        return genre;
    }

    @Override
    public GenreDto genreToDto(Genre genre) {
        if ( genre == null ) {
            return null;
        }

        GenreDto genreDto = new GenreDto();

        if ( genre.getIdGenre() != null ) {
            genreDto.setIdGenre( genre.getIdGenre() );
        }
        if ( genre.getName() != null ) {
            genreDto.setName( genre.getName() );
        }

        return genreDto;
    }

    @Override
    public List<Genre> listDtoToListGenre(List<GenreDto> genreDtoList) {
        if ( genreDtoList == null ) {
            return null;
        }

        List<Genre> list = new ArrayList<Genre>( genreDtoList.size() );
        for ( GenreDto genreDto : genreDtoList ) {
            list.add( dtoToGenre( genreDto ) );
        }

        return list;
    }

    @Override
    public List<GenreDto> listGenreToListDto(List<Genre> genreList) {
        if ( genreList == null ) {
            return null;
        }

        List<GenreDto> list = new ArrayList<GenreDto>( genreList.size() );
        for ( Genre genre : genreList ) {
            list.add( genreToDto( genre ) );
        }

        return list;
    }
}
