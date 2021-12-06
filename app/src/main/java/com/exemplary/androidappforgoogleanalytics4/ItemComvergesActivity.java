package com.exemplary.androidappforgoogleanalytics4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

/** Import dependencies for Firebase */
import com.google.firebase.analytics.FirebaseAnalytics;

public class ItemComvergesActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;

    // "Add to cart" button and counter
    private int counter;
    private View btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_comverges);

        // Connects app activity with Analytics
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        btnAdd = findViewById(R.id.addToCart);
        counter = Persist.readValue(this, "COMVERGES");

        // Increments "Add to cart" counter
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /** Create bundle for the item that appears on screen */
                Bundle itemCompton = new Bundle();
                itemCompton.putString(FirebaseAnalytics.Param.ITEM_ID, "MAIN f6be8");
                itemCompton.putString(FirebaseAnalytics.Param.ITEM_NAME, "MAIN Comverges T-Shirt");
                itemCompton.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "MAIN T-Shirts");
                itemCompton.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "MAIN Black");
                itemCompton.putString(FirebaseAnalytics.Param.ITEM_BRAND, "MAIN Comverges");
                itemCompton.putDouble(FirebaseAnalytics.Param.PRICE, 33.00);

                Bundle itemComptonCart = new Bundle(itemCompton);
                itemComptonCart.putLong(FirebaseAnalytics.Param.QUANTITY, 1);

                Bundle addToCartParams = new Bundle();
                addToCartParams.putString(FirebaseAnalytics.Param.CURRENCY, "USD");
                addToCartParams.putDouble(FirebaseAnalytics.Param.VALUE, 33.00);
                addToCartParams.putParcelableArray(FirebaseAnalytics.Param.ITEMS,
                        new Parcelable[]{ itemComptonCart });

                mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.ADD_TO_CART, addToCartParams);

                counter++;
                Persist.writeValue(getApplicationContext(), counter, "COMVERGES");
            }
        });
    }

    /** Activates after clicking the "Add to cart" button */
    public void addToCart(View view) {
        /** Create bundle for the item that appears on screen */
        Bundle itemCompton = new Bundle();
        itemCompton.putString(FirebaseAnalytics.Param.ITEM_ID, "f6be8");
        itemCompton.putString(FirebaseAnalytics.Param.ITEM_NAME, "Comverges T-Shirt");
        itemCompton.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemCompton.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Black");
        itemCompton.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Comverges");
        itemCompton.putDouble(FirebaseAnalytics.Param.PRICE, 33.00);

        Bundle itemComptonCart = new Bundle(itemCompton);
        itemComptonCart.putLong(FirebaseAnalytics.Param.QUANTITY, 1);

        Bundle addToCartParams = new Bundle();
        addToCartParams.putString(FirebaseAnalytics.Param.CURRENCY, "USD");
        addToCartParams.putDouble(FirebaseAnalytics.Param.VALUE, 33.00);
        addToCartParams.putParcelableArray(FirebaseAnalytics.Param.ITEMS,
                new Parcelable[]{ itemComptonCart });

        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.ADD_TO_CART, addToCartParams);
    }

    /** Activates after clicking the "Add to wishlist" button */
    public void addToWishlist(View view) {
        /** Create bundle for the item that appears on screen */
        Bundle itemCompton = new Bundle();
        itemCompton.putString(FirebaseAnalytics.Param.ITEM_ID, "f6be8");
        itemCompton.putString(FirebaseAnalytics.Param.ITEM_NAME, "Comverges T-Shirt");
        itemCompton.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemCompton.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Black");
        itemCompton.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Comverges");
        itemCompton.putDouble(FirebaseAnalytics.Param.PRICE, 33.00);

        Bundle itemComptonWishlist = new Bundle(itemCompton);
        itemComptonWishlist.putLong(FirebaseAnalytics.Param.QUANTITY, 1);

        Bundle addToWishlistParams = new Bundle();
        addToWishlistParams.putString(FirebaseAnalytics.Param.CURRENCY, "USD");
        addToWishlistParams.putDouble(FirebaseAnalytics.Param.VALUE, 33.00);
        addToWishlistParams.putParcelableArray(FirebaseAnalytics.Param.ITEMS,
                new Parcelable[]{ itemComptonWishlist });

        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.ADD_TO_WISHLIST, addToWishlistParams);

        Intent intent = new Intent(ItemComvergesActivity.this, ProductsActivity.class);
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
            startActivity(new Intent(ItemComvergesActivity.this, MainActivity.class));
        }
        if (item.getItemId() == R.id.cart) {
            startActivity(new Intent(ItemComvergesActivity.this, CartActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

}