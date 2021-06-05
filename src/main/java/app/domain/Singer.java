package app.domain;


import lombok.Data;
import org.apache.tomcat.util.digester.ArrayStack;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "singer")
@Data
public class Singer {

    @Id
    @Column(name = "idSinger")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSinger;

    @Column(name = "singerFirstName")
    private String singerFirstName;

    @Column(name = "singerLastName")
    private String singerLastName;

    @Column(name = "birthday")
    private LocalDate birthday;

    @ManyToMany(mappedBy = "singers")
    List<Music> musics = new ArrayList<>();

    @OneToMany(mappedBy = "singer")
    private List<Order> orders = new ArrayList<>();
}
