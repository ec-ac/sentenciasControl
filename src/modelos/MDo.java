/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ecac
 */

public class MDo {
    
    public double Promedio1(int n){
        double prom;

        int i = 1, suma = 0;
        
        do{
            suma += i;
            i++;
        }while(i <= n);
        prom = suma / n;
            
        return prom;
    }
    
    public double Promedio2 (int a, int b){
        double prom = 0;
        
        int i = a+1;
        
        float suma = a;

        do{
            suma += i;
            i++;
        }while(i <= b);            
        prom = suma/(b-a+1);
           
           
        return prom;
    }

    public boolean Contrasena(String contra) {
   
        boolean acceso = (contra.equals("abc.123"));

        return acceso;
    }

    public boolean NumCompuesto(int num) {
        
        boolean compuesto = false;
        
        int i = 2;
        
        if (num == 2) {
            return compuesto;
        }
        
        do{
            if (num % i == 0) {
                compuesto = true;
            }
            i++;
        }while (i < num);
        
        return compuesto;
    }

    public int Suma() {

        int i = 3, suma = 0;
        do{
            suma = suma + i;
            i = i + 2;
        }while(i <= 200);
        
        return suma;
    }

    public String SerieFib() {
        
        ArrayList serie = new ArrayList();
        
        int num1 = 1, num2 = 1, temp;
        
        int i = 0;
        do{
            serie.add(i, num1);
            temp = num1 + num2;
            num1 = num2;
            num2 = temp;
            
            i++;
        }while(i<6);
 
        return (serie.get(0) + " " + serie.get(1) + " " + serie.get(2) + " " 
                + serie.get(3) + " " + serie.get(4) + " " + serie.get(5));
    }
}
