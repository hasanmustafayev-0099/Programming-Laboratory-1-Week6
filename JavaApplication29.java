
package javaapplication29;

import java.util.ArrayList;


public class JavaApplication29 {

    
    public static void main(String[] args) {
        
        ArrayList<Ride> yolcu = new ArrayList<>();
        
        PremiumRide p = new PremiumRide("Furkan", "Niğde", "Kayseri", 5, 6, 2, 2, 30);
        Ride r = new Ride("Hasan", "Kayseri", "Ankara", 200, 1, 50);
        EconomyRide e = new EconomyRide("Erdem", "İstanbul", "Bursa", 200, 40, 3, 2);
        SharedRide s = new SharedRide("Mehmet", "Ağrı", "Kars", 50, 15, 2, 1, 3);
        yolcu.add(p);
        yolcu.add(r);
        yolcu.add(e);
        yolcu.add(s);
        
        for(Ride yolcular: yolcu){
            System.out.println(yolcular.toString());
        }
        
    }
    
}
