package base.de.datos.alumnos;

import java.util.Scanner;

public class BaseDeDatosAlumnos {

    public static void main(String[] args) {

        estudiantes datos[] = new estudiantes[10];
        int op = 0;
        Scanner teclado = new Scanner(System.in);
        Scanner letras = new Scanner(System.in);
        while (op != 5) {
            System.out.println("1. nuevo alumno");
            System.out.println("2. ver alumnos");
            System.out.println("3. buscar alumno");
            System.out.println("4. modificar alumno");
            System.out.println("5. salir");
            System.out.println("ingrese los datos");
            op = teclado.nextInt();
            if (op == 1) {
                System.out.println("-----------------------");
                System.out.println("ingrese clave ");
                int clave = teclado.nextInt();
                System.out.println("ingrese nombre ");
                String nombre = letras.nextLine();
                System.out.println("ingrese el grado");
                String grado = letras.nextLine();
                System.out.println(nueval(clave, nombre, grado, datos));
                System.out.println("--------------------------");
            } else if (op == 2) {
                System.out.println(imp(datos));
            } else if (op == 3) {
                System.out.println("ingrese la clave");
                int clave = teclado.nextInt();
                System.out.println(buscaralumno(clave, datos));
            } else if (op == 4) {
                System.out.println("ingrese la clave del alumno que desee modificar");
                int clave = teclado.nextInt();
                if (mod(clave, datos)) {
                    System.out.println("ingrese el nuevo nombre");
                    String nombre = letras.nextLine();
                    System.out.println("ingrese el nuevo grado");
                    String grado = letras.nextLine();
                    System.out.println(MD(clave, nombre, grado, datos));
                }
            }
        }
    }

    public static String nueval(int clave, String nombre, String grado, estudiantes arreglo[]) {
        boolean lleno = true;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == null) {
                arreglo[i] = new estudiantes(clave, nombre, grado);
                lleno = false;
                break;
            } else if (arreglo[i].getClave() == clave) {
                return "ya existe la clave";
            }
        }
        if (!lleno) {
            return "guardado con exito";
        } else {
            return "ya no hay espacio";
        }

    }

    public static String imp(estudiantes arreglo[]) {
        String cadena = "";
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null) {
                cadena = cadena + arreglo[i].getClave() + " | " + arreglo[i].getNombre() + " | " + arreglo[i].getGrado() + "\n";
            }
        }
        return cadena;
    }

    public static String buscaralumno(int clave, estudiantes arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null && arreglo[i].getClave() == clave) {
                return "los datos son \n nombre: " + arreglo[i].getNombre() + "el grado: " + arreglo[i].getGrado();
            }

        }
        return "la clave es inexistrente";
    }

    public static boolean mod(int clave, estudiantes arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null && arreglo[i].getClave() == clave) {
                return true;
            }

        }
        return false;
    }

    public static String MD(int clave, String nombre, String grado, estudiantes arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null && arreglo[i].getClave() == clave) {
                arreglo[i].setNombre(nombre);
                arreglo[i].setNombre(nombre);
                return "se actualizo";
            }

        }
        return "";
    }
}
