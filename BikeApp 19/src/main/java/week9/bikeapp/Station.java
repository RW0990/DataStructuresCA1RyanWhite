/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9.bikeapp;

/**
 *
 * @author ryanwhite
 */
public class Station{
    private int stationNo;
    private String stationName;
    private int bikeAmnt;
    private int distanceCal;
    
    public Station(int stationNo, String stationName, int bikeAmnt,int distanceCal){
        this.stationNo=stationNo;
        this.stationName=stationName;
        this.bikeAmnt=bikeAmnt;
        this.distanceCal=distanceCal;
    }

    public String getStationName() {
        return stationName;
    }

    public int getStationNo() {
        return stationNo;
    }

    public int getBikeAmnt() {
        return bikeAmnt;
    }

    public int getDistanceCal() {
        return distanceCal;
    }
    
    public void setStationNo(int stationNo) {
        this.stationNo = stationNo;
    }
    
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }
    
    public void setBikeAmnt(int bikeAmnt) {
        this.bikeAmnt = bikeAmnt;
    }

    public void setDistanceCal(int distanceCal) {
        this.distanceCal = distanceCal;
    }
    
    
    public void addBike(){
        bikeAmnt++;
    }
    public void removeBike(){
        bikeAmnt--;
    }
    
    public String getStationInfo(){
        return "Station No:"+stationNo+"\nStation Name: "+stationName+"\nAmount of Bikes: "+bikeAmnt;
    }
    @Override
    public String toString(){
        return getStationInfo();
    }
    
    
    
}
