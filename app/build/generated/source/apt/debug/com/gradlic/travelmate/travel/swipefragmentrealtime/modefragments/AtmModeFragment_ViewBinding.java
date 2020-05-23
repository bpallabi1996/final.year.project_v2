// Generated code from Butter Knife. Do not modify!
package com.gradlic.travelmate.travel.swipefragmentrealtime.modefragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ListView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.airbnb.lottie.LottieAnimationView;
import com.gradlic.travelmate.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AtmModeFragment_ViewBinding implements Unbinder {
  private AtmModeFragment target;

  @UiThread
  public AtmModeFragment_ViewBinding(AtmModeFragment target, View source) {
    this.target = target;

    target.listView = Utils.findRequiredViewAsType(source, R.id.listview, "field 'listView'", ListView.class);
    target.animationView = Utils.findRequiredViewAsType(source, R.id.animation_view, "field 'animationView'", LottieAnimationView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AtmModeFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.listView = null;
    target.animationView = null;
  }
}
