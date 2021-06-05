package app.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "program")
@Data
public class Program {

    @Id
    @Column(name = "idProgram")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProgram;

    @Column(name = "timePlaying")
    private LocalTime timePlaying;

    @Column(name = "numberPlay")
    private int numberPlay;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_radioBroadcast")
    private RadioBroadcast radioBroadcast;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_music")
    private Music music;

    @OneToMany(mappedBy = "program")
    private List<Order> orders = new ArrayList<>();
}
