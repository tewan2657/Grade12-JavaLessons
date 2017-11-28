/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview;

import java.io.FileReader;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author tewan2657
 */
public class TextFileExample {

   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a blank a file reader
        FileReader file = null;
        try {
            //Fix this proper loading later
            URL url = TextFileExample.class.getResource("Input.txt");

            // creating the file reader
            file = new FileReader(url.getFile());
        } catch (Exception e) {
            //handle any errors
            //print out the red errors
            e.printStackTrace();
            //exit the program 
            System.exit(0);
        }
        // use a scanner with the file 
        Scanner in = new Scanner(file);
        // ge the number of addresses
        int numAddresses = in.nextInt();

        //move to the next line
        in.nextLine();
        //Create an empty rolodex
        Contact[] contacts = new Contact[numAddresses];
        int i = 0;
        while (in.hasNext()) {
            // go through the file 
            //for (int i = 0; i < numAddresses; i++) {
            String name = in.next();
            String phone = in.next();
            String email = in.nextLine().trim();
            //Create the contact
            Contact c = new Contact(name);
            c.setEmail(email);
            c.setNumber(phone);
            // add contact to list 
            contacts[i] = c;
            i++;
        }
        // Print out the rolodex
        for (int j = 0; j < contacts.length; j++) {
            System.out.println(contacts[j]);
        }



    }
}
