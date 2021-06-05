package app.mapper;

import app.domain.Music;
import app.dto.MusicDto;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface MusicMapper {

    Music dtoToMusic(MusicDto musicDto);

    MusicDto musicToDto(Music music);

    List<Music> listDtoToListMusic(List<MusicDto> musicDtoList);

    List<MusicDto> listMusicToListDto(List<Music> musicList);
}
