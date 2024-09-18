package Evaluacion1;

import java.util.Scanner;

public class PrimeraEvaluacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número de empleados
        System.out.print("Ingrese el número de empleados: ");
        int numeroEmpleados = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        // Crear arrays para almacenar la información
        int[] edades = new int[numeroEmpleados];
        boolean[] accidentes = new boolean[numeroEmpleados];
        int[] diasBaja = new int[numeroEmpleados];
        boolean[] formacionSeguridad = new boolean[numeroEmpleados];

        // Bucle para ingresar la información de cada empleado
        for (int i = 0; i < numeroEmpleados; i++) {
            System.out.println("Empleado " + (i + 1) + ":");

            // Ingresar edad
            System.out.print("Ingrese la edad: ");
            edades[i] = scanner.nextInt();

            // Ingresar si ha tenido accidentes (true/false)
            System.out.print("¿Ha tenido accidentes? (true/false): ");
            accidentes[i] = scanner.nextBoolean();

            // Ingresar días de baja laboral
            System.out.print("Ingrese los días de baja laboral: ");
            diasBaja[i] = scanner.nextInt();

            // Ingresar si tiene formación en seguridad del trabajo (true/false)
            System.out.print("¿Tiene formación en seguridad del trabajo? (true/false): ");
            formacionSeguridad[i] = scanner.nextBoolean();

            scanner.nextLine(); // Limpiar el buffer para la próxima iteración
            System.out.println();
        }

        // Mostrar la información ingresada
        System.out.println("Información de los empleados:");
        for (int i = 0; i < numeroEmpleados; i++) {
            System.out.println("Empleado " + (i + 1) + ":");
            System.out.println("Edad: " + edades[i]);
            System.out.println("Ha tenido accidentes: " + accidentes[i]);
            System.out.println("Días de baja laboral: " + diasBaja[i]);
            System.out.println("Tiene formación en seguridad del trabajo: " + formacionSeguridad[i]);
            System.out.println();
        }

        scanner.close();

        System.out.println("************************************************ ");
        System.out.println("1. Promedio de edad de los trabajadores ");
        System.out.println("2. porcentaje de un trebajador que han sufrido accidetes laborales en el ultimo año ");
        System.out.println("3. Promedio de Dias de baja laboral por Accidente Laboral");
        System.out.println("4. Porcentaje de Tabajadores con formalidad en seguridad industrial");
        System.out.println("5. Total de inspecciones de seguridad Realizada por proyectos  ");
        System.out.println("6. numero total de Proyectos con riesgo critico identificados ");
        System.out.println("7. Numero Total de Proyectos con mas de 10 incidentes de seguridad reportada  ");
        System.out.println("8. ");

    }
}
