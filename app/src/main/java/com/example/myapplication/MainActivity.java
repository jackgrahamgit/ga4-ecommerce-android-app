package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;

import com.google.firebase.analytics.FirebaseAnalytics;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myapplication.MESSAGE";
    private FirebaseAnalytics analytics;
    private AdView adView;

    /** Initialize Analytics and AdMob */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        analytics = FirebaseAnalytics.getInstance(this);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        adView = (AdView) findViewById(R.id.adView);

        AdRequest adRequest = new AdRequest.Builder().build();
//                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR) // Use test ads to test

        // Load the ad
        adView.loadAd(adRequest);





        Bundle itemJeggings = new Bundle();
        itemJeggings.putString(FirebaseAnalytics.Param.ITEM_ID, "SKU_123");
        itemJeggings.putString(FirebaseAnalytics.Param.ITEM_NAME, "jeggings");
        itemJeggings.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "pants");
        itemJeggings.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "black");
        itemJeggings.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Google");
        itemJeggings.putDouble(FirebaseAnalytics.Param.PRICE, 9.99);

        Bundle itemBoots = new Bundle();
        itemBoots.putString(FirebaseAnalytics.Param.ITEM_ID, "SKU_456");
        itemBoots.putString(FirebaseAnalytics.Param.ITEM_NAME, "boots");
        itemBoots.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "shoes");
        itemBoots.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "brown");
        itemBoots.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Google");
        itemBoots.putDouble(FirebaseAnalytics.Param.PRICE, 24.99);

        Bundle itemSocks = new Bundle();
        itemSocks.putString(FirebaseAnalytics.Param.ITEM_ID, "SKU_789");
        itemSocks.putString(FirebaseAnalytics.Param.ITEM_NAME, "ankle_socks");
        itemSocks.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "socks");
        itemSocks.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "red");
        itemSocks.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Google");
        itemSocks.putDouble(FirebaseAnalytics.Param.PRICE, 5.99);

        Bundle itemJeggingsWithIndex = new Bundle(itemJeggings);
        itemJeggingsWithIndex.putLong(FirebaseAnalytics.Param.INDEX, 1);

        Bundle itemBootsWithIndex = new Bundle(itemBoots);
        itemBootsWithIndex.putLong(FirebaseAnalytics.Param.INDEX, 2);

        Bundle itemSocksWithIndex = new Bundle(itemSocks);
        itemSocksWithIndex.putLong(FirebaseAnalytics.Param.INDEX, 3);

        Bundle viewItemListParams = new Bundle();
        viewItemListParams.putString(FirebaseAnalytics.Param.ITEM_LIST_ID, "L001");
        viewItemListParams.putString(FirebaseAnalytics.Param.ITEM_LIST_NAME, "Related products");
        viewItemListParams.putParcelableArray(FirebaseAnalytics.Param.ITEMS,
                new Parcelable[]{ itemJeggingsWithIndex, itemBootsWithIndex, itemSocksWithIndex });
        analytics.logEvent(FirebaseAnalytics.Event.VIEW_ITEM_LIST, viewItemListParams);
    }

    /** Called when a user taps the Men's Clothes button */
    public void sendMensClothes(View view) {
        Intent intent = new Intent(this, MensClothesActivity.class);
        startActivity(intent);
    }
}