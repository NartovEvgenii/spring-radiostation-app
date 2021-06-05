package app.mapper;

import app.domain.Program;
import app.dto.ProgramDto;
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
public class ProgramMapperImpl implements ProgramMapper {

    @Override
    public Program dtoToProgram(ProgramDto programDto) {
        if ( programDto == null ) {
            return null;
        }

        Program program = new Program();

        if ( programDto.getIdProgram() != null ) {
            program.setIdProgram( programDto.getIdProgram() );
        }
        if ( programDto.getTimePlaying() != null ) {
            program.setTimePlaying( programDto.getTimePlaying() );
        }
        program.setNumberPlay( programDto.getNumberPlay() );

        return program;
    }

    @Override
    public ProgramDto programToDto(Program program) {
        if ( program == null ) {
            return null;
        }

        ProgramDto programDto = new ProgramDto();

        if ( program.getIdProgram() != null ) {
            programDto.setIdProgram( program.getIdProgram() );
        }
        if ( program.getTimePlaying() != null ) {
            programDto.setTimePlaying( program.getTimePlaying() );
        }
        programDto.setNumberPlay( program.getNumberPlay() );

        return programDto;
    }

    @Override
    public List<Program> listDtoToListProgram(List<ProgramDto> programDtoList) {
        if ( programDtoList == null ) {
            return null;
        }

        List<Program> list = new ArrayList<Program>( programDtoList.size() );
        for ( ProgramDto programDto : programDtoList ) {
            list.add( dtoToProgram( programDto ) );
        }

        return list;
    }

    @Override
    public List<ProgramDto> listProgramToListDto(List<Program> programList) {
        if ( programList == null ) {
            return null;
        }

        List<ProgramDto> list = new ArrayList<ProgramDto>( programList.size() );
        for ( Program program : programList ) {
            list.add( programToDto( program ) );
        }

        return list;
    }
}
