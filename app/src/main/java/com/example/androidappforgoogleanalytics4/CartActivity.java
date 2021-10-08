package com.example.androidappforgoogleanalytics4;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView; // Pass value through Intent

public class CartActivity extends AppCompatActivity {

    private TextView comvergesQuantity, comvergesPrice, comptonQuantity, comptonPrice, flexigenQuantity, flexigenPrice, fuelworksQuantity, fuelworksPrice, totalPrice;
    private int counterComverges, counterCompton, counterFlexigen, counterFuelworks, total;
    private View removeComverges;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        // Number of times user adds compton to their cart
        comptonQuantity = findViewById(R.id.comptonQuantity);
        comptonPrice = findViewById(R.id.comptonPrice);
        counterCompton = Persist.readValue(this, "COMPTON");
        comptonQuantity.setText("Compton quantity: " + counterCompton);
        comptonPrice.setText("Compton subtotal: $" + counterCompton*44 + ".00");

        // Number of times user adds comverges to their cart
        comvergesQuantity = findViewById(R.id.comvergesQuantity);
        comvergesPrice = findViewById(R.id.comvergesPrice);
        counterComverges = Persist.readValue(this, "COMVERGES");
        comvergesQuantity.setText("Comverges quantity: " + counterComverges);
        comvergesPrice.setText("Comverges subtotal: $" + counterComverges*33 + ".00");

        // Removes comverges from cart
        removeComverges = findViewById(R.id.removeComverges);
        removeComverges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Persist.deleteValue(getApplicationContext(), "COMVERGES");
                startActivity(new Intent(CartActivity.this, CartActivity.class));
            }
        });

        // Number of times user adds flexigen to their cart
        flexigenQuantity = findViewById(R.id.flexigenQuantity);
        flexigenPrice = findViewById(R.id.flexigenPrice);
        counterFlexigen = Persist.readValue(this, "FLEXIGEN");
        flexigenQuantity.setText("Flexigen quantity: " + counterFlexigen);
        flexigenPrice.setText("Flexigen subtotal: $" + counterFlexigen*16 + ".00");

        // Number of times user adds fuelworks to their cart
        fuelworksQuantity = findViewById(R.id.fuelworksQuantity);
        fuelworksPrice = findViewById(R.id.fuelworksPrice);
        counterFuelworks = Persist.readValue(this, "FUELWORKS");
        fuelworksQuantity.setText("Fuelworks quantity: " + counterFuelworks);
        fuelworksPrice.setText("Fuelworks subtotal: $" + counterFuelworks*92 + ".00");

        // Total cart value
        totalPrice = findViewById(R.id.totalPrice);
        total = counterCompton*44+counterComverges*33+counterFlexigen*16+counterFuelworks*92;
        fuelworksPrice.setText("Total: $" + total + ".00");
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
            startActivity(new Intent(CartActivity.this, MainActivity.class));
        }
        if (item.getItemId() == R.id.cart) {
            startActivity(new Intent(CartActivity.this, CartActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

    /** Begin the checkout process */
    public void openShippingInformation(View view) {
        Intent intent = new Intent(CartActivity.this, ShippingInformationActivity.class);
        startActivity(intent);
    }
}