package com.cydeo.TASK;

import java.util.Arrays;
import java.util.List;

public class DishData {


    public static List<Dish> getAll(){
        return Arrays.asList(
                new Dish("pork",false,800,Type.MEAT),
                new Dish("beef",false,700,Type.MEAT),
                new Dish("chicken",false,400,Type.MEAT),
                new Dish("fries",true,500,Type.OTHER),
                new Dish("rice",false,400,Type.OTHER),
                new Dish("fruit",true,400,Type.OTHER),
                new Dish("pizza",true,200,Type.OTHER),
                new Dish("prawns",false,900,Type.FISH),
                new Dish("salmon",false,400,Type.FISH)
        );


    }

}
