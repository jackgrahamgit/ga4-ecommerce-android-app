package com.exemplary.itsAnApp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/* Import dependencies for navigating to new screen */
import android.content.Intent;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* Import dependencies for Firebase */
import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;
//    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connects app activity with Analytics
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        Bundle itemFlexigen = new Bundle();
        itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_ID, "b55da");
        itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_NAME, "Flexigen T-Shirt");
        itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Black");
        itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Flexigen");
        itemFlexigen.putDouble(FirebaseAnalytics.Param.PRICE, 16.00);

        Bundle promoParams = new Bundle();
        promoParams.putString(FirebaseAnalytics.Param.PROMOTION_ID, "SUMMER_DISCOUNT");
        promoParams.putString(FirebaseAnalytics.Param.PROMOTION_NAME, "Summer Sale");
        promoParams.putString(FirebaseAnalytics.Param.CREATIVE_NAME, "Summer Promotion");
        promoParams.putString(FirebaseAnalytics.Param.CREATIVE_SLOT, "Featured Product");
        promoParams.putString(FirebaseAnalytics.Param.LOCATION_ID, "HOME_BANNER");
        promoParams.putParcelableArray(FirebaseAnalytics.Param.ITEMS,
                new Parcelable[]{ itemFlexigen });

        // Promotion selected
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.VIEW_PROMOTION, promoParams);
    }

    public void openEcommerce(View view) {
        Intent intent = new Intent(MainActivity.this, ProductsActivity.class);
        startActivity(intent);
    }

    public void openPromotion(View view) {
        Bundle itemFlexigen = new Bundle();
        itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_ID, "b55da");
        itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_NAME, "Flexigen T-Shirt");
        itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Black");
        itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Flexigen");
        itemFlexigen.putDouble(FirebaseAnalytics.Param.PRICE, 16.00);

        Bundle promoParams = new Bundle();
        promoParams.putString(FirebaseAnalytics.Param.PROMOTION_ID, "SUMMER_DISCOUNT");
        promoParams.putString(FirebaseAnalytics.Param.PROMOTION_NAME, "Summer Sale");
        promoParams.putString(FirebaseAnalytics.Param.CREATIVE_NAME, "Summer Promotion");
        promoParams.putString(FirebaseAnalytics.Param.CREATIVE_SLOT, "Featured Product");
        promoParams.putString(FirebaseAnalytics.Param.LOCATION_ID, "HOME_BANNER");
        promoParams.putParcelableArray(FirebaseAnalytics.Param.ITEMS,
                new Parcelable[]{ itemFlexigen });

        // Promotion selected
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_PROMOTION, promoParams);

        Intent intent = new Intent(MainActivity.this, ItemFlexigenActivity.class);
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
            startActivity(new Intent(MainActivity.this, MainActivity.class));
        }
        if (item.getItemId() == R.id.cart) {
            startActivity(new Intent(MainActivity.this, CartActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}