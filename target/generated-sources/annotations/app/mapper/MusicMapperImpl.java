package app.mapper;

import app.domain.Music;
import app.dto.MusicDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-05T02:51:09+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
@Component
public class MusicMapperImpl implements MusicMapper {

    @Override
    public Music dtoToMusic(MusicDto musicDto) {
        if ( musicDto == null ) {
            return null;
        }

        Music music = new Music();

        if ( musicDto.getIdMusic() != null ) {
            music.setIdMusic( musicDto.getIdMusic() );
        }
        if ( musicDto.getTitle() != null ) {
            music.setTitle( musicDto.getTitle() );
        }
        if ( musicDto.getDuration() != null ) {
            music.setDuration( musicDto.getDuration() );
        }
        if ( musicDto.getRating() != null ) {
            music.setRating( musicDto.getRating() );
        }

        return music;
    }

    @Override
    public MusicDto musicToDto(Music music) {
        if ( music == null ) {
            return null;
        }

        MusicDto musicDto = new MusicDto();

        if ( music.getIdMusic() != null ) {
            musicDto.setIdMusic( music.getIdMusic() );
        }
        if ( music.getTitle() != null ) {
            musicDto.setTitle( music.getTitle() );
        }
        if ( music.getDuration() != null ) {
            musicDto.setDuration( music.getDuration() );
        }
        if ( music.getRating() != null ) {
            musicDto.setRating( music.getRating() );
        }

        return musicDto;
    }

    @Override
    public List<Music> listDtoToListMusic(List<MusicDto> musicDtoList) {
        if ( musicDtoList == null ) {
            return null;
        }

        List<Music> list = new ArrayList<Music>( musicDtoList.size() );
        for ( MusicDto musicDto : musicDtoList ) {
            list.add( dtoToMusic( musicDto ) );
        }

        return list;
    }

    @Override
    public List<MusicDto> listMusicToListDto(List<Music> musicList) {
        if ( musicList == null ) {
            return null;
        }

        List<MusicDto> list = new ArrayList<MusicDto>( musicList.size() );
        for ( Music music : musicList ) {
            list.add( musicToDto( music ) );
        }

        return list;
    }
}
