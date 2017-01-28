/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devopsmigration;

/**
 *
 * @author sanal_000
 */
public class TypeCasting {
    public static void main(String[] args){
        int i = 100;
        long l = i;
        float j = l;
        System.out.println("int value " + i);
        System.out.println("long value " + l);
        System.out.println("Float value " + j);
        
        double a = 100.04;
        long b = (long)a;
        float c = (float)b;
        System.out.println("double value " + a);
        System.out.println("long value " + b);
        System.out.println("Float value " + c);
    }
    
}
