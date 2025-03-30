package edu.masanz.dto;

public class AlumnoNotaMedia extends Alumno {
    protected double notaMedia;
    protected boolean aprobado;

    public AlumnoNotaMedia() {
        super();
        notaMedia = 0;
        aprobado = false;
    }

    public AlumnoNotaMedia(Alumno alumno) {
        super(alumno.id, alumno.nombre, alumno.apellidos);
        notaMedia = 0;
        aprobado = false;
    }

    public AlumnoNotaMedia(int id, String nombre, String apellidos) {
        super(id, nombre, apellidos);
        notaMedia = 0;
        aprobado = false;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    @Override
    public String toString() {
        return "AlumnoNotaMedia{\n" +
                "alumno=" + super.toString() + "\n" +
                "notaMedia=" + notaMedia +
                '}';
    }
}
