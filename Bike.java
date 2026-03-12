/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9.bikeapp;

/**
 *
 * @author ryanwhite
 */
public abstract class Bike{
    private int bikeNo;
    private boolean isAvailable;
    private String stationName;
    private double pricePerKm;
    
    public Bike(int bikeNo,String stationName,double pricePerKm){
        this.bikeNo=bikeNo;
        this.isAvailable=true;
        this.stationName=stationName;
        this.pricePerKm=pricePerKm;
    }

    public int getBikeNo() {
        return bikeNo;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getStationName() {
        return stationName;
    }

    public double getPricePerKm() {
        return pricePerKm;
    }

    public void setBikeNo(int bikeNo) {
        this.bikeNo = bikeNo;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public void setPricePerKm(double pricePerKm) {
        this.pricePerKm = pricePerKm;
    }
    
    public void startJourney(){
        isAvailable=false;
    }
    public void endJourney(String newStationName){
        isAvailable=true;
        stationName = newStationName;
    }
    
    public double calCost(double distance){
        return distance * pricePerKm;
    }
    public abstract String getBikeType();
    
    public String getDetails(){
        return "Bike No: "+bikeNo+"\nBike Type: "+getBikeType()+"\nAvailable: "+isAvailable+"\nAt station: "+stationName+"\n"+pricePerKm+" per KM.";
    }
    @Override
    public String toString(){
        return getDetails();
    }
}
