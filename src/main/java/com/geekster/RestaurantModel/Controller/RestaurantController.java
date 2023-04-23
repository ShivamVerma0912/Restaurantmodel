package com.geekster.RestaurantModel.Controller;

import com.geekster.RestaurantModel.Restaurant.Restaurant;
import com.geekster.RestaurantModel.Service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    ModelService modelService;

    @PostMapping("/restaurant")
    public String postRestaurant(@RequestBody Restaurant restaurant){

        return modelService.addRestaurant(restaurant);
    }

    @GetMapping("/restaurant/{restaurantId}")
    public Restaurant getRestaurantByID(@PathVariable String restaurantId){
        return modelService.restaurantGetById(restaurantId);
    }

    @GetMapping("/restaurant")
    public List<Restaurant> getRestaurant(){
        return modelService.getAllRestaurant();
    }

    @PutMapping(value = "/restaurant/{restaurantId}/{restaurantName}")
    public String updateRestaurant(@PathVariable String restaurantId,@PathVariable String restaurantName){
        return modelService.updateRestaurantById(restaurantId,restaurantName)? "Updated successfully":"Not found restaurant with this id..!!";
    }
    @DeleteMapping(value = "/restaurant/{restaurantId}")
    public String deleteUserByUserId(@PathVariable String restaurantId){
        return modelService.removeRestaurantByRestaurantId(restaurantId);
    }


}
