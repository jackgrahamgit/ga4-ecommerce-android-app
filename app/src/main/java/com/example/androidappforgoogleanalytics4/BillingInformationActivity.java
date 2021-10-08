package com.example.androidappforgoogleanalytics4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.FtsOptions;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class BillingInformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billing_information);
    }

    /** Activates after clicking the "Purchase" button */
    public void purchase(View view) {
        Intent intent = new Intent(BillingInformationActivity.this, OrderConfirmationActivity.class);
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
            startActivity(new Intent(BillingInformationActivity.this, MainActivity.class));
        }
        if (item.getItemId() == R.id.cart) {
            startActivity(new Intent(BillingInformationActivity.this, CartActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}