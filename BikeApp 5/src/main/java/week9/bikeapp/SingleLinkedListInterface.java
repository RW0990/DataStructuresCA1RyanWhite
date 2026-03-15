/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package week9.bikeapp;

/**
 *
 * @author ryanwhite
 */
public interface SingleLinkedListInterface {
    public boolean isEmpty();
    public int size();
    public Object get(int index);
    public void remove(int index);
    public void add(int index,Object element);
    public void printList();
}
