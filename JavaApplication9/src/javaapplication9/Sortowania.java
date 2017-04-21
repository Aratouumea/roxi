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
public class Sortowania {
    
    
    public static ArrayList<Double> sortowaniePrzezWybieranie(ArrayList<Double> tablica){
        int indeksMin;
        Double minValue;
        for(int i=0;i<tablica.size();i++){
           indeksMin=i;
           minValue=tablica.get(i);
           for(int j=i+1;j<tablica.size();j++){
               if(tablica.get(j)< minValue){
                   minValue=tablica.get(j);
                   indeksMin=j;
               }
           }
           tablica.set(indeksMin, tablica.get(i));
           tablica.set(i, minValue);
           
        }
        return tablica;
    }
    
    public void qSort(ArrayList<Double> tablica, int d, int g){
        Double t;
        int s;
        if(d <g){
            t= tablica.get(d);
            s=g;
            for(int i=g; i>0;i--){
                if(tablica.get(i) > t){
                    zamiana(tablica, s, i);
                    s-=1;
                }
            }
            zamiana(tablica, d, s);
            for(int i =d ;i<s;i++){
                System.out.print(tablica.get(i)+" |"+" ");
            }
            System.out.println(" \n LEwa");
            qSort(tablica, d, s-1);
             for(int i =s+1 ;i<=g;i++){
                System.out.print(tablica.get(i)+" |"+" ");
                
            }
             System.out.println(" \n Prawa");
            qSort(tablica, s+1, g);
        }
    }
    private void zamiana(ArrayList<Double> tablica, int x, int y){
        Double xx= tablica.get(x);
        Double yy= tablica.get(y);
        tablica.set(x, yy);
        tablica.set(y, xx);
        
    }
    
}
