package app.repository;

import app.domain.Singer;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface SingerRepository {

    List<Singer> getAll();

    Singer findById(UUID id_singer);

    void addSinger(Singer singer);
}
