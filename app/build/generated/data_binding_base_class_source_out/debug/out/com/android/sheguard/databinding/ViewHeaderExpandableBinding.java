// Generated by view binder compiler. Do not edit!
package com.android.sheguard.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.android.sheguard.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.appbar.SubtitleCollapsingToolbarLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewHeaderExpandableBinding implements ViewBinding {
  @NonNull
  private final AppBarLayout rootView;

  @NonNull
  public final AppBarLayout appBarLayout;

  @NonNull
  public final SubtitleCollapsingToolbarLayout collapsingToolbar;

  @NonNull
  public final MaterialToolbar toolbar;

  private ViewHeaderExpandableBinding(@NonNull AppBarLayout rootView,
      @NonNull AppBarLayout appBarLayout,
      @NonNull SubtitleCollapsingToolbarLayout collapsingToolbar,
      @NonNull MaterialToolbar toolbar) {
    this.rootView = rootView;
    this.appBarLayout = appBarLayout;
    this.collapsingToolbar = collapsingToolbar;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public AppBarLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewHeaderExpandableBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewHeaderExpandableBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.view_header_expandable, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewHeaderExpandableBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      AppBarLayout appBarLayout = (AppBarLayout) rootView;

      id = R.id.collapsing_toolbar;
      SubtitleCollapsingToolbarLayout collapsingToolbar = ViewBindings.findChildViewById(rootView, id);
      if (collapsingToolbar == null) {
        break missingId;
      }

      id = R.id.toolbar;
      MaterialToolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ViewHeaderExpandableBinding((AppBarLayout) rootView, appBarLayout,
          collapsingToolbar, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
