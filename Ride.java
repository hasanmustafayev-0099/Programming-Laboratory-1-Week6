
package javaapplication29;


public class Ride {
    
    protected String passangerName , pickup, destination;
    protected double distanceKm , pricePerKm;
    protected int durationMin;
    
    public Ride(String passangerName, String pickup , String destination, double distanceKm,double pricePerKm, int durationMin){
        this.passangerName=passangerName;
        this.pickup=pickup;
        this.destination=destination;
        this.distanceKm=distanceKm;
        this.durationMin=durationMin;
        this.pricePerKm=pricePerKm;
    }
    
    public String getPassangerName(){
        return passangerName;
    }
    public String getPickup(){
        return pickup;
    }
    public String getDestination(){
        return destination;
    }
    public double getDistanceKm(){
        return distanceKm;
    }
    public double getPricePerKm(){
        return pricePerKm;
    }
    public int getDurationMin(){
        return durationMin;
    }
    
    public double calculateFare(){
        return getDistanceKm()*getPricePerKm();
    }
    
    public String toString(){
        return "İsim : " + getPassangerName() + " Nereden : " + getPickup() + " Nereye : " + getDestination() + " Kaç km: " + getDistanceKm() + " Kaç Dk : " + getDurationMin() + " Km Başına Ücret : " + getPricePerKm() + " Toplam Ücret : " + calculateFare() ; 
    }
    
    
}
