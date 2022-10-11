
package modelos;

import static java.lang.Math.sqrt;
import java.util.ArrayList;

/**
 *
 * @author ecac
 */
public class MConsola {
    
    public double raizCuadrada(double number) {
        return sqrt(number);
    }
    
    public String caraConcat(char caracteres[]) {
        String line = "";
        
        for(int i = 0; i < 6; i++) {
            line += caracteres[i];
        }
        
        return line;
    }
    
    public double residuoDiv(double n1, double n2) {
        return (n1%n2);
    }
    
    public double valorPagarProds(double precios[], double descuento) {
        int i;
        double suma = 0, pagoImp, pagoFinal;
        
        for(i = 0; i < 4; i++) {
            suma += precios[i];
        }
        
        pagoImp = suma * 1.15;
        pagoFinal = pagoImp * (1 - descuento);
        
        return  pagoFinal;
    }
    
    public void descomponerCifra(int cifra) {
        ArrayList<Integer> descomposicion = new ArrayList<>();
        
        String cant = String.valueOf(cifra);
        int digit;
        
        for(int i = 0; i < cant.length(); i++) {
           
            descomposicion.add(Integer.parseInt(String.valueOf(cant.charAt(i))));
        }
        
        System.out.println("Descomposicion de digitos de la cifra ingresada: ");
        
        for(int j = 0; j < descomposicion.size(); j++) {
            System.out.println(descomposicion.get(j));
        }
    }
    
}
