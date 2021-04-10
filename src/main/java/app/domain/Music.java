package app.domain;

import lombok.Data;

import java.time.Duration;
import java.util.List;
import java.util.UUID;

public class Music {

    private UUID id_music = UUID.randomUUID();

    private String title;

    private Duration duration;

    private Genre genre;

    private List<Singer> singers;

    private Double rating;

    public Music(String title, Duration duration, Genre genre) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.rating = Double.valueOf(0);
    }

    @Override
    public String toString() {
        return "Music{" +
                "id_music=" + id_music +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", genre=" + genre +
                ", singers=" + singers +
                ", rating=" + rating +
                '}';
    }

    public UUID getId_music() {
        return id_music;
    }

    public void setId_music(UUID id_music) {
        this.id_music = id_music;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public List<Singer> getSingers() {
        return singers;
    }

    public void setSingers(List<Singer> singers) {
        this.singers = singers;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}
