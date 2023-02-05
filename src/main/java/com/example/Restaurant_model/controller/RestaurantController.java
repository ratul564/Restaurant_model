package com.example.Restaurant_model.controller;

import com.example.Restaurant_model.model.Restaurant;
import com.example.Restaurant_model.service.RestaurantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fm1/res-app")
public class RestaurantController {

    private final RestaurantService restaurantService;
    public RestaurantController(RestaurantService restaurantService){
          this.restaurantService = restaurantService;
    }

    @GetMapping("find-all")
    public List<Restaurant> findAllRestaurant(){
        return RestaurantService.findAll();
    }

    @GetMapping("/find/total_staff/{total_staff}")
    public Restaurant findByName(@PathVariable int total_staff){
        return restaurantService.findByStaff(total_staff);
    }

    @PostMapping("add-restaurant")
    public void addRestaurant(@RequestBody Restaurant restaurant){
        restaurantService.addRestaurant((restaurant));
    }

}




