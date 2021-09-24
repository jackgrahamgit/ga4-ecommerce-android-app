package com.example.androidappforgoogleanalytics4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/** Import dependencies for Firebase */
import com.google.firebase.analytics.FirebaseAnalytics;
import android.os.Parcelable;

/** Import dependencies for navigating to a new screen */
import android.content.Intent;
import android.view.View;

public class ProductsActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;

    /** Send a view_item_list event with the item details and positions on screen */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

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

        Bundle itemFuturis = new Bundle();
        itemFuturis.putString(FirebaseAnalytics.Param.ITEM_ID, "035f0");
        itemFuturis.putString(FirebaseAnalytics.Param.ITEM_NAME, "Futuris T-Shirt");
        itemFuturis.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemFuturis.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Brown");
        itemFuturis.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Futuris");
        itemFuturis.putDouble(FirebaseAnalytics.Param.PRICE, 55.00);

        Bundle itemIsoternia = new Bundle();
        itemIsoternia.putString(FirebaseAnalytics.Param.ITEM_ID, "8835a");
        itemIsoternia.putString(FirebaseAnalytics.Param.ITEM_NAME, "Isoternia T-Shirt");
        itemIsoternia.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemIsoternia.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Blue");
        itemIsoternia.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Isoternia");
        itemIsoternia.putDouble(FirebaseAnalytics.Param.PRICE, 57.00);

        Bundle itemKiosk = new Bundle();
        itemKiosk.putString(FirebaseAnalytics.Param.ITEM_ID, "57b9d");
        itemKiosk.putString(FirebaseAnalytics.Param.ITEM_NAME, "Kiosk T-Shirt");
        itemKiosk.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemKiosk.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Green");
        itemKiosk.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Kiosk");
        itemKiosk.putDouble(FirebaseAnalytics.Param.PRICE, 55.00);

        Bundle itemLunchpod = new Bundle();
        itemLunchpod.putString(FirebaseAnalytics.Param.ITEM_ID, "dc646");
        itemLunchpod.putString(FirebaseAnalytics.Param.ITEM_NAME, "Lunchpod T-Shirt");
        itemLunchpod.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemLunchpod.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Light Brown");
        itemLunchpod.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Lunchpod");
        itemLunchpod.putDouble(FirebaseAnalytics.Param.PRICE, 90.00);

        Bundle itemMasons = new Bundle();
        itemMasons.putString(FirebaseAnalytics.Param.ITEM_ID, "7w9e0");
        itemMasons.putString(FirebaseAnalytics.Param.ITEM_NAME, "Masons T-Shirt");
        itemMasons.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemMasons.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Graphic Pink");
        itemMasons.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Masons");
        itemMasons.putDouble(FirebaseAnalytics.Param.PRICE, 31.00);

        Bundle itemPigzart = new Bundle();
        itemPigzart.putString(FirebaseAnalytics.Param.ITEM_ID, "239b5");
        itemPigzart.putString(FirebaseAnalytics.Param.ITEM_NAME, "Pigzart T-Shirt");
        itemPigzart.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemPigzart.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Burgundy");
        itemPigzart.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Pigzart");
        itemPigzart.putDouble(FirebaseAnalytics.Param.PRICE, 82.00);

        Bundle itemPoyo = new Bundle();
        itemPoyo.putString(FirebaseAnalytics.Param.ITEM_ID, "6d9b0");
        itemPoyo.putString(FirebaseAnalytics.Param.ITEM_NAME, "Poyo T-Shirt");
        itemPoyo.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemPoyo.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Graphic Yellow");
        itemPoyo.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Poyo");
        itemPoyo.putDouble(FirebaseAnalytics.Param.PRICE, 62.00);

        Bundle itemZappix = new Bundle();
        itemZappix.putString(FirebaseAnalytics.Param.ITEM_ID, "6c3b0");
        itemZappix.putString(FirebaseAnalytics.Param.ITEM_NAME, "Zappix T-Shirt");
        itemZappix.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemZappix.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Dark Gray");
        itemZappix.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Zappix");
        itemZappix.putDouble(FirebaseAnalytics.Param.PRICE, 99.00);

        /** The position of the displayed items by index */
        Bundle itemComptonWithIndex = new Bundle(itemCompton);
        itemComptonWithIndex.putLong(FirebaseAnalytics.Param.INDEX, 1);

        Bundle itemComvergesWithIndex = new Bundle(itemComverges);
        itemComvergesWithIndex.putLong(FirebaseAnalytics.Param.INDEX, 2);

        Bundle itemFlexigenWithIndex = new Bundle(itemFlexigen);
        itemFlexigenWithIndex.putLong(FirebaseAnalytics.Param.INDEX, 3);

        Bundle itemFuelworksWithIndex = new Bundle(itemFuelworks);
        itemFuelworksWithIndex.putLong(FirebaseAnalytics.Param.INDEX, 4);

        Bundle itemFuturisWithIndex = new Bundle(itemFuturis);
        itemFuturisWithIndex.putLong(FirebaseAnalytics.Param.INDEX, 5);

        Bundle itemIsoterniaWithIndex = new Bundle(itemIsoternia);
        itemIsoterniaWithIndex.putLong(FirebaseAnalytics.Param.INDEX, 6);

        Bundle itemKioskWithIndex = new Bundle(itemKiosk);
        itemKioskWithIndex.putLong(FirebaseAnalytics.Param.INDEX, 7);

        Bundle itemLunchpodWithIndex = new Bundle(itemLunchpod);
        itemLunchpodWithIndex.putLong(FirebaseAnalytics.Param.INDEX, 8);

        Bundle itemMasonsWithIndex = new Bundle(itemMasons);
        itemMasonsWithIndex.putLong(FirebaseAnalytics.Param.INDEX, 9);

        Bundle itemPigzartWithIndex = new Bundle(itemPigzart);
        itemPigzartWithIndex.putLong(FirebaseAnalytics.Param.INDEX, 10);

        Bundle itemPoyoWithIndex = new Bundle(itemPoyo);
        itemPoyoWithIndex.putLong(FirebaseAnalytics.Param.INDEX, 11);

        Bundle itemZappixWithIndex = new Bundle(itemZappix);
        itemZappixWithIndex.putLong(FirebaseAnalytics.Param.INDEX, 12);

        /** Send a view_item_list event with the position of the items on screen */
        Bundle viewItemListParams = new Bundle();
        viewItemListParams.putString(FirebaseAnalytics.Param.ITEM_LIST_ID, "A002");
        viewItemListParams.putString(FirebaseAnalytics.Param.ITEM_LIST_NAME, "All T-shirts");
        viewItemListParams.putParcelableArray(FirebaseAnalytics.Param.ITEMS,
                new Parcelable[]{
                        itemComptonWithIndex,
                        itemComvergesWithIndex,
                        itemFlexigenWithIndex,
                        itemFuelworksWithIndex,
                        itemFuturisWithIndex,
                        itemIsoterniaWithIndex,
                        itemKioskWithIndex,
                        itemLunchpodWithIndex,
                        itemMasonsWithIndex,
                        itemPigzartWithIndex,
                        itemPoyoWithIndex,
                        itemZappixWithIndex
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


    /** Activates after clicking the "Futuris" button */
    public void openItemFuturis(View view) {
        Bundle itemFuturis = new Bundle();
        itemFuturis.putString(FirebaseAnalytics.Param.ITEM_ID, "035f0");
        itemFuturis.putString(FirebaseAnalytics.Param.ITEM_NAME, "Futuris T-Shirt");
        itemFuturis.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemFuturis.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Brown");
        itemFuturis.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Futuris");
        itemFuturis.putDouble(FirebaseAnalytics.Param.PRICE, 55.00);

        Bundle selectItemParams = new Bundle();
        selectItemParams.putString(FirebaseAnalytics.Param.ITEM_LIST_ID, "A002");
        selectItemParams.putString(FirebaseAnalytics.Param.ITEM_LIST_NAME, "All T-shirts");
        selectItemParams.putParcelableArray(FirebaseAnalytics.Param.ITEMS,
                new Parcelable[]{itemFuturis});
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_ITEM, selectItemParams);

        Intent intent = new Intent(ProductsActivity.this, ItemFuturisActivity.class);
        startActivity(intent);
    }

    /** Activates after clicking the "Isoternia" button */
    public void openItemIsoternia(View view) {
        Bundle itemIsoternia = new Bundle();
        itemIsoternia.putString(FirebaseAnalytics.Param.ITEM_ID, "8835a");
        itemIsoternia.putString(FirebaseAnalytics.Param.ITEM_NAME, "Isoternia T-Shirt");
        itemIsoternia.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemIsoternia.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Blue");
        itemIsoternia.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Isoternia");
        itemIsoternia.putDouble(FirebaseAnalytics.Param.PRICE, 57.00);

        Bundle selectItemParams = new Bundle();
        selectItemParams.putString(FirebaseAnalytics.Param.ITEM_LIST_ID, "A002");
        selectItemParams.putString(FirebaseAnalytics.Param.ITEM_LIST_NAME, "All T-shirts");
        selectItemParams.putParcelableArray(FirebaseAnalytics.Param.ITEMS,
                new Parcelable[]{itemIsoternia});
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_ITEM, selectItemParams);

        Intent intent = new Intent(ProductsActivity.this, ItemIsoterniaActivity.class);
        startActivity(intent);
    }

    /** Activates after clicking the "Kiosk" button */
    public void openItemKiosk(View view) {
        Bundle itemKiosk = new Bundle();
        itemKiosk.putString(FirebaseAnalytics.Param.ITEM_ID, "57b9d");
        itemKiosk.putString(FirebaseAnalytics.Param.ITEM_NAME, "Kiosk T-Shirt");
        itemKiosk.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemKiosk.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Green");
        itemKiosk.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Kiosk");
        itemKiosk.putDouble(FirebaseAnalytics.Param.PRICE, 55.00);

        Bundle selectItemParams = new Bundle();
        selectItemParams.putString(FirebaseAnalytics.Param.ITEM_LIST_ID, "A002");
        selectItemParams.putString(FirebaseAnalytics.Param.ITEM_LIST_NAME, "All T-shirts");
        selectItemParams.putParcelableArray(FirebaseAnalytics.Param.ITEMS,
                new Parcelable[]{itemKiosk});
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_ITEM, selectItemParams);

        Intent intent = new Intent(ProductsActivity.this, ItemKioskActivity.class);
        startActivity(intent);
    }

    /** Activates after clicking the "Lunchpod" button */
    public void openItemLunchpod(View view) {
        Bundle itemLunchpod = new Bundle();
        itemLunchpod.putString(FirebaseAnalytics.Param.ITEM_ID, "dc646");
        itemLunchpod.putString(FirebaseAnalytics.Param.ITEM_NAME, "Lunchpod T-Shirt");
        itemLunchpod.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemLunchpod.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Light Brown");
        itemLunchpod.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Lunchpod");
        itemLunchpod.putDouble(FirebaseAnalytics.Param.PRICE, 90.00);

        Bundle selectItemParams = new Bundle();
        selectItemParams.putString(FirebaseAnalytics.Param.ITEM_LIST_ID, "A002");
        selectItemParams.putString(FirebaseAnalytics.Param.ITEM_LIST_NAME, "All T-shirts");
        selectItemParams.putParcelableArray(FirebaseAnalytics.Param.ITEMS,
                new Parcelable[]{itemLunchpod});
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_ITEM, selectItemParams);

        Intent intent = new Intent(ProductsActivity.this, ItemLunchpodActivity.class);
        startActivity(intent);
    }

    /** Activates after clicking the "Masons" button */
    public void openItemMasons(View view) {
        Bundle itemMasons = new Bundle();
        itemMasons.putString(FirebaseAnalytics.Param.ITEM_ID, "7w9e0");
        itemMasons.putString(FirebaseAnalytics.Param.ITEM_NAME, "Masons T-Shirt");
        itemMasons.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemMasons.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Graphic Pink");
        itemMasons.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Masons");
        itemMasons.putDouble(FirebaseAnalytics.Param.PRICE, 31.00);

        Bundle selectItemParams = new Bundle();
        selectItemParams.putString(FirebaseAnalytics.Param.ITEM_LIST_ID, "A002");
        selectItemParams.putString(FirebaseAnalytics.Param.ITEM_LIST_NAME, "All T-shirts");
        selectItemParams.putParcelableArray(FirebaseAnalytics.Param.ITEMS,
                new Parcelable[]{itemMasons});
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_ITEM, selectItemParams);

        Intent intent = new Intent(ProductsActivity.this, ItemMasonsActivity.class);
        startActivity(intent);
    }

    /** Activates after clicking the "Pigzart" button */
    public void openItemPigzart(View view) {
        Bundle itemPigzart = new Bundle();
        itemPigzart.putString(FirebaseAnalytics.Param.ITEM_ID, "239b5");
        itemPigzart.putString(FirebaseAnalytics.Param.ITEM_NAME, "Pigzart T-Shirt");
        itemPigzart.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemPigzart.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Burgundy");
        itemPigzart.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Pigzart");
        itemPigzart.putDouble(FirebaseAnalytics.Param.PRICE, 82.00);

        Bundle selectItemParams = new Bundle();
        selectItemParams.putString(FirebaseAnalytics.Param.ITEM_LIST_ID, "A002");
        selectItemParams.putString(FirebaseAnalytics.Param.ITEM_LIST_NAME, "All T-shirts");
        selectItemParams.putParcelableArray(FirebaseAnalytics.Param.ITEMS,
                new Parcelable[]{itemPigzart});
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_ITEM, selectItemParams);

        Intent intent = new Intent(ProductsActivity.this, ItemPigzartActivity.class);
        startActivity(intent);
    }

    /** Activates after clicking the "Poyo" button */
    public void openItemPoyo(View view) {
        Bundle itemPoyo = new Bundle();
        itemPoyo.putString(FirebaseAnalytics.Param.ITEM_ID, "6d9b0");
        itemPoyo.putString(FirebaseAnalytics.Param.ITEM_NAME, "Poyo T-Shirt");
        itemPoyo.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemPoyo.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Graphic Yellow");
        itemPoyo.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Poyo");
        itemPoyo.putDouble(FirebaseAnalytics.Param.PRICE, 62.00);

        Bundle selectItemParams = new Bundle();
        selectItemParams.putString(FirebaseAnalytics.Param.ITEM_LIST_ID, "A002");
        selectItemParams.putString(FirebaseAnalytics.Param.ITEM_LIST_NAME, "All T-shirts");
        selectItemParams.putParcelableArray(FirebaseAnalytics.Param.ITEMS,
                new Parcelable[]{itemPoyo});
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_ITEM, selectItemParams);

        Intent intent = new Intent(ProductsActivity.this, ItemPoyoActivity.class);
        startActivity(intent);
    }

    /** Activates after clicking the "Zappix" button */
    public void openItemZappix(View view) {
        Bundle itemZappix = new Bundle();
        itemZappix.putString(FirebaseAnalytics.Param.ITEM_ID, "6c3b0");
        itemZappix.putString(FirebaseAnalytics.Param.ITEM_NAME, "Zappix T-Shirt");
        itemZappix.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "T-Shirts");
        itemZappix.putString(FirebaseAnalytics.Param.ITEM_VARIANT, "Dark Gray");
        itemZappix.putString(FirebaseAnalytics.Param.ITEM_BRAND, "Zappix");
        itemZappix.putDouble(FirebaseAnalytics.Param.PRICE, 99.00);

        Bundle selectItemParams = new Bundle();
        selectItemParams.putString(FirebaseAnalytics.Param.ITEM_LIST_ID, "A002");
        selectItemParams.putString(FirebaseAnalytics.Param.ITEM_LIST_NAME, "All T-shirts");
        selectItemParams.putParcelableArray(FirebaseAnalytics.Param.ITEMS,
                new Parcelable[]{itemZappix});
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_ITEM, selectItemParams);

        Intent intent = new Intent(ProductsActivity.this, ItemZappixActivity.class);
        startActivity(intent);
    }

}