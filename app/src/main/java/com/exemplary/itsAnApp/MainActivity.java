package com.exemplary.itsAnApp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/* Import dependencies for navigating to new screen */
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* Import dependencies for Firebase */
import com.google.android.gms.ads.LoadAdError;
import com.google.firebase.analytics.FirebaseAnalytics;

/* Import dependencies for AdMob */
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class MainActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;

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

        // Initializes listener for AdMob
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        // Displays ad through AdMob
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

//        InterstitialAd.load(this,"ca-app-pub-3940256099942544/1033173712", adRequest,
//                new InterstitialAdLoadCallback() {
//                    @Override
//                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
//                        // The mInterstitialAd reference will be null until
//                        // an ad is loaded.
//                        mInterstitialAd = interstitialAd;
//                        Log.i(TAG, "onAdLoaded");
//                    }
//
//                    @Override
//                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
//                        // Handle the error
//                        Log.i(TAG, loadAdError.getMessage());
//                        mInterstitialAd = null;
//                    }
//        }
    }

    public void openEcommerce(View view) {
        Intent intent = new Intent(MainActivity.this, ProductsActivity.class);
        startActivity(intent);
    }

    public void openInAppPurchase(View view) {
        Intent intent = new Intent(MainActivity.this, InAppPurchaseActivity.class);
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

    public void openTests(View view) {
        Intent intent = new Intent(MainActivity.this, TestActivity.class);
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