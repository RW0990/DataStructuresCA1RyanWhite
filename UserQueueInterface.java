/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package week9.bikeapp;

/**
 *
 * @author ryanwhite
 */
public interface UserQueueInterface {
    public boolean isEmpty();
    public int size();
    public Object firstElement();
    public void enqueue(Object newUser);
    public Object dequeue();
}
