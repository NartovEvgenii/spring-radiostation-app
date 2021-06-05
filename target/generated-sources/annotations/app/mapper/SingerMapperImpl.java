package app.mapper;

import app.domain.Singer;
import app.dto.SingerDto;
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
public class SingerMapperImpl implements SingerMapper {

    @Override
    public Singer dtoToSinger(SingerDto singerDto) {
        if ( singerDto == null ) {
            return null;
        }

        Singer singer = new Singer();

        if ( singerDto.getIdSinger() != null ) {
            singer.setIdSinger( singerDto.getIdSinger() );
        }
        if ( singerDto.getSingerFirstName() != null ) {
            singer.setSingerFirstName( singerDto.getSingerFirstName() );
        }
        if ( singerDto.getSingerLastName() != null ) {
            singer.setSingerLastName( singerDto.getSingerLastName() );
        }
        if ( singerDto.getBirthday() != null ) {
            singer.setBirthday( singerDto.getBirthday() );
        }

        return singer;
    }

    @Override
    public SingerDto singerToDto(Singer singer) {
        if ( singer == null ) {
            return null;
        }

        SingerDto singerDto = new SingerDto();

        if ( singer.getIdSinger() != null ) {
            singerDto.setIdSinger( singer.getIdSinger() );
        }
        if ( singer.getSingerFirstName() != null ) {
            singerDto.setSingerFirstName( singer.getSingerFirstName() );
        }
        if ( singer.getSingerLastName() != null ) {
            singerDto.setSingerLastName( singer.getSingerLastName() );
        }
        if ( singer.getBirthday() != null ) {
            singerDto.setBirthday( singer.getBirthday() );
        }

        return singerDto;
    }

    @Override
    public List<Singer> listDtoToListSinger(List<SingerDto> singerDtoList) {
        if ( singerDtoList == null ) {
            return null;
        }

        List<Singer> list = new ArrayList<Singer>( singerDtoList.size() );
        for ( SingerDto singerDto : singerDtoList ) {
            list.add( dtoToSinger( singerDto ) );
        }

        return list;
    }

    @Override
    public List<SingerDto> listSingerToListDto(List<Singer> singerList) {
        if ( singerList == null ) {
            return null;
        }

        List<SingerDto> list = new ArrayList<SingerDto>( singerList.size() );
        for ( Singer singer : singerList ) {
            list.add( singerToDto( singer ) );
        }

        return list;
    }
}
