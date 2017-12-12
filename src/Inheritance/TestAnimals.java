/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author tewan2657
 */
public class TestAnimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog Fido = new Dog("Fido", 3, "Boston Terrier", "Black");
        Cat Whiskers = new Cat("Whiskers", 5, "Tabby", "Brown");
        Dog Spike = new Dog("Spike", 8, "Bull Dog", "Black");

//        Fido.speak();
//        Whiskers.speak();
        Pet[] p = new Pet[3];
        p[0] = Fido;
        p[1] = Whiskers;
        p[2] = Spike;


        Object[] things = new Object[10];
        


        for (int i = 0; i < 3; i++) {
            System.out.println(p[i]);
            if (p[i] instanceof Dog) {
                Dog tempDog = (Dog) p[i];
                tempDog.howl();
            } else {
                p[i].speak();

            }

        }
    }
}
