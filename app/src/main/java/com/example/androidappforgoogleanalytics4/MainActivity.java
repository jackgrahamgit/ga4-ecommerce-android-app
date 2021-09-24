package com.example.androidappforgoogleanalytics4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/** Import dependencies for navigating to new screen */
import android.content.Intent;
import android.view.View;

/** Import dependencies for Firebase */
import com.google.firebase.analytics.FirebaseAnalytics;

/** Import dependencies for AdMob */
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this); // Connects app activity with Firebase

        // Initialize listener for AdMob
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    /** Activates after clicking the "Clothes" button */
    public void openEcommerce(View view) {
        Intent intent = new Intent(MainActivity.this, ProductsActivity.class);
        startActivity(intent);
    }

}