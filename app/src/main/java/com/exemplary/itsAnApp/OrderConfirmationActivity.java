package com.exemplary.itsAnApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class OrderConfirmationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_confirmation);
    }

    /** Activates after clicking the "Home" button */
    public void openHome(View view) {
        Intent intent = new Intent(OrderConfirmationActivity.this, MainActivity.class);
        startActivity(intent);
    }

    /** Activates after clicking the "Get a refund" button */
    public void getRefund(View view) {
        Intent intent = new Intent(OrderConfirmationActivity.this, MainActivity.class);
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
            startActivity(new Intent(OrderConfirmationActivity.this, MainActivity.class));
        }
        if (item.getItemId() == R.id.cart) {
            startActivity(new Intent(OrderConfirmationActivity.this, CartActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}