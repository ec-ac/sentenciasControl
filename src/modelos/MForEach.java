/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import javax.swing.JOptionPane;

/**
 *
 * @author ecac
 */
public class MForEach {
     public void CalcularTam(){
    
        String[] lista = {"Juan", "María", "Miguel", "Susana"};
        int i = 0;
        int[] TAM = {0,0,0,0};
        
        for (String nombre : lista){
            TAM[i] = nombre.length();
            i++;
        }
        
        for (i = 0; i<4; i++)
            JOptionPane.showMessageDialog(null, "El nombre #" + (i+1) + " es de " 
                    + TAM[i] + " caracteres.");
    }
    
    public int CalcularMenor() {
        
        int[] lista = {5, 8, 3, 7, 9, 0, 3, 2, 1, 4, 6};
        int menor = lista[0];
        
        for (int num : lista){       
            if (num < menor)
                menor = num;
        }
        
        return menor;
    }
}
