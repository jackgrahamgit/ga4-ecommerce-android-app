// Generated by view binder compiler. Do not edit!
package com.exemplary.itsAnApp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.exemplary.itsAnApp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCartBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button button;

  @NonNull
  public final TextView cartSubtitle;

  @NonNull
  public final TableLayout cartTable;

  @NonNull
  public final TextView comptonName;

  @NonNull
  public final TextView comptonPrice;

  @NonNull
  public final TextView comptonQuantity;

  @NonNull
  public final TextView comvergesName;

  @NonNull
  public final TextView comvergesPrice;

  @NonNull
  public final TextView comvergesQuantity;

  @NonNull
  public final TextView flexigenName;

  @NonNull
  public final TextView flexigenPrice;

  @NonNull
  public final TextView flexigenQuantity;

  @NonNull
  public final TextView fuelworksName;

  @NonNull
  public final TextView fuelworksPrice;

  @NonNull
  public final TextView fuelworksQuantity;

  @NonNull
  public final TextView header;

  @NonNull
  public final TextView removeCompton;

  @NonNull
  public final TextView removeComverges;

  @NonNull
  public final TextView removeFlexigen;

  @NonNull
  public final TextView removeFuelworks;

  @NonNull
  public final TextView totalPrice;

  private ActivityCartBinding(@NonNull RelativeLayout rootView, @NonNull Button button,
      @NonNull TextView cartSubtitle, @NonNull TableLayout cartTable, @NonNull TextView comptonName,
      @NonNull TextView comptonPrice, @NonNull TextView comptonQuantity,
      @NonNull TextView comvergesName, @NonNull TextView comvergesPrice,
      @NonNull TextView comvergesQuantity, @NonNull TextView flexigenName,
      @NonNull TextView flexigenPrice, @NonNull TextView flexigenQuantity,
      @NonNull TextView fuelworksName, @NonNull TextView fuelworksPrice,
      @NonNull TextView fuelworksQuantity, @NonNull TextView header,
      @NonNull TextView removeCompton, @NonNull TextView removeComverges,
      @NonNull TextView removeFlexigen, @NonNull TextView removeFuelworks,
      @NonNull TextView totalPrice) {
    this.rootView = rootView;
    this.button = button;
    this.cartSubtitle = cartSubtitle;
    this.cartTable = cartTable;
    this.comptonName = comptonName;
    this.comptonPrice = comptonPrice;
    this.comptonQuantity = comptonQuantity;
    this.comvergesName = comvergesName;
    this.comvergesPrice = comvergesPrice;
    this.comvergesQuantity = comvergesQuantity;
    this.flexigenName = flexigenName;
    this.flexigenPrice = flexigenPrice;
    this.flexigenQuantity = flexigenQuantity;
    this.fuelworksName = fuelworksName;
    this.fuelworksPrice = fuelworksPrice;
    this.fuelworksQuantity = fuelworksQuantity;
    this.header = header;
    this.removeCompton = removeCompton;
    this.removeComverges = removeComverges;
    this.removeFlexigen = removeFlexigen;
    this.removeFuelworks = removeFuelworks;
    this.totalPrice = totalPrice;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_cart, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCartBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.cartSubtitle;
      TextView cartSubtitle = ViewBindings.findChildViewById(rootView, id);
      if (cartSubtitle == null) {
        break missingId;
      }

      id = R.id.cartTable;
      TableLayout cartTable = ViewBindings.findChildViewById(rootView, id);
      if (cartTable == null) {
        break missingId;
      }

      id = R.id.comptonName;
      TextView comptonName = ViewBindings.findChildViewById(rootView, id);
      if (comptonName == null) {
        break missingId;
      }

      id = R.id.comptonPrice;
      TextView comptonPrice = ViewBindings.findChildViewById(rootView, id);
      if (comptonPrice == null) {
        break missingId;
      }

      id = R.id.comptonQuantity;
      TextView comptonQuantity = ViewBindings.findChildViewById(rootView, id);
      if (comptonQuantity == null) {
        break missingId;
      }

      id = R.id.comvergesName;
      TextView comvergesName = ViewBindings.findChildViewById(rootView, id);
      if (comvergesName == null) {
        break missingId;
      }

      id = R.id.comvergesPrice;
      TextView comvergesPrice = ViewBindings.findChildViewById(rootView, id);
      if (comvergesPrice == null) {
        break missingId;
      }

      id = R.id.comvergesQuantity;
      TextView comvergesQuantity = ViewBindings.findChildViewById(rootView, id);
      if (comvergesQuantity == null) {
        break missingId;
      }

      id = R.id.flexigenName;
      TextView flexigenName = ViewBindings.findChildViewById(rootView, id);
      if (flexigenName == null) {
        break missingId;
      }

      id = R.id.flexigenPrice;
      TextView flexigenPrice = ViewBindings.findChildViewById(rootView, id);
      if (flexigenPrice == null) {
        break missingId;
      }

      id = R.id.flexigenQuantity;
      TextView flexigenQuantity = ViewBindings.findChildViewById(rootView, id);
      if (flexigenQuantity == null) {
        break missingId;
      }

      id = R.id.fuelworksName;
      TextView fuelworksName = ViewBindings.findChildViewById(rootView, id);
      if (fuelworksName == null) {
        break missingId;
      }

      id = R.id.fuelworksPrice;
      TextView fuelworksPrice = ViewBindings.findChildViewById(rootView, id);
      if (fuelworksPrice == null) {
        break missingId;
      }

      id = R.id.fuelworksQuantity;
      TextView fuelworksQuantity = ViewBindings.findChildViewById(rootView, id);
      if (fuelworksQuantity == null) {
        break missingId;
      }

      id = R.id.header;
      TextView header = ViewBindings.findChildViewById(rootView, id);
      if (header == null) {
        break missingId;
      }

      id = R.id.removeCompton;
      TextView removeCompton = ViewBindings.findChildViewById(rootView, id);
      if (removeCompton == null) {
        break missingId;
      }

      id = R.id.removeComverges;
      TextView removeComverges = ViewBindings.findChildViewById(rootView, id);
      if (removeComverges == null) {
        break missingId;
      }

      id = R.id.removeFlexigen;
      TextView removeFlexigen = ViewBindings.findChildViewById(rootView, id);
      if (removeFlexigen == null) {
        break missingId;
      }

      id = R.id.removeFuelworks;
      TextView removeFuelworks = ViewBindings.findChildViewById(rootView, id);
      if (removeFuelworks == null) {
        break missingId;
      }

      id = R.id.totalPrice;
      TextView totalPrice = ViewBindings.findChildViewById(rootView, id);
      if (totalPrice == null) {
        break missingId;
      }

      return new ActivityCartBinding((RelativeLayout) rootView, button, cartSubtitle, cartTable,
          comptonName, comptonPrice, comptonQuantity, comvergesName, comvergesPrice,
          comvergesQuantity, flexigenName, flexigenPrice, flexigenQuantity, fuelworksName,
          fuelworksPrice, fuelworksQuantity, header, removeCompton, removeComverges, removeFlexigen,
          removeFuelworks, totalPrice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
