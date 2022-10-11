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
public class MFor {
    public int CalcularSuma1(int n) {
        
        int suma = 1, i;
        for (i = 2; i <= n; i++)
            suma = suma + i;
        
        return suma;
    }
    
    public int CalcularSuma2(int a, int b) {
        
        int suma = a, i;
        for (i = a+1; i <= b; i++)
            suma = suma + i;
        
        return suma;
    }

    public boolean NumPrimo(int num) {
        int i;
        
        if (num == 0 || num == 1)
            return false;
        else{
        
            for (i = 2; i <= num/2; i++){
                if (num % i == 0)
                    return false;           
            }
        }        
        return true;
    }

    public double CalcularPromedio(int n) {
        
        ArrayList<Integer> notas = new ArrayList();
        int i, suma = 0;
        double promedio;
        
        for (i = 0; i<n; i++)
            notas.add(i, (Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota #" + (i+1)))));
        
        for (i = 0; i<n; i++)
            suma = suma + notas.get(i);
        
        promedio = suma/n;
        
        return promedio;
    }
    
    public int CalcularSuma3(){
    
        int suma = 0, i;
        
        for (i = 2; i <= 100; i = i+2)
            suma = suma + i;
        
        return suma;
    }

    public String SerieFib() {
        
        ArrayList serie = new ArrayList();
        
        int num1 = 1, num2 = 1, temp;
        
        int i = 0;
        
        for (i = 0; i < 6; i++){
            serie.add(i, num1);
            temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }
        
        return (serie.get(0) + " " + serie.get(1) + " " + serie.get(2) + " " 
                + serie.get(3) + " " + serie.get(4) + " " + serie.get(5));
    }
}
