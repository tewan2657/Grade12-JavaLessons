 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview;

/**
 *
 * @author tewan2657
 */
public class JavaMethods {

    /**
     * @param args the command line arguments
     */
    public void helloWorld(){
        System.out.println("Hello world");
             
    }
    
    public void helloWorld(String name){
        System.out.println("Hello " + name);
    }
    
    public int sumRange(int start, int end){
       int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + i;
            
        }
        return sum;
    }
    
    
    public static void main(String[] args) {
        // Create an object to run methods 
        JavaMethods test = new JavaMethods(); 
        test.helloWorld();
        test.helloWorld("Moon!");
        int total = test.sumRange(5, 10);
        System.out.println(total);
    }
}
