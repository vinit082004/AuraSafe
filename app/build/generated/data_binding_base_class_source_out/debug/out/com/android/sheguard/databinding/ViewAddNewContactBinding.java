// Generated by view binder compiler. Do not edit!
package com.android.sheguard.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.android.sheguard.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewAddNewContactBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MaterialButton btnAddContact;

  @NonNull
  public final TextInputEditText etAddName;

  @NonNull
  public final TextInputLayout etAddNameLayout;

  @NonNull
  public final TextInputEditText etAddNumber;

  @NonNull
  public final TextInputLayout etAddNumberLayout;

  private ViewAddNewContactBinding(@NonNull LinearLayout rootView,
      @NonNull MaterialButton btnAddContact, @NonNull TextInputEditText etAddName,
      @NonNull TextInputLayout etAddNameLayout, @NonNull TextInputEditText etAddNumber,
      @NonNull TextInputLayout etAddNumberLayout) {
    this.rootView = rootView;
    this.btnAddContact = btnAddContact;
    this.etAddName = etAddName;
    this.etAddNameLayout = etAddNameLayout;
    this.etAddNumber = etAddNumber;
    this.etAddNumberLayout = etAddNumberLayout;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewAddNewContactBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewAddNewContactBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.view_add_new_contact, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewAddNewContactBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_add_contact;
      MaterialButton btnAddContact = ViewBindings.findChildViewById(rootView, id);
      if (btnAddContact == null) {
        break missingId;
      }

      id = R.id.et_add_name;
      TextInputEditText etAddName = ViewBindings.findChildViewById(rootView, id);
      if (etAddName == null) {
        break missingId;
      }

      id = R.id.et_add_name_layout;
      TextInputLayout etAddNameLayout = ViewBindings.findChildViewById(rootView, id);
      if (etAddNameLayout == null) {
        break missingId;
      }

      id = R.id.et_add_number;
      TextInputEditText etAddNumber = ViewBindings.findChildViewById(rootView, id);
      if (etAddNumber == null) {
        break missingId;
      }

      id = R.id.et_add_number_layout;
      TextInputLayout etAddNumberLayout = ViewBindings.findChildViewById(rootView, id);
      if (etAddNumberLayout == null) {
        break missingId;
      }

      return new ViewAddNewContactBinding((LinearLayout) rootView, btnAddContact, etAddName,
          etAddNameLayout, etAddNumber, etAddNumberLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
