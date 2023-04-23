package com.geekster.RestaurantModel.Service;

import com.geekster.RestaurantModel.Repo.ModelDao;
import com.geekster.RestaurantModel.Restaurant.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelService {

    @Autowired
    ModelDao modelDao;

    public List<Restaurant> getAllRestaurant(){
        return modelDao.getRestaurantList();
    }

    public String addRestaurant(Restaurant restaurant) {
        boolean addedStatus = modelDao.add(restaurant);
        if(addedStatus) return "Restaurant added successfully";
        return "Restaurant addition failed..!!";
    }

    public Restaurant restaurantGetById(String restaurantId) {
        List<Restaurant> restaurantList = modelDao.getRestaurantList();
        for(Restaurant restaurant : restaurantList){
            if(restaurant.getRestaurantId().equals(restaurantId))
                return restaurant;
        }
        return null;
    }

    public boolean updateRestaurantById(String restaurantId,String restaurantName) {
        List<Restaurant> restaurantList = modelDao.getRestaurantList();
        for(Restaurant restaurant : restaurantList){
            if(restaurant.getRestaurantId().equals(restaurantId)){
                //remove original
                modelDao.remove(restaurant);

                restaurant.setRestaurantName(restaurantName);

                modelDao.add(restaurant);
                return true;
            }
        }
        return false;
    }

    public String removeRestaurantByRestaurantId(String restaurantId) {
        String status = "";
        boolean dResponse = false;
        if(restaurantId != null){
            List<Restaurant> restaurantList = modelDao.getRestaurantList();
            for(Restaurant restaurant : restaurantList){
                if(restaurant.getRestaurantId().equals(restaurantId)) {
                    dResponse = modelDao.remove(restaurant);
                    if (dResponse)
                        status = "RestaurantId " + restaurantId + " deleted successfully";
                    else
                        status = "RestaurantId " + restaurantId + " was not found";
                    return status;
                }
            }
        }
        return "RestaurantId "+restaurantId +" was not found..!!!";
    }
}
