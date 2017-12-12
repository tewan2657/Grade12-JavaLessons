/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author tewan2657
 */
public abstract class Pet {
    //Instance variables
    private String name;
    private int age;
    private String breed;
    private String colour;

    /**
     * 
     * @param name
     * @param age
     * @param breed
     * @param colour 
     */
    public Pet(String name, int age, String breed, String colour) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.colour = colour;
    }

    /**
     * get the name of the pet
     * @return name of the pet
     */
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        String output = "------------\n";
        output += "Name: " + this.name + "\n";
        output += "Age: " + this.age + "\n";
        output += "Breed: " + this.breed + "\n";
        output += "Colour: " + this.colour;
        return output;
    }
    
    public abstract void speak();
    
}
