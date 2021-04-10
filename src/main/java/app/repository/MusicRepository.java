package app.repository;

import app.domain.Music;

import java.util.List;
import java.util.UUID;

public interface MusicRepository {

    List<Music> getAll();

    Music findById(UUID id_music);

    Music findByTitle(String musicTitle);

    void addMusic(Music music);
}
