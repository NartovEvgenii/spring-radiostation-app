package app.service;

import app.domain.Music;
import app.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MusicService {

    @Autowired
    private MusicRepository musicRepository;

    public List<Music> getAll() {
        return musicRepository.getAll();
    }

    public Music findById(UUID id_music) {
        return musicRepository.findById(id_music);
    }

    public Music findByTitle(String musicTitle) {
        return musicRepository.findByTitle(musicTitle);
    }

    public void addMusic(Music music) {
        musicRepository.addMusic(music);
    }
}
