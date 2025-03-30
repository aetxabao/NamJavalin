package edu.masanz.dao;

import edu.masanz.dto.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class NamDao {

    Map<Integer, Alumno> alumnos = Map.of(
            1, new Alumno(1, "Juan", "Perez"),
            2, new Alumno(2, "Maria", "Lopez"),
            3, new Alumno(3, "Pedro", "Gomez"),
            4, new Alumno(4, "Ana", "Martinez"),
            5, new Alumno(5, "Luis", "Rodriguez")
    );
    Map<String, Modulo> modulos = Map.of(
            "ACDA", new Modulo("ACDA", "Acceso a datos"),
            "DEIN", new Modulo("DEIN", "Desarrollo de interfaces"),
            "PMDM", new Modulo("PMDM", "Programación multimedia y dispositivos móviles"),
            "PSEP", new Modulo("PSEP", "Programación de servicios y procesos"),
            "SGEM", new Modulo("SGEM", "Sistemas de gestión empresarial")
    );
    List<Nota> notas = List.of(
            new Nota(1, "ACDA", 8.5),
            new Nota(1, "DEIN", 7.5),
            new Nota(1, "PMDM", 6.5),
            new Nota(1, "PSEP", 5.5),
            new Nota(1, "SGEM", 4.5),
            new Nota(2, "ACDA", 7.5),
            new Nota(2, "DEIN", 6.5),
            new Nota(2, "PMDM", 5.5),
            new Nota(2, "PSEP", 4.5),
            new Nota(2, "SGEM", 3.5),
            new Nota(3, "ACDA", 6.5),
            new Nota(3, "DEIN", 5.5),
            new Nota(3, "PMDM", 4.5),
            new Nota(3, "PSEP", 3.5),
            new Nota(3, "SGEM", 2.5),
            new Nota(4, "ACDA", 5.5),
            new Nota(4, "DEIN", 4.5),
            new Nota(4, "PMDM", 3.5),
            new Nota(4, "PSEP", 2.5),
            new Nota(4, "SGEM", 1.5),
            new Nota(5, "ACDA", 4.5),
            new Nota(5, "DEIN", 3.5),
            new Nota(5, "PMDM", 2.5),
            new Nota(5, "PSEP", 1.5),
            new Nota(5, "SGEM", 0.5)
    );

    public List<Alumno> getAlumnado() {
        return new ArrayList<>(alumnos.values());
    }

    public List<AlumnoNotaMedia> getAlumnadoNotasMedias() {
        List<AlumnoNotaMedia> lista = new ArrayList<>();
        for (Alumno alumno : alumnos.values()) {
            AlumnoNotaMedia anm = new AlumnoNotaMedia(alumno);
            anm.setAprobado(true);
            double suma = 0;
            int contador = 0;
            for (Nota nota : notas) {
                if (nota.getIdAlumno() == alumno.getId()) {
                    suma += nota.getNota();
                    contador++;
                    if (nota.getNota() < 5) {
                        anm.setAprobado(false);
                    }
                }
            }
            anm.setNotaMedia(suma / contador);
            lista.add(anm);
        }
        return lista;
    }

    public List<AlumnoModulosNotas> getAlumnadoNotasModulos() {
        List<AlumnoModulosNotas> lista = new ArrayList<>();
        for (Alumno alumno : alumnos.values()) {
            AlumnoModulosNotas amn = new AlumnoModulosNotas(alumno);
            for (Nota nota : notas) {
                if (nota.getIdAlumno() == alumno.getId()) {
                    String idModulo = nota.getIdModulo();
                    String nombreModulo = modulos.get(idModulo).getNombre();
                    double notaModulo = nota.getNota();
                    amn.addModuloNota(new ModuloNota(idModulo, nombreModulo, notaModulo));
                }
            }
            lista.add(amn);
        }
        return lista;
    }

    public Map<String, List<Integer>> getNotasModulos() {
        Map<String, List<Integer>> mapa = new TreeMap<>();
        for (Nota nota : notas) {
            String idModulo = nota.getIdModulo();
            int notaEntera = (int) nota.getNota();
            if (!mapa.containsKey(idModulo)) {
                mapa.put(idModulo, new ArrayList<>());
            }
            mapa.get(idModulo).add(notaEntera);
        }
        return mapa;
    }
}
