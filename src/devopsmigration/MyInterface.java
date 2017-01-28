/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devopsmigration;

interface Myintface
{
    public void method1();
    public void method2();
}

/**
 *
 * @author sanal_000
 */
public class MyInterface implements Myintface {
    public void method1(){
            System.out.println("My interface method1 implementation");
    }
    public void method2(){
            System.out.println("My interface method2 implementation");
    }
    public static void main(String[]  args){
        MyInterface m = new MyInterface();
        m.method1();
        m.method2();
        
    }
}
