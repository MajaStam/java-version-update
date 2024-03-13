package com.cydeo;

import com.cydeo.TASK.Dish;
import com.cydeo.TASK.DishData;

import java.util.Optional;

public class FindingMatching {
    public static void main(String[] args) {
        System.out.println("All match");
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(isHealthy);

        System.out.println("ANY MATCH");
        if (DishData.getAll().stream().anyMatch(Dish::isVegeterian)) {
            System.out.println("The menu is vegetarian friendly");
        }

        System.out.println("NONE MATCH");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println(isHealthy2);

        System.out.println("FIND ANY");
        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegeterian).findAny();
        System.out.println(dish.get());


    }



}
