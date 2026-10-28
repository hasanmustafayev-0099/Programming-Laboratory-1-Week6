
package javaapplication29;


public class PremiumRide extends Ride{
    
    private int comfortFee;
    private double surgeMultiplier;
    
    public PremiumRide(String passangerName, String pickup, String destination, double distanceKm, double pricePerKm, int durationMin,int comfortFee,double surgeMultiplier) {
        super(passangerName, pickup, destination, distanceKm, pricePerKm, durationMin);
        this.comfortFee=comfortFee;
        this.surgeMultiplier=surgeMultiplier;
    }
    
    public int getComfortFee(){
        return comfortFee;
    }
    public double getSurgeMultiplier(){
        if(surgeMultiplier<3&&surgeMultiplier>1){
            return surgeMultiplier;
        }else{
            System.out.println("Uyarı ! Surge Multiplier 1 ile deiştirildi . ");
            return 1;
        }
    }
    
    @Override
    public double calculateFare(){
        return (super.calculateFare() + getComfortFee())*getSurgeMultiplier();
    }
    
    @Override
    public String toString(){
        return super.toString() + " Comfort Fee :" + getComfortFee() + " Surge : " + getSurgeMultiplier();
    }
    
}
