package app.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "genre")
@Data
public class Genre {

    @Id
    @Column(name = "idGenre")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGenre;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "genres")
    List<Music> musics = new ArrayList<>();

    @OneToMany(mappedBy = "genre")
    private List<Order> orders = new ArrayList<>();
}
