
package modelos;

/**
 *
 * @author ecac
 */
public class MLogico {
    
    public boolean verificarMismos(double n1, double n2) {
        return n1 == n2;
    }
    
    public double encontrarMayor(double n1, double n2) {
        if (n1 > n2)
            return n1;
        else if (n1 == n2)
            return n1;
        
        return n2;
    }
    
    public double encontrarMenor(double n1, double n2) {
        if (n1 < n2)
            return n1;
        else if (n1 == n2)
            return n1;
        
        return n2;
    }
    
    public boolean valorVerdaderoMayor(double n1, double n2) {
        return n1 >= n2;
    }
    
    public boolean valorVerdaderoMenor(double n1, double n2) {
        return n1 <= n2;
    }
    
    public boolean caracteresIguales(char c1, char c2) {
        return c1 == c2;
    }
    
    public boolean caracteresDistintos(char c1, char c2) {
        return c1 != c2;
    }
    
    public boolean cadenasIguales(String s1, String s2) {
        return s1.equals(s2);
    }
    
    public int cadenaMayor(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        
        if (len1 > len2)
                return len1;
        else if (len1 == len2)
                return len1;
        
        return len2; 
    }
    
    public boolean numeroPositivo(double n1) {
        if (n1 > 0)
            return true;
        else if (n1 < 0)
            return false;
        
        return false;
    }
}
