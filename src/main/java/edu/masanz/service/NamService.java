package edu.masanz.service;

import edu.masanz.dao.NamDao;
import edu.masanz.dto.*;

import java.util.List;
import java.util.Map;

public class NamService {

    private static NamDao namDao = new NamDao();

    public static List<Alumno> getAlumnado() {
        return namDao.getAlumnado();
    }

    public static List<AlumnoNotaMedia> getAlumnadoNotasMedias() {
        return namDao.getAlumnadoNotasMedias();
    }

    public static List<AlumnoModulosNotas> getAlumnadoNotasModulos() {
        return namDao.getAlumnadoNotasModulos();
    }

    public static Map<String, List<Integer>> getNotasModulos() {
        return namDao.getNotasModulos();
    }

}
