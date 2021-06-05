package app.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "music")
@Data
public class Music {

    @Id
    @Column(name = "idMusic")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMusic;

    @Column(name = "title")
    private String title;

    @Column(name = "duration")
    private Duration duration;

    @Column(name = "rating")
    private Double rating;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "music_has_genre", joinColumns = @JoinColumn(name = "music_id", referencedColumnName = "idMusic"),
            inverseJoinColumns = @JoinColumn(name = "genre_id", referencedColumnName = "idGenre"))
    private List<Genre> genres;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "music_has_singer", joinColumns = @JoinColumn(name = "music_id", referencedColumnName = "idMusic"),
            inverseJoinColumns = @JoinColumn(name = "singer_id", referencedColumnName = "idSinger"))
    private List<Singer> singers;

    @OneToMany(mappedBy = "music")
    private List<Program> programs = new ArrayList<>();

    @OneToMany(mappedBy = "music")
    private List<Order> orders = new ArrayList<>();
}
