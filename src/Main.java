import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(new Alumno("Luis","Perez",20));
        listaAlumnos.add(new Alumno("Ana","Garcia",28));
        listaAlumnos.add(new Alumno("Pablo","Almeida",19));
        listaAlumnos.add(new Alumno("Vinicio","Zambrano",22));
        listaAlumnos.add(new Alumno("Cecicilia","Ayala",15));

        //crea comparador
        //esos dos puntos dice que hace eso
        Comparator <Alumno> comparadorNombre = Comparator.comparing(Alumno::getNombre);

        //ordena
        Collections.sort(listaAlumnos, comparadorNombre);

        /*for(Alumno alumno : listaAlumnos){
            System.out.println(alumno.getNombre());
        }*/

        for(Alumno alumno : listaAlumnos){
            System.out.println("el nombre del alumno es: "+alumno.getNombre());
            System.out.println("el apellido del alumno es: "+alumno.getApellido());
            System.out.println("la edad del alumno es: "+alumno.getEdad());
            System.out.println("------------------------------");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingreese el apellido del alumno que desea encontrar");
        String apellido1 = scanner.next();


        //esto es programacion funcional, estamos diciendo que necesitamos hacer, no como hacer
        Alumno alumno1 = listaAlumnos.stream()
                .filter(x -> x.getApellido().equals(apellido1))
                .findAny()
                .orElseThrow();
        System.out.println("el nombre del alumno es: "+alumno1.getNombre());
        System.out.println("el apeliido del alumno es: "+alumno1.getApellido());
        System.out.println("la edad el alumno es: "+alumno1.getEdad());

    }
}