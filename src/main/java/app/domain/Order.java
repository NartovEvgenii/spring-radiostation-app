package app.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "orders")
@Data
public class Order {

    @Id
    @Column(name = "idOrder")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrder;

    @Column(name = "fullNameOrders")
    private String fullNameOrders;

    @Column(name = "time")
    private LocalDate time;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_music")
    private Music music;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_genre")
    private Genre genre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_singer")
    private Singer singer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_program")
    private Program program;
}
