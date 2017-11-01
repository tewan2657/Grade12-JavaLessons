/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview;

/**
 *
 * @author tewan2657
 */
public class MyLinkedList {

    private IntNode head;
    private int numItems;

    public MyLinkedList() {
        head = null;
        numItems = 0;
    }

    public void add(int num) {
        //start at beginning of list 
        IntNode node = head;
        //see if it is first item 
        if (node == null) {
            IntNode temp = new IntNode(num);
            head = temp;
        } else {
            // Travel to the end
            while (node.getNext() != null) {
                //Travel to the next node 
                node.getNext();
            }
            //node is the last node in the list
            //create the new node
            IntNode temp = new IntNode(num);
            //insert it into the list
            node.setNext(temp);

        }
        //increases the size counter 
        numItems++;
    }

    public void add(int pos, int num) {
        //At the front 
        if (pos == 0) {
            //Create the node
            IntNode temp = new IntNode(num);
            //the ned ndoe points to the start 
            temp.setNext(head);
            //reassign the head node
            head = temp;
            //adding at the end of the list
        } else if (pos == numItems) {
            add(num);
            //anywher else....
        } else {
            //start at the beginning 
            IntNode node = head;
            //move to the node before the insert
            for (int i = 0; i < pos - 1; i++) {
                node = node.getNext();
            }
            // @ node just before the insert
            IntNode temp = new IntNode(num);
            // create the after link first!
            temp.setNext(node.getNext());
        }
        //increases item counter
        numItems++;
    }

    public int size() {
        return numItems;
    }

    public boolean isEmpty() {
        return numItems == 0;
    }

    public int get(int position) {
        IntNode node = head;
        // mov ethe number of times 
        for (int i = 0; i < position; i++) {
            node = node.getNext();

        }
        return node.getNum();
    }

    public void remove(int pos) {
        //if removing from the start
        if (pos == 0) {
            head = head.getNext();
        } else if (pos == numItems - 1) {
            //remvoing from the end
            IntNode node = head;
            //Moving to the second last item 
            for (int i = 0; i < numItems - 1; i++) {
                node = node.getNext();
            }
            //Sever the link
            node.setNext(null);
        } else {
            IntNode node = head;
            // move to the spot just before
            for (int i = 0; i < pos - 1; i++) {
                node = node.getNext();
            }
            //the node to remove
            IntNode toRemove = node.getNext();
            //its next node
            IntNode next = toRemove.getNext();
            //set all the links 
            node.setNext(next);
            toRemove.setNext(null);
        }
        numItems--;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(2);
        list.add(-5);
        list.add(0,13);
        list.remove(1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
