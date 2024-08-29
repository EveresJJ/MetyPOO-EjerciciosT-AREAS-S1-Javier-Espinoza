package modelos;

public class Main {
    public static void main(String[] args) {
        System.out.println("*".repeat(13));
        Curso = new Curso(nombre:"Metodologia y POO");
        Profesor dimitrick = new Profesor (nombre: "Dimitrick Navarro");
        dimitrick.enseñar(curso);
        Departamento FIA = new Departamento( nombre: "Facultad de Ingenieria");
        Profesor noel = new Profesor( nombre: "Noel Gavarrete");
        fia.agregarProfesor(noel);
        fia.agregatProfesor(dimitrick);
        System.out.println(fia.getNombre());
        for (Profesor doc: fia.getProfesores());
        System.out println(doc.getNombre());
        System.out.println("=".repeat(13));
    }

}


