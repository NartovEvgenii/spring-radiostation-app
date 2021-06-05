package app.service;

import app.domain.Program;
import app.dto.ProgramDto;
import app.mapper.ProgramMapper;
import app.repository.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProgrammService {

    @Autowired
    private ProgramRepository programRepository;

    @Autowired
    private ProgramMapper programMapper;

    public List<ProgramDto> getAll() {
        List<Program> programs = programRepository.findAll();
        return programMapper.listProgramToListDto(programs);
    }

    public ProgramDto findById(Long programId) {
        Optional<Program> program = programRepository.findById(programId);
        return program.map(programMapper::programToDto).orElse(null);
    }

    public ProgramDto addProgram(ProgramDto programDto) {
        Program program = programMapper.dtoToProgram(programDto);
        program = programRepository.save(program);
        return programMapper.programToDto(program);
    }

    public void deleteAllProgram(){
        programRepository.deleteAll();
    }

    public void deleteProgramById(Long programId){
        programRepository.deleteById(programId);
    }
}
