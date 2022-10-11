
package modelos;

import java.util.ArrayList;

/**
 *
 * @author ecac
 */
public class MArreglo1 {
    
    private int sizeArray;
    private int multiploCheck;
    private int mayorArray;
    private int menorArray;
    
    public MArreglo1(int sizeArray, int multiploCheck, int mayorArray, int menorArray) {
        this.sizeArray = sizeArray;
        this.multiploCheck = multiploCheck;
        this.mayorArray = mayorArray;
        this.menorArray = menorArray;
    }

    public MArreglo1() {
    }
    
    
    public boolean esMultiplo (int n1, int n2) {
        return ((n2 % n1 == 0) && (n2/n1 >= 1));
    }


    public int getSizeArray() {
        return sizeArray;
    }

    public void setSizeArray(int sizeArray) {
        this.sizeArray = sizeArray;
    }

    public int getMultiploCheck() {
        return multiploCheck;
    }

    public void setMultiploCheck(int multiploCheck) {
        this.multiploCheck = multiploCheck;
    }

    public int getMayorArray() {
        return mayorArray;
    }

    public void setMayorArray(int mayorArray) {
        this.mayorArray = mayorArray;
    }

    public int getMenorArray() {
        return menorArray;
    }

    public void setMenorArray(int menorArray) {
        this.menorArray = menorArray;
    }
}
