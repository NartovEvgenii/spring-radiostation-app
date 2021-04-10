package app.repository;

import app.domain.Genre;
import app.domain.Music;
import org.springframework.stereotype.Repository;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class MusicRepositoryImp implements MusicRepository{

    List<Music> musics = Arrays.asList(
            new Music("", Duration.ofMinutes(3L),new Genre("Рок"))
    );

    @Override
    public List<Music> getAll() {
        return musics;
    }

    @Override
    public Music findById(UUID id_music) {
        return musics.stream().filter(m -> m.getId_music().equals(id_music)).findAny().orElse(null);
    }

    @Override
    public Music findByTitle(String musicTitle) {
        return musics.stream().filter(m -> m.getTitle().equals(musicTitle)).findAny().orElse(null);
    }

    @Override
    public void addMusic(Music music) {
        musics.add(music);
    }
}
