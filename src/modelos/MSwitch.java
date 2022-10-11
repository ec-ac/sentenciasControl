/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.Scanner;

/**
 *
 * @author ecac
 */
public class MSwitch {
    
    Scanner read = new Scanner(System.in);
    
    public String diasPorMes(String mes) {
        String m = mes;
        
        int group;
        
        if (m.equals("Enero") || m.equals("Marzo") || m.equals("Mayo") 
                || m.equals("Julio") || m.equals("Agosto") || m.equals("Octubre")
                || m.equals("Diciembre")) {
            group = 1;
        } else if (m.contentEquals("Febrero")) {
            group = 3;
        } else if (m.equals("Abril") || m.equals("Junio") || m.equals("Septiembre") 
                || m.equals("Noviembre")) {
            group = 2;
        } else {
            group = 4;
        }

        switch (group) {

            case 1:
                return "Pertenece al grupo de 31 días";
            case 2:
                return "Pertenece al grupo de 30 días";
            case 3:
                return "Pertenece al grupo de 28 días";

            default:
                break;
        }

        return "Este mes no existe";
    }
    
    public String epocaPorMes(int mes) {

        switch (mes) {

            case 1:
                return "La época es invierno";

            case 3:
                return "La época es primavera";

            case 4:
                return "La época es primavera";

            case 5:
                return "La época es primavera";

            case 6:
                return "La época es verano";

            case 7:
                return "La época es verano";

            case 8:
                return "La época es verano";

            case 9:
                return "La época es otoño";

            case 10:
                return "La época es otoño";

            case 11:
                return "La época es otoño";

            case 12:
                return "La época es invierno";

            case 2:
                return "La época es invierno";

            default:
                break;
        }

        return "Este mes no existe";
    }
public String diasPorNumeroMes(int mes) {

        switch (mes) {

            case 1:
                return "Pertenece al grupo de 31 días";
                
            case 2:
                return "Pertenece al grupo de 28 días";

            case 3:
                return "Pertenece al grupo de 31 días";

            case 4:
                return "Pertenece al grupo de 30 días";

            case 5:
                return "Pertenece al grupo de 31 días";

            case 6:
                return "Pertenece al grupo de 30 días";

            case 7:
                return "Pertenece al grupo de 31 días";

            case 8:
                return "Pertenece al grupo de 31 días";

            case 9:
                return "Pertenece al grupo de 30 días";

            case 10:
                return "Pertenece al grupo de 31 días";

            case 11:
                return "Pertenece al grupo de 30 días";

            case 12:
                return "Pertenece al grupo de 31 días";

            default:
                break;
        }

        return "Este mes no existe";
    }

public double sqrt(int numero) {
        double raiz = Math.sqrt(numero);
        return raiz;
    }

 public double calcMod(double numero1, double numero2) {
       double residuo = numero1 % numero2;
       return residuo;
    }
 
 public String lesserNum(int n) {
        double lesser = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingresa el valor de un numero: ");
            
            double numero = read.nextDouble();
            read.nextLine();
            
            if (i == 1 || numero < lesser) {
                lesser = numero;
            }
            System.out.println();
        }
        return "Valor de menor: " + lesser;
    }
 
 public int isEvenOdd(int num){
    return num % 2;
    }
 
}
