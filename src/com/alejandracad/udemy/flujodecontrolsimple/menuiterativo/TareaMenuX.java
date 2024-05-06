package com.alejandracad.udemy.flujodecontrolsimple.menuiterativo;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class TareaMenuX {
    public static void main(String[] args) {
        int opcionIndice = 0;


        /* Los Map (o mapas) los veremos más adelante en el curso en profundidad,
           pero son como un arreglo asociativo, asocia un nombre (o índice) a un valor
           también se les conoce como diccionarios para almacenar datos con base a un nombre.*/

        Map<String, Integer> opciones = new HashMap();

        opciones.put("Actualizar", 1);
        opciones.put("Eliminar", 2);
        opciones.put("Agregar", 3);
        opciones.put("Listar", 4);
        opciones.put("Salir", 5);

        Object[] opArreglo = opciones.keySet().toArray();
        /*System.out.println(opciones.keySet());*/

        Object opcion = JOptionPane.showInputDialog(null,
                "Seleccione un Opción",
                "Mantenedor de Productos",
                JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

        if (opcion == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
        } else {
            opcionIndice = opciones.get(opcion.toString());

            switch (opcionIndice) {
                case 1 -> JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");
                case 2 -> JOptionPane.showMessageDialog(null,"Usuario eliminado correctamente");
                case 3 -> JOptionPane.showMessageDialog(null,"Usuario agregado correctamente");
                case 4 -> JOptionPane.showMessageDialog(null,"Usuario añadido a la lista");
                case 5 -> {
                    JOptionPane.showMessageDialog(null,"Saliendo del programa...");
                    System.exit(0); // Aquí se detiene la ejecución del programa,
                    // 0 para indicar finalización exitosa del programa y 1 (o más)
                    // para indicar finalización debido a un error.
                    //System.out.println("probando salida del sistema, este mensaje no debería mostrarse en consola");
                }
                default -> JOptionPane.showMessageDialog(null,"Opción no es válida");
            }
        }
    }
}
