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

public class ItemFlexigenActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;

    // "Add to cart" button and counter
    private int counter;
    private View btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_flexigen);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Connects app activity with Analytics
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        btnAdd = findViewById(R.id.addToCart);
        counter = Persist.readValue(this, "FLEXIGEN");

        // Increments "Add to cart" counter
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /** Create bundle for the item that appears on screen */
                Bundle itemFlexigen = new Bundle();
                itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_ID, "b55da");
                itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_NAME, "Flexigen T-Shirt");
                itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
                itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Black");
                itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Flexigen");
                itemFlexigen.putDouble(FirebaseAnalytics.Param.PRICE, 16.00);

                Bundle itemFlexigenCart = new Bundle(itemFlexigen);
                itemFlexigenCart.putLong(FirebaseAnalytics.Param.QUANTITY, 1);

                Bundle addToCartParams = new Bundle();
                addToCartParams.putString(FirebaseAnalytics.Param.CURRENCY, "USD");
                addToCartParams.putDouble(FirebaseAnalytics.Param.VALUE, 16.00);
                addToCartParams.putParcelableArray(FirebaseAnalytics.Param.ITEMS,
                        new Parcelable[]{ itemFlexigenCart });

                mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.ADD_TO_CART, addToCartParams);

                counter++;
                Persist.writeValue(getApplicationContext(), counter, "FLEXIGEN");
            }
        });

        // Creates titles and actions for items in the action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Ibby's T-Shirt Shop");
    }

    /** Activates after clicking the "Add to wishlist" button */
    public void addToWishlist(View view) {
        /** Create bundle for the item that appears on screen */
        Bundle itemFlexigen = new Bundle();
        itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_ID, "b55da");
        itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_NAME, "Flexigen T-Shirt");
        itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Black");
        itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Flexigen");
        itemFlexigen.putDouble(FirebaseAnalytics.Param.PRICE, 16.00);

        Bundle itemFlexigenWishlist = new Bundle(itemFlexigen);
        itemFlexigenWishlist.putLong(FirebaseAnalytics.Param.QUANTITY, 1);

        Bundle addToWishlistParams = new Bundle();
        addToWishlistParams.putString(FirebaseAnalytics.Param.CURRENCY, "USD");
        addToWishlistParams.putDouble(FirebaseAnalytics.Param.VALUE, 16.00);
        addToWishlistParams.putParcelableArray(FirebaseAnalytics.Param.ITEMS,
                new Parcelable[]{ itemFlexigenWishlist });

        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.ADD_TO_WISHLIST, addToWishlistParams);

        Intent intent = new Intent(ItemFlexigenActivity.this, ProductsActivity.class);
        startActivity(intent);
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
            startActivity(new Intent(ItemFlexigenActivity.this, MainActivity.class));
        }
        if (item.getItemId() == R.id.cart) {
            startActivity(new Intent(ItemFlexigenActivity.this, CartActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

}