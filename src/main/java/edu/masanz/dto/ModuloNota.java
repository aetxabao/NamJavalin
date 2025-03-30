package edu.masanz.dto;

public class ModuloNota extends Modulo {
    protected double nota;

    public ModuloNota() {
        super();
        this.nota = 0;
    }

    public ModuloNota(String id, String nombre, double nota) {
        super(id, nombre);
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "NotaModulo{" +
                "id='" + getId() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", nota=" + nota +
                '}';
    }
}
