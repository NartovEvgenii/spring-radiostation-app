package app.mapper;

import app.domain.RadioBroadcast;
import app.dto.RadioBroadcastDto;
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
public class RadioBroadcastMapperImpl implements RadioBroadcastMapper {

    @Override
    public RadioBroadcast dtoToRadioBroadcast(RadioBroadcastDto radioBroadcastDto) {
        if ( radioBroadcastDto == null ) {
            return null;
        }

        RadioBroadcast radioBroadcast = new RadioBroadcast();

        if ( radioBroadcastDto.getIdRadioBroadcast() != null ) {
            radioBroadcast.setIdRadioBroadcast( radioBroadcastDto.getIdRadioBroadcast() );
        }
        if ( radioBroadcastDto.getNameRadio() != null ) {
            radioBroadcast.setNameRadio( radioBroadcastDto.getNameRadio() );
        }
        if ( radioBroadcastDto.getDate() != null ) {
            radioBroadcast.setDate( radioBroadcastDto.getDate() );
        }

        return radioBroadcast;
    }

    @Override
    public RadioBroadcastDto radioBroadcastToDto(RadioBroadcast radioBroadcast) {
        if ( radioBroadcast == null ) {
            return null;
        }

        RadioBroadcastDto radioBroadcastDto = new RadioBroadcastDto();

        if ( radioBroadcast.getIdRadioBroadcast() != null ) {
            radioBroadcastDto.setIdRadioBroadcast( radioBroadcast.getIdRadioBroadcast() );
        }
        if ( radioBroadcast.getNameRadio() != null ) {
            radioBroadcastDto.setNameRadio( radioBroadcast.getNameRadio() );
        }
        if ( radioBroadcast.getDate() != null ) {
            radioBroadcastDto.setDate( radioBroadcast.getDate() );
        }

        return radioBroadcastDto;
    }

    @Override
    public List<RadioBroadcast> listDtoToListRadioBroadcast(List<RadioBroadcastDto> radioBroadcastDtoList) {
        if ( radioBroadcastDtoList == null ) {
            return null;
        }

        List<RadioBroadcast> list = new ArrayList<RadioBroadcast>( radioBroadcastDtoList.size() );
        for ( RadioBroadcastDto radioBroadcastDto : radioBroadcastDtoList ) {
            list.add( dtoToRadioBroadcast( radioBroadcastDto ) );
        }

        return list;
    }

    @Override
    public List<RadioBroadcastDto> listRadioBroadcastToListDto(List<RadioBroadcast> radioBroadcastList) {
        if ( radioBroadcastList == null ) {
            return null;
        }

        List<RadioBroadcastDto> list = new ArrayList<RadioBroadcastDto>( radioBroadcastList.size() );
        for ( RadioBroadcast radioBroadcast : radioBroadcastList ) {
            list.add( radioBroadcastToDto( radioBroadcast ) );
        }

        return list;
    }
}
