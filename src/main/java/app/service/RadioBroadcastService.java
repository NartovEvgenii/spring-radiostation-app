package app.service;

import app.domain.RadioBroadcast;
import app.dto.RadioBroadcastDto;
import app.mapper.RadioBroadcastMapper;
import app.repository.RadioBroadcastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class RadioBroadcastService {

    @Autowired
    private RadioBroadcastRepository radioBroadcastRepository;

    private RadioBroadcastMapper broadcastMapper;

    public List<RadioBroadcastDto> getAll() {
        List<RadioBroadcast> radioBroadcasts = radioBroadcastRepository.findAll();
        return broadcastMapper.listRadioBroadcastToListDto(radioBroadcasts);
    }

    public RadioBroadcastDto findById(Long radioBroadcastId) {
        Optional<RadioBroadcast> radioBroadcast = radioBroadcastRepository.findById(radioBroadcastId);
        return radioBroadcast.map(broadcastMapper::radioBroadcastToDto).orElse(null);
    }

    public RadioBroadcastDto findByName(String nameRadio) {
        Optional<RadioBroadcast> radioBroadcast= radioBroadcastRepository.findByNameRadio(nameRadio);
        return radioBroadcast.map(broadcastMapper::radioBroadcastToDto).orElse(null);
    }

    public RadioBroadcastDto addProgram(RadioBroadcastDto radioBroadcastDto) {
        RadioBroadcast radioBroadcast = broadcastMapper.dtoToRadioBroadcast(radioBroadcastDto);
        radioBroadcast = radioBroadcastRepository.save(radioBroadcast);
        return broadcastMapper.radioBroadcastToDto(radioBroadcast);
    }

    public void deleteAllRadioBroadcast(){
        radioBroadcastRepository.deleteAll();
    }

    public void deleteRadioBroadcastById(Long radioBroadcastId){
        radioBroadcastRepository.deleteById(radioBroadcastId);
    }
}
