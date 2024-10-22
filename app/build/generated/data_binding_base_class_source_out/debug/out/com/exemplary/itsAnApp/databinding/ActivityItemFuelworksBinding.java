// Generated by view binder compiler. Do not edit!
package com.exemplary.itsAnApp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.exemplary.itsAnApp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityItemFuelworksBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button addToCart;

  @NonNull
  public final Button addToWishlist;

  @NonNull
  public final TextView descriptionHeader;

  @NonNull
  public final TextView descriptionText;

  @NonNull
  public final ImageView productImage;

  @NonNull
  public final TextView productName;

  @NonNull
  public final TextView productPrice;

  private ActivityItemFuelworksBinding(@NonNull ScrollView rootView, @NonNull Button addToCart,
      @NonNull Button addToWishlist, @NonNull TextView descriptionHeader,
      @NonNull TextView descriptionText, @NonNull ImageView productImage,
      @NonNull TextView productName, @NonNull TextView productPrice) {
    this.rootView = rootView;
    this.addToCart = addToCart;
    this.addToWishlist = addToWishlist;
    this.descriptionHeader = descriptionHeader;
    this.descriptionText = descriptionText;
    this.productImage = productImage;
    this.productName = productName;
    this.productPrice = productPrice;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityItemFuelworksBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityItemFuelworksBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_item_fuelworks, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityItemFuelworksBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addToCart;
      Button addToCart = ViewBindings.findChildViewById(rootView, id);
      if (addToCart == null) {
        break missingId;
      }

      id = R.id.addToWishlist;
      Button addToWishlist = ViewBindings.findChildViewById(rootView, id);
      if (addToWishlist == null) {
        break missingId;
      }

      id = R.id.descriptionHeader;
      TextView descriptionHeader = ViewBindings.findChildViewById(rootView, id);
      if (descriptionHeader == null) {
        break missingId;
      }

      id = R.id.descriptionText;
      TextView descriptionText = ViewBindings.findChildViewById(rootView, id);
      if (descriptionText == null) {
        break missingId;
      }

      id = R.id.productImage;
      ImageView productImage = ViewBindings.findChildViewById(rootView, id);
      if (productImage == null) {
        break missingId;
      }

      id = R.id.productName;
      TextView productName = ViewBindings.findChildViewById(rootView, id);
      if (productName == null) {
        break missingId;
      }

      id = R.id.productPrice;
      TextView productPrice = ViewBindings.findChildViewById(rootView, id);
      if (productPrice == null) {
        break missingId;
      }

      return new ActivityItemFuelworksBinding((ScrollView) rootView, addToCart, addToWishlist,
          descriptionHeader, descriptionText, productImage, productName, productPrice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
