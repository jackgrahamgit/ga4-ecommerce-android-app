package com.exemplary.itsAnApp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.firebase.analytics.FirebaseAnalytics;

public class ItemFuelworksActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;
    private int counter;
    private View btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_fuelworks);

        // Connects app activity with Analytics
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
    }

    public void addToCart(View view) {
        // Gets the button by ID from the XML file
        btnAdd = findViewById(R.id.addToCart);

        // Reads the value using the method in Persist.java
        counter = Persist.readValue(this, "FUELWORKS");

        Bundle itemFuelworks = new Bundle();
        itemFuelworks.putString(FirebaseAnalytics.Param.ITEM_ID, "bc823");
        itemFuelworks.putString(FirebaseAnalytics.Param.ITEM_NAME, "Fuelworks T-Shirt");
        itemFuelworks.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemFuelworks.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Pink");
        itemFuelworks.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Fuelworks");
        itemFuelworks.putDouble(FirebaseAnalytics.Param.PRICE, 92.00);

        Bundle itemFuelworksCart = new Bundle(itemFuelworks);
        itemFuelworksCart.putLong(FirebaseAnalytics.Param.QUANTITY, 1);

        Bundle addToCartParams = new Bundle();
        addToCartParams.putString(FirebaseAnalytics.Param.CURRENCY, "USD");
        addToCartParams.putDouble(FirebaseAnalytics.Param.VALUE, 16.00);
        addToCartParams.putParcelableArray(FirebaseAnalytics.Param.ITEMS,
                new Parcelable[]{ itemFuelworksCart });

        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.ADD_TO_CART, addToCartParams);

        counter++;
        Persist.writeValue(getApplicationContext(), counter, "FUELWORKS");

        Intent intent = new Intent(ItemFuelworksActivity.this, ProductsActivity.class);
        startActivity(intent);
    }

    // Activates after clicking the "Add to wishlist" button
    public void addToWishlist(View view) {
        Bundle itemFuelworks = new Bundle();
        itemFuelworks.putString(FirebaseAnalytics.Param.ITEM_ID, "bc823");
        itemFuelworks.putString(FirebaseAnalytics.Param.ITEM_NAME, "Fuelworks T-Shirt");
        itemFuelworks.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemFuelworks.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Pink");
        itemFuelworks.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Fuelworks");
        itemFuelworks.putDouble(FirebaseAnalytics.Param.PRICE, 92.00);

        Bundle itemFuelworksWishlist = new Bundle(itemFuelworks);
        itemFuelworksWishlist.putLong(FirebaseAnalytics.Param.QUANTITY, 1);

        Bundle addToWishlistParams = new Bundle();
        addToWishlistParams.putString(FirebaseAnalytics.Param.CURRENCY, "USD");
        addToWishlistParams.putDouble(FirebaseAnalytics.Param.VALUE, 92.00);
        addToWishlistParams.putParcelableArray(FirebaseAnalytics.Param.ITEMS,
                new Parcelable[]{ itemFuelworksWishlist });

        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.ADD_TO_WISHLIST, addToWishlistParams);

        Intent intent = new Intent(ItemFuelworksActivity.this, ProductsActivity.class);
        startActivity(intent);
    }

    // Creates the options in the action bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // Sets the actions for the items in the action bar
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