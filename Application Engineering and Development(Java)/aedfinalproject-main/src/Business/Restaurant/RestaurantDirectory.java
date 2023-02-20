/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    
    ArrayList<Restaurant> rl = new ArrayList<Restaurant>();
    
    public void addRestaurant(Restaurant restaurant){
        rl.add(restaurant);
    }

    public ArrayList<Restaurant> getRestaurantList() {
        return rl;
    }

    public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
        this.rl = restaurantList;
    }
    
    public void removeRestaurant(Restaurant restaurant){
        rl.remove(restaurant);
    }
    
}
