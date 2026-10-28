
package javaapplication29;


public class SharedRide extends EconomyRide{
    
    private int passangerCount;
    
    public SharedRide(String passangerName, String pickup, String destination, double distanceKm, double pricePerKm, int durationMin, double pricePerMinute,int passangerCount) {
        super(passangerName, pickup, destination, distanceKm, pricePerKm, durationMin, pricePerMinute);
        this.passangerCount=passangerCount;
    }
    
    public int getPassangerCount(){
        if(passangerCount<4&&passangerCount>1){
            return passangerCount;
        }else{
            System.out.println(" Passanger cant be bigger than 4 and less than 1 ! So it changed with 1 !!");
            return 1;
        }
    }
    
    @Override
    public double calculateFare(){
        return (super.calculateFare()/getPassangerCount())*110/100;
    }
    
    @Override
    public String toString(){
        return super.toString()+ " Passanger Count : " + getPassangerCount();
    }
    
}
