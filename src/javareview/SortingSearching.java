/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview;

/**
 *
 * @author tewan2657
 */
public class SortingSearching {

    public void swap(int[] array, int p1, int p2) {
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }

    public void selectionSort(int[] array) {
        //Keep track  of which position we are sorting
        for (int position = 0; position < array.length; position++) {
            //go through the rest looking for a smaller number
            for (int i = position + 1; i < array.length; i++) {
                //have we found smaller?
                if (array[i] < array[position]) {

                    //swap numbers
                    swap(array, i, position);
                }
            }
        }

    }

    public void bubbleSort(int[] array){
     //Keep track of end   
     int last = array.length;  
     //boolean to flag a swap
     boolean swap = true;
     //continue if a swap has been made
     while(swap){
        //assume no swaps will be done 
         swap = false;
         //look for swaps
         for (int i = 0; i < last; i++) {
             
         }
     }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SortingSearching test = new SortingSearching();

        //making a random array of ints
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            //make a random number
            num[i] = (int) (Math.random() * 101);
        }

        System.out.println("BEFORE:");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        //SORT here
        test.selectionSort(num);
        //AFTER
        System.out.println("AFTER:");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
