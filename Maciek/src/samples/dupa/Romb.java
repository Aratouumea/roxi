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
public class Romb extends Prostokat {
    
    private int h;
    
    public Romb(int a, int h) {
        super(a, a);
        this.h=h;
        if(this instanceof Prostokat){
            (Prostokat)this;
        }
        
    }
    
    
    public int liczPole(){
        return h*a;
    }
    
    
    
    
   
    
    
}
