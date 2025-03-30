package edu.masanz.dto;

import java.util.Objects;

public class Nota implements Comparable<Nota> {
    protected int idAlumno;
    protected String idModulo;
    protected double nota;

    public Nota() {
        idAlumno = 0;
        idModulo = "";
        nota = 0.0;
    }

    public Nota(int idAlumno, String idModulo, double nota) {
        this.idAlumno = idAlumno;
        this.idModulo = idModulo;
        this.nota = nota;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(String idModulo) {
        this.idModulo = idModulo;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nota nota = (Nota) o;
        return idAlumno == nota.idAlumno && Objects.equals(idModulo, nota.idModulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAlumno, idModulo);
    }


    @Override
    public int compareTo(Nota other) {
        if (this.idAlumno == other.idAlumno) {
            return this.idModulo.compareTo(other.idModulo);
        } else {
            return this.idAlumno - other.idAlumno;
        }
    }

    @Override
    public String toString() {
        return "Nota{" +
                "idAlumno=" + idAlumno +
                ", idModulo='" + idModulo + '\'' +
                ", nota=" + nota +
                '}';
    }
}
