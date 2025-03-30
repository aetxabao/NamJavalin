package edu.masanz;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinFreemarker;

import edu.masanz.controller.MainController;

public class Main {
    public static void main(String[] args) {

        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("/public");
            config.fileRenderer(new JavalinFreemarker());
        }).start(4567);

        app.get("/", MainController::mostrarMenu);

        app.get("/alumnado", MainController::mostrarAlumnado);
        app.get("/alumnado-nota-media", MainController::mostrarAlumnadoNotaMedia);
        app.get("/alumnado-modulos-notas", MainController::mostrarAlumnadoModulosNotas);

        app.get("/modulos-notas", MainController::mostrarModulosNotas);

    }
}