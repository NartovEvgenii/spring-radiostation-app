package app.domain;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

public class Order {

    private UUID id_order = UUID.randomUUID();

    private String full_name_orders;

    private Music music;

    private Genre genre;

    private Singer singer;

    private Date time;

    private Program prog;

    public Order(String full_name_orders, Music music, Genre genre, Singer singer, Date time, Program prog) {
        this.full_name_orders = full_name_orders;
        this.music = music;
        this.genre = genre;
        this.singer = singer;
        this.time = time;
        this.prog = prog;
    }

    public Order(String full_name_orders, Music music, Date time, Program prog) {
        this.full_name_orders = full_name_orders;
        this.music = music;
        this.time = time;
        this.prog = prog;
    }

    public Order(String full_name_orders,Genre genre, Date time, Program prog) {
        this.full_name_orders = full_name_orders;
        this.genre = genre;
        this.time = time;
        this.prog = prog;
    }

    public Order(String full_name_orders,Singer singer, Date time, Program prog) {
        this.full_name_orders = full_name_orders;
        this.singer = singer;
        this.time = time;
        this.prog = prog;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id_order=" + id_order +
                ", full_name_orders='" + full_name_orders + '\'' +
                ", music=" + music +
                ", genre=" + genre +
                ", singer=" + singer +
                ", time=" + time +
                ", prog=" + prog +
                '}';
    }

    public UUID getId_order() {
        return id_order;
    }

    public void setId_order(UUID id_order) {
        this.id_order = id_order;
    }

    public String getFull_name_orders() {
        return full_name_orders;
    }

    public void setFull_name_orders(String full_name_orders) {
        this.full_name_orders = full_name_orders;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Program getProg() {
        return prog;
    }

    public void setProg(Program prog) {
        this.prog = prog;
    }
}
