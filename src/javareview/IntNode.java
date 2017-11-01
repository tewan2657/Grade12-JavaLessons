/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview;

/**
 *
 * @author tewan2657
 */
public class IntNode {

    private int item;
    private IntNode next;

    public IntNode(int num) {
        item = num;
        next = null;
    }

    /**
     * Returns the number stored in the node
     * @return the stored number
     */
    public int getNum() {
        return item;
    }

    /**
     * Returns the node that comes after
     *
     * @return the next node
     */
    public IntNode getNext() {
        return next;
    }

    /**
     * Sets the node that comes after
     * @param node the node to point to 
     */
    public void setNext(IntNode node) {
        next = node;

    }
}
