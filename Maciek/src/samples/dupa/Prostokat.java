/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples.dupa;

/**
 *
 * @author Aratouumea
 */
public abstract class Prostokat {

    private int a;
    private int b;

    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    public int liczPole(){
        return a*b;
    }

}
