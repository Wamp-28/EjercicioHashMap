import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        List<Persona> lstPersona = new ArrayList<>();


        Estudiante estu1 = new Estudiante("Andres", "Calle 11 # 2-60", "Ingenieria", 5);
        Estudiante estu2 = new Estudiante("Leonardo", "Calle 11 #12-78", "Medicina", 7);
        Estudiante estu3 = new Estudiante("Leidy", "Calle 11 #9-24", "Derecho", 3);


        Profesor prof1 = new Profesor("Pedro", "Cra5-12-96", "TI", "Docente");
        Profesor prof2 = new Profesor("Carlos", "Cra5-14-37", "Investigacion", "Docente");
        Profesor prof3 = new Profesor("Maria", "Cra5-12-19", "Ciencia", "Docente");



        lstPersona.add(estu1);
        lstPersona.add(estu2);
        lstPersona.add(estu3);
        lstPersona.add(prof1);
        lstPersona.add(prof2);
        lstPersona.add(prof3);


        System.out.println(lstPersona);

        for(Persona p: lstPersona  ){
            System.out.println(p);
        }
































    }
}