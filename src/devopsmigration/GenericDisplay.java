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
public class GenericDisplay {
    
public static <genarr> void printArray(genarr[] elements) {
    for (genarr element:elements){
        System.out.printf("%s %s", element," ");
    }
}

public static void main(String args[]){
    Integer[] intArray = {1,2,3,4,5};
    Double[] doubleArray = {3.4, 5.1, 6.1, 9.35};
    Character[] charArray = {'H','A','L','N','Y'};
    System.out.println("int array");
    printArray(intArray);
    System.out.println("\nDouble array");
    printArray(doubleArray);
    System.out.println("\nCharacter array");
    printArray(charArray);
    
    
}
}

