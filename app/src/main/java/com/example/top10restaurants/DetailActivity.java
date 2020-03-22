package com.example.top10restaurants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.NumberFormat;

public class DetailActivity extends AppCompatActivity {
    private Restaurants mRes;
    private TextView name;
    private TextView cuisine;
    private TextView location;
    private TextView rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        name = findViewById(R.id.ResName);
        cuisine = findViewById(R.id.cuisine);
        location = findViewById(R.id.location);
        rating = findViewById(R.id.RestRating);

        Intent intent = getIntent();
        int position = intent.getIntExtra(MainActivity.EXTRA_MESSAGE, 0);

        mRes = Restaurants.getRestaurants().get(position);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        setTitle(mRes.getName());
        name.setText(mRes.getName());
        cuisine.setText(mRes.getCuisine());
        location.setText(formatter.format(mRes.getLocation()));
        rating.setText(String.valueOf(mRes.getRating()));

    }

}
