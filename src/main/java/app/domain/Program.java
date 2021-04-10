package app.domain;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.UUID;

public class Program {

    private UUID id_program = UUID.randomUUID();

    private LocalDateTime time_playing;

    private Music list_musics;

    private int number_play;

    public Program(LocalDateTime time_playing, Music list_musics, int number_play) {
        this.time_playing = time_playing;
        this.list_musics = list_musics;
        this.number_play = number_play;
    }

    @Override
    public String toString() {
        return "Program{" +
                "id_program=" + id_program +
                ", time_playing=" + time_playing +
                ", list_musics=" + list_musics +
                ", number_play=" + number_play +
                '}';
    }

    public UUID getId_program() {
        return id_program;
    }

    public void setId_program(UUID id_program) {
        this.id_program = id_program;
    }

    public LocalDateTime getTime_playing() {
        return time_playing;
    }

    public void setTime_playing(LocalDateTime time_playing) {
        this.time_playing = time_playing;
    }

    public Music getList_musics() {
        return list_musics;
    }

    public void setList_musics(Music list_musics) {
        this.list_musics = list_musics;
    }

    public int getNumber_play() {
        return number_play;
    }

    public void setNumber_play(int number_play) {
        this.number_play = number_play;
    }
}
