package com.cydeo;

import com.cydeo.TASK.Dish;
import com.cydeo.TASK.DishData;
import com.cydeo.TASK.Type;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);
        List<Integer> numberList = numbers.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(numberList);
        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);

        List<Integer> numberList2 = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toList());

        Set<Integer> numberSet2 = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toSet());

        Map<String,Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println(dishMap);

        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        Long evenCount = numbers.stream()
                .filter(x -> x%2 == 0)
                .collect(Collectors.counting());
        System.out.println(evenCount);

        Double calorieAverage = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(calorieAverage);


        List<String> courses = Arrays.asList("Java","JS","TS");
        String str = courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);

        Map<Boolean,List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegeterian));
        System.out.println(veggieDish);

        Map<Type,List<Dish>> dishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);







    }



}
