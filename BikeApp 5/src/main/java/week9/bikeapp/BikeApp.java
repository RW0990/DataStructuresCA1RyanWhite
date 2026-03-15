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
       
       //User Queue
       BikeAppGUI bikeapp=new BikeAppGUI();
       bikeapp.setVisible(true);
       /*Testing Code
       //User Queue
       uq.enqueue("Jack, #12467, Electric Bike, 3 Arena");
       uq.enqueue("User 2");
       uq.enqueue("User 3");
       uq.enqueue("User 4");
       uq.enqueue("User 5");
       System.out.println("Users waiting for bikes: ");
       System.out.println("Users: "+uq.size());
       System.out.println("First user: "+uq.firstElement());
       System.out.print("\n--------------\n");
       
       //Station Single linked list
       StationSLL stations=new StationSLL();
       Station s1=new Station(1,"NCI Spenser Dock",12);
       stations.add(s1);
       Station s2=new Station(2,"3 Arena",2);
       stations.add(s2);
       Station s3=new Station(3,"Connolly Station",15);
       stations.add(s3);
       Station s4=new Station(4,"Samuel Beckett Bridge",5);
       stations.add(s4);
       Station s5=new Station(5,"Grand Canal",3);
       stations.add(s5);
       stations.get(2);
       System.out.println("Stations: ");
       stations.printList();
       System.out.print("Amount of Stations: "+stations.size());
       System.out.print("\nStation Info: "+stations.get(2));
       //stations.remove(3);
       //stations.printList();
       System.out.print("\n--------------\n");
       
       //Electric Bike Stack
       System.out.print("\nElectric Bikes:\n");
       ReturnBikeStack ebike=new ReturnBikeStack();
       ElectricBike ebike1=new ElectricBike(111345,"NCI Spenser Dock");
       ebike.push(ebike1);
       ElectricBike ebike2=new ElectricBike(111321,"NCI Spenser Dock");
       ebike.push(ebike2);
       System.out.println(ebike.displayStack());
       System.out.print("\n--------------\n");
       //Normal Bike Stack
       System.out.print("\nNormal Bikes:\n");
       ReturnBikeStack bike=new ReturnBikeStack();
       NormalBike bike1=new NormalBike(121245,"NCI Spenser Dock");
       bike.push(bike1);
       NormalBike bike2=new NormalBike(128745,"NCI Spenser Dock");
       bike.push(bike2);
       System.out.println(bike.displayStack());
       */
       
       
    }
}
