package app.service;

import app.domain.RadioBroadcast;
import app.repository.RadioBroadcastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RadioBroadcastService {

    @Autowired
    private RadioBroadcastRepository radioBroadcastRepository;

    public List<RadioBroadcast> getAll() {
        return radioBroadcastRepository.getAll();
    }

    public RadioBroadcast findById(UUID id_radioBroadcast) {
        return radioBroadcastRepository.findById(id_radioBroadcast);
    }

    public RadioBroadcast findByName(String name_radio) {
        return radioBroadcastRepository.findByName(name_radio);
    }

    public void addProgram(RadioBroadcast radioBroadcast) {
        radioBroadcastRepository.addProgram(radioBroadcast);
    }
}
