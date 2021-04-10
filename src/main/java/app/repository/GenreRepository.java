package app.repository;

import app.domain.Genre;

import java.util.List;
import java.util.UUID;

public interface GenreRepository {

    List<Genre> getAll();

    Genre findById(UUID id_genre);

    void addGenre(Genre genre);
}
