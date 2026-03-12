/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9.bikeapp;

/**
 *
 * @author ryanwhite
 */
public class Node {
    private Object element;
    private Node next;
    
    public Node(Object e, Node n){
        element= e;
        next=n;
    }
    public Node getNext(){
       return next;
    }
    
    public Object getElement() {
        return element;
    }

    public void setElement(Object e) {
        element = e;
    }

    public void setNext(Node n) {
        next = n;
    }
    
    public String toString(){
        return element.toString();
    }
    
}
