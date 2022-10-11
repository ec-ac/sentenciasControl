
package modelos;

import static java.lang.Math.pow;

/**
 *
 * @author ecac
 */
public class MAritmeticos {
    
    public boolean esMultiplo (int n1, int n2) {
        return ((n2 % n1 == 0) && (n2/n1 >= 1)); //n2 mod n1 (no remainder), n2/n1 (not a fraction)
    }
    
    public double valorPow (double n1, double n2) {
        return pow(n1, n2);
    }
}
