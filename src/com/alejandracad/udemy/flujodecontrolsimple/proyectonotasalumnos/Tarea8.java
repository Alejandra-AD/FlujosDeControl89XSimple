package com.alejandracad.udemy.flujodecontrolsimple.proyectonotasalumnos;

import java.util.Scanner;

public class Tarea8 {
    public static void main(String[] args) {

        Double[] arregloNotas = new Double[20];
        Scanner sNota = new Scanner(System.in);
        int contadorNotasUno = 0;
        int contadorNotasMayoresCinco = 0;
        int contadorNotasMenoresCuatro = 0;
        double sumaNotasMayoresCinco = 0;
        double sumasNotasMenoresCuatro = 0;
        double promedioNotasMayoresCinco = 0;
        double promedioNotasMenoresCuatro = 0;
        double sumaTotalNotas = 0;
        double promedioTotalNotas = 0;
        boolean salir = false;

        for (int i = 0; i < arregloNotas.length; i++) {

            System.out.println("Nota nro #" + i + ": Ingrese una nota");
            arregloNotas[i] = sNota.nextDouble();

            if (arregloNotas[i] == 0) {
                System.out.println("error ingreso nota 0, saliendo del programa...");
                salir = true;
                break;
            } else if (arregloNotas[i] > 5) {
                contadorNotasMayoresCinco++;
                sumaNotasMayoresCinco = sumaNotasMayoresCinco + arregloNotas[i];
                promedioNotasMayoresCinco = sumaNotasMayoresCinco / contadorNotasMayoresCinco;
            } else if (arregloNotas[i] < 4) {

                if(arregloNotas[i] == 1){
                    contadorNotasUno++;
                }
                contadorNotasMenoresCuatro++;
                sumasNotasMenoresCuatro = sumasNotasMenoresCuatro + arregloNotas[i];
                promedioNotasMenoresCuatro = sumasNotasMenoresCuatro / contadorNotasMenoresCuatro;
            }
            sumaTotalNotas = sumaTotalNotas + arregloNotas[i];
            promedioTotalNotas = sumaTotalNotas / arregloNotas.length;
        }


        if (!salir) {

            System.out.println("Notas ingresadas:");
            for (int i = 0; i < arregloNotas.length; i++) {
                System.out.println("Nota nro #" + (i + 1) + ": " + arregloNotas[i]);
            }

            System.out.println("*****                 *****");

            System.out.println("-Cantidad de notas mayores a 5.0 = " + contadorNotasMayoresCinco +
                    "\n-Promedio de notas mayores a 5.0 = " + promedioNotasMayoresCinco + "\n");

            System.out.println("-Cantidad de notas menores a 4.0 = " + contadorNotasMenoresCuatro +
                    "\n-Promedio de notas menores a 4.0 = " + promedioNotasMenoresCuatro + "\n");

            System.out.println("-Cantidad total de notas = " + arregloNotas.length +
                    "\n-Promedio total de notas = " + promedioTotalNotas + "\n");

            System.out.println("-Cantidad de notas iguales a 1 = " + contadorNotasUno);
        }

    }

}
