package app.service;

import app.domain.Genre;
import app.dto.GenreDto;
import app.mapper.GenreMapper;
import app.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenreService {

    @Autowired
    private GenreRepository genreRepository;

    @Autowired
    private GenreMapper genreMapper;

    public List<GenreDto> getAllGenre() {
        List<Genre> genres = genreRepository.findAll();
        return genreMapper.listGenreToListDto(genres);
    }

    public GenreDto findGenreById(Long genreId) {
        Optional<Genre> genre = genreRepository.findById(genreId);
        return genre.map(genreMapper::genreToDto).orElse(null);
    }

    public GenreDto addGenre(GenreDto genreDto) {
        Genre genre = genreMapper.dtoToGenre(genreDto);
        genre = genreRepository.save(genre);
        return genreMapper.genreToDto(genre);
    }

    public void deleteAllGenre(){
        genreRepository.deleteAll();
    }

    public void deleteGenreById(Long genreId){
        genreRepository.deleteById(genreId);
    }
}
