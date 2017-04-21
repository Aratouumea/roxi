/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples;

import java.util.Scanner;

/**
 *
 * @author Aratouumea
 */
public class Interakcja {
    
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Wpisz jakis tekst");
        String tekst = sc.nextLine();
        int x = Integer.parseInt(tekst);
        //System.out.println(pobranyTeskt);
        int wynik = dodawanie_dwochliczb(x, 2);
        System.out.println("Miejsca zerowe to:" + 2 + 3);
        double miejscaZerowe[] = new double[5];
        miejscaZerowe[4] = 1;
        System.out.println(miejscaZerowe[0]);
        int licznik= 1;
        licznik++;
        licznik--;
         System.out.println(licznik);
        for(int i =0; i<5; i=i+6){
            System.out.println(miejscaZerowe[i]); 
            for(j)
        }
        int j =0;
        while(j<=0){
             System.out.println(miejscaZerowe[j]); 
             j++;
        }
        int k=3;
        if(k!=4){
            k--;
        }
         System.out.println(k); 
        
        
    }

    static int dodawanie_dwochliczb(int x, int y) {
        return x % y;
    }
    
}
