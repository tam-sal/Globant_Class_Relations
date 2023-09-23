/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relclassExcer01;

import relclassExcer01.entities.*;

/**
 *
 * @author blue_
 */
public class RelClass01Excer01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p1 = new Person("John", "Nash", new Dog("Fluffy", "Beagle", 7, "small"));
        System.out.println(p1);
        Dog d2 = new Dog("Poppy", "German", 3, "medium");
        Person p2 = new Person("Thomas", "Johnson", d2);
        System.out.println(p2);
    }
    
}
