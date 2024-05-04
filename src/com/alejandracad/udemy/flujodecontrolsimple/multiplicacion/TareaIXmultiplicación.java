package com.alejandracad.udemy.flujodecontrolsimple.multiplicacion;

public class TareaIXmultiplicación {
    public static void main(String[] args) {

        int numero1 = -2;
        int numero2 = 4;


        //Opción 1:
        int multiplicacionOpcion1 = Math.multiplyExact(numero1,numero2);
        System.out.println("Resultado multiplicacion = " + multiplicacionOpcion1);


        //Opción 2:

        int multiplicacionOpcion2 = 0;

        for (int i = 0; i < Math.abs(numero2) ; i++) {

            if (numero1 == Math.abs(numero1) && numero2 == Math.abs(numero2) || numero1 != Math.abs(numero1) && numero2 != Math.abs(numero2)){

                multiplicacionOpcion2 += Math.abs(numero1);
            }else {
                multiplicacionOpcion2 += numero1;
            }

        }
        System.out.println(multiplicacionOpcion2);

    }
}
