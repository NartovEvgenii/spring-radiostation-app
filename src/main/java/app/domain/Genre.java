package app.domain;

import lombok.Data;

import java.util.UUID;


public class Genre {

    private UUID id_genre = UUID.randomUUID();

    private String name;

    public Genre(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "id_genre=" + id_genre +
                ", name='" + name + '\'' +
                '}';
    }

    public UUID getId_genre() {
        return id_genre;
    }

    public void setId_genre(UUID id_genre) {
        this.id_genre = id_genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
