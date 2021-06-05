package app.service;

import app.domain.Singer;
import app.dto.SingerDto;
import app.mapper.SingerMapper;
import app.repository.SingerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class SingerService {

    @Autowired
    private SingerRepository singerRepository;

    @Autowired
    private SingerMapper singerMapper;

    public List<SingerDto> getAll() {
        List<Singer> singers = singerRepository.findAll();
        return singerMapper.listSingerToListDto(singers);
    }

    public SingerDto findById(Long singerId) {
        Optional<Singer> singer = singerRepository.findById(singerId);
        return singer.map(singerMapper::singerToDto).orElse(null);
    }

    public SingerDto addSinger(SingerDto singerDto) {
        Singer singer = singerMapper.dtoToSinger(singerDto);
        singer = singerRepository.save(singer);
        return singerMapper.singerToDto(singer);
    }

    public void deleteAllSinger(){
        singerRepository.deleteAll();
    }

    public void deleteSingerById(Long singerId){
        singerRepository.deleteById(singerId);
    }
}
