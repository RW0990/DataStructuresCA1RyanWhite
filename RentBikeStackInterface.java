/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package week9.bikeapp;

/**
 *
 * @author ryanwhite
 */
public interface RentBikeStackInterface {
    public boolean isEmpty();
    public boolean isFull();
    public void push(Object newBike);
    public Object pop();
    public int size();
    public void emptyStack();
    public String displayStack();
}
