/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.ArrayList;

/**
 *
 * @author Aratouumea
 */
public class Test {
    
  
    
    
    public static void main(String[] args) {
      
        Sortowania sort = new Sortowania();
        ArrayList<Double> tablica = new ArrayList<>();
        tablica.add(6.0);
        tablica.add(5.0);
        tablica.add(1.0);
        tablica.add(2.0);
        tablica.add(4.0);
        tablica.add(3.0);
        tablica.add(10.0);
        tablica.add(8.0);
        tablica.add(7.0);
        tablica.add(9.0);
        tablica.add(11.0);
        tablica.add(12.0);
        sort.qSort(tablica, 0, 11);
        for( Double liczba: tablica){
            System.out.println(liczba);
        }

    }
    
    
    
}
