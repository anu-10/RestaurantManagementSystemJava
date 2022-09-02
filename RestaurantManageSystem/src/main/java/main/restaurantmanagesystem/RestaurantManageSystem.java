package main.restaurantmanagesystem;
import LoadingScreen.SplashScreen;

import LoginScreen.LoginPage;

import java.util.logging.Level;
import java.util.logging.Logger;



        
public class RestaurantManageSystem {

    public static void main(String[] args) {
        SplashScreen LS = new SplashScreen();
        LS.setVisible(true);
        
        // ADD THE RESOURCE LOADING CODE HERE
        
        for ( int i=0; i<10; ++i)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex.toString());
            }
            
        }
        LS.dispose();
        LoginPage LP = new LoginPage();
        LP.setVisible(true);
        
        
    }
}
