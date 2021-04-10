package app.domain;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class RadioBroadcast {

    private UUID id_radioBroadcast = UUID.randomUUID();

    private String name_radio;

    private LocalDate date;

    private List<Program> programList;

    public RadioBroadcast(String name_radio, LocalDate date) {
        this.name_radio = name_radio;
        this.date = date;
    }

    @Override
    public String toString() {
        return "RadioBroadcast{" +
                "id_radioBroadcast=" + id_radioBroadcast +
                ", name_radio='" + name_radio + '\'' +
                ", date=" + date +
                ", programList=" + programList +
                '}';
    }

    public UUID getId_radioBroadcast() {
        return id_radioBroadcast;
    }

    public void setId_radioBroadcast(UUID id_radioBroadcast) {
        this.id_radioBroadcast = id_radioBroadcast;
    }

    public String getName_radio() {
        return name_radio;
    }

    public void setName_radio(String name_radio) {
        this.name_radio = name_radio;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Program> getProgramList() {
        return programList;
    }

    public void setProgramList(List<Program> programList) {
        this.programList = programList;
    }
}
