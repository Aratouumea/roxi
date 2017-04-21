/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testhub;

/**
 *
 * @author Aratouumea
 */
public class Testhub {

    public enum cos{
        Zmiana, Niezmiana
    };
    private static final cos pp=cos.Niezmiana;
    static private void test(cos p){
        p=cos.Zmiana;
    }
    public static void main(String[] args) {
        test(pp);
        System.out.println(pp);
    }
    
}
