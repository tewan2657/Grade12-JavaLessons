/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author tewan2657
 */
public class Cat extends Pet {

    private int livesRemaining;
    
    public Cat(String name, int age, String breed, String colour) {
        super(name, age, breed, colour);
        livesRemaining = 9;
    }

    @Override
    public void speak() {
        System.out.println("MEOW MEOW");
    }
    
    public String toString(){
     String fromPet = super.toString();
     fromPet += "\nLives: " + livesRemaining;
     fromPet += "\nType : Cat";
     return fromPet;
    }
    
}
