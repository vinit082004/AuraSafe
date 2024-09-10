// Generated by view binder compiler. Do not edit!
package com.android.sheguard.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.android.sheguard.R;
import com.google.android.material.button.MaterialButton;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewOnboardingPageBinding implements ViewBinding {
  @NonNull
  private final MotionLayout rootView;

  @NonNull
  public final Guideline guideline;

  @NonNull
  public final MaterialButton nextBtn;

  @NonNull
  public final MotionLayout onboardingRoot;

  @NonNull
  public final WormDotsIndicator pageIndicator;

  @NonNull
  public final MaterialButton skipBtn;

  @NonNull
  public final ViewPager2 slider;

  @NonNull
  public final MaterialButton startBtn;

  private ViewOnboardingPageBinding(@NonNull MotionLayout rootView, @NonNull Guideline guideline,
      @NonNull MaterialButton nextBtn, @NonNull MotionLayout onboardingRoot,
      @NonNull WormDotsIndicator pageIndicator, @NonNull MaterialButton skipBtn,
      @NonNull ViewPager2 slider, @NonNull MaterialButton startBtn) {
    this.rootView = rootView;
    this.guideline = guideline;
    this.nextBtn = nextBtn;
    this.onboardingRoot = onboardingRoot;
    this.pageIndicator = pageIndicator;
    this.skipBtn = skipBtn;
    this.slider = slider;
    this.startBtn = startBtn;
  }

  @Override
  @NonNull
  public MotionLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewOnboardingPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewOnboardingPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.view_onboarding_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewOnboardingPageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.guideline;
      Guideline guideline = ViewBindings.findChildViewById(rootView, id);
      if (guideline == null) {
        break missingId;
      }

      id = R.id.nextBtn;
      MaterialButton nextBtn = ViewBindings.findChildViewById(rootView, id);
      if (nextBtn == null) {
        break missingId;
      }

      MotionLayout onboardingRoot = (MotionLayout) rootView;

      id = R.id.page_indicator;
      WormDotsIndicator pageIndicator = ViewBindings.findChildViewById(rootView, id);
      if (pageIndicator == null) {
        break missingId;
      }

      id = R.id.skipBtn;
      MaterialButton skipBtn = ViewBindings.findChildViewById(rootView, id);
      if (skipBtn == null) {
        break missingId;
      }

      id = R.id.slider;
      ViewPager2 slider = ViewBindings.findChildViewById(rootView, id);
      if (slider == null) {
        break missingId;
      }

      id = R.id.startBtn;
      MaterialButton startBtn = ViewBindings.findChildViewById(rootView, id);
      if (startBtn == null) {
        break missingId;
      }

      return new ViewOnboardingPageBinding((MotionLayout) rootView, guideline, nextBtn,
          onboardingRoot, pageIndicator, skipBtn, slider, startBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
