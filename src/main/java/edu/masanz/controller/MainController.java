package edu.masanz.controller;

import edu.masanz.dto.*;
import edu.masanz.service.NamService;

import io.javalin.http.Context;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainController {

    //app.get("/", MainController::mostrarMenu);

    public static void mostrarMenu(Context ctx) {
        ctx.render("templates/inicio.ftl");
    }


    //app.get("/alumnado", MainController::mostrarAlumnos);
    public static void mostrarAlumnado(Context context) {
        List<Alumno> alumnado = NamService.getAlumnado();
        Map<String, Object> model = new HashMap<>();
        model.put("alumnado", alumnado);
        context.render("/templates/alumnado.ftl", model);
    }


    //app.get("/alumnado-nota-media", MainController::mostrarAlumnosNotaMedia);
    public static void mostrarAlumnadoNotaMedia(Context context) {
        List<AlumnoNotaMedia> alumnado = NamService.getAlumnadoNotasMedias();
        Map<String, Object> model = new HashMap<>();
        model.put("alumnado", alumnado);
        context.render("/templates/alumnado-nota-media.ftl", model);
    }


    //app.get("/alumnado-modulos-notas", MainController::mostrarAlumnosModulosNotas);
    public static void mostrarAlumnadoModulosNotas(Context context) {
        List<AlumnoModulosNotas> alumnado = NamService.getAlumnadoNotasModulos();
        Map<String, Object> model = new HashMap<>();
        model.put("alumnado", alumnado);
        context.render("/templates/alumnado-modulos-notas.ftl", model);
    }


    //app.get("/modulos-notas", MainController::mostrarModulosNotas);
    public static void mostrarModulosNotas(Context context) {
        Map<String, List<Integer>> mapa = NamService.getNotasModulos();
        Map<String, Object> model = new HashMap<>();
        model.put("mapa", mapa);
        context.render("/templates/modulos-notas.ftl", model);
    }
}
