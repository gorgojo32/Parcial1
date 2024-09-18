package Evaluacion1;

import java.util.Scanner;

public class PrimerPacial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        System.out.print("Ingrese el número de personas: ");
        int numeroPersonas = scanner.nextInt();
        scanner.nextLine();

        String[] edad = new String[numeroPersonas];

        for (int i = 0; i < numeroPersonas; i++) {
            System.out.print("Ingrese el edad de la persona " + (i + 1) + ": ");
            edad[i] = scanner.nextLine();

        }
        System.out.print("Usted ha sufrido Accidentes: (Si/No)");
        String sufrido = scanner.nextLine();

        if (sufrido == "Si") {

            System.out.print("Dias de baja por Accidente Laboral:");
            int diasBaja = scanner.nextInt();
            scanner.nextInt();
            //String diasaBajaLaboral = Scanner.nextLine(); 
            int[] promedioDias = new int[diasBaja];

            for (int i = 0; i < diasBaja; i++) {

                System.out.print("Dias de Baja por Accidente Persona N°:" + (i + 1));
                promedioDias[i] = scanner.nextInt();

            }
        }
        System.out.print("Usted ha tenido Formacion en seguridad y salud en el trebajo: (Si/No)");
        String seguridad = scanner.nextLine();
        for (int i = 0; i < numeroPersonas; i++) {
            if (seguridad == "Si") {
          //      int contador = contador + 1;

            }
        }
        if (seguridad == "Si") {
            
            for (int i = 0; i < contador; i++) {

                System.out.print("Dias de Baja por Accidente Persona N°:" + (i + 1));
              //  proms[i] = scanner.nextInt();
            }
        }

        System.out.println("\nNombres ingresados:");
        for (int i = 0; i < numeroPersonas; i++) {
            System.out.println("Persona " + (i + 1) + ": " + edad[i]);
        }

    }
}
