package com.example.Restaurant_model.service;

import com.example.Restaurant_model.model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class RestaurantService {

    private static List<Restaurant> restaurants = new ArrayList<>();
    private static int restaurant_count = 0;
    static{
        restaurants.add(new Restaurant(++restaurant_count,"ABC","Mumbai","98****4521","Due to food items",20));
        restaurants.add(new Restaurant(++restaurant_count,"DEF","Bangalore","99****4545","Due to food prices",20));
        restaurants.add(new Restaurant(++restaurant_count,"GHI","Hyderabad","97****2121","Due to location",30));
        restaurants.add(new Restaurant(++restaurant_count,"JKL","Pune","62****4011","Due to service",40));
        restaurants.add(new Restaurant(++restaurant_count,"NMO","Kolkata","98****4481","Due to restaurant's environment",25));
        restaurants.add(new Restaurant(++restaurant_count,"PQR","Delhi","90****3331","Due to decoration",28));

    }

    public static List<Restaurant> findAll(){
        return restaurants;
    }
    public Restaurant findByStaff(int total_staff){
        Predicate<? super Restaurant> predicate = restaurant -> restaurant.getTotal_staff()==total_staff;
        Restaurant restaurant = restaurants.stream().filter(predicate).findFirst().get();
        return restaurant;
    }

    public void addRestaurant(Restaurant restaurant){
        restaurants.add(restaurant);
    }

}

