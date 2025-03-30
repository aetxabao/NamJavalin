package edu.masanz.dto;

import java.util.ArrayList;
import java.util.List;

public class AlumnoModulosNotas extends Alumno {
    protected List<ModuloNota> modulosNotas;

    public AlumnoModulosNotas() {
        super();
        modulosNotas = new ArrayList<>();
    }

    public AlumnoModulosNotas(Alumno alumno) {
        super(alumno.id, alumno.nombre, alumno.apellidos);
        this.modulosNotas = new ArrayList<>();
    }

    public AlumnoModulosNotas(int id, String nombre, String apellidos) {
        super(id, nombre, apellidos);
        this.modulosNotas = new ArrayList<>();
    }

    public List<ModuloNota> getModulosNotas() {
        return modulosNotas;
    }

    public void setModulosNotas(List<ModuloNota> modulosNotas) {
        this.modulosNotas = modulosNotas;
    }

    public void addModuloNota(ModuloNota moduloNota) {
        modulosNotas.add(moduloNota);
    }

    @Override
    public String toString() {
        return "AlumnoNotasModulos{\n" +
                "alumno=" + super.toString() + "\n" +
                "notasModulos=" + modulosNotas.toString() +
                '}';
    }
}
