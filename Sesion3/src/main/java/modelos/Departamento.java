package modelos;
import java.util.ArrayList;
import java.util.List

public class Departamento {
    private String nombre;
    private List<Profesor> profesores;

    public Departamento (){
        profesores = new ArrayList<>();
    }

    public class Departamento {
        private String nombre;
        private List<Profesor> profesores;
    }


    public void agregarProfesor(Profesor profesor) {
        profesores.add (profesor);
    }

    public Departamento(List<Profesor> profesores) {
        this.profesores = profesores;
    }


}
