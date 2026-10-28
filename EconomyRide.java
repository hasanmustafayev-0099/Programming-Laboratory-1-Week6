
package javaapplication29;


public class EconomyRide extends Ride{
    
    private double pricePerMinute;
    
    public EconomyRide(String passangerName, String pickup, String destination, double distanceKm, double pricePerKm, int durationMin,double pricePerMinute) {
        super(passangerName, pickup, destination, distanceKm, pricePerKm, durationMin);
        this.pricePerMinute=pricePerMinute;
    }
    
    @Override
    public double calculateFare(){
        if(super.calculateFare()+(durationMin*pricePerMinute)<50){
            return 50;
        }else{
            return super.calculateFare()+(durationMin*pricePerMinute);
        }
    }
    
    @Override
    public String toString(){
        return super.toString() + " Price Per Minute: " + pricePerMinute;
    }
    
    
    
}
