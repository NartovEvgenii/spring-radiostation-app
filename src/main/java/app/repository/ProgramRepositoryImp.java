package app.repository;

import app.domain.Program;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ProgramRepositoryImp implements ProgramRepository{

    List<Program> programs = new ArrayList<>();

    @Override
    public List<Program> getAll() {
        return programs;
    }

    @Override
    public Program findById(UUID id_program) {
        return programs.stream().filter(p -> p.getId_program().equals(id_program)).findAny().orElse(null);
    }

    @Override
    public void addProgram(Program program) {
        programs.add(program);
    }
}
