// Generated by view binder compiler. Do not edit!
package com.example.bobbysandroidstartersolution.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bobbysandroidstartersolution.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class HighScoreLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button goBack;

  @NonNull
  public final ListView highScoreList;

  @NonNull
  public final TextView textView;

  private HighScoreLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull Button goBack,
      @NonNull ListView highScoreList, @NonNull TextView textView) {
    this.rootView = rootView;
    this.goBack = goBack;
    this.highScoreList = highScoreList;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static HighScoreLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HighScoreLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.high_score_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HighScoreLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.go_back;
      Button goBack = ViewBindings.findChildViewById(rootView, id);
      if (goBack == null) {
        break missingId;
      }

      id = R.id.high_score_list;
      ListView highScoreList = ViewBindings.findChildViewById(rootView, id);
      if (highScoreList == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new HighScoreLayoutBinding((ConstraintLayout) rootView, goBack, highScoreList,
          textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
