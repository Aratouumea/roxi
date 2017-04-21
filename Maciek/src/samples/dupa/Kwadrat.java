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
public class Kwadrat {

     int dlugoscBoku;
     int pole;
    public Kwadrat(int pDlugoscBoku){
       dlugoscBoku=pDlugoscBoku;
    }
    public Kwadrat( int pDlugoscBoku, int pole){
    }
    
    public int liczPole(){
        return dlugoscBoku*dlugoscBoku;
    }
    public int getDlugoscBoku(){
        return dlugoscBoku;
    }
    public void setDlugoscBoku(int pDlugoscBoku){
         dlugoscBoku=pDlugoscBoku;
    }
    
    
    
    
    
     public static void main(String[] args) {
         Kwadrat kwadrat = new  Kwadrat(2);
         Kwadrat kdwadrat2 = new Kwadrat(6);
         System.out.println(kwadrat.liczPole());
         
         
    }
    
}
