package com.exemplary.androidappforgoogleanalytics4;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ItemFuelworksActivity extends AppCompatActivity {

    // "Add to cart" button and counter
    private int counter;
    private View btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_fuelworks);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnAdd = findViewById(R.id.addToCart);
        counter = Persist.readValue(this, "FUELWORKS");

        // Increments "Add to cart" counter
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                Persist.writeValue(getApplicationContext(), counter, "FUELWORKS");
            }
        });

        // Creates titles and actions for items in the action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Ibby's T-Shirt Shop");
    }

    /** Creates the options in the action bar */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /** Sets the actions for the items in the action bar */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.home) {
            startActivity(new Intent(ItemFuelworksActivity.this, MainActivity.class));
        }
        if (item.getItemId() == R.id.cart) {
            startActivity(new Intent(ItemFuelworksActivity.this, CartActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

}