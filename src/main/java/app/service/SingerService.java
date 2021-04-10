package app.service;

import app.domain.Singer;
import app.repository.SingerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SingerService {

    @Autowired
    private SingerRepository singerRepository;

    public List<Singer> getAll() {
        return singerRepository.getAll();
    }

    public Singer findById(UUID id_singer) {
        return singerRepository.findById(id_singer);
    }

    public void addSinger(Singer singer) {
        singerRepository.addSinger(singer);
    }
}
