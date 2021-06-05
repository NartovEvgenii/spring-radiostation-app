package app.mapper;


import app.domain.Program;
import app.dto.ProgramDto;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface ProgramMapper {

    Program dtoToProgram(ProgramDto programDto);

    ProgramDto programToDto(Program program);

    List<Program> listDtoToListProgram(List<ProgramDto> programDtoList);

    List<ProgramDto> listProgramToListDto(List<Program> programList);
}
