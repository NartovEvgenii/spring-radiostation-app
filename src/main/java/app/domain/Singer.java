package app.domain;

import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

public class Singer {

    private UUID id_singer = UUID.randomUUID();

    private String singer_first_name;

    private String singer_last_name;

    private LocalDate birthday;

    public Singer(String singer_first_name, String singer_last_name, LocalDate birthday) {
        this.singer_first_name = singer_first_name;
        this.singer_last_name = singer_last_name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "id_singer=" + id_singer +
                ", singer_first_name='" + singer_first_name + '\'' +
                ", singer_last_name='" + singer_last_name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public UUID getId_singer() {
        return id_singer;
    }

    public void setId_singer(UUID id_singer) {
        this.id_singer = id_singer;
    }

    public String getSinger_first_name() {
        return singer_first_name;
    }

    public void setSinger_first_name(String singer_first_name) {
        this.singer_first_name = singer_first_name;
    }

    public String getSinger_last_name() {
        return singer_last_name;
    }

    public void setSinger_last_name(String singer_last_name) {
        this.singer_last_name = singer_last_name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
