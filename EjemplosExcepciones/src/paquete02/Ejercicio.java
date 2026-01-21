/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Pole
 */
public class Ejercicio {
    public static void main(String[] args) {
        int valor1 = ingresarValor();
        int valor2 = ingresarValor();
        
        int suma = obtenerSuma(valor1, valor2)
    }
    public static int ingresarValor() {
          boolean bandera = true;
        int valor1;
        while (bandera) {
            try {

                System.out.println("Ingrese el valor 1");
                valor1 = entrada.nextInt();
                if (valor1 < 0) {
                    throw new Exception("Número negativos");
                }
                if (valor1 % 2 != 0) {
                    throw new Exception("Número impar");
                }
                bandera = false;
            } catc
        
    }
    public static void imprimir() {
        
    }
    public static int obtenerSuma() {
        
    }
    
    
    
}
