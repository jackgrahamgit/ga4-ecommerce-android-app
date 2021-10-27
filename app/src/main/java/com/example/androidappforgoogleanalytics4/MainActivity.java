package com.example.androidappforgoogleanalytics4;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/* Import dependencies for navigating to new screen */
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* Import dependencies for Firebase */
import com.google.firebase.analytics.FirebaseAnalytics;

/* Import dependencies for AdMob */
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

        // Connects app activity with Analytics
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

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
    }

    /* Creates the options in the action bar */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /* Sets the actions for the items in the action bar */
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

    /* Activates after clicking the "Clothes" button */
    public void openEcommerce(View view) {
        Intent intent = new Intent(MainActivity.this, ProductsActivity.class);
        startActivity(intent);
    }

    /* Activates after clicking the "In-app purchase" button */
    public void openInAppPurchase(View view) {
        Intent intent = new Intent(MainActivity.this, InAppPurchaseActivity.class);
        MainActivity.this.startActivity(intent);
    }

}