/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author ecac
 */
public class MWhile {
    
    public int vowelCheck(String Sentence) {
        int i = 0, count = 0;
        
        String proxy = Sentence.toLowerCase();
        
        
        while (i < proxy.length()) {
            
            if (Sentence.charAt(i) == 'a' || Sentence.charAt(i) == 'i' 
                    || Sentence.charAt(i) == 'u' || Sentence.charAt(i) == 'e'
                    || Sentence.charAt(i) == 'o') {
                count = count + 1;
            }
            i++;
        }
        
        return count;
    }
    
    public boolean perfect(int num) {
        
        int i = 1, count = 0, total = 0;
        
        int[] factor = new int[num];
        
        while (i < num) {
            if (num % i == 0) {
                factor[count] = i;
                count++;
            }
            i++;
        }
        
        for (i = 0; i < count; i++) {
            total = total + factor[i];
        }
        
        return total == num;
        
        
        
    }
    
    
    
    
    private double Suma = 0;
    
    public MWhile() {
        
    }

    public MWhile(double suma) {
        Suma = suma;
    }

    public double getSuma() {
        return Suma;
    }

    public void setSuma(double suma) {
        this.Suma = suma;
    }
        
    public void agregarSuma(double valor) {
        this.Suma += valor;
    }
    
    
    
    
    private int Count = 0;
    
    public MWhile(int count) {
        Count = count;
    }

    public double getCount() {
        return Count;
    }

    public void setCount(int count) {
        this.Count = count;
    }
        
    public void agregarCount(int yes) {
        this.Count += yes;
    }
}
