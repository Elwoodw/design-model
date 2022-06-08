package com.pingan.creationalpatterns.builderpattern;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder=new MealBuilder();
        Meal vegMeal=mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println(vegMeal.cost());
        Meal nonVegMeal=mealBuilder.prepareNonVegMeal();
        System.out.println("Non-Veg Meal");
        nonVegMeal.showItems();
        System.out.println(nonVegMeal.cost());

    }
}
