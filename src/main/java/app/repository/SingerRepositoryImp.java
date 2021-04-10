package app.repository;

import app.domain.Singer;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class SingerRepositoryImp implements SingerRepository{

    List<Singer> singers = Arrays.asList(
            new Singer("Norman","Moreno", LocalDate.of(1989,12,26)),
            new Singer("Jessica","Perez", LocalDate.of(1995,10,14)),
            new Singer("Patrick","Padill", LocalDate.of(1990,9,20)),
            new Singer("Donald","Davis", LocalDate.of(1980,7,10))
    );

    @Override
    public List<Singer> getAll() {
        return singers;
    }

    @Override
    public Singer findById(UUID id_singer) {
        return singers.stream().filter(s -> s.getId_singer().equals(id_singer)).findAny().orElse(null);
    }

    @Override
    public void addSinger(Singer singer) {
        singers.add(singer);
    }
}
