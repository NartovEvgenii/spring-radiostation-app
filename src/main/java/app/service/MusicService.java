package app.service;

import app.domain.Music;
import app.dto.MusicDto;
import app.mapper.MusicMapper;
import app.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class MusicService {

    @Autowired
    private MusicRepository musicRepository;

    @Autowired
    private MusicMapper musicMapper;

    public List<MusicDto> getAll() {
        List<Music> music = musicRepository.findAll();
        return musicMapper.listMusicToListDto(music);
    }

    public MusicDto findById(Long musicId) {
        Optional<Music> music = musicRepository.findById(musicId);
        return music.map(musicMapper::musicToDto).orElse(null);
    }

    public MusicDto findByTitle(String musicTitle) {
        Optional<Music> music = musicRepository.findByTitle(musicTitle);
        return music.map(musicMapper::musicToDto).orElse(null);
    }

    public MusicDto addMusic(MusicDto musicDto) {
        Music music = musicMapper.dtoToMusic(musicDto);
        music = musicRepository.save(music);
        return musicMapper.musicToDto(music);
    }

    public void deleteAllMusic(){
        musicRepository.deleteAll();
    }

    public void deleteMusicById(Long musicId){
        musicRepository.deleteById(musicId);
    }
}
