package com.exemplary.androidappforgoogleanalytics4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/* Import dependencies for Firebase */
import com.google.firebase.analytics.FirebaseAnalytics;
import android.os.Parcelable;

/* Import dependencies for navigating to a new screen */
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class InAppPurchaseActivity extends AppCompatActivity {

  private FirebaseAnalytics mFirebaseAnalytics;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_in_app_purchase);

    // Connects app activity with Analytics
    mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
  }

  // Creates the options in the action bar
  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.main, menu);
    return super.onCreateOptionsMenu(menu);
  }

}