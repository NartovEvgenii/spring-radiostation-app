package app.repository;

import app.domain.Genre;
import app.domain.Singer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class GenreRepositoryImp implements GenreRepository{

    List<Genre> genres = Arrays.asList(
            new Genre("Рок"),
            new Genre("Джаз"),
            new Genre("Кантри"),
            new Genre("Поп"),
            new Genre("Рэп")
    );

    @Override
    public List<Genre> getAll() {
        return genres;
    }

    @Override
    public Genre findById(UUID id_genre) {
        return genres.stream().filter(g -> g.getId_genre().equals(id_genre)).findAny().orElse(null);
    }

    @Override
    public void addGenre(Genre genre) {
        genres.add(genre);
    }
}
