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
    private Object station;
    private Node next;
    
    public Node(Object e, Node n){
        station= e;
        next=n;
    }
    public Node getNext(){
       return next;
    }
    
    public Object getElement() {
        return station;
    }

    public void setElement(Object e) {
        station = e;
    }

    public void setNext(Node n) {
        next = n;
    }
    
    public String toString(){
        return station.toString();
    }
    
}
