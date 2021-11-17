package com.exemplary.androidappforgoogleanalytics4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/** Import dependencies for Firebase */
import com.google.firebase.analytics.FirebaseAnalytics;
import android.os.Parcelable;

/** Import dependencies for navigating to a new screen */
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ProductsActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;

    /** Send a view_item_list event with the item details and positions on screen */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        // Connects app activity with Analytics
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        /** Create bundles for the items that appear on screen */
        Bundle itemCompton = new Bundle();
        itemCompton.putString(FirebaseAnalytics.Param.ITEM_ID, "9bdd2");
        itemCompton.putString(FirebaseAnalytics.Param.ITEM_NAME, "Compton T-Shirt");
        itemCompton.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemCompton.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Yellow");
        itemCompton.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Compton");
        itemCompton.putDouble(FirebaseAnalytics.Param.PRICE, 44.00);

        Bundle itemComverges = new Bundle();
        itemComverges.putString(FirebaseAnalytics.Param.ITEM_ID, "f6be8");
        itemComverges.putString(FirebaseAnalytics.Param.ITEM_NAME, "Comverges T-Shirt");
        itemComverges.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemComverges.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Dark Gray");
        itemComverges.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Comverges");
        itemComverges.putDouble(FirebaseAnalytics.Param.PRICE, 33.00);

        Bundle itemFlexigen = new Bundle();
        itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_ID, "b55da");
        itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_NAME, "Flexigen T-Shirt");
        itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Black");
        itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Flexigen");
        itemFlexigen.putDouble(FirebaseAnalytics.Param.PRICE, 16.00);

        Bundle itemFuelworks = new Bundle();
        itemFuelworks.putString(FirebaseAnalytics.Param.ITEM_ID, "bc823");
        itemFuelworks.putString(FirebaseAnalytics.Param.ITEM_NAME, "Fuelworks T-Shirt");
        itemFuelworks.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemFuelworks.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Pink");
        itemFuelworks.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Fuelworks");
        itemFuelworks.putDouble(FirebaseAnalytics.Param.PRICE, 92.00);

        /** The position of the displayed items by index */
        Bundle itemComptonWithIndex = new Bundle(itemCompton);
        itemComptonWithIndex.putLong(FirebaseAnalytics.Param.INDEX, 1);

        Bundle itemComvergesWithIndex = new Bundle(itemComverges);
        itemComvergesWithIndex.putLong(FirebaseAnalytics.Param.INDEX, 2);

        Bundle itemFlexigenWithIndex = new Bundle(itemFlexigen);
        itemFlexigenWithIndex.putLong(FirebaseAnalytics.Param.INDEX, 3);

        Bundle itemFuelworksWithIndex = new Bundle(itemFuelworks);
        itemFuelworksWithIndex.putLong(FirebaseAnalytics.Param.INDEX, 4);

        /** Send a view_item_list event with the position of the items on screen */
        Bundle viewItemListParams = new Bundle();
        viewItemListParams.putString(FirebaseAnalytics.Param.ITEM_LIST_ID, "A002");
        viewItemListParams.putString(FirebaseAnalytics.Param.ITEM_LIST_NAME, "All T-shirts");
        viewItemListParams.putParcelableArray(FirebaseAnalytics.Param.ITEMS,
                new Parcelable[]{
                        itemComptonWithIndex,
                        itemComvergesWithIndex,
                        itemFlexigenWithIndex,
                        itemFuelworksWithIndex
                });
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.VIEW_ITEM_LIST, viewItemListParams);

    }

    /** Activates after clicking the "Compton" button */
    public void openItemCompton(View view) {
        Bundle itemCompton = new Bundle();
        itemCompton.putString(FirebaseAnalytics.Param.ITEM_ID, "9bdd2");
        itemCompton.putString(FirebaseAnalytics.Param.ITEM_NAME, "Compton T-Shirt");
        itemCompton.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemCompton.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Yellow");
        itemCompton.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Compton");
        itemCompton.putDouble(FirebaseAnalytics.Param.PRICE, 44.00);

        Bundle selectItemParams = new Bundle();
        selectItemParams.putString(FirebaseAnalytics.Param.ITEM_LIST_ID, "A002");
        selectItemParams.putString(FirebaseAnalytics.Param.ITEM_LIST_NAME, "All T-shirts");
        selectItemParams.putParcelableArray(FirebaseAnalytics.Param.ITEMS,
                new Parcelable[]{ itemCompton });
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_ITEM, selectItemParams);

        Intent intent = new Intent(ProductsActivity.this, ItemComptonActivity.class);
        startActivity(intent);
    }

    /** Activates after clicking the "Comverges" button */
    public void openItemComverges(View view) {
        Bundle itemComverges = new Bundle();
        itemComverges.putString(FirebaseAnalytics.Param.ITEM_ID, "f6be8");
        itemComverges.putString(FirebaseAnalytics.Param.ITEM_NAME, "Comverges T-Shirt");
        itemComverges.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemComverges.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Dark Gray");
        itemComverges.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Comverges");
        itemComverges.putDouble(FirebaseAnalytics.Param.PRICE, 33.00);

        Bundle selectItemParams = new Bundle();
        selectItemParams.putString(FirebaseAnalytics.Param.ITEM_LIST_ID, "A002");
        selectItemParams.putString(FirebaseAnalytics.Param.ITEM_LIST_NAME, "All T-shirts");
        selectItemParams.putParcelableArray(FirebaseAnalytics.Param.ITEMS,
                new Parcelable[]{ itemComverges });
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_ITEM, selectItemParams);

        Intent intent = new Intent(ProductsActivity.this, ItemComvergesActivity.class);
        startActivity(intent);
    }

    /** Activates after clicking the "Flexigen" button */
    public void openItemFlexigen(View view) {
        Bundle itemFlexigen = new Bundle();
        itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_ID, "b55da");
        itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_NAME, "Flexigen T-Shirt");
        itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Black");
        itemFlexigen.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Flexigen");
        itemFlexigen.putDouble(FirebaseAnalytics.Param.PRICE, 16.00);

        Bundle selectItemParams = new Bundle();
        selectItemParams.putString(FirebaseAnalytics.Param.ITEM_LIST_ID, "A002");
        selectItemParams.putString(FirebaseAnalytics.Param.ITEM_LIST_NAME, "All T-shirts");
        selectItemParams.putParcelableArray(FirebaseAnalytics.Param.ITEMS,
                new Parcelable[]{ itemFlexigen });
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_ITEM, selectItemParams);

        Intent intent = new Intent(ProductsActivity.this, ItemFlexigenActivity.class);
        startActivity(intent);
    }

    /** Activates after clicking the "Fuelworks" button */
    public void openItemFuelworks(View view) {
        Bundle itemFuelworks = new Bundle();
        itemFuelworks.putString(FirebaseAnalytics.Param.ITEM_ID, "bc823");
        itemFuelworks.putString(FirebaseAnalytics.Param.ITEM_NAME, "Fuelworks T-Shirt");
        itemFuelworks.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemFuelworks.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Pink");
        itemFuelworks.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Fuelworks");
        itemFuelworks.putDouble(FirebaseAnalytics.Param.PRICE, 92.00);

        Bundle selectItemParams = new Bundle();
        selectItemParams.putString(FirebaseAnalytics.Param.ITEM_LIST_ID, "A002");
        selectItemParams.putString(FirebaseAnalytics.Param.ITEM_LIST_NAME, "All T-shirts");
        selectItemParams.putParcelableArray(FirebaseAnalytics.Param.ITEMS,
                new Parcelable[]{itemFuelworks});
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_ITEM, selectItemParams);

        Intent intent = new Intent(ProductsActivity.this, ItemFuelworksActivity.class);
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
            startActivity(new Intent(ProductsActivity.this, MainActivity.class));
        }
        if (item.getItemId() == R.id.cart) {
            startActivity(new Intent(ProductsActivity.this, CartActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

}