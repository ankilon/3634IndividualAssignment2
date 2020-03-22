package com.example.top10restaurants;

import java.util.ArrayList;

public class Restaurants {
    private String name;
    private String location;
    private String cuisine;
    private String rating;

    public Restaurants() {

    }

    public Restaurants(String name, String location, String cuisine, String rating) {

        this.name = name;
        this.location = location;
        this.cuisine = cuisine;
        this.rating = rating;
    }

    public String getName()  {
        return name;
    }
    public void setName(String name)  {
        this.name = name;
    }

    public String getLocation( )  {
        return location;
    }
    public void setLocation()  {
        this.location = location;
    }

    public String getCuisine()   {
        return cuisine;
    }
    public void setCuisine()  {
        this.cuisine=cuisine;
    }

    public String getRating()  {
        return rating;
    }
    public void setRating()  {
        this.rating=rating;
    }

    public static ArrayList<Restaurants> getRestaurants(){
        ArrayList<Restaurants> restaurants= new ArrayList<>();
        restaurants.add(new Restaurants("Kinn", "Castle Hill", "Thai", "5/5" ));
        restaurants.add(new Restaurants("Bar Luca", "Circular Quay", "Burgers", "5/5" ));
        restaurants.add(new Restaurants("Jimmy's Kebabs", "Baulkham Hills", "Turkish", "4/5" ));
        restaurants.add(new Restaurants("Time for Thai", "Kensington", "Thai", "4/5" ));
        restaurants.add(new Restaurants("Messina", "Circular Quay", "Dessert", "4/5" ));
        restaurants.add(new Restaurants("Taste of Shanghai", "Castle Hill", "Chinese", "3/5" ));
        restaurants.add(new Restaurants("Jongajip", "Eastwood", "Korean", "3/5" ));
        restaurants.add(new Restaurants("El Camino Camina", "The Rocks", "Mexican", "3/5" ));
        restaurants.add(new Restaurants("Chicken V", "Town Hall", "Korean", "3/5" ));
        restaurants.add(new Restaurants("Xang Guo Fuo", "Town Hall", "Chinese", "3/5" ));


        return restaurants;
    }

}

