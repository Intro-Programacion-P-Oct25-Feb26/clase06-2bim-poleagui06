/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author Pole
 */
public class Ejercicio {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int valor1 = ingresarValor();
        int valor2 = ingresarValor();

        int suma = obtenerSuma(valor1, valor2);
        imprimir(valor1, valor2, suma);
    }

    public static int ingresarValor() {
        boolean bandera = true;
        int valor1 = 0;
        while (bandera) {
            try {

                System.out.println("Ingrese el valor");
                valor1 = entrada.nextInt();
                if (valor1 < 0) {
                    throw new Exception("Número negativos");
                }
                if (valor1 % 2 != 0) {
                    throw new Exception("Número impar");
                }
                bandera = false;

            } catch (Exception e) {
                System.out.printf("Valor no permitido\n"
                        + "Error : %s\n", e);
            }
        }

        return valor1;
    }

   
    public static int obtenerSuma(int a, int b) {
        int suma = a + b;
        return suma;

    }
    
    public static void imprimir(int a, int b, int c) {
        System.out.printf("La suma de %s + %s = %s\n", a, b, c);

    }

}
