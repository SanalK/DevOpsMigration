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
public class MyStringBuilder {
    public static void main (String[] args){
        String info = "";
        info += "My name is ";
        info += " ";
        info += "Dev Ops Engineer X";
        System.out.println(info);
        
        //Efficient Method
        StringBuilder sb = new StringBuilder("");
        sb.append ("my name is");
        sb.append (" ");
        sb.append ("Dev Ops Engineer Y");
        System.out.println(sb.toString());
        sb.replace(1, 5, "A totl");
        System.out.println(sb.toString());
    }
    
}
