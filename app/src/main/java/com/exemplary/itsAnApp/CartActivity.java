package com.exemplary.itsAnApp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView; // Pass value through Intent

import com.google.firebase.analytics.FirebaseAnalytics;

public class CartActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;

    private TextView comptonQuantity, comptonPrice,
            comvergesQuantity, comvergesPrice,
            flexigenQuantity, flexigenPrice,
            fuelworksQuantity, fuelworksPrice,
            totalPrice;
    private int counterCompton, counterComverges, counterFlexigen, counterFuelworks, total;
    private View removeCompton, removeComverges, removeFlexigen, removeFuelworks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        // Connects app activity with Analytics
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        Bundle itemCompton = new Bundle();
        itemCompton.putString(FirebaseAnalytics.Param.ITEM_ID, "9bdd2");
        itemCompton.putString(FirebaseAnalytics.Param.ITEM_NAME, "Compton T-Shirt");
        itemCompton.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemCompton.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Yellow");
        itemCompton.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Compton");
        itemCompton.putDouble(FirebaseAnalytics.Param.PRICE, 44.00);

        Bundle itemComptonCart = new Bundle(itemCompton);
        itemComptonCart.putLong(FirebaseAnalytics.Param.QUANTITY, counterCompton);

        Bundle itemComverges = new Bundle();
        itemComverges.putString(FirebaseAnalytics.Param.ITEM_ID, "f6be8");
        itemComverges.putString(FirebaseAnalytics.Param.ITEM_NAME, "Comverges T-Shirt");
        itemComverges.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemComverges.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Gray");
        itemComverges.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Comverges");
        itemComverges.putDouble(FirebaseAnalytics.Param.PRICE, 33.00);

        Bundle itemComvergesCart = new Bundle(itemComverges);
        itemComvergesCart.putLong(FirebaseAnalytics.Param.QUANTITY, counterComverges);

        Bundle itemFlexigen = new Bundle();
        itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_ID, "b55da");
        itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_NAME, "Flexigen T-Shirt");
        itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Black");
        itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Flexigen");
        itemFlexigen.putDouble(FirebaseAnalytics.Param.PRICE, 16.00);

        Bundle itemFlexigenCart = new Bundle(itemFlexigen);
        itemFlexigenCart.putLong(FirebaseAnalytics.Param.QUANTITY, counterFlexigen);

        Bundle itemFuelworks = new Bundle();
        itemFuelworks.putString(FirebaseAnalytics.Param.ITEM_ID, "bc823");
        itemFuelworks.putString(FirebaseAnalytics.Param.ITEM_NAME, "Fuelworks T-Shirt");
        itemFuelworks.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemFuelworks.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Pink");
        itemFuelworks.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Fuelworks");
        itemFuelworks.putDouble(FirebaseAnalytics.Param.PRICE, 92.00);

        Bundle itemFuelworksCart = new Bundle(itemFuelworks);
        itemFuelworksCart.putLong(FirebaseAnalytics.Param.QUANTITY, counterFuelworks);

        // Number of times user adds compton to their cart
        comptonQuantity = findViewById(R.id.comptonQuantity);
        comptonPrice = findViewById(R.id.comptonPrice);
        counterCompton = Persist.readValue(this, "COMPTON");
        comptonQuantity.setText("" + counterCompton); // Compton quantity
        comptonPrice.setText("$" + counterCompton*44); // Compton subtotal

        // Removes compton from cart
        removeCompton = findViewById(R.id.removeCompton);
        removeCompton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle removeCartParams = new Bundle();
                removeCartParams.putString(FirebaseAnalytics.Param.CURRENCY, "USD");
                removeCartParams.putDouble(FirebaseAnalytics.Param.VALUE, (counterCompton * 44.00));
                removeCartParams.putParcelableArray(FirebaseAnalytics.Param.ITEMS,
                        new Parcelable[]{ itemComptonCart });

                mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.REMOVE_FROM_CART, removeCartParams);

                Persist.deleteValue(getApplicationContext(), "COMPTON");
                startActivity(new Intent(CartActivity.this, CartActivity.class));
            }
        });

        // Number of times user adds comverges to their cart
        comvergesQuantity = findViewById(R.id.comvergesQuantity);
        comvergesPrice = findViewById(R.id.comvergesPrice);
        counterComverges = Persist.readValue(this, "COMVERGES");
        comvergesQuantity.setText("" + counterComverges); // Comverges quantity
        comvergesPrice.setText("$" + counterComverges*33); // Comverges subtotal

        // Removes comverges from cart
        removeComverges = findViewById(R.id.removeComverges);
        removeComverges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle removeCartParams = new Bundle();
                removeCartParams.putString(FirebaseAnalytics.Param.CURRENCY, "USD");
                removeCartParams.putDouble(FirebaseAnalytics.Param.VALUE, (counterComverges * 33.00));
                removeCartParams.putParcelableArray(FirebaseAnalytics.Param.ITEMS,
                        new Parcelable[]{ itemComvergesCart });

                mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.REMOVE_FROM_CART, removeCartParams);

                Persist.deleteValue(getApplicationContext(), "COMVERGES");
                startActivity(new Intent(CartActivity.this, CartActivity.class));
            }
        });

        // Number of times user adds flexigen to their cart
        flexigenQuantity = findViewById(R.id.flexigenQuantity);
        flexigenPrice = findViewById(R.id.flexigenPrice);
        counterFlexigen = Persist.readValue(this, "FLEXIGEN");
        flexigenQuantity.setText("" + counterFlexigen); // Flexigen quantity
        flexigenPrice.setText("$" + counterFlexigen*16); // Flexigen subtotal

        // Removes compton from cart
        removeFlexigen = findViewById(R.id.removeFlexigen);
        removeFlexigen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle removeCartParams = new Bundle();
                removeCartParams.putString(FirebaseAnalytics.Param.CURRENCY, "USD");
                removeCartParams.putDouble(FirebaseAnalytics.Param.VALUE, (counterFlexigen * 16.00));
                removeCartParams.putParcelableArray(FirebaseAnalytics.Param.ITEMS,
                        new Parcelable[]{ itemFlexigenCart });

                mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.REMOVE_FROM_CART, removeCartParams);

                Persist.deleteValue(getApplicationContext(), "FLEXIGEN");
                startActivity(new Intent(CartActivity.this, CartActivity.class));
            }
        });

        // Number of times user adds fuelworks to their cart
        fuelworksQuantity = findViewById(R.id.fuelworksQuantity);
        fuelworksPrice = findViewById(R.id.fuelworksPrice);
        counterFuelworks = Persist.readValue(this, "FUELWORKS");
        fuelworksQuantity.setText("" + counterFuelworks); // Fuelworks quantity
        fuelworksPrice.setText("$" + counterFuelworks*92); // Fuelworks subtotal

        // Removes compton from cart
        removeFuelworks = findViewById(R.id.removeFuelworks);
        removeFuelworks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle removeCartParams = new Bundle();
                removeCartParams.putString(FirebaseAnalytics.Param.CURRENCY, "USD");
                removeCartParams.putDouble(FirebaseAnalytics.Param.VALUE, (counterFuelworks * 92.00));
                removeCartParams.putParcelableArray(FirebaseAnalytics.Param.ITEMS,
                        new Parcelable[]{ itemFuelworksCart });

                mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.REMOVE_FROM_CART, removeCartParams);

                Persist.deleteValue(getApplicationContext(), "FUELWORKS");
                startActivity(new Intent(CartActivity.this, CartActivity.class));
            }
        });

        // Total cart value
        totalPrice = findViewById(R.id.totalPrice);
        total = counterCompton*44+counterComverges*33+counterFlexigen*16+counterFuelworks*92;
        totalPrice.setText("$" + total);

        // ================================================
        // View_cart event
        // ================================================
        Bundle viewCartParams = new Bundle();
        viewCartParams.putString(FirebaseAnalytics.Param.CURRENCY, "USD");
        viewCartParams.putDouble(FirebaseAnalytics.Param.VALUE, total);
        viewCartParams.putParcelableArray(FirebaseAnalytics.Param.ITEMS,
                new Parcelable[]{ itemComptonCart, itemComvergesCart, itemFlexigenCart, itemFuelworksCart });

        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.VIEW_CART, viewCartParams);
    }

    // Begin the checkout process
    public void openShippingInformation(View view) {
        Intent intent = new Intent(CartActivity.this, ShippingInformationActivity.class);
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
            startActivity(new Intent(CartActivity.this, MainActivity.class));
        }
        if (item.getItemId() == R.id.cart) {
            startActivity(new Intent(CartActivity.this, CartActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}