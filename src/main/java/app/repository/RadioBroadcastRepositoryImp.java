package app.repository;

import app.domain.RadioBroadcast;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class RadioBroadcastRepositoryImp implements RadioBroadcastRepository{

    List<RadioBroadcast> radioBroadcasts = new ArrayList<>();

    @Override
    public List<RadioBroadcast> getAll() {
        return radioBroadcasts;
    }

    @Override
    public RadioBroadcast findById(UUID id_radioBroadcast) {
        return radioBroadcasts.stream().filter(r -> r.getId_radioBroadcast().equals(id_radioBroadcast)).findAny().orElse(null);
    }

    @Override
    public RadioBroadcast findByName(String name_radio) {
        return radioBroadcasts.stream().filter(r -> r.getName_radio().equals(name_radio)).findAny().orElse(null);
    }

    @Override
    public void addProgram(RadioBroadcast radioBroadcast) {
        radioBroadcasts.add(radioBroadcast);
    }
}
