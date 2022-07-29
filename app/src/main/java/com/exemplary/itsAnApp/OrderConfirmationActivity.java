package com.exemplary.itsAnApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.Random;

public class OrderConfirmationActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;
    private int counterCompton, counterComverges, counterFlexigen, counterFuelworks, total, transactionID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_confirmation);

        // Connects app activity with Analytics
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
    }

    public void openHome(View view) {
        Intent intent = new Intent(OrderConfirmationActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void getRefund(View view) {
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

        counterCompton = Persist.readValue(this, "COMPTON");
        counterComverges = Persist.readValue(this, "COMVERGES");
        counterFlexigen = Persist.readValue(this, "FLEXIGEN");
        counterFuelworks = Persist.readValue(this, "FUELWORKS");
        total = counterCompton*44+counterComverges*33+counterFlexigen*16+counterFuelworks*92;

        Random rand = new Random();
        transactionID = rand.nextInt(99999);

        Bundle refundParams = new Bundle();
        refundParams.putString(FirebaseAnalytics.Param.TRANSACTION_ID, String.valueOf(transactionID));
        refundParams.putString(FirebaseAnalytics.Param.AFFILIATION, "Ibby's T-Shirt Shop");
        refundParams.putString(FirebaseAnalytics.Param.CURRENCY, "USD");
        refundParams.putDouble(FirebaseAnalytics.Param.VALUE, total);

        refundParams.putParcelableArray(FirebaseAnalytics.Param.ITEMS,
                new Parcelable[]{ itemComptonCart, itemComvergesCart, itemFlexigenCart, itemFuelworksCart });

        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.REFUND, refundParams);

        Intent intent = new Intent(OrderConfirmationActivity.this, MainActivity.class);
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
            startActivity(new Intent(OrderConfirmationActivity.this, MainActivity.class));
        }
        if (item.getItemId() == R.id.cart) {
            startActivity(new Intent(OrderConfirmationActivity.this, CartActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}