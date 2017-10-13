/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview;

/**
 *
 * @author tewan2657
 */
public class Human {
//Define instance variables
//In java, make instance variables private
    private String name;
    private int age;
    private  char gender;
    
    // Constructor 
    // Used to create individual human 
    // "Set up" a human to use 
    //this.name - using the instance variable
    public Human(String name, int age, char gender){
       this.name = name;
       this.age = age;
       this.gender = gender;
    }
    
    public String getName(){
     return name;   
    }
    public int getAge(){
       return age; 
       }

    public void setName(String name){
        this.name = name;
    }
    
    
    public void celebrateBirthday(){
        //Increase Human age 
        this.age++;
        //Wish them a Happy Birthday
        System.out.println("Happy Birthday " + this.name);
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human bob = new Human("Bob", 20, 'M'); 
        System.out.println(bob.getName());
        System.out.println(bob.getAge());
       
        
        Human alice = new Human("Alice", 23, 'F');
        System.out.println(alice.getName());
        System.out.println(alice.getAge());
     
        alice.celebrateBirthday();
        System.out.println(alice.getAge());
        System.out.println(bob.getAge());
        
    }
}
