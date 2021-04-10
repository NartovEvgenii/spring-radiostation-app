package app.repository;

import app.domain.RadioBroadcast;

import java.util.List;
import java.util.UUID;

public interface RadioBroadcastRepository {

    List<RadioBroadcast> getAll();

    RadioBroadcast findById(UUID id_radioBroadcast);

    RadioBroadcast findByName(String name_radio);

    void addProgram(RadioBroadcast radioBroadcast);
}
