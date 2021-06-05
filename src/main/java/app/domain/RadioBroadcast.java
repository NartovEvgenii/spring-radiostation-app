package app.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "radioBroadcast")
@Data
public class RadioBroadcast {

    @Id
    @Column(name = "idRadioBroadcast")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRadioBroadcast;

    @Column(name = "nameRadio")
    private String nameRadio;

    @Column(name = "date")
    private LocalDate date;

    @OneToMany(mappedBy = "radioBroadcast")
    private List<Program> programs = new ArrayList<>();

}
