package app.service;

import app.domain.Genre;
import app.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class GenreService {

    @Autowired
    private GenreRepository genreRepository;

    public List<Genre> getAll() {
        return genreRepository.getAll();
    }

    public Genre findById(UUID id_genre) {
        return genreRepository.findById(id_genre);
    }

    public void addGenre(Genre genre) {
        genreRepository.addGenre(genre);
    }
}
