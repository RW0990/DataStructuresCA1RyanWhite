/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package week9.bikeapp;

/**
 *
 * @author ryanwhite
 */
public class BikeApp {

    public static void main(String[] args) {
       UserQueueInterface uq=new UserQueue();
       BikeAppGUI bikeapp=new BikeAppGUI();
       //bikeapp.setVisible(true);
       
       uq.enqueue("Jack, #12467, Electric Bike, 3 Arena");
       uq.enqueue("User 2");
       uq.enqueue("User 3");
       uq.enqueue("User 4");
       uq.enqueue("User 5");
       System.out.println("Users waiting for bikes: ");
       System.out.println("Users: "+uq.size());
       System.out.println("First user: "+uq.firstElement());
       
    }
}
