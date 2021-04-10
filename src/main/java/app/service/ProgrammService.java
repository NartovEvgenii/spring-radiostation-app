package app.service;

import app.domain.Program;
import app.repository.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProgrammService {

    @Autowired
    private ProgramRepository programRepository;

    public List<Program> getAll() {
        return programRepository.getAll();
    }

    public Program findById(UUID id_program) {
        return programRepository.findById(id_program);
    }

    public void addProgram(Program program) {
        programRepository.addProgram(program);
    }
}
