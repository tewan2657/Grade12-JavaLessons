/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contacts;

import Contacts.Contact;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author lamon
 */
public class TextFileExample {

    // contact list
    private Contact[] contacts;
    private int position = 0;
    private ContactGUI gui;
    
    // constructor
    public TextFileExample(ContactGUI gui){
        this.gui = gui;
        // create a blank file reader
        FileReader file = null;
        try{
            // fix this proper loading later
            
            URL url = TextFileExample.class.getResource("input.txt");
            System.out.println(url);
            // Creating the file reader
            file = new FileReader(url.getFile());
        }catch(Exception e){
            // handle any errors
            // print out the lovely red errors
            e.printStackTrace();
            // exit the program
            System.exit(0);
        }
        
        // Use a Scanner with the file
        Scanner in = new Scanner(file);
        // get the number of adderesses
        int numAddresses = 6;
        
        // move to the next line
        in.nextLine();
        // create an empty rolodex
        contacts = new Contact[numAddresses];
        // go through the file
        int i = 0;
        while(in.hasNext()){
            String name = in.next();
            String phone = in.next();
            String email = in.nextLine().trim();
            // create the contact
            Contact c = new Contact(name);
            c.setEmail(email);
            c.setNumber(phone);
            // add contact to list
            contacts[i] = c;
            i++;
        }
    }
    
    public String getName(){
        return contacts[position].getName();
    }
    
    public String getPhone(){
        return contacts[position].getPhone();
    }
    
    public String getEmail(){
        return contacts[position].getEmail();
    }
    
    public int numContacts(){
        return contacts.length;
    }
    
    public int getPosition(){
        return position;
    }
    
    public void next(){
        // if there is another contact
        if(position < contacts.length - 1){
            // move to the next spot
            position++;
        }
    }
    
    public void prev(){
        // still contacts left
        if(position > 0){
            // move back
            position--;
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a blank file reader
        FileReader file = null;
        try{
            // fix this proper loading later
            
            URL url = TextFileExample.class.getResource("input.txt");
            System.out.println(url);
            // Creating the file reader
            file = new FileReader(url.getFile());
        }catch(Exception e){
            // handle any errors
            // print out the lovely red errors
            e.printStackTrace();
            // exit the program
            System.exit(0);
        }
        
        // Use a Scanner with the file
        Scanner in = new Scanner(file);
        // get the number of adderesses
        int numAddresses = 6;
        
        // move to the next line
        in.nextLine();
        // create an empty rolodex
        Contact[] contacts = new Contact[numAddresses];
        // go through the file
        int i = 0;
        while(in.hasNext()){
            String name = in.next();
            String phone = in.next();
            String email = in.nextLine().trim();
            // create the contact
            Contact c = new Contact(name);
            c.setEmail(email);
            c.setNumber(phone);
            // add contact to list
            contacts[i] = c;
            i++;
        }
        
        // print out the rolodex
        for(int j = 0; j < contacts.length; j++){
            System.out.println(contacts[j]);
        }
        
    }
    
}
