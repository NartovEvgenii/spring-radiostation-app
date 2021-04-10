package app.repository;

import app.domain.Genre;
import app.domain.Program;

import java.util.List;
import java.util.UUID;

public interface ProgramRepository {

    List<Program> getAll();

    Program findById(UUID id_program);

    void addProgram(Program program);
}
