// Generated by view binder compiler. Do not edit!
package com.exemplary.itsAnApp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.exemplary.itsAnApp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityProductsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final TextView productName;

  @NonNull
  public final TextView productName2;

  @NonNull
  public final TextView productName3;

  @NonNull
  public final TextView productName4;

  @NonNull
  public final TextView productPrice;

  @NonNull
  public final TextView productPrice2;

  @NonNull
  public final TextView productPrice3;

  @NonNull
  public final TextView productPrice4;

  @NonNull
  public final TextView textView;

  private ActivityProductsBinding(@NonNull LinearLayout rootView, @NonNull ImageView imageView,
      @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4,
      @NonNull TextView productName, @NonNull TextView productName2, @NonNull TextView productName3,
      @NonNull TextView productName4, @NonNull TextView productPrice,
      @NonNull TextView productPrice2, @NonNull TextView productPrice3,
      @NonNull TextView productPrice4, @NonNull TextView textView) {
    this.rootView = rootView;
    this.imageView = imageView;
    this.imageView2 = imageView2;
    this.imageView3 = imageView3;
    this.imageView4 = imageView4;
    this.productName = productName;
    this.productName2 = productName2;
    this.productName3 = productName3;
    this.productName4 = productName4;
    this.productPrice = productPrice;
    this.productPrice2 = productPrice2;
    this.productPrice3 = productPrice3;
    this.productPrice4 = productPrice4;
    this.textView = textView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityProductsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityProductsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_products, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityProductsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.imageView4;
      ImageView imageView4 = ViewBindings.findChildViewById(rootView, id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.productName;
      TextView productName = ViewBindings.findChildViewById(rootView, id);
      if (productName == null) {
        break missingId;
      }

      id = R.id.productName2;
      TextView productName2 = ViewBindings.findChildViewById(rootView, id);
      if (productName2 == null) {
        break missingId;
      }

      id = R.id.productName3;
      TextView productName3 = ViewBindings.findChildViewById(rootView, id);
      if (productName3 == null) {
        break missingId;
      }

      id = R.id.productName4;
      TextView productName4 = ViewBindings.findChildViewById(rootView, id);
      if (productName4 == null) {
        break missingId;
      }

      id = R.id.productPrice;
      TextView productPrice = ViewBindings.findChildViewById(rootView, id);
      if (productPrice == null) {
        break missingId;
      }

      id = R.id.productPrice2;
      TextView productPrice2 = ViewBindings.findChildViewById(rootView, id);
      if (productPrice2 == null) {
        break missingId;
      }

      id = R.id.productPrice3;
      TextView productPrice3 = ViewBindings.findChildViewById(rootView, id);
      if (productPrice3 == null) {
        break missingId;
      }

      id = R.id.productPrice4;
      TextView productPrice4 = ViewBindings.findChildViewById(rootView, id);
      if (productPrice4 == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new ActivityProductsBinding((LinearLayout) rootView, imageView, imageView2, imageView3,
          imageView4, productName, productName2, productName3, productName4, productPrice,
          productPrice2, productPrice3, productPrice4, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
