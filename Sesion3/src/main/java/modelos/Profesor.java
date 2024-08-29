package modelos;

public class Profesor {
    private String nombre;

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public Profesor() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void enseñar(Curso curso) {
        System.out.println(nombre + " esta enseñando"
                +curso.getNombre());

        Curso curso = new Curso(nombre: "Metodologia y POO");
        Profesor dimitrick = new Profesor( nombre: "Dimitrick Navarro");

    }
}
